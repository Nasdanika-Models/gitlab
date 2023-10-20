package org.nasdanika.models.git.tests;

import java.util.function.BiConsumer;

import org.junit.jupiter.api.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.TreeItem;
import org.nasdanika.models.gitlab.util.Loader;

public class GitLabTests {

	@Test
	public void testLoadTopLevelGroups() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading top level groups");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Group, ProgressMonitor> tlgConsumer = (tlg, pm) -> {
					System.out.println(tlg.getId() + " " + tlg.getName());
				};
				loader.loadTopLevelGroups(tlgConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadSubGroups() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading sub-groups");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken) {
				
				@Override
				protected org.gitlab4j.api.models.GroupFilter getGroupFilter() {
					return super.getGroupFilter().withStatistics(true);					
				};
				
			}) {				
				BiConsumer<Group, ProgressMonitor> groupConsumer = (tlg, pm) -> {
					System.out.println(tlg.getId() + " " + tlg.getName());
				};
				loader.loadSubGroups(71435473L, groupConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadGroupMembers() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading group members");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Member, ProgressMonitor> memberConsumer = (member, pm) -> {
					System.out.println(member.getId() + " " + member.getName());
				};
				loader.loadGroupMembers(71457619L, memberConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjects() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading projects");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Project, ProgressMonitor> projectConsumer = (project, pm) -> {
					System.out.println(project.getId() + " " + project.getName());
				};
				loader.loadProjects(71457619L, projectConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjectMembers() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading project members");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Member, ProgressMonitor> memberConsumer = (member, pm) -> {
					System.out.println(member.getId() + " " + member.getName());
				};
				loader.loadProjectMembers(48523784L, memberConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjectContributors() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading project contributors");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Contributor, ProgressMonitor> contributorConsumer = (contributor, pm) -> {
					System.out.println(contributor.getId() + " " + contributor.getName());
				};
				loader.loadProjectContributors(48523784L, contributorConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadBranches() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading branches");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<Branch, ProgressMonitor> branchConsumer = (branch, pm) -> {
					System.out.println(branch.getName());
				};
				loader.loadBranches(48523784L, branchConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadTree() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = System.getenv("GITLAB_ACCESS_TOKEN");
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading tree");
			try (Loader loader = new Loader("https://gitlab.com/", accessToken)) {				
				BiConsumer<TreeItem, ProgressMonitor> treeItemConsumer = (treeItem, pm) -> {
					System.out.println(treeItem.getName() + " " + treeItem.eClass().getName());
				};
				loader.loadTree(48523784L, null, Loader.ROOT_PATH, treeItemConsumer, progressMonitor);
			}
		}
	}

}
