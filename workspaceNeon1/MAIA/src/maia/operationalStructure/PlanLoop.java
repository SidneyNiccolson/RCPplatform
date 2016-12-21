/**
 */
package maia.operationalStructure;

import maia.ontologicalStructure.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.PlanLoop#getPlan <em>Plan</em>}</li>
 *   <li>{@link maia.operationalStructure.PlanLoop#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getPlanLoop()
 * @model
 * @generated
 */
public interface PlanLoop extends Plan {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' reference.
	 * @see #setPlan(Plan)
	 * @see maia.operationalStructure.OperationalStructurePackage#getPlanLoop_Plan()
	 * @model required="true"
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.PlanLoop#getPlan <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see maia.operationalStructure.OperationalStructurePackage#getPlanLoop_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.PlanLoop#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // PlanLoop
