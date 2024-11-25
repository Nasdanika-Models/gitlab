package org.nasdanika.models.gitlab.cli;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.gitlab4j.api.CommitsApi;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.RepositoryFileApi;
import org.gitlab4j.api.models.Blame;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.Diff;
import org.gitlab4j.api.utils.ISO8601;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.cli.CommandGroup;
import org.nasdanika.cli.Description;
import org.nasdanika.cli.ParentCommands;
import org.nasdanika.common.Invocable;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.Util;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.RepositoryFile;
import org.nasdanika.models.gitlab.cli.GitLabContributorCommand.Result;
import org.nasdanika.models.gitlab.util.GitLabApiProvider;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.gitlab.util.GitLabURIHandlerFunction;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Parent for sub-commands contributing based on history",
		name = "retrospect",
		mixinStandardHelpOptions = true)
@ParentCommands(GitLabContributorCommand.class)
@Description(icon = "https://docs.nasdanika.org/images/retrospective.svg")
public class GitLabRetrospectCommand extends CommandGroup implements Invocable.Invoker {
	
	/**
	 * Child commands call this command's apply passing instances of this interface
	 * @param <T>
	 */
	public interface Retrospector<T> {
		
		/**
		 * @param gitLabURIHandler Handler to work with GitLab
		 * @param project Model project populated with commit, diff and blame information
		 * @return
		 * @throws IOException
		 */
		T apply(GitLabURIHandler gitLabURIHandler, Date since, Date until, Project project) throws IOException;

	}
	
	public GitLabRetrospectCommand() {
		super();
	}

	public GitLabRetrospectCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
	
	@ParentCommand
	private GitLabContributorCommand parent;
	
	@Option(			
			names = {"--path"},
			description = "Paths of interest")
    private List<String> paths = new ArrayList<>();
	
	public List<String> getPaths() {
		return paths;
	}
	
	@Parameters(
			index =  "0",	
			arity = "1",
			description = "Project ID or path")
	private String project;
	
	public String getProject() {
		return project;
	}
	
	@Option(			
			names = {"--ref"},
			description = "Reference - branch, tag, or commit")
    private String ref;
	
	public String getRef() {
		return ref;
	}
	
	@Option(			
			names = {"--since"},
			description = "Since date in ISO8601 format yyyy-MM-dd'T'HH:mm:ssZ")
    private String since;
	
	public String getSince() {
		return since;
	}
	
	@Option(			
			names = {"--until"},
			description = "Since date in ISO8601 format yyyy-MM-dd'T'HH:mm:ssZ")
    private String until;
	
	public String getUntil() {
		return until;
	}
	
	private org.nasdanika.models.gitlab.Commit loadCommit(Commit commit, CommitsApi commitsApi) throws GitLabApiException {
		org.nasdanika.models.gitlab.Commit modelCommit = getGitLabFactory().createCommit();
		modelCommit.setAuthoredDate(commit.getAuthoredDate());
		modelCommit.setAuthorEmail(commit.getAuthorEmail());
		modelCommit.setAuthorName(commit.getAuthorName());
		modelCommit.setCommittedDate(commit.getCommittedDate());
		modelCommit.setCommitterEmail(commit.getCommitterEmail());
		modelCommit.setCommitterName(commit.getCommitterName());
		modelCommit.setCreatedAt(commit.getCreatedAt());
		modelCommit.setId(commit.getId());
		modelCommit.setMessage(commit.getMessage());
		modelCommit.setShortId(commit.getShortId());
		modelCommit.setStatus(commit.getStatus());
		modelCommit.setTimestamp(commit.getTimestamp());
		modelCommit.setTitle(commit.getTitle());
		modelCommit.setUrl(commit.getUrl());
		modelCommit.setWebURL(commit.getWebUrl());
		List<String> parentIds = commit.getParentIds();
		if (parentIds != null) {
			modelCommit.getParentIds().addAll(parentIds);
		}
		for (Diff diff: commitsApi.getDiff(project, commit.getId())) {
			org.nasdanika.models.gitlab.Diff modelDiff = getGitLabFactory().createDiff();
			modelDiff.setAMode(diff.getAMode());
			modelDiff.setBMode(diff.getBMode());
			modelDiff.setDeletedFile(diff.getDeletedFile());
			modelDiff.setDiff(diff.getDiff());
			modelDiff.setNewFile(diff.getNewFile());
			modelDiff.setNewPath(diff.getNewPath());
			modelDiff.setOldPath(diff.getOldPath());
			modelDiff.setRenamedFile(diff.getRenamedFile());									
			modelCommit.getDiffs().add(modelDiff);
		}		
		return modelCommit;
	}
	
