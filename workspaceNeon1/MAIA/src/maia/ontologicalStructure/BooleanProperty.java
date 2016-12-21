/**
 */
package maia.ontologicalStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.BooleanProperty#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see maia.ontologicalStructure.OntologicalStructurePackage#getBooleanProperty()
 * @model
 * @generated
 */
public interface BooleanProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getBooleanProperty_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link maia.ontologicalStructure.BooleanProperty#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanProperty
