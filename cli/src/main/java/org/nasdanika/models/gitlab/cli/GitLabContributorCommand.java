package org.nasdanika.models.gitlab.cli;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.Constants.StateEvent;
import org.gitlab4j.api.models.CommitAction.Action;
import org.gitlab4j.api.models.CommitPayload;
import org.gitlab4j.api.models.MergeRequestParams;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.Description;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.Util;
import org.nasdanika.models.gitlab.util.GitLabApiFunction;
import org.nasdanika.models.gitlab.util.GitLabApiProvider;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.gitlab.util.GitLabURIHandlerFunction;
import org.nasdanika.models.gitlab.util.GitLabURIHandler.CommitResult;

import picocli.CommandLine.ArgGroup;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

@Command(
	description = "Parent for sub-command contributing via GitLabURIHandler",
	name = "contribute",
	mixinStandardHelpOptions = true)
@ParentCommands(GitLabCommand.class)
@Description(icon = "https://docs.nasdanika.org/images/jigsaw.svg")
public class GitLabContributorCommand extends CommandGroup implements Invocable.Invoker {
	
	public GitLabContributorCommand() {
		super();
	}

	public GitLabContributorCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@ParentCommand
	private GitLabCommand parent;
	
	@Option(			
			names = {"-a", "--alias"},
			description = {	"Map project alias (key) to project ID or path (value)" })
    private Map<String, String> projectAliases = new LinkedHashMap<>();
	
	public Map<String, String> getProjectAliases() {
		return projectAliases;
	}
	
	public static record Result<T>(T functionResult, Map<Object, Map<String, CommitResult>> commitResults) {}
	
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
				