	/**
	 * Applies the argument function in a try-catch with resources block of {@link GitLabApiProvider}
	 * @param <Т>
	 * @param function
	 * @return
	 * @throws GitLabApiException
	 */
	public <T> Result<T> apply(Retrospector<T> retrospector) throws GitLabApiException {
		GitLabURIHandlerFunction<T> gitLabURIHandlerFunction = gitLabURIHandler -> {
			try {				
				Project modelProject = getGitLabFactory().createProject();
				modelProject.setPathWithNamespace(project);
				GitLabApi gitLabApi = gitLabURIHandler.getGitLabApi();
				CommitsApi commitsApi = gitLabApi.getCommitsApi();
				RepositoryFileApi repoFileApi = gitLabApi.getRepositoryFileApi();
				Map<String, org.nasdanika.models.gitlab.Commit> commits = new LinkedHashMap<>();
				org.nasdanika.models.gitlab.Branch modelBranch = null;
				String reference = getRef();
				if (!Util.isBlank(reference)) {
					modelBranch = getGitLabFactory().createBranch();
					modelBranch.setName(reference);
					modelProject.getBranches().add(modelBranch);
				}
				
				for (String path: paths.isEmpty() ? Collections.singleton((String) null) : paths) {
					List<Commit> pathCommits = commitsApi.getCommits(
							this.project, 
							reference, 
							since == null ? null : ISO8601.toDate(since),
							until == null ? null : ISO8601.toDate(until),
							path);
					
					for (Commit commit: pathCommits) {
						if (!commits.containsKey(commit.getId())) {
							commits.put(commit.getId(), loadCommit(commit, commitsApi));
						}
					}
					
					if (!Util.isBlank(path) && !Util.isBlank(reference)) {
						RepositoryFile repoFile = getGitLabFactory().createRepositoryFile();
						repoFile.setPath(path);
						modelBranch.getTreeItems().add(repoFile);
						for (Blame blame: repoFileApi.getBlame(this.project, path, reference)) {
							org.nasdanika.models.gitlab.Blame modelBlame = getGitLabFactory().createBlame();
							Commit commit = blame.getCommit();
							if (!commits.containsKey(commit.getId())) {
								commits.put(commit.getId(), loadCommit(commit, commitsApi));
							}
							modelBlame.setCommit(commits.get(commit.getId()));
							modelBlame.getLines().addAll(blame.getLines());
							repoFile.getBlame().add(modelBlame);
						}
					}
				}
				
				modelProject.getCommits().addAll(commits.values());				
				return retrospector.apply(
						gitLabURIHandler, 
						since == null ? null : ISO8601.toDate(since), 
						until == null ? null : ISO8601.toDate(until), 
						modelProject);
			} catch (IOException | GitLabApiException | ParseException e) {
				throw new NasdanikaException(e);
			}
		};
		return parent.apply(gitLabURIHandlerFunction);
	}

	protected GitLabFactory getGitLabFactory() {
		return GitLabFactory.eINSTANCE;
	}	

	@Override
	public Object invoke(Invocable invocable) {
		Retrospector<Object> f = (gitLabURIHandler, since, until, project) -> {
			return invocable
					.bindByName("gitLabURIHandler", gitLabURIHandler)
					.bindByName("capabilityLoader", capabilityLoader)
					.bindByName("since", since)
					.bindByName("until", until)
					.bindByName("project", project)
					.invoke();
		};
		try {
			return apply(f);
		} catch (GitLabApiException e) {
			throw new NasdanikaException(e);
		}
	}
	
}
