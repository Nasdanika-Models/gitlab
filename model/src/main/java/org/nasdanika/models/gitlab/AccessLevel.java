/**
 */
package org.nasdanika.models.gitlab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.GitLabPackage#getAccessLevel()
 * @model
 * @generated
 */
public enum AccessLevel implements Enumerator {
	/**
	 * The '<em><b>Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(-1, "Invalid", "Invalid"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Minimal Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMAL_ACCESS(5, "MinimalAccess", "MinimalAccess"),

	/**
	 * The '<em><b>Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	GUEST(10, "Guest", "Guest"),

	/**
	 * The '<em><b>Reporter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTER_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTER(20, "Reporter", "Reporter"),

	/**
	 * The '<em><b>Developer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPER(30, "Developer", "Developer"),

	/**
	 * The '<em><b>Maintainer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINER(40, "Maintainer", "Maintainer"),

	/**
	 * The '<em><b>Owner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER(50, "Owner", "Owner"),

	/**
	 * The '<em><b>Admin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN(60, "Admin", "Admin");

	/**
	 * The '<em><b>Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID
	 * @model name="Invalid"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = -1;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Minimal Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_ACCESS
	 * @model name="MinimalAccess"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMAL_ACCESS_VALUE = 5;

	/**
	 * The '<em><b>Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUEST
	 * @model name="Guest"
	 * @generated
	 * @ordered
	 */
	public static final int GUEST_VALUE = 10;

	/**
	 * The '<em><b>Reporter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTER
	 * @model name="Reporter"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTER_VALUE = 20;

	/**
	 * The '<em><b>Developer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER
	 * @model name="Developer"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPER_VALUE = 30;

	/**
	 * The '<em><b>Maintainer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINER
	 * @model name="Maintainer"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINER_VALUE = 40;

	/**
	 * The '<em><b>Owner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER
	 * @model name="Owner"
	 * @generated
	 * @ordered
	 */
	public static final int OWNER_VALUE = 50;

	/**
	 * The '<em><b>Admin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @model name="Admin"
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_VALUE = 60;

	/**
	 * An array of all the '<em><b>Access Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessLevel[] VALUES_ARRAY =
		new AccessLevel[] {
			INVALID,
			NONE,
			MINIMAL_ACCESS,
			GUEST,
			REPORTER,
			DEVELOPER,
			MAINTAINER,
			OWNER,
			ADMIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessLevel get(int value) {
		switch (value) {
			case INVALID_VALUE: return INVALID;
			case NONE_VALUE: return NONE;
			case MINIMAL_ACCESS_VALUE: return MINIMAL_ACCESS;
			case GUEST_VALUE: return GUEST;
			case REPORTER_VALUE: return REPORTER;
			case DEVELOPER_VALUE: return DEVELOPER;
			case MAINTAINER_VALUE: return MAINTAINER;
			case OWNER_VALUE: return OWNER;
			case ADMIN_VALUE: return ADMIN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccessLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AccessLevel
