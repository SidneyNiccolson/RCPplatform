/**
 */
package maia.evaluativeStructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maia.evaluativeStructure.EvaluativeStructurePackage
 * @generated
 */
public interface EvaluativeStructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvaluativeStructureFactory eINSTANCE = maia.evaluativeStructure.impl.EvaluativeStructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Debugging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debugging</em>'.
	 * @generated
	 */
	Debugging createDebugging();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>Evaluative Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluative Structure</em>'.
	 * @generated
	 */
	EvaluativeStructure createEvaluativeStructure();

	/**
	 * Returns a new object of class '<em>Property Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Variable</em>'.
	 * @generated
	 */
	PropertyVariable createPropertyVariable();

	/**
	 * Returns a new object of class '<em>Personal Value Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Value Variable</em>'.
	 * @generated
	 */
	PersonalValueVariable createPersonalValueVariable();

	/**
	 * Returns a new object of class '<em>Ontological Concept Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontological Concept Variable</em>'.
	 * @generated
	 */
	OntologicalConceptVariable createOntologicalConceptVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvaluativeStructurePackage getEvaluativeStructurePackage();

} //EvaluativeStructureFactory
