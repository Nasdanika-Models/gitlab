package org.nasdanika.models.gitlab.util;

import java.util.Date;
import java.util.concurrent.Executor;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.gitlab.GitLab;

/**
 * Performs multi-object, multi-stage loading leveraging {@link Loader}. 
 */
public class LoadingEngine {
	
	private Loader loader;

	public LoadingEngine(Loader loader) {
		this.loader = loader;
	}
	
	public LoadingEngine(Loader loader, Executor executor) {
		this.loader = loader;
		this.executor = executor;
	}	
		
	// Caller thread executor
	private Executor executor = r -> r.run();
	
	public Executor getExecutor() {
		return executor;
	}
	
	/**
	 * @param executor To execute loading in parallel
	 */
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	
	/**
	 * @param modelGroup
	 * @return true if sub-groups of this group shall be (re) loaded
	 */
	protected boolean isLoadSubGroups(org.nasdanika.models.gitlab.Group modelGroup) {
		return true;
	}
	
	/**
	 * @param modelGroup
	 * @return true if projects of this group shall be (re) loaded
	 */
	protected boolean isLoadProjects(org.nasdanika.models.gitlab.Group modelGroup) {
		return true;
	}
	
	/**
	 * @param modelProject
	 * @return true if branches of this project shall be (re) loaded
	 */
	protected boolean isLoadBranches(org.nasdanika.models.gitlab.Project modelProject) {
		return true;
	}
	
	/**
	 * @param modelTreeItem
	 * @return true if content of this tree item shall be (re) loaded
	 */
	protected boolean isLoadTreeItem(org.nasdanika.models.gitlab.TreeItem modelTreeItem) {
		return true;
	}
		
//	/**
//	 * Loads groups, their projects, sub-groups, members and other related objects into a new {@link GitLab} instance.
//	 * @param progressMonitor
//	 * @return Populated {@link GitLab} instance.
//	 */
//	public GitLab loadGitLabGroups(ProgressMonitor progressMonitor) {
//		GitLab ret = getFactory().createGitLab();	
//		ret.setLoaded(new Date());
//		loadGroups(ret, progressMonitor);				
//		return ret;
//	}
	

}
