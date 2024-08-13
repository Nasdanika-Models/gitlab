package org.nasdanika.models.gitlab.cli;

import org.gitlab4j.api.GitLabApiException;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.models.gitlab.util.GitLabApiFunction;
import org.nasdanika.models.gitlab.util.GitLabApiProvider;

import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

/**
 * Base class for commands with sub-commands implementing or providing {@link GitLabApiFunction} interface.
 * Sub-commands would get a hold of the parent command using {@link ParentCommand} annotation and call its execute() method.
 * Subclassing can be used instead of creating sub-commands
 */
public class GitLabCommand extends CommandGroup {

	@Option( 
		names = {"-u", "--url"},
		description = {
				"GitLab URL, defaults to the value of",
				"GITLAB_URL environment variable"
		})
	private String url = System.getenv("GITLAB_URL");
	
	@Option( 
			names = {"-t", "--access-token"},
			description = {
					"GitLab access token, defaults to the value of",
					"GITLAB_ACCESS_TOKEN environment variable"
			})
	private String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		
	@Option( 
			names = {"-w", "--client-rate-limit-window"},
			description = {
					"Client enforced rate limit window in seconds",
					"defaults to ${DEFAULT-VALUE}",
					"ignored if the client rate limit is not set"
			})
	private long clientRateLimitWindow = 10;
		
	@Option( 
			names = {"-l", "--client-rate-limit"},
			description = {
					"Client enforced rate limit",
					"use this option if the server limits requests rate,",
					"but does not rate limit headers to the client",
					"only errors if the rate limit is exceeded"
			})
	private int clientRateLimit;
	
	/**
	 * Applies the argument function in a try-catch with resources block of {@link GitLabApiProvider}
	 * @param <Т>
	 * @param function
	 * @return
	 * @throws GitLabApiException
	 */
	public <Т> Т execute(GitLabApiFunction<Т> function) throws GitLabApiException {
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider(
				url, 
				accessToken, 
				clientRateLimitWindow * 1000, 
				clientRateLimit)) {
			
			return function.apply(gitLabApiProvider.getGitLabApi());			
		}
	}	

}
