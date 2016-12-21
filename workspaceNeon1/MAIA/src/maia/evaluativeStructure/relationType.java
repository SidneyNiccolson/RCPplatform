/**
 */
package maia.evaluativeStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getrelationType()
 * @model
 * @generated
 */
public enum relationType implements Enumerator {
	/**
	 * The '<em><b>Direct Relationship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_RELATIONSHIP(1, "directRelationship", "directRelationship"),

	/**
	 * The '<em><b>Indirect Relationship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIRECT_RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	INDIRECT_RELATIONSHIP(2, "indirectRelationship", "indirectRelationship");

	/**
	 * The '<em><b>Direct Relationship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Direct Relationship</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT_RELATIONSHIP
	 * @model name="directRelationship"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_RELATIONSHIP_VALUE = 1;

	/**
	 * The '<em><b>Indirect Relationship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indirect Relationship</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDIRECT_RELATIONSHIP
	 * @model name="indirectRelationship"
	 * @generated
	 * @ordered
	 */
	public static final int INDIRECT_RELATIONSHIP_VALUE = 2;

	/**
	 * An array of all the '<em><b>relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final relationType[] VALUES_ARRAY =
		new relationType[] {
			DIRECT_RELATIONSHIP,
			INDIRECT_RELATIONSHIP,
		};

	/**
	 * A public read-only list of all the '<em><b>relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<relationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static relationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			relationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static relationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			relationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static relationType get(int value) {
		switch (value) {
			case DIRECT_RELATIONSHIP_VALUE: return DIRECT_RELATIONSHIP;
			case INDIRECT_RELATIONSHIP_VALUE: return INDIRECT_RELATIONSHIP;
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
	private relationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //relationType
