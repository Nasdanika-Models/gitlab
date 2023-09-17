/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.gitlab.RepositoryFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Owners</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.CodeOwners#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwners()
 * @model
 * @generated
 */
public interface CodeOwners extends RepositoryFile, DefaultSection {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.codeowners.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwners_Sections()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Section> getSections();

} // CodeOwners
