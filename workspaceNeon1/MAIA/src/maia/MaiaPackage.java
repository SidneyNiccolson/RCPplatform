/**
 */
package maia;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maia.MaiaFactory
 * @model kind="package"
 * @generated
 */
public interface MaiaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaiaPackage eINSTANCE = maia.impl.MaiaPackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.impl.MAIAImpl <em>MAIA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.impl.MAIAImpl
	 * @see maia.impl.MaiaPackageImpl#getMAIA()
	 * @generated
	 */
	int MAIA = 0;

	/**
	 * The feature id for the '<em><b>Constitutional Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__CONSTITUTIONAL_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Collective Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__COLLECTIVE_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Physical Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__PHYSICAL_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Operational Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__OPERATIONAL_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Evaluative Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__EVALUATIVE_STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Ontological Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA__ONTOLOGICAL_STRUCTURE = 5;

	/**
	 * The number of structural features of the '<em>MAIA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>MAIA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link maia.MAIA <em>MAIA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAIA</em>'.
	 * @see maia.MAIA
	 * @generated
	 */
	EClass getMAIA();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getConstitutionalStructure <em>Constitutional Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constitutional Structure</em>'.
	 * @see maia.MAIA#getConstitutionalStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_ConstitutionalStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getCollectiveStructure <em>Collective Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collective Structure</em>'.
	 * @see maia.MAIA#getCollectiveStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_CollectiveStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getPhysicalStructure <em>Physical Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Structure</em>'.
	 * @see maia.MAIA#getPhysicalStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_PhysicalStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getOperationalStructure <em>Operational Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational Structure</em>'.
	 * @see maia.MAIA#getOperationalStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_OperationalStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getEvaluativeStructure <em>Evaluative Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluative Structure</em>'.
	 * @see maia.MAIA#getEvaluativeStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_EvaluativeStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.MAIA#getOntologicalStructure <em>Ontological Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontological Structure</em>'.
	 * @see maia.MAIA#getOntologicalStructure()
	 * @see #getMAIA()
	 * @generated
	 */
	EReference getMAIA_OntologicalStructure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaiaFactory getMaiaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maia.impl.MAIAImpl <em>MAIA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.impl.MAIAImpl
		 * @see maia.impl.MaiaPackageImpl#getMAIA()
		 * @generated
		 */
		EClass MAIA = eINSTANCE.getMAIA();

		/**
		 * The meta object literal for the '<em><b>Constitutional Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__CONSTITUTIONAL_STRUCTURE = eINSTANCE.getMAIA_ConstitutionalStructure();

		/**
		 * The meta object literal for the '<em><b>Collective Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__COLLECTIVE_STRUCTURE = eINSTANCE.getMAIA_CollectiveStructure();

		/**
		 * The meta object literal for the '<em><b>Physical Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__PHYSICAL_STRUCTURE = eINSTANCE.getMAIA_PhysicalStructure();

		/**
		 * The meta object literal for the '<em><b>Operational Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__OPERATIONAL_STRUCTURE = eINSTANCE.getMAIA_OperationalStructure();

		/**
		 * The meta object literal for the '<em><b>Evaluative Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__EVALUATIVE_STRUCTURE = eINSTANCE.getMAIA_EvaluativeStructure();

		/**
		 * The meta object literal for the '<em><b>Ontological Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIA__ONTOLOGICAL_STRUCTURE = eINSTANCE.getMAIA_OntologicalStructure();

	}

} //MaiaPackage
