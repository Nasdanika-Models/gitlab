package org.nasdanika.models.gitlab.cli;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.CommitAction.Action;
import org.gitlab4j.api.models.CommitPayload;
import org.gitlab4j.api.models.MergeRequestParams;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.models.gitlab.util.GitLabApiFunction;
import org.nasdanika.models.gitlab.util.GitLabApiProvider;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.gitlab.util.GitLabURIHandlerFunction;
import org.nasdanika.models.gitlab.util.GitLabURIHandler.CommitResult;

import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

@Command(
	description = "Parent for sub-command contributing via GitLabURIHandler",
	name = "contribute",
	mixinStandardHelpOptions = true)
@ParentCommands(GitLabCommand.class)
public class GitLabContributorCommand extends CommandGroup implements Invocable.Invoker {
	
	protected GitLabContributorCommand() {
		super();
	}

	protected GitLabContributorCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@ParentCommand
	private GitLabCommand parent;

//	@Option( 
//		names = {"-u", "--url"},
//		description = {
//				"GitLab URL, defaults to the value of",
//				"GITLAB_URL environment variable"
//		})
//	private String url = System.getenv("GITLAB_URL");
//	
//	@Option( 
//			names = {"-t", "--access-token"},
//			description = {
//					"GitLab access token, defaults to the value of",
//					"GITLAB_ACCESS_TOKEN environment variable"
//			})
//	private String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
//		
//	@Option( 
//			names = {"-w", "--client-rate-limit-window"},
//			description = {
//					"Client enforced rate limit window in seconds",
//					"defaults to ${DEFAULT-VALUE}",
//					"ignored if the client rate limit is not set"
//			})
//	private long clientRateLimitWindow = 10;
//		
//	@Option( 
//			names = {"-l", "--client-rate-limit"},
//			description = {
//					"Client enforced rate limit",
//					"use this option if the server limits requests rate,",
//					"but does not rate limit headers to the client",
//					"only errors if the rate limit is exceeded"
//			})
//	private int clientRateLimit;
	
	// TODO - project aliases
	
	public record Result<T>(T functionResult, Map<Object, Map<String, CommitResult>> commitResults) {}
	
	/**
	 * Applies the argument function in a try-catch with resources block of {@link GitLabApiProvider}
	 * @param <Т>
	 * @param function
	 * @return
	 * @throws GitLabApiException
	 */
	public <T> Result<T> apply(GitLabURIHandlerFunction<T> function) throws GitLabApiException {
		GitLabApiFunction<Result<T>> gitLabApiFunction = gitLabApi -> {
			GitLabURIHandler gitLabURIHandler = new GitLabURIHandler(gitLabApi) {
				
				// TODO - project aliases
				
			};					
			T result;
			try {
				result = function.apply(gitLabURIHandler);
			} catch (IOException e) {
				throw new NasdanikaException(e);
			}
			Map<Object, Map<String, CommitResult>> commitResults = gitLabURIHandler.commit(
					this::isCommit, 
					(projectID, ref) -> (commitPayload) -> configurePayload(projectID, ref, commitPayload), 
					this::createMergeRequestParams);
			
			return new Result<T>(result, commitResults);
		};
		return parent.apply(gitLabApiFunction);
	}
	
	protected void configurePayload(Object projectID, String ref, CommitPayload commitPayload) {
		// TODO - from options and params
	}
	
	protected boolean isCommit(URI uri, Action action) {
		return true; // TODO - includes/excludes
	}
	
	protected MergeRequestParams createMergeRequestParams(Object projectID, String ref) {
		return null; // TODO
	}

	@Override
	public Object invoke(Invocable invocable) {
		GitLabURIHandlerFunction<Object> f = gitLabURIHandler -> {
			return invocable
					.bindByName("gitLabURIHandler", gitLabURIHandler)
					.bindByName("capabilityLoader", capabilityLoader)
					.invoke();
		};
		try {
			return apply(f);
		} catch (GitLabApiException e) {
			throw new NasdanikaException(e);
		}
	}	

}