				/**
				 * Uses aliases
				 */
				@Override				
				protected Object getProjectIdOrPath(URI uri) {
					String authority = uri.authority();
					if (projectAliases.containsKey(authority)) {
						authority = projectAliases.get(authority);
						try {
							return Long.parseLong(authority);
						} catch (NumberFormatException e) {
							return authority;
						}
					}
					return super.getProjectIdOrPath(uri); 
				}
				
			};					
			T result;
			try {
				result = function.apply(gitLabURIHandler);
			} catch (IOException e) {
				throw new NasdanikaException(e);
			}
			Map<Object, Map<String, CommitResult>> commitResults = gitLabURIHandler.commit(
					this::isCommit, 
					(projectID, ref) -> (commitPayload) -> commitArgGroup.configurePayload(projectID, ref, commitPayload), 
					mergeRequestArgGroup == null ? null : (projectID, ref) -> mergeRequestArgGroup.createMergeRequestParams(projectID, ref, commitArgGroup.branch));
			
			return new Result<T>(result, commitResults);
		};
		return parent.apply(gitLabApiFunction);
	}
	
	public static class CommitArgGroup {
	
		@Parameters(
				index =  "0",	
				arity = "1",
				description = "Commit author eMail")
		String authorEmail;
		
		public String getAuthorEmail() {
			return authorEmail;
		}
	
		@Parameters(
				index =  "1",	
				arity = "1",
				description = "Commit author name")
		String authorName;
		
		public String getAuthorName() {
			return authorName;
		}
		
		@Option( 
				names = {"-m", "--commit-message"},
				description = "Commit message")
		String commitMessage;
		
		public String getCommitMessage() {
			return commitMessage;
		}
		
		@Option( 
				names = {"-b", "--branch"},
				description = "Branch to commit to")
		String branch;
		
		public String getBranch() {
			return branch;
		}
		
		@Option( 
				names = {"-f", "--force"},
				description = "Force commit")
		Boolean force;
		
		public Boolean getForce() {
			return force;
		}
		
		@Option( 
				names = {"-s", "--stats"},
				description = "With stats")
		Boolean stats;
		
		public Boolean getStats() {
			return stats;
		}
				
		void configurePayload(Object projectID, String ref, CommitPayload commitPayload) {
			commitPayload
				.withAuthorEmail(authorEmail)
				.withAuthorName(authorName);
			
			if (!Util.isBlank(commitMessage)) {
				commitPayload.withCommitMessage(commitMessage);
			}
			
			if (Util.isBlank(branch) || Objects.equals(ref, branch)) {
				commitPayload.withBranch(ref);
			} else {
				commitPayload
					.withBranch(branch)
					.withStartBranch(ref);			
			}
			commitPayload
				.withForce(force)
				.withStats(stats);		
		}
	}
	
	@ArgGroup(
			multiplicity = "1",
			heading = "Commit%n",
			exclusive = false)
	private CommitArgGroup commitArgGroup;
	
	public CommitArgGroup getCommitArgGroup() {
		return commitArgGroup;
	}
	
	protected boolean isCommit(URI uri, Action action) {
		return true; // TODO - includes/excludes
	}
		
	public static class MergeRequestArgGroup {
				
		@Option( 
				names = {"-t", "--target-branch"},
				description = "Target branch, defaults to the original branch")
	    private String targetBranch;
		
		public String getTargetBranch() {
			return targetBranch;
		}
	    
		@Option(names = "--allow-collaboration", negatable = true)
	    private Boolean allowCollaboration;
		
		public Boolean getAllowCollaboration() {
			return allowCollaboration;
		}
	    
		@Option(names = "--approvals-before-merge", description = "Number of approvals before merge")
	    private Integer approvalsBeforeMerge;
		
		public Integer getApprovalsBeforeMerge() {
			return approvalsBeforeMerge;
		}
		
		@Option(
				names = "--assignee", 
				description = "Assignee ID", 
						paramLabel = "<Assignee ID>",
				type = Long.class)
	    private List<Long> assigneeIds;
		
		public List<Long> getAssigneeIds() {
			return assigneeIds;
		}
		
		@Option(names = "--merge-request-description")
	    private String description;
		
		public String getDescription() {
			return description;
		}
	    
		@Option(names = "--discussion-locked", negatable = true)
	    private Boolean discussionLocked;
		
		public Boolean getDiscussionLocked() {
			return discussionLocked;
		}
		
		@Option(names = "--label")
	    private String[] labels;
		
		public String[] getLabels() {
			return labels;
		}
		
		@Option(names = "--milestone", description = "Milestone ID")
	    private Long milestoneId;
		
		public Long getMilestoneId() {
			return milestoneId;
		}
			    
		@Option(names = "--remove-source-branch", negatable = true)
	    private Boolean removeSourceBranch;
		
		public Boolean getRemoveSourceBranch() {
			return removeSourceBranch;
		}
		
		@Option(
				names = "--reviewer", 
				description = "Reviewer ID", 
				paramLabel = "<Reviewer ID>",
				type = Long.class)
	    private List<Long> reviewerIds;
		
		public List<Long> getReviewerIds() {
			return reviewerIds;
		}
	    
		@Option(names = "--squash", negatable = true)
	    private Boolean squash;
		
		public Boolean getSquash() {
			return squash;
		}
	    
		@Option(names = "--merge-request-title")
	    private String title;
		
		public String getTitle() {
			return title;
		}
		
		@Option(names = "--state-event", description = "Valid values: ${COMPLETION-CANDIDATES}")
	    private StateEvent stateEvent;
		
		public StateEvent getStateEvent() {
			return stateEvent;
		}
		
		MergeRequestParams createMergeRequestParams(Object projectID, String ref, String sourceBranch) {
			MergeRequestParams ret = new MergeRequestParams()
				.withTargetBranch(Util.isBlank(targetBranch) ? ref : targetBranch)
				.withSourceBranch(sourceBranch)
				.withAllowCollaboration(allowCollaboration)
				.withApprovalsBeforeMerge(approvalsBeforeMerge)
				.withDescription(description)
				.withDiscussionLocked(discussionLocked)
				.withMilestoneId(milestoneId)
				.withRemoveSourceBranch(removeSourceBranch)
				.withSquash(squash)
				.withTitle(title)
				.withStateEvent(stateEvent);
			
			if (assigneeIds != null) {
				ret.withAssigneeIds(assigneeIds);
			}
			
			if (labels != null) {
				ret.withLabels(labels);
			}
			
			if (reviewerIds != null) {
				ret.withReviewerIds(reviewerIds);
			}
			
			return ret;
		}
		
	}
	
	@ArgGroup(
			multiplicity = "0..1",
			heading = "Merge request%n",
			exclusive = false)
	private MergeRequestArgGroup mergeRequestArgGroup;

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
