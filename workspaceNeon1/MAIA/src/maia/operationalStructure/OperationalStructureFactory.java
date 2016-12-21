/**
 */
package maia.operationalStructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maia.operationalStructure.OperationalStructurePackage
 * @generated
 */
public interface OperationalStructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalStructureFactory eINSTANCE = maia.operationalStructure.impl.OperationalStructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Body</em>'.
	 * @generated
	 */
	ActionBody createActionBody();

	/**
	 * Returns a new object of class '<em>Entity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Action</em>'.
	 * @generated
	 */
	EntityAction createEntityAction();

	/**
	 * Returns a new object of class '<em>Action Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Situation</em>'.
	 * @generated
	 */
	ActionSituation createActionSituation();

	/**
	 * Returns a new object of class '<em>Action Arena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Arena</em>'.
	 * @generated
	 */
	ActionArena createActionArena();

	/**
	 * Returns a new object of class '<em>Role Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Enactment</em>'.
	 * @generated
	 */
	RoleEnactment createRoleEnactment();

	/**
	 * Returns a new object of class '<em>Plan Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Sequence</em>'.
	 * @generated
	 */
	PlanSequence createPlanSequence();

	/**
	 * Returns a new object of class '<em>Plan Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Alternative</em>'.
	 * @generated
	 */
	PlanAlternative createPlanAlternative();

	/**
	 * Returns a new object of class '<em>Plan Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Loop</em>'.
	 * @generated
	 */
	PlanLoop createPlanLoop();

	/**
	 * Returns a new object of class '<em>Operational Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Structure</em>'.
	 * @generated
	 */
	OperationalStructure createOperationalStructure();

	/**
	 * Returns a new object of class '<em>Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performer</em>'.
	 * @generated
	 */
	Performer createPerformer();

	/**
	 * Returns a new object of class '<em>Plan Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Condition</em>'.
	 * @generated
	 */
	PlanCondition createPlanCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationalStructurePackage getOperationalStructurePackage();

} //OperationalStructureFactory
