/**
 */
package maia.evaluativeStructure;

import maia.collectiveStructure.PersonalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Value Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.PersonalValueVariable#getPersonalValue <em>Personal Value</em>}</li>
 * </ul>
 *
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getPersonalValueVariable()
 * @model
 * @generated
 */
public interface PersonalValueVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Personal Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Value</em>' reference.
	 * @see #setPersonalValue(PersonalValue)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getPersonalValueVariable_PersonalValue()
	 * @model
	 * @generated
	 */
	PersonalValue getPersonalValue();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.PersonalValueVariable#getPersonalValue <em>Personal Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Value</em>' reference.
	 * @see #getPersonalValue()
	 * @generated
	 */
	void setPersonalValue(PersonalValue value);

} // PersonalValueVariable
