/**
 */
package maia.constitutionalStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>deon Logic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getdeonLogicType()
 * @model
 * @generated
 */
public enum deonLogicType implements Enumerator {
	/**
	 * The '<em><b>Obliges</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGES_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGES(0, "obliges", "obliges"),

	/**
	 * The '<em><b>Permits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMITS_VALUE
	 * @generated
	 * @ordered
	 */
	PERMITS(1, "permits", "permits"),

	/**
	 * The '<em><b>Prohibits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROHIBITS_VALUE
	 * @generated
	 * @ordered
	 */
	PROHIBITS(2, "prohibits", "prohibits");

	/**
	 * The '<em><b>Obliges</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obliges</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBLIGES
	 * @model name="obliges"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGES_VALUE = 0;

	/**
	 * The '<em><b>Permits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMITS
	 * @model name="permits"
	 * @generated
	 * @ordered
	 */
	public static final int PERMITS_VALUE = 1;

	/**
	 * The '<em><b>Prohibits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prohibits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROHIBITS
	 * @model name="prohibits"
	 * @generated
	 * @ordered
	 */
	public static final int PROHIBITS_VALUE = 2;

	/**
	 * An array of all the '<em><b>deon Logic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final deonLogicType[] VALUES_ARRAY =
		new deonLogicType[] {
			OBLIGES,
			PERMITS,
			PROHIBITS,
		};

	/**
	 * A public read-only list of all the '<em><b>deon Logic Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<deonLogicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>deon Logic Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static deonLogicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			deonLogicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>deon Logic Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static deonLogicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			deonLogicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>deon Logic Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static deonLogicType get(int value) {
		switch (value) {
			case OBLIGES_VALUE: return OBLIGES;
			case PERMITS_VALUE: return PERMITS;
			case PROHIBITS_VALUE: return PROHIBITS;
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
	private deonLogicType(int value, String name, String literal) {
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
	
} //deonLogicType
