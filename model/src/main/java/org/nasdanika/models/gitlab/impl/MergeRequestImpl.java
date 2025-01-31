/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.gitlab.ApprovalRule;
import org.nasdanika.models.gitlab.ApprovalState;
import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.DiffRef;
import org.nasdanika.models.gitlab.Discussable;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Issue;
import org.nasdanika.models.gitlab.MergeRequest;
import org.nasdanika.models.gitlab.MergeRequestDiff;
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
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalRules <em>Approval Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalState <em>Approval State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getClosedIssues <em>Closed Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDiffs <em>Diffs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDiffVersions <em>Diff Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#isAllowCollaboration <em>Allow Collaboration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getAllowMaintainerToPush <em>Allow Maintainer To Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalsLeft <em>Approvals Left</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovalsRequired <em>Approvals Required</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getBlockingDiscussionsResolved <em>Blocking Discussions Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getChangesCount <em>Changes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getClosedAt <em>Closed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getClosedBy <em>Closed By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDetailedMergeStatus <em>Detailed Merge Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDiscussionLocked <em>Discussion Locked</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDivergedCommitsCount <em>Diverged Commits Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getDownvotes <em>Downvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getForceRemoveSourceBranch <em>Force Remove Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getLatestBuildFinishedAt <em>Latest Build Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getLatestBuildStartedAt <em>Latest Build Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergeCommitSha <em>Merge Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergedAt <em>Merged At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergedBy <em>Merged By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergeError <em>Merge Error</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergeStatus <em>Merge Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getMergeWhenPipelineSucceeds <em>Merge When Pipeline Succeeds</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getRebaseInProgress <em>Rebase In Progress</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSha <em>Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getShouldRemoveSourceBranch <em>Should Remove Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSourceBranch <em>Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSourceProjectId <em>Source Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSquash <em>Squash</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSquashCommitSha <em>Squash Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getSubscribed <em>Subscribed</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getTargetBranch <em>Target Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getTargetProjectId <em>Target Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getUpvotes <em>Upvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getUserNotesCount <em>User Notes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl#getWorkInProgress <em>Work In Progress</em>}</li>
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
	 * The default value of the '{@link #isAllowCollaboration() <em>Allow Collaboration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCollaboration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_COLLABORATION_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getAllowMaintainerToPush() <em>Allow Maintainer To Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMaintainerToPush()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_MAINTAINER_TO_PUSH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getApprovalsBeforeMerge() <em>Approvals Before Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalsBeforeMerge()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APPROVALS_BEFORE_MERGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getApprovalsLeft() <em>Approvals Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalsLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APPROVALS_LEFT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getApprovalsRequired() <em>Approvals Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APPROVALS_REQUIRED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBlockingDiscussionsResolved() <em>Blocking Discussions Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingDiscussionsResolved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BLOCKING_DISCUSSIONS_RESOLVED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getChangesCount() <em>Changes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangesCount()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGES_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getClosedAt() <em>Closed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDetailedMergeStatus() <em>Detailed Merge Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedMergeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILED_MERGE_STATUS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDiscussionLocked() <em>Discussion Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISCUSSION_LOCKED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDivergedCommitsCount() <em>Diverged Commits Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergedCommitsCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIVERGED_COMMITS_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDownvotes() <em>Downvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownvotes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOWNVOTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getForceRemoveSourceBranch() <em>Force Remove Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRemoveSourceBranch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FORCE_REMOVE_SOURCE_BRANCH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHasConflicts() <em>Has Conflicts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConflicts()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_CONFLICTS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLatestBuildFinishedAt() <em>Latest Build Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestBuildFinishedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LATEST_BUILD_FINISHED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLatestBuildStartedAt() <em>Latest Build Started At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestBuildStartedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LATEST_BUILD_STARTED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeCommitSha() <em>Merge Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGE_COMMIT_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergedAt() <em>Merged At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date MERGED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeError() <em>Merge Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeError()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGE_ERROR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeStatus() <em>Merge Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGE_STATUS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeWhenPipelineSucceeds() <em>Merge When Pipeline Succeeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeWhenPipelineSucceeds()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MERGE_WHEN_PIPELINE_SUCCEEDS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROJECT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRebaseInProgress() <em>Rebase In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebaseInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REBASE_IN_PROGRESS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSha() <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha()
	 * @generated
	 * @ordered
	 */
	protected static final String SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getShouldRemoveSourceBranch() <em>Should Remove Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShouldRemoveSourceBranch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOULD_REMOVE_SOURCE_BRANCH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSourceBranch() <em>Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_BRANCH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSourceProjectId() <em>Source Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Long SOURCE_PROJECT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSquash() <em>Squash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquash()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SQUASH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSquashCommitSha() <em>Squash Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquashCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String SQUASH_COMMIT_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSubscribed() <em>Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUBSCRIBED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTargetBranch() <em>Target Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_BRANCH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTargetProjectId() <em>Target Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Long TARGET_PROJECT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpvotes() <em>Upvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpvotes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPVOTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUserNotesCount() <em>User Notes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserNotesCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USER_NOTES_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWorkInProgress() <em>Work In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WORK_IN_PROGRESS_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<ApprovalRule> getApprovalRules() {
		return (EList<ApprovalRule>)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVAL_RULES, GitLabPackage.Literals.MERGE_REQUEST__APPROVAL_RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalState getApprovalState() {
		return (ApprovalState)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVAL_STATE, GitLabPackage.Literals.MERGE_REQUEST__APPROVAL_STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalState basicGetApprovalState() {
		return (ApprovalState)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVAL_STATE, GitLabPackage.Literals.MERGE_REQUEST__APPROVAL_STATE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalState(ApprovalState newApprovalState) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__APPROVAL_STATE, GitLabPackage.Literals.MERGE_REQUEST__APPROVAL_STATE, newApprovalState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getApprovalStatus() {
		return (EList<Issue>)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVAL_STATUS, GitLabPackage.Literals.MERGE_REQUEST__APPROVAL_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getClosedIssues() {
		return (EList<Issue>)eDynamicGet(GitLabPackage.MERGE_REQUEST__CLOSED_ISSUES, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getCommits() {
		return (EList<Commit>)eDynamicGet(GitLabPackage.MERGE_REQUEST__COMMITS, GitLabPackage.Literals.MERGE_REQUEST__COMMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Diff> getDiffs() {
		return (EList<Diff>)eDynamicGet(GitLabPackage.MERGE_REQUEST__DIFFS, GitLabPackage.Literals.MERGE_REQUEST__DIFFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MergeRequestDiff> getDiffVersions() {
		return (EList<MergeRequestDiff>)eDynamicGet(GitLabPackage.MERGE_REQUEST__DIFF_VERSIONS, GitLabPackage.Literals.MERGE_REQUEST__DIFF_VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowCollaboration() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION, GitLabPackage.Literals.MERGE_REQUEST__ALLOW_COLLABORATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCollaboration(boolean newAllowCollaboration) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION, GitLabPackage.Literals.MERGE_REQUEST__ALLOW_COLLABORATION, newAllowCollaboration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowMaintainerToPush() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH, GitLabPackage.Literals.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMaintainerToPush(Boolean newAllowMaintainerToPush) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH, GitLabPackage.Literals.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH, newAllowMaintainerToPush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getApprovalsBeforeMerge() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_BEFORE_MERGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalsBeforeMerge(Integer newApprovalsBeforeMerge) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_BEFORE_MERGE, newApprovalsBeforeMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getApprovalsLeft() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalsLeft(Integer newApprovalsLeft) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_LEFT, newApprovalsLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getApprovalsRequired() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalsRequired(Integer newApprovalsRequired) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED, GitLabPackage.Literals.MERGE_REQUEST__APPROVALS_REQUIRED, newApprovalsRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getApprovedBy() {
		return (EList<User>)eDynamicGet(GitLabPackage.MERGE_REQUEST__APPROVED_BY, GitLabPackage.Literals.MERGE_REQUEST__APPROVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBlockingDiscussionsResolved() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED, GitLabPackage.Literals.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockingDiscussionsResolved(Boolean newBlockingDiscussionsResolved) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED, GitLabPackage.Literals.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED, newBlockingDiscussionsResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangesCount() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__CHANGES_COUNT, GitLabPackage.Literals.MERGE_REQUEST__CHANGES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangesCount(String newChangesCount) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__CHANGES_COUNT, GitLabPackage.Literals.MERGE_REQUEST__CHANGES_COUNT, newChangesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__CLOSED_AT, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedAt(Date newClosedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__CLOSED_AT, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_AT, newClosedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getClosedBy() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__CLOSED_BY, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetClosedBy() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__CLOSED_BY, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedBy(User newClosedBy) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__CLOSED_BY, GitLabPackage.Literals.MERGE_REQUEST__CLOSED_BY, newClosedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__CREATED_AT, GitLabPackage.Literals.MERGE_REQUEST__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__CREATED_AT, GitLabPackage.Literals.MERGE_REQUEST__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__DESCRIPTION, GitLabPackage.Literals.MERGE_REQUEST__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DESCRIPTION, GitLabPackage.Literals.MERGE_REQUEST__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailedMergeStatus() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS, GitLabPackage.Literals.MERGE_REQUEST__DETAILED_MERGE_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedMergeStatus(String newDetailedMergeStatus) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS, GitLabPackage.Literals.MERGE_REQUEST__DETAILED_MERGE_STATUS, newDetailedMergeStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDiscussionLocked() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED, GitLabPackage.Literals.MERGE_REQUEST__DISCUSSION_LOCKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscussionLocked(Boolean newDiscussionLocked) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED, GitLabPackage.Literals.MERGE_REQUEST__DISCUSSION_LOCKED, newDiscussionLocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDivergedCommitsCount() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT, GitLabPackage.Literals.MERGE_REQUEST__DIVERGED_COMMITS_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivergedCommitsCount(Integer newDivergedCommitsCount) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT, GitLabPackage.Literals.MERGE_REQUEST__DIVERGED_COMMITS_COUNT, newDivergedCommitsCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDownvotes() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__DOWNVOTES, GitLabPackage.Literals.MERGE_REQUEST__DOWNVOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownvotes(Integer newDownvotes) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__DOWNVOTES, GitLabPackage.Literals.MERGE_REQUEST__DOWNVOTES, newDownvotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForceRemoveSourceBranch() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForceRemoveSourceBranch(Boolean newForceRemoveSourceBranch) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH, newForceRemoveSourceBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasConflicts() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS, GitLabPackage.Literals.MERGE_REQUEST__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasConflicts(Boolean newHasConflicts) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS, GitLabPackage.Literals.MERGE_REQUEST__HAS_CONFLICTS, newHasConflicts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getLabels() {
		return (EList<String>)eDynamicGet(GitLabPackage.MERGE_REQUEST__LABELS, GitLabPackage.Literals.MERGE_REQUEST__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLatestBuildFinishedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT, GitLabPackage.Literals.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestBuildFinishedAt(Date newLatestBuildFinishedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT, GitLabPackage.Literals.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT, newLatestBuildFinishedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLatestBuildStartedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT, GitLabPackage.Literals.MERGE_REQUEST__LATEST_BUILD_STARTED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestBuildStartedAt(Date newLatestBuildStartedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT, GitLabPackage.Literals.MERGE_REQUEST__LATEST_BUILD_STARTED_AT, newLatestBuildStartedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMergeCommitSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST__MERGE_COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeCommitSha(String newMergeCommitSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST__MERGE_COMMIT_SHA, newMergeCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getMergedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGED_AT, GitLabPackage.Literals.MERGE_REQUEST__MERGED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergedAt(Date newMergedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGED_AT, GitLabPackage.Literals.MERGE_REQUEST__MERGED_AT, newMergedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getMergedBy() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGED_BY, GitLabPackage.Literals.MERGE_REQUEST__MERGED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetMergedBy() {
		return (User)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGED_BY, GitLabPackage.Literals.MERGE_REQUEST__MERGED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergedBy(User newMergedBy) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGED_BY, GitLabPackage.Literals.MERGE_REQUEST__MERGED_BY, newMergedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMergeError() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_ERROR, GitLabPackage.Literals.MERGE_REQUEST__MERGE_ERROR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeError(String newMergeError) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGE_ERROR, GitLabPackage.Literals.MERGE_REQUEST__MERGE_ERROR, newMergeError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMergeStatus() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_STATUS, GitLabPackage.Literals.MERGE_REQUEST__MERGE_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeStatus(String newMergeStatus) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGE_STATUS, GitLabPackage.Literals.MERGE_REQUEST__MERGE_STATUS, newMergeStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMergeWhenPipelineSucceeds() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS, GitLabPackage.Literals.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeWhenPipelineSucceeds(Boolean newMergeWhenPipelineSucceeds) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS, GitLabPackage.Literals.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS, newMergeWhenPipelineSucceeds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProjectId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST__PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectId(Long newProjectId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__PROJECT_ID, newProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRebaseInProgress() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS, GitLabPackage.Literals.MERGE_REQUEST__REBASE_IN_PROGRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRebaseInProgress(Boolean newRebaseInProgress) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS, GitLabPackage.Literals.MERGE_REQUEST__REBASE_IN_PROGRESS, newRebaseInProgress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__SHA, GitLabPackage.Literals.MERGE_REQUEST__SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSha(String newSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SHA, GitLabPackage.Literals.MERGE_REQUEST__SHA, newSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getShouldRemoveSourceBranch() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShouldRemoveSourceBranch(Boolean newShouldRemoveSourceBranch) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH, newShouldRemoveSourceBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceBranch() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__SOURCE_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceBranch(String newSourceBranch) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__SOURCE_BRANCH, newSourceBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSourceProjectId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__SOURCE_PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceProjectId(Long newSourceProjectId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__SOURCE_PROJECT_ID, newSourceProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSquash() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__SQUASH, GitLabPackage.Literals.MERGE_REQUEST__SQUASH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSquash(Boolean newSquash) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SQUASH, GitLabPackage.Literals.MERGE_REQUEST__SQUASH, newSquash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSquashCommitSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST__SQUASH_COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSquashCommitSha(String newSquashCommitSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST__SQUASH_COMMIT_SHA, newSquashCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__STATE, GitLabPackage.Literals.MERGE_REQUEST__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__STATE, GitLabPackage.Literals.MERGE_REQUEST__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSubscribed() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__SUBSCRIBED, GitLabPackage.Literals.MERGE_REQUEST__SUBSCRIBED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribed(Boolean newSubscribed) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__SUBSCRIBED, GitLabPackage.Literals.MERGE_REQUEST__SUBSCRIBED, newSubscribed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetBranch() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__TARGET_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__TARGET_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetBranch(String newTargetBranch) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__TARGET_BRANCH, GitLabPackage.Literals.MERGE_REQUEST__TARGET_BRANCH, newTargetBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTargetProjectId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__TARGET_PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetProjectId(Long newTargetProjectId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID, GitLabPackage.Literals.MERGE_REQUEST__TARGET_PROJECT_ID, newTargetProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__TITLE, GitLabPackage.Literals.MERGE_REQUEST__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__TITLE, GitLabPackage.Literals.MERGE_REQUEST__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST__UPDATED_AT, GitLabPackage.Literals.MERGE_REQUEST__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__UPDATED_AT, GitLabPackage.Literals.MERGE_REQUEST__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpvotes() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__UPVOTES, GitLabPackage.Literals.MERGE_REQUEST__UPVOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpvotes(Integer newUpvotes) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__UPVOTES, GitLabPackage.Literals.MERGE_REQUEST__UPVOTES, newUpvotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUserNotesCount() {
		return (Integer)eDynamicGet(GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT, GitLabPackage.Literals.MERGE_REQUEST__USER_NOTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserNotesCount(Integer newUserNotesCount) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT, GitLabPackage.Literals.MERGE_REQUEST__USER_NOTES_COUNT, newUserNotesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST__WEB_URL, GitLabPackage.Literals.MERGE_REQUEST__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__WEB_URL, GitLabPackage.Literals.MERGE_REQUEST__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWorkInProgress() {
		return (Boolean)eDynamicGet(GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS, GitLabPackage.Literals.MERGE_REQUEST__WORK_IN_PROGRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkInProgress(Boolean newWorkInProgress) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS, GitLabPackage.Literals.MERGE_REQUEST__WORK_IN_PROGRESS, newWorkInProgress);
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
			case GitLabPackage.MERGE_REQUEST__APPROVAL_RULES:
				return getApprovalRules();
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATE:
				if (resolve) return getApprovalState();
				return basicGetApprovalState();
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATUS:
				return getApprovalStatus();
			case GitLabPackage.MERGE_REQUEST__CLOSED_ISSUES:
				return getClosedIssues();
			case GitLabPackage.MERGE_REQUEST__COMMITS:
				return getCommits();
			case GitLabPackage.MERGE_REQUEST__DIFFS:
				return getDiffs();
			case GitLabPackage.MERGE_REQUEST__DIFF_VERSIONS:
				return getDiffVersions();
			case GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION:
				return isAllowCollaboration();
			case GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH:
				return getAllowMaintainerToPush();
			case GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE:
				return getApprovalsBeforeMerge();
			case GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT:
				return getApprovalsLeft();
			case GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED:
				return getApprovalsRequired();
			case GitLabPackage.MERGE_REQUEST__APPROVED_BY:
				return getApprovedBy();
			case GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED:
				return getBlockingDiscussionsResolved();
			case GitLabPackage.MERGE_REQUEST__CHANGES_COUNT:
				return getChangesCount();
			case GitLabPackage.MERGE_REQUEST__CLOSED_AT:
				return getClosedAt();
			case GitLabPackage.MERGE_REQUEST__CLOSED_BY:
				if (resolve) return getClosedBy();
				return basicGetClosedBy();
			case GitLabPackage.MERGE_REQUEST__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.MERGE_REQUEST__DESCRIPTION:
				return getDescription();
			case GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS:
				return getDetailedMergeStatus();
			case GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED:
				return getDiscussionLocked();
			case GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT:
				return getDivergedCommitsCount();
			case GitLabPackage.MERGE_REQUEST__DOWNVOTES:
				return getDownvotes();
			case GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH:
				return getForceRemoveSourceBranch();
			case GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS:
				return getHasConflicts();
			case GitLabPackage.MERGE_REQUEST__LABELS:
				return getLabels();
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT:
				return getLatestBuildFinishedAt();
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT:
				return getLatestBuildStartedAt();
			case GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA:
				return getMergeCommitSha();
			case GitLabPackage.MERGE_REQUEST__MERGED_AT:
				return getMergedAt();
			case GitLabPackage.MERGE_REQUEST__MERGED_BY:
				if (resolve) return getMergedBy();
				return basicGetMergedBy();
			case GitLabPackage.MERGE_REQUEST__MERGE_ERROR:
				return getMergeError();
			case GitLabPackage.MERGE_REQUEST__MERGE_STATUS:
				return getMergeStatus();
			case GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS:
				return getMergeWhenPipelineSucceeds();
			case GitLabPackage.MERGE_REQUEST__PROJECT_ID:
				return getProjectId();
			case GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS:
				return getRebaseInProgress();
			case GitLabPackage.MERGE_REQUEST__SHA:
				return getSha();
			case GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH:
				return getShouldRemoveSourceBranch();
			case GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH:
				return getSourceBranch();
			case GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID:
				return getSourceProjectId();
			case GitLabPackage.MERGE_REQUEST__SQUASH:
				return getSquash();
			case GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA:
				return getSquashCommitSha();
			case GitLabPackage.MERGE_REQUEST__STATE:
				return getState();
			case GitLabPackage.MERGE_REQUEST__SUBSCRIBED:
				return getSubscribed();
			case GitLabPackage.MERGE_REQUEST__TARGET_BRANCH:
				return getTargetBranch();
			case GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID:
				return getTargetProjectId();
			case GitLabPackage.MERGE_REQUEST__TITLE:
				return getTitle();
			case GitLabPackage.MERGE_REQUEST__UPDATED_AT:
				return getUpdatedAt();
			case GitLabPackage.MERGE_REQUEST__UPVOTES:
				return getUpvotes();
			case GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT:
				return getUserNotesCount();
			case GitLabPackage.MERGE_REQUEST__WEB_URL:
				return getWebUrl();
			case GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS:
				return getWorkInProgress();
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
			case GitLabPackage.MERGE_REQUEST__APPROVAL_RULES:
				getApprovalRules().clear();
				getApprovalRules().addAll((Collection<? extends ApprovalRule>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATE:
				setApprovalState((ApprovalState)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATUS:
				getApprovalStatus().clear();
				getApprovalStatus().addAll((Collection<? extends Issue>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_ISSUES:
				getClosedIssues().clear();
				getClosedIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__COMMITS:
				getCommits().clear();
				getCommits().addAll((Collection<? extends Commit>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DIFFS:
				getDiffs().clear();
				getDiffs().addAll((Collection<? extends Diff>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DIFF_VERSIONS:
				getDiffVersions().clear();
				getDiffVersions().addAll((Collection<? extends MergeRequestDiff>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION:
				setAllowCollaboration((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH:
				setAllowMaintainerToPush((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE:
				setApprovalsBeforeMerge((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT:
				setApprovalsLeft((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED:
				setApprovalsRequired((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVED_BY:
				getApprovedBy().clear();
				getApprovedBy().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED:
				setBlockingDiscussionsResolved((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CHANGES_COUNT:
				setChangesCount((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_AT:
				setClosedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_BY:
				setClosedBy((User)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS:
				setDetailedMergeStatus((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED:
				setDiscussionLocked((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT:
				setDivergedCommitsCount((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__DOWNVOTES:
				setDownvotes((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH:
				setForceRemoveSourceBranch((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS:
				setHasConflicts((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT:
				setLatestBuildFinishedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT:
				setLatestBuildStartedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA:
				setMergeCommitSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGED_AT:
				setMergedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGED_BY:
				setMergedBy((User)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_ERROR:
				setMergeError((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_STATUS:
				setMergeStatus((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS:
				setMergeWhenPipelineSucceeds((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__PROJECT_ID:
				setProjectId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS:
				setRebaseInProgress((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SHA:
				setSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH:
				setShouldRemoveSourceBranch((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH:
				setSourceBranch((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID:
				setSourceProjectId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SQUASH:
				setSquash((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA:
				setSquashCommitSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__STATE:
				setState((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__SUBSCRIBED:
				setSubscribed((Boolean)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__TARGET_BRANCH:
				setTargetBranch((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID:
				setTargetProjectId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__TITLE:
				setTitle((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__UPVOTES:
				setUpvotes((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT:
				setUserNotesCount((Integer)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS:
				setWorkInProgress((Boolean)newValue);
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
			case GitLabPackage.MERGE_REQUEST__APPROVAL_RULES:
				getApprovalRules().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATE:
				setApprovalState((ApprovalState)null);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATUS:
				getApprovalStatus().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_ISSUES:
				getClosedIssues().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__COMMITS:
				getCommits().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__DIFFS:
				getDiffs().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__DIFF_VERSIONS:
				getDiffVersions().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION:
				setAllowCollaboration(ALLOW_COLLABORATION_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH:
				setAllowMaintainerToPush(ALLOW_MAINTAINER_TO_PUSH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE:
				setApprovalsBeforeMerge(APPROVALS_BEFORE_MERGE_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT:
				setApprovalsLeft(APPROVALS_LEFT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED:
				setApprovalsRequired(APPROVALS_REQUIRED_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__APPROVED_BY:
				getApprovedBy().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED:
				setBlockingDiscussionsResolved(BLOCKING_DISCUSSIONS_RESOLVED_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__CHANGES_COUNT:
				setChangesCount(CHANGES_COUNT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_AT:
				setClosedAt(CLOSED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__CLOSED_BY:
				setClosedBy((User)null);
				return;
			case GitLabPackage.MERGE_REQUEST__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS:
				setDetailedMergeStatus(DETAILED_MERGE_STATUS_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED:
				setDiscussionLocked(DISCUSSION_LOCKED_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT:
				setDivergedCommitsCount(DIVERGED_COMMITS_COUNT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__DOWNVOTES:
				setDownvotes(DOWNVOTES_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH:
				setForceRemoveSourceBranch(FORCE_REMOVE_SOURCE_BRANCH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS:
				setHasConflicts(HAS_CONFLICTS_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__LABELS:
				getLabels().clear();
				return;
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT:
				setLatestBuildFinishedAt(LATEST_BUILD_FINISHED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT:
				setLatestBuildStartedAt(LATEST_BUILD_STARTED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA:
				setMergeCommitSha(MERGE_COMMIT_SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGED_AT:
				setMergedAt(MERGED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGED_BY:
				setMergedBy((User)null);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_ERROR:
				setMergeError(MERGE_ERROR_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_STATUS:
				setMergeStatus(MERGE_STATUS_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS:
				setMergeWhenPipelineSucceeds(MERGE_WHEN_PIPELINE_SUCCEEDS_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS:
				setRebaseInProgress(REBASE_IN_PROGRESS_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SHA:
				setSha(SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH:
				setShouldRemoveSourceBranch(SHOULD_REMOVE_SOURCE_BRANCH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH:
				setSourceBranch(SOURCE_BRANCH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID:
				setSourceProjectId(SOURCE_PROJECT_ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SQUASH:
				setSquash(SQUASH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA:
				setSquashCommitSha(SQUASH_COMMIT_SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__SUBSCRIBED:
				setSubscribed(SUBSCRIBED_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__TARGET_BRANCH:
				setTargetBranch(TARGET_BRANCH_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID:
				setTargetProjectId(TARGET_PROJECT_ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__UPVOTES:
				setUpvotes(UPVOTES_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT:
				setUserNotesCount(USER_NOTES_COUNT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS:
				setWorkInProgress(WORK_IN_PROGRESS_EDEFAULT);
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
			case GitLabPackage.MERGE_REQUEST__APPROVAL_RULES:
				return !getApprovalRules().isEmpty();
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATE:
				return basicGetApprovalState() != null;
			case GitLabPackage.MERGE_REQUEST__APPROVAL_STATUS:
				return !getApprovalStatus().isEmpty();
			case GitLabPackage.MERGE_REQUEST__CLOSED_ISSUES:
				return !getClosedIssues().isEmpty();
			case GitLabPackage.MERGE_REQUEST__COMMITS:
				return !getCommits().isEmpty();
			case GitLabPackage.MERGE_REQUEST__DIFFS:
				return !getDiffs().isEmpty();
			case GitLabPackage.MERGE_REQUEST__DIFF_VERSIONS:
				return !getDiffVersions().isEmpty();
			case GitLabPackage.MERGE_REQUEST__ALLOW_COLLABORATION:
				return isAllowCollaboration() != ALLOW_COLLABORATION_EDEFAULT;
			case GitLabPackage.MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH:
				return ALLOW_MAINTAINER_TO_PUSH_EDEFAULT == null ? getAllowMaintainerToPush() != null : !ALLOW_MAINTAINER_TO_PUSH_EDEFAULT.equals(getAllowMaintainerToPush());
			case GitLabPackage.MERGE_REQUEST__APPROVALS_BEFORE_MERGE:
				return APPROVALS_BEFORE_MERGE_EDEFAULT == null ? getApprovalsBeforeMerge() != null : !APPROVALS_BEFORE_MERGE_EDEFAULT.equals(getApprovalsBeforeMerge());
			case GitLabPackage.MERGE_REQUEST__APPROVALS_LEFT:
				return APPROVALS_LEFT_EDEFAULT == null ? getApprovalsLeft() != null : !APPROVALS_LEFT_EDEFAULT.equals(getApprovalsLeft());
			case GitLabPackage.MERGE_REQUEST__APPROVALS_REQUIRED:
				return APPROVALS_REQUIRED_EDEFAULT == null ? getApprovalsRequired() != null : !APPROVALS_REQUIRED_EDEFAULT.equals(getApprovalsRequired());
			case GitLabPackage.MERGE_REQUEST__APPROVED_BY:
				return !getApprovedBy().isEmpty();
			case GitLabPackage.MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED:
				return BLOCKING_DISCUSSIONS_RESOLVED_EDEFAULT == null ? getBlockingDiscussionsResolved() != null : !BLOCKING_DISCUSSIONS_RESOLVED_EDEFAULT.equals(getBlockingDiscussionsResolved());
			case GitLabPackage.MERGE_REQUEST__CHANGES_COUNT:
				return CHANGES_COUNT_EDEFAULT == null ? getChangesCount() != null : !CHANGES_COUNT_EDEFAULT.equals(getChangesCount());
			case GitLabPackage.MERGE_REQUEST__CLOSED_AT:
				return CLOSED_AT_EDEFAULT == null ? getClosedAt() != null : !CLOSED_AT_EDEFAULT.equals(getClosedAt());
			case GitLabPackage.MERGE_REQUEST__CLOSED_BY:
				return basicGetClosedBy() != null;
			case GitLabPackage.MERGE_REQUEST__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.MERGE_REQUEST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GitLabPackage.MERGE_REQUEST__DETAILED_MERGE_STATUS:
				return DETAILED_MERGE_STATUS_EDEFAULT == null ? getDetailedMergeStatus() != null : !DETAILED_MERGE_STATUS_EDEFAULT.equals(getDetailedMergeStatus());
			case GitLabPackage.MERGE_REQUEST__DISCUSSION_LOCKED:
				return DISCUSSION_LOCKED_EDEFAULT == null ? getDiscussionLocked() != null : !DISCUSSION_LOCKED_EDEFAULT.equals(getDiscussionLocked());
			case GitLabPackage.MERGE_REQUEST__DIVERGED_COMMITS_COUNT:
				return DIVERGED_COMMITS_COUNT_EDEFAULT == null ? getDivergedCommitsCount() != null : !DIVERGED_COMMITS_COUNT_EDEFAULT.equals(getDivergedCommitsCount());
			case GitLabPackage.MERGE_REQUEST__DOWNVOTES:
				return DOWNVOTES_EDEFAULT == null ? getDownvotes() != null : !DOWNVOTES_EDEFAULT.equals(getDownvotes());
			case GitLabPackage.MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH:
				return FORCE_REMOVE_SOURCE_BRANCH_EDEFAULT == null ? getForceRemoveSourceBranch() != null : !FORCE_REMOVE_SOURCE_BRANCH_EDEFAULT.equals(getForceRemoveSourceBranch());
			case GitLabPackage.MERGE_REQUEST__HAS_CONFLICTS:
				return HAS_CONFLICTS_EDEFAULT == null ? getHasConflicts() != null : !HAS_CONFLICTS_EDEFAULT.equals(getHasConflicts());
			case GitLabPackage.MERGE_REQUEST__LABELS:
				return !getLabels().isEmpty();
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_FINISHED_AT:
				return LATEST_BUILD_FINISHED_AT_EDEFAULT == null ? getLatestBuildFinishedAt() != null : !LATEST_BUILD_FINISHED_AT_EDEFAULT.equals(getLatestBuildFinishedAt());
			case GitLabPackage.MERGE_REQUEST__LATEST_BUILD_STARTED_AT:
				return LATEST_BUILD_STARTED_AT_EDEFAULT == null ? getLatestBuildStartedAt() != null : !LATEST_BUILD_STARTED_AT_EDEFAULT.equals(getLatestBuildStartedAt());
			case GitLabPackage.MERGE_REQUEST__MERGE_COMMIT_SHA:
				return MERGE_COMMIT_SHA_EDEFAULT == null ? getMergeCommitSha() != null : !MERGE_COMMIT_SHA_EDEFAULT.equals(getMergeCommitSha());
			case GitLabPackage.MERGE_REQUEST__MERGED_AT:
				return MERGED_AT_EDEFAULT == null ? getMergedAt() != null : !MERGED_AT_EDEFAULT.equals(getMergedAt());
			case GitLabPackage.MERGE_REQUEST__MERGED_BY:
				return basicGetMergedBy() != null;
			case GitLabPackage.MERGE_REQUEST__MERGE_ERROR:
				return MERGE_ERROR_EDEFAULT == null ? getMergeError() != null : !MERGE_ERROR_EDEFAULT.equals(getMergeError());
			case GitLabPackage.MERGE_REQUEST__MERGE_STATUS:
				return MERGE_STATUS_EDEFAULT == null ? getMergeStatus() != null : !MERGE_STATUS_EDEFAULT.equals(getMergeStatus());
			case GitLabPackage.MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS:
				return MERGE_WHEN_PIPELINE_SUCCEEDS_EDEFAULT == null ? getMergeWhenPipelineSucceeds() != null : !MERGE_WHEN_PIPELINE_SUCCEEDS_EDEFAULT.equals(getMergeWhenPipelineSucceeds());
			case GitLabPackage.MERGE_REQUEST__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? getProjectId() != null : !PROJECT_ID_EDEFAULT.equals(getProjectId());
			case GitLabPackage.MERGE_REQUEST__REBASE_IN_PROGRESS:
				return REBASE_IN_PROGRESS_EDEFAULT == null ? getRebaseInProgress() != null : !REBASE_IN_PROGRESS_EDEFAULT.equals(getRebaseInProgress());
			case GitLabPackage.MERGE_REQUEST__SHA:
				return SHA_EDEFAULT == null ? getSha() != null : !SHA_EDEFAULT.equals(getSha());
			case GitLabPackage.MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH:
				return SHOULD_REMOVE_SOURCE_BRANCH_EDEFAULT == null ? getShouldRemoveSourceBranch() != null : !SHOULD_REMOVE_SOURCE_BRANCH_EDEFAULT.equals(getShouldRemoveSourceBranch());
			case GitLabPackage.MERGE_REQUEST__SOURCE_BRANCH:
				return SOURCE_BRANCH_EDEFAULT == null ? getSourceBranch() != null : !SOURCE_BRANCH_EDEFAULT.equals(getSourceBranch());
			case GitLabPackage.MERGE_REQUEST__SOURCE_PROJECT_ID:
				return SOURCE_PROJECT_ID_EDEFAULT == null ? getSourceProjectId() != null : !SOURCE_PROJECT_ID_EDEFAULT.equals(getSourceProjectId());
			case GitLabPackage.MERGE_REQUEST__SQUASH:
				return SQUASH_EDEFAULT == null ? getSquash() != null : !SQUASH_EDEFAULT.equals(getSquash());
			case GitLabPackage.MERGE_REQUEST__SQUASH_COMMIT_SHA:
				return SQUASH_COMMIT_SHA_EDEFAULT == null ? getSquashCommitSha() != null : !SQUASH_COMMIT_SHA_EDEFAULT.equals(getSquashCommitSha());
			case GitLabPackage.MERGE_REQUEST__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case GitLabPackage.MERGE_REQUEST__SUBSCRIBED:
				return SUBSCRIBED_EDEFAULT == null ? getSubscribed() != null : !SUBSCRIBED_EDEFAULT.equals(getSubscribed());
			case GitLabPackage.MERGE_REQUEST__TARGET_BRANCH:
				return TARGET_BRANCH_EDEFAULT == null ? getTargetBranch() != null : !TARGET_BRANCH_EDEFAULT.equals(getTargetBranch());
			case GitLabPackage.MERGE_REQUEST__TARGET_PROJECT_ID:
				return TARGET_PROJECT_ID_EDEFAULT == null ? getTargetProjectId() != null : !TARGET_PROJECT_ID_EDEFAULT.equals(getTargetProjectId());
			case GitLabPackage.MERGE_REQUEST__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case GitLabPackage.MERGE_REQUEST__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GitLabPackage.MERGE_REQUEST__UPVOTES:
				return UPVOTES_EDEFAULT == null ? getUpvotes() != null : !UPVOTES_EDEFAULT.equals(getUpvotes());
			case GitLabPackage.MERGE_REQUEST__USER_NOTES_COUNT:
				return USER_NOTES_COUNT_EDEFAULT == null ? getUserNotesCount() != null : !USER_NOTES_COUNT_EDEFAULT.equals(getUserNotesCount());
			case GitLabPackage.MERGE_REQUEST__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.MERGE_REQUEST__WORK_IN_PROGRESS:
				return WORK_IN_PROGRESS_EDEFAULT == null ? getWorkInProgress() != null : !WORK_IN_PROGRESS_EDEFAULT.equals(getWorkInProgress());
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
