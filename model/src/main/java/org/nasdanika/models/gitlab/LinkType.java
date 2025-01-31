/**
 */
package org.nasdanika.models.gitlab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.GitLabPackage#getLinkType()
 * @model
 * @generated
 */
public enum LinkType implements Enumerator {
	/**
	 * The '<em><b>RELATES TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATES_TO_VALUE
	 * @generated
	 * @ordered
	 */
	RELATES_TO(0, "RELATES_TO", "RELATES_TO"),

	/**
	 * The '<em><b>BLOCKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKS_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKS(1, "BLOCKS", "BLOCKS"),

	/**
	 * The '<em><b>IS BLOCKED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BLOCKED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_BLOCKED_BY(2, "IS_BLOCKED_BY", "IS_BLOCKED_BY");

	/**
	 * The '<em><b>RELATES TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATES_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATES_TO_VALUE = 0;

	/**
	 * The '<em><b>BLOCKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKS_VALUE = 1;

	/**
	 * The '<em><b>IS BLOCKED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_BLOCKED_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_BLOCKED_BY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinkType[] VALUES_ARRAY =
		new LinkType[] {
			RELATES_TO,
			BLOCKS,
			IS_BLOCKED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType get(int value) {
		switch (value) {
			case RELATES_TO_VALUE: return RELATES_TO;
			case BLOCKS_VALUE: return BLOCKS;
			case IS_BLOCKED_BY_VALUE: return IS_BLOCKED_BY;
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
	private LinkType(int value, String name, String literal) {
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
	
} //LinkType
