package org.nasdanika.models.gitlab.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A {@link Handler} for throttling API calls based on rate limit HTTP response headers
 */
public class ThrottlingHandler extends Handler {
	
	private static final Pattern REQUEST_PATTERN = Pattern.compile("\\d+ - Sending client request on thread .+");
	private static final Pattern RESPONSE_PATTERN = Pattern.compile("\\d+ - Received server response on thread .+"); 
	
	private static final Pattern RATE_LIMIT_PREFIX_PATTERN = Pattern.compile("^\\d+ < RateLimit-Limit: ");
//	private static final Pattern RATE_LIMIT_OBSERVED_PREFIX_PATTERN = Pattern.compile("^\\d+ < RateLimit-Observed: ");
	private static final Pattern RATE_LIMIT_REMAINING_PREFIX_PATTERN = Pattern.compile("^\\d+ < RateLimit-Remaining: ");
	private static final Pattern RATE_LIMIT_RESET_PREFIX_PATTERN = Pattern.compile("^\\d+ < RateLimit-Reset: ");
	private static final Pattern DATE_PREFIX_PATTERN = Pattern.compile("^\\d+ < Date: ");
	
	private int conservatism = 3;
	private int factor = 10;
	private int interval = -1;
	private long lastRequest;
	
	public ThrottlingHandler() {
	}
	
	/**
	 * @param rateLimit Client imposed rate limit
	 */
	public ThrottlingHandler(int rateLimit) {
		if (rateLimit > 0) {
			interval = 60000 / rateLimit;
		}
	}
	
	public int getConservatism() {
		return conservatism;
	}
	
	/**
	 * Number in seconds to add to the rate window when computing throttling sleep interval. 
	 * Non-zero conservatism ensures that not all rate is used before the window ends. The default value is 3.
	 * @param conservatism
	 */
	public void setConservatism(int conservatism) {
		this.conservatism = conservatism;
	}
	
	public int getFactor() {
		return factor;
	}
	
	/**
	 * Determines when to start throttling. Throttling starts when remaining rate limit is less than rate limit divided by factor. E.g. if factor is 20 then throttling will start when 95% of the rate has been used. 
	 * The default is 10 - throttling starts after 90% of the rate has been used. 
	 * @param factor
	 */
	public void setFactor(int factor) {
		this.factor = factor;
	}	
	
	@Override
	public void publish(LogRecord logRecord) {
		String message = logRecord.getMessage();
		String lines[] = message.split("\\r?\\n");
		if (REQUEST_PATTERN.matcher(lines[0]).matches()) {
			if (interval > 0) {
				long sinceLastRequest = System.currentTimeMillis() - lastRequest;
				if (sinceLastRequest < interval) {
					try {
						long toSleep = interval - sinceLastRequest;
						Thread.sleep(toSleep);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};					
				}
				lastRequest = System.currentTimeMillis();
			}
		}
				
		if (RESPONSE_PATTERN.matcher(lines[0]).matches()) {
			int rateLimit = -1;
//			int rateLimitObserved = -1;
			int rateLimitRemaining = -1;
			long rateLimitReset = -1;
			ZonedDateTime date = null;
			
			for (String line: lines) {
				Matcher rateLimitMatcher = RATE_LIMIT_PREFIX_PATTERN.matcher(line);
				if (rateLimitMatcher.find()) {
					rateLimit = Integer.parseInt(line.substring(rateLimitMatcher.end()));
				} else {
					Matcher rateLimitRemainingMatcher = RATE_LIMIT_REMAINING_PREFIX_PATTERN.matcher(line);
					if (rateLimitRemainingMatcher.find()) {
						rateLimitRemaining = Integer.parseInt(line.substring(rateLimitRemainingMatcher.end()));
					} else {
						Matcher rateLimitResetMatcher = RATE_LIMIT_RESET_PREFIX_PATTERN.matcher(line);
						if (rateLimitResetMatcher.find()) {
							rateLimitReset = Long.parseLong(line.substring(rateLimitResetMatcher.end()));
						} else {
							Matcher dateMatcher = DATE_PREFIX_PATTERN.matcher(line);
							if (dateMatcher.find()) {
								String dateString = line.substring(dateMatcher.end());
								date = ZonedDateTime.parse(dateString, DateTimeFormatter.RFC_1123_DATE_TIME);								
							} else {
								// Rate limit observed if needed
							}
						
						}
					}
				}
			}
			
			if (rateLimit > 0 
					&& rateLimitRemaining > 0 
					&& rateLimitRemaining * factor < rateLimit) { // Start throttling when less than rateLimit / factor remains
				
				long delta = rateLimitReset - (date == null ? System.currentTimeMillis() / 1000 : date.toEpochSecond()); // Seconds remaining until reset
				delta += conservatism; 
				long toSleep = delta * 1000 / rateLimitRemaining;
				if (toSleep > 0) { // Configurable sleep threshold?
					try {
						Thread.sleep(toSleep);
					} catch (InterruptedException e) {
						e.printStackTrace();
					};
				}						
			}
		}
	}
	
	@Override
	public void flush() {
		// NOP				
	}
	
	@Override
	public void close() throws SecurityException {
		// NOP				
	}

}
