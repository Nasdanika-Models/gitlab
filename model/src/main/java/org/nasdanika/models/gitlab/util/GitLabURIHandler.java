package org.nasdanika.models.gitlab.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.RepositoryFileApi;
import org.nasdanika.common.Util;

/**
 * A very simple implementation of {@link URIHandler} to retrieve content from GitLab using REST API
 * URI format: <code>gitlab://projectid/ref/path</code>
 */
public class GitLabURIHandler implements URIHandler, AutoCloseable {
	
	public static final String GITLAB_URI_SCHEME = "gitlab";
	
	protected RepositoryFileApi repositoryFileApi;
	protected GitLabApi gitLabApi;
		
	public GitLabURIHandler(String hostUrl, String accessToken) {
		this(new GitLabApi(hostUrl, accessToken));
	}	
	
	public GitLabURIHandler(GitLabApi gitLabApi) {
		this(gitLabApi, new ThrottlingHandler());
	}
	
	/**
	 * @param clientRateLimitWindow Client rate window in milliseconds. Client rate limit is enforced if this value and clientRateLimit are positive.
	 * @param clientRateLimit Client rate limit per rate window. Client rate limit is enforced if this value and clientRateLimitWindow are positive.
	 */	
	public GitLabURIHandler(
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
	public GitLabURIHandler(
			GitLabApi gitLabApi,
			long clientRateLimitWindow,
			int clientRateLimit) {
		this(gitLabApi, new ThrottlingHandler(clientRateLimitWindow, clientRateLimit));
	}	
	
	public GitLabURIHandler(GitLabApi gitLabApi, Handler throttlingHandler) {
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
		this.repositoryFileApi = new RepositoryFileApi(gitLabApi);
	}
	
	@Override
	public void close() {
		if (gitLabApi != null) {
			gitLabApi.close();
		}
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return GITLAB_URI_SCHEME.equals(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		if (Util.isBlank(uri.lastSegment())) {
			// Directory - use tree API
			throw new UnsupportedOperationException();
		}
		
		try {
			return repositoryFileApi.getRawFile(
					getProjectIdOrPath(uri), 
					getRef(uri),
					getPath(uri));
		} catch (GitLabApiException e) {
			throw new IOException(e);
		}
	}
	
	/**
	 * This method returns URI authority parsed as Long. Override as needed
	 * @param uri
	 * @return
	 */
	protected Object getProjectIdOrPath(URI uri) {
		return Long.parseLong(uri.authority());
	}
			
	/**
	 * This method returns the first (0) URI segment
	 * @param uri
	 * @return
	 */
	protected String getRef(URI uri) {
		return uri.segment(0);
	}
	
	protected String getPath(URI uri) {
		return uri.path().substring(uri.segment(0).length() + 2);
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
		return Collections.emptyMap();
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return true; // Need a better way
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		return Collections.emptyMap();
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();		
	}

}
