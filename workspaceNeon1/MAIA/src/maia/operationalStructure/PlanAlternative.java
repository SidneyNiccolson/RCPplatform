/**
 */
package maia.operationalStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.PlanAlternative#getPlan1 <em>Plan1</em>}</li>
 *   <li>{@link maia.operationalStructure.PlanAlternative#getPlan2 <em>Plan2</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getPlanAlternative()
 * @model
 * @generated
 */
public interface PlanAlternative extends Plan {
	/**
	 * Returns the value of the '<em><b>Plan1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan1</em>' reference.
	 * @see #setPlan1(Plan)
	 * @see maia.operationalStructure.OperationalStructurePackage#getPlanAlternative_Plan1()
	 * @model required="true"
	 * @generated
	 */
	Plan getPlan1();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.PlanAlternative#getPlan1 <em>Plan1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan1</em>' reference.
	 * @see #getPlan1()
	 * @generated
	 */
	void setPlan1(Plan value);

	/**
	 * Returns the value of the '<em><b>Plan2</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan2</em>' reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getPlanAlternative_Plan2()
	 * @model required="true"
	 * @generated
	 */
	EList<Plan> getPlan2();

} // PlanAlternative
