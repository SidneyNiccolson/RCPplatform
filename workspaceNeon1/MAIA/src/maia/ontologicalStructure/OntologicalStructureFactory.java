/**
 */
package maia.ontologicalStructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maia.ontologicalStructure.OntologicalStructurePackage
 * @generated
 */
public interface OntologicalStructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologicalStructureFactory eINSTANCE = maia.ontologicalStructure.impl.OntologicalStructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ontological Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontological Structure</em>'.
	 * @generated
	 */
	OntologicalStructure createOntologicalStructure();

	/**
	 * Returns a new object of class '<em>Ontological Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontological Concept</em>'.
	 * @generated
	 */
	OntologicalConcept createOntologicalConcept();

	/**
	 * Returns a new object of class '<em>Natural Lang Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Lang Condition</em>'.
	 * @generated
	 */
	NaturalLangCondition createNaturalLangCondition();

	/**
	 * Returns a new object of class '<em>Negformula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negformula</em>'.
	 * @generated
	 */
	Negformula createNegformula();

	/**
	 * Returns a new object of class '<em>ORformula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ORformula</em>'.
	 * @generated
	 */
	ORformula createORformula();

	/**
	 * Returns a new object of class '<em>AN Dformula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AN Dformula</em>'.
	 * @generated
	 */
	ANDformula createANDformula();

	/**
	 * Returns a new object of class '<em>equal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equal Formula</em>'.
	 * @generated
	 */
	equalFormula createequalFormula();

	/**
	 * Returns a new object of class '<em>more Eqformula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>more Eqformula</em>'.
	 * @generated
	 */
	moreEqformula createmoreEqformula();

	/**
	 * Returns a new object of class '<em>lessformula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>lessformula</em>'.
	 * @generated
	 */
	lessformula createlessformula();

	/**
	 * Returns a new object of class '<em>Number Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Property</em>'.
	 * @generated
	 */
	NumberProperty createNumberProperty();

	/**
	 * Returns a new object of class '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Property</em>'.
	 * @generated
	 */
	BooleanProperty createBooleanProperty();

	/**
	 * Returns a new object of class '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Property</em>'.
	 * @generated
	 */
	StringProperty createStringProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OntologicalStructurePackage getOntologicalStructurePackage();

} //OntologicalStructureFactory
