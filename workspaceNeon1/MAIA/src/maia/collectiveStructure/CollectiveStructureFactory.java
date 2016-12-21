/**
 */
package maia.collectiveStructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maia.collectiveStructure.CollectiveStructurePackage
 * @generated
 */
public interface CollectiveStructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectiveStructureFactory eINSTANCE = maia.collectiveStructure.impl.CollectiveStructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Personal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Value</em>'.
	 * @generated
	 */
	PersonalValue createPersonalValue();

	/**
	 * Returns a new object of class '<em>Decision Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Influence</em>'.
	 * @generated
	 */
	DecisionInfluence createDecisionInfluence();

	/**
	 * Returns a new object of class '<em>Collective Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collective Structure</em>'.
	 * @generated
	 */
	CollectiveStructure createCollectiveStructure();

	/**
	 * Returns a new object of class '<em>MCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MCDA</em>'.
	 * @generated
	 */
	MCDA createMCDA();

	/**
	 * Returns a new object of class '<em>Personal Value Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Value Aspect</em>'.
	 * @generated
	 */
	PersonalValueAspect createPersonalValueAspect();

	/**
	 * Returns a new object of class '<em>Property Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Aspect</em>'.
	 * @generated
	 */
	PropertyAspect createPropertyAspect();

	/**
	 * Returns a new object of class '<em>Condition Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Aspect</em>'.
	 * @generated
	 */
	ConditionAspect createConditionAspect();

	/**
	 * Returns a new object of class '<em>Sanction Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sanction Aspect</em>'.
	 * @generated
	 */
	SanctionAspect createSanctionAspect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CollectiveStructurePackage getCollectiveStructurePackage();

} //CollectiveStructureFactory
