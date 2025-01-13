/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.DiffRef;
import org.nasdanika.models.gitlab.Discussable;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.MergeRequest;
import org.nasdanika.models.gitlab.Milestone;
import org.nasdanika.models.gitlab.References;
import org.nasdanika.models.gitlab.TaskCompletionStatus;
import org.nasdanika.models.gitlab.TimeStats;
import org.nasdanika.models.gitlab.User;
import org.nasdanika.models.gitlab.pipeline.Pipeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergeUser <em>Merge User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getTaskCompletionStatus <em>Task Completion Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getHeadPipeline <em>Head Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getTimeStats <em>Time Stats</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDiffRefs <em>Diff Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeRequestImpl extends NotableImpl implements MergeRequest {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The default value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected static final long IID_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.MERGE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Discussion> getDiscussions() {
		return (EList<Discussion>)eDynamicGet(GitLabPackage.MERGE_REQUEST__DISCUSSIONS, GitLabPackage.Literals.DISCUSSABLE__DISCUSSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST__ID, GitLabPackage.Literals.MERGE_REQUEST__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__ID, GitLabPackage.Literals.MERGE_REQUEST__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIid() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST__IID, GitLabPackage.Literals.MERGE_REQUEST__IID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIid(long newIid) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__IID, GitLabPackage.Literals.MERGE_REQUEST__IID, newIid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAssignee() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__ASSIGNEE, GitLabPackage.Literals.MERGE_REQUEST__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignee() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__ASSIGNEE, GitLabPackage.Literals.MERGE_REQUEST__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(User newAssignee) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__ASSIGNEE, GitLabPackage.Literals.MERGE_REQUEST__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getAssignees() {
		return (EList<User>)eDynamicGet(GitLabPackage.MERGE_REQUEST__ASSIGNEES, GitLabPackage.Literals.MERGE_REQUEST__ASSIGNEES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAuthor() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__AUTHOR, GitLabPackage.Literals.MERGE_REQUEST__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__AUTHOR, GitLabPackage.Literals.MERGE_REQUEST__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(User newAuthor) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__AUTHOR, GitLabPackage.Literals.MERGE_REQUEST__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getReviewers() {
		return (EList<User>)eDynamicGet(GitLabPackage.MERGE_REQUEST__REVIEWERS, GitLabPackage.Literals.MERGE_REQUEST__REVIEWERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Diff> getChanges() {
		return (EList<Diff>)eDynamicGet(GitLabPackage.MERGE_REQUEST__CHANGES, GitLabPackage.Literals.MERGE_REQUEST__CHANGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getMergeUser() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_USER, GitLabPackage.Literals.MERGE_REQUEST__MERGE_USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetMergeUser() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_USER, GitLabPackage.Literals.MERGE_REQUEST__MERGE_USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeUser(User newMergeUser) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGE_USER, GitLabPackage.Literals.MERGE_REQUEST__MERGE_USER, newMergeUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCompletionStatus getTaskCompletionStatus() {
		return (TaskCompletionStatus)eDynamicGet(GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS, GitLabPackage.Literals.MERGE_REQUEST__TASK_COMPLETION_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCompletionStatus basicGetTaskCompletionStatus() {
		return (TaskCompletionStatus)eDynamicGet(GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS, GitLabPackage.Literals.MERGE_REQUEST__TASK_COMPLETION_STATUS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskCompletionStatus(TaskCompletionStatus newTaskCompletionStatus) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS, GitLabPackage.Literals.MERGE_REQUEST__TASK_COMPLETION_STATUS, newTaskCompletionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Milestone getMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.MERGE_REQUEST__MILESTONE, GitLabPackage.Literals.MERGE_REQUEST__MILESTONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone basicGetMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.MERGE_REQUEST__MILESTONE, GitLabPackage.Literals.MERGE_REQUEST__MILESTONE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestone(Milestone newMilestone) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MILESTONE, GitLabPackage.Literals.MERGE_REQUEST__MILESTONE, newMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline getPipeline() {
		return (Pipeline)eDynamicGet(GitLabPackage.MERGE_REQUEST__PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__PIPELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline basicGetPipeline() {
		return (Pipeline)eDynamicGet(GitLabPackage.MERGE_REQUEST__PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__PIPELINE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPipeline(Pipeline newPipeline) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__PIPELINE, newPipeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline getHeadPipeline() {
		return (Pipeline)eDynamicGet(GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__HEAD_PIPELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline basicGetHeadPipeline() {
		return (Pipeline)eDynamicGet(GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__HEAD_PIPELINE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadPipeline(Pipeline newHeadPipeline) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE, GitLabPackage.Literals.MERGE_REQUEST__HEAD_PIPELINE, newHeadPipeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public References getReferences() {
		return (References)eDynamicGet(GitLabPackage.MERGE_REQUEST__REFERENCES, GitLabPackage.Literals.MERGE_REQUEST__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(References newReferences, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReferences, GitLabPackage.MERGE_REQUEST__REFERENCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferences(References newReferences) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__REFERENCES, GitLabPackage.Literals.MERGE_REQUEST__REFERENCES, newReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStats getTimeStats() {
		return (TimeStats)eDynamicGet(GitLabPackage.MERGE_REQUEST__TIME_STATS, GitLabPackage.Literals.MERGE_REQUEST__TIME_STATS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStats(TimeStats newTimeStats, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTimeStats, GitLabPackage.MERGE_REQUEST__TIME_STATS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStats(TimeStats newTimeStats) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__TIME_STATS, GitLabPackage.Literals.MERGE_REQUEST__TIME_STATS, newTimeStats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffRef getDiffRefs() {
		return (DiffRef)eDynamicGet(GitLabPackage.MERGE_REQUEST__DIFF_REFS, GitLabPackage.Literals.MERGE_REQUEST__DIFF_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffRefs(DiffRef newDiffRefs, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDiffRefs, GitLabPackage.MERGE_REQUEST__DIFF_REFS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiffRefs(DiffRef newDiffRefs) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DIFF_REFS, GitLabPackage.Literals.MERGE_REQUEST__DIFF_REFS, newDiffRefs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST__DISCUSSIONS:
				return ((InternalEList<?>)getDiscussions()).basicRemove(otherEnd, msgs);
			case GitLabPackage.MERGE_REQUEST__REFERENCES:
				return basicSetReferences(null, msgs);
			case GitLabPackage.MERGE_REQUEST__TIME_STATS:
				return basicSetTimeStats(null, msgs);
			case GitLabPackage.MERGE_REQUEST__DIFF_REFS:
				return basicSetDiffRefs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST__DISCUSSIONS:
				return getDiscussions();
			case GitLabPackage.MERGE_REQUEST__ID:
				return getId();
			case GitLabPackage.MERGE_REQUEST__IID:
				return getIid();
			case GitLabPackage.MERGE_REQUEST__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case GitLabPackage.MERGE_REQUEST__ASSIGNEES:
				return getAssignees();
			case GitLabPackage.MERGE_REQUEST__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case GitLabPackage.MERGE_REQUEST__REVIEWERS:
				return getReviewers();
			case GitLabPackage.MERGE_REQUEST__CHANGES:
				return getChanges();
			case GitLabPackage.MERGE_REQUEST__MERGE_USER:
				if (resolve) return getMergeUser();
				return basicGetMergeUser();
			case GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS:
				if (resolve) return getTaskCompletionStatus();
				return basicGetTaskCompletionStatus();
			case GitLabPackage.MERGE_REQUEST__MILESTONE:
				if (resolve) return getMilestone();
				return basicGetMilestone();
			case GitLabPackage.MERGE_REQUEST__PIPELINE:
				if (resolve) return getPipeline();
				return basicGetPipeline();
			case GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE:
				if (resolve) return getHeadPipeline();
				return basicGetHeadPipeline();
			case GitLabPackage.MERGE_REQUEST__REFERENCES:
				return getReferences();
			case GitLabPackage.MERGE_REQUEST__TIME_STATS:
				return getTimeStats();
			case GitLabPackage.MERGE_REQUEST__DIFF_REFS:
				return getDiffRefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST__DISCUSSIONS:
				getDiscussions().clear();
				getDiscussions().addAll((Collection<? extends Discussion>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__IID:
				setIid((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEE:
				setAssignee((User)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEES:
				getAssignees().clear();
				getAssignees().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__AUTHOR:
				setAuthor((User)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__REVIEWERS:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CHANGES:
				getChanges().clear();
				getChanges().addAll((Collection<? extends Diff>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_USER:
				setMergeUser((User)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MILESTONE:
				setMilestone((Milestone)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__PIPELINE:
				setPipeline((Pipeline)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE:
				setHeadPipeline((Pipeline)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__REFERENCES:
				setReferences((References)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__TIME_STATS:
				setTimeStats((TimeStats)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DIFF_REFS:
				setDiffRefs((DiffRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST__DISCUSSIONS:
				getDiscussions().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__IID:
				setIid(IID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEE:
				setAssignee((User)null);
				return;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEES:
				getAssignees().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__AUTHOR:
				setAuthor((User)null);
				return;
			case GitLabPackage.MERGE_REQUEST__REVIEWERS:
				getReviewers().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__CHANGES:
				getChanges().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_USER:
				setMergeUser((User)null);
				return;
			case GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)null);
				return;
			case GitLabPackage.MERGE_REQUEST__MILESTONE:
				setMilestone((Milestone)null);
				return;
			case GitLabPackage.MERGE_REQUEST__PIPELINE:
				setPipeline((Pipeline)null);
				return;
			case GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE:
				setHeadPipeline((Pipeline)null);
				return;
			case GitLabPackage.MERGE_REQUEST__REFERENCES:
				setReferences((References)null);
				return;
			case GitLabPackage.MERGE_REQUEST__TIME_STATS:
				setTimeStats((TimeStats)null);
				return;
			case GitLabPackage.MERGE_REQUEST__DIFF_REFS:
				setDiffRefs((DiffRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST__DISCUSSIONS:
				return !getDiscussions().isEmpty();
			case GitLabPackage.MERGE_REQUEST__ID:
				return getId() != ID_EDEFAULT;
			case GitLabPackage.MERGE_REQUEST__IID:
				return getIid() != IID_EDEFAULT;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEE:
				return basicGetAssignee() != null;
			case GitLabPackage.MERGE_REQUEST__ASSIGNEES:
				return !getAssignees().isEmpty();
			case GitLabPackage.MERGE_REQUEST__AUTHOR:
				return basicGetAuthor() != null;
			case GitLabPackage.MERGE_REQUEST__REVIEWERS:
				return !getReviewers().isEmpty();
			case GitLabPackage.MERGE_REQUEST__CHANGES:
				return !getChanges().isEmpty();
			case GitLabPackage.MERGE_REQUEST__MERGE_USER:
				return basicGetMergeUser() != null;
			case GitLabPackage.MERGE_REQUEST__TASK_COMPLETION_STATUS:
				return basicGetTaskCompletionStatus() != null;
			case GitLabPackage.MERGE_REQUEST__MILESTONE:
				return basicGetMilestone() != null;
			case GitLabPackage.MERGE_REQUEST__PIPELINE:
				return basicGetPipeline() != null;
			case GitLabPackage.MERGE_REQUEST__HEAD_PIPELINE:
				return basicGetHeadPipeline() != null;
			case GitLabPackage.MERGE_REQUEST__REFERENCES:
				return getReferences() != null;
			case GitLabPackage.MERGE_REQUEST__TIME_STATS:
				return getTimeStats() != null;
			case GitLabPackage.MERGE_REQUEST__DIFF_REFS:
				return getDiffRefs() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Discussable.class) {
			switch (derivedFeatureID) {
				case GitLabPackage.MERGE_REQUEST__DISCUSSIONS: return GitLabPackage.DISCUSSABLE__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Discussable.class) {
			switch (baseFeatureID) {
				case GitLabPackage.DISCUSSABLE__DISCUSSIONS: return GitLabPackage.MERGE_REQUEST__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MergeRequestImpl
