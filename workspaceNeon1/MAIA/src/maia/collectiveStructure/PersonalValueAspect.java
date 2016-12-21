/**
 */
package maia.collectiveStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Value Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.PersonalValueAspect#getPersonalValue <em>Personal Value</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValueAspect()
 * @model
 * @generated
 */
public interface PersonalValueAspect extends DecisionCriterion {
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
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValueAspect_PersonalValue()
	 * @model required="true"
	 * @generated
	 */
	PersonalValue getPersonalValue();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.PersonalValueAspect#getPersonalValue <em>Personal Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Value</em>' reference.
	 * @see #getPersonalValue()
	 * @generated
	 */
	void setPersonalValue(PersonalValue value);

} // PersonalValueAspect
