/**
 */
package maia.ontologicalStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.NumberProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see maia.ontologicalStructure.OntologicalStructurePackage#getNumberProperty()
 * @model
 * @generated
 */
public interface NumberProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getNumberProperty_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link maia.ontologicalStructure.NumberProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // NumberProperty
