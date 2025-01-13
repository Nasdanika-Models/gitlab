/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.AbstractIssue;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Milestone;
import org.nasdanika.models.gitlab.References;
import org.nasdanika.models.gitlab.TaskCompletionStatus;
import org.nasdanika.models.gitlab.TimeStats;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getClosedBy <em>Closed By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTimeStats <em>Time Stats</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTaskCompletionStatus <em>Task Completion Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractIssueImpl extends MinimalEObjectImpl.Container implements AbstractIssue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.ABSTRACT_ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAssignee() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignee() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(User newAssignee) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getAssignees() {
		return (EList<User>)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAuthor() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(User newAuthor) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getClosedBy() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetClosedBy() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedBy(User newClosedBy) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, newClosedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Milestone getMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone basicGetMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestone(Milestone newMilestone) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, newMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public References getReferences() {
		return (References)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__REFERENCES, GitLabPackage.Literals.ABSTRACT_ISSUE__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(References newReferences, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReferences, GitLabPackage.ABSTRACT_ISSUE__REFERENCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferences(References newReferences) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__REFERENCES, GitLabPackage.Literals.ABSTRACT_ISSUE__REFERENCES, newReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStats getTimeStats() {
		return (TimeStats)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, GitLabPackage.Literals.ABSTRACT_ISSUE__TIME_STATS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStats(TimeStats newTimeStats, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTimeStats, GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStats(TimeStats newTimeStats) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, GitLabPackage.Literals.ABSTRACT_ISSUE__TIME_STATS, newTimeStats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCompletionStatus getTaskCompletionStatus() {
		return (TaskCompletionStatus)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskCompletionStatus(TaskCompletionStatus newTaskCompletionStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTaskCompletionStatus, GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskCompletionStatus(TaskCompletionStatus newTaskCompletionStatus) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, newTaskCompletionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return basicSetReferences(null, msgs);
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return basicSetTimeStats(null, msgs);
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return basicSetTaskCompletionStatus(null, msgs);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				return getAssignees();
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				if (resolve) return getClosedBy();
				return basicGetClosedBy();
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				if (resolve) return getMilestone();
				return basicGetMilestone();
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return getReferences();
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return getTimeStats();
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return getTaskCompletionStatus();
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				setAssignee((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				getAssignees().clear();
				getAssignees().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				setAuthor((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				setClosedBy((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				setMilestone((Milestone)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				setReferences((References)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				setTimeStats((TimeStats)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)newValue);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				setAssignee((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				getAssignees().clear();
				return;
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				setAuthor((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				setClosedBy((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				setMilestone((Milestone)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				setReferences((References)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				setTimeStats((TimeStats)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)null);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				return !getAssignees().isEmpty();
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				return basicGetAuthor() != null;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				return basicGetClosedBy() != null;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				return basicGetMilestone() != null;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return getReferences() != null;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return getTimeStats() != null;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return getTaskCompletionStatus() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractIssueImpl
