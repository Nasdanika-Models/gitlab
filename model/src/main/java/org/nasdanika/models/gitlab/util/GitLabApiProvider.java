package org.nasdanika.models.gitlab.util;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.gitlab4j.api.GitLabApi;

/**
 * This class takes care of different ways to create {@link GitLabApi} and request throttling    
 */
public class GitLabApiProvider  implements AutoCloseable {
	
	private GitLabApi gitLabApi;
	
	/**
	 * Access to the API. 
	 * @return
	 */
	public GitLabApi getGitLabApi() {
		return gitLabApi;
	}
	
	public GitLabApiProvider(String hostUrl, String accessToken) {
		this(new GitLabApi(hostUrl, accessToken));
	}	
	
	public GitLabApiProvider(GitLabApi gitLabApi) {
		this(gitLabApi, new ThrottlingHandler());
	}
	
	/**
	 * @param clientRateLimitWindow Client rate window in milliseconds. Client rate limit is enforced if this value and clientRateLimit are positive.
	 * @param clientRateLimit Client rate limit per rate window. Client rate limit is enforced if this value and clientRateLimitWindow are positive.
	 */	
	public GitLabApiProvider(
			String hostUrl, 
			String accessToken, 
			long clientRateLimitWindow,
			int clientRateLimit) {
		this(new GitLabApi(hostUrl, accessToken), clientRateLimitWindow, clientRateLimit);
	}	
	
	/**
	 * @param clientRateLimitWindow Client rate window in milliseconds. Client rate limit is enforced if this value and clientRateLimit are positive.
	 * @param clientRateLimit Client rate limit per rate window. Client rate limit is enforced if this value and clientRateLimitWindow are positive.
	 */	
	public GitLabApiProvider(
			GitLabApi gitLabApi,
			long clientRateLimitWindow,
			int clientRateLimit) {
		this(gitLabApi, new ThrottlingHandler(clientRateLimitWindow, clientRateLimit));
	}	
	
	public GitLabApiProvider(GitLabApi gitLabApi, Handler throttlingHandler) {
		if (throttlingHandler != null) {			
			Level level = Level.FINE;
			throttlingHandler.setLevel(level);
			Logger logger = Logger.getLogger(GitLabApi.class.getName());
			Level loggerLevel = logger.getLevel();
			if (loggerLevel == null || loggerLevel.intValue() > level.intValue()) {
				logger.setLevel(level);
			}
			logger.addHandler(throttlingHandler);
			gitLabApi.enableRequestResponseLogging();
		}
		
		this.gitLabApi = gitLabApi;
	}
	
	@Override
	public void close() {
		if (gitLabApi != null) {
			gitLabApi.close();
		}
	}
	
}
