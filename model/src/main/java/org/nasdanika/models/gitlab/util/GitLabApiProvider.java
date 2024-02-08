package org.nasdanika.models.gitlab.util;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EMap;
import org.gitlab4j.api.Constants.AutoDevopsDeployStrategy;
import org.gitlab4j.api.Constants.BuildGitStrategy;
import org.gitlab4j.api.Constants.SquashOption;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.GroupApi;
import org.gitlab4j.api.Pager;
import org.gitlab4j.api.ProjectApi;
import org.gitlab4j.api.ProjectLicense;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.RepositoryFileApi;
import org.gitlab4j.api.models.AbstractUser;
import org.gitlab4j.api.models.Branch;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.Contributor;
import org.gitlab4j.api.models.CustomAttribute;
import org.gitlab4j.api.models.Group.Statistics;
import org.gitlab4j.api.models.GroupFilter;
import org.gitlab4j.api.models.Owner;
import org.gitlab4j.api.models.Permissions;
import org.gitlab4j.api.models.Project;
import org.gitlab4j.api.models.ProjectAccess;
import org.gitlab4j.api.models.ProjectSharedGroup;
import org.gitlab4j.api.models.ProjectStatistics;
import org.gitlab4j.api.models.TreeItem;
import org.gitlab4j.api.models.Visibility;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.MergeMethod;

/**
 * This class takes care of different ways to create {@link GitLabApi} and request throttling    
 */
public class GitLabApiProvider  implements AutoCloseable {
	
	private GitLabApi gitLabApi;
	
	/**
	 * Access to the API for configuration. 
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
