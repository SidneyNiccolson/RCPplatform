/**
 */
package maia.evaluativeStructure;

import maia.ontologicalStructure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.PropertyVariable#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getPropertyVariable()
 * @model
 * @generated
 */
public interface PropertyVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getPropertyVariable_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.PropertyVariable#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyVariable
