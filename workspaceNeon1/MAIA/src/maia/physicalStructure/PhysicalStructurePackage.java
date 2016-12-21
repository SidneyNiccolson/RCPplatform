/**
 */
package maia.physicalStructure;

import maia.operationalStructure.OperationalStructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see maia.physicalStructure.PhysicalStructureFactory
 * @model kind="package"
 * @generated
 */
public interface PhysicalStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "physicalStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/physicalStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "physicalStruct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhysicalStructurePackage eINSTANCE = maia.physicalStructure.impl.PhysicalStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.physicalStructure.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.physicalStructure.impl.PhysicalComponentImpl
	 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getPhysicalComponent()
	 * @generated
	 */
	int PHYSICAL_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__NAME = OperationalStructurePackage.PERFORMER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__TYPE = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affordance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__AFFORDANCE = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__BEHAVIOUR = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PROPERTY = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_FEATURE_COUNT = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_OPERATION_COUNT = OperationalStructurePackage.PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.physicalStructure.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.physicalStructure.impl.ConnectionImpl
	 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Connection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Begin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BEGIN_NODE = 1;

	/**
	 * The feature id for the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__END_NODE = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.physicalStructure.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.physicalStructure.impl.CompositionImpl
	 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Composition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__COMPOSITION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.physicalStructure.impl.PhysicalStructureImpl <em>Physical Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.physicalStructure.impl.PhysicalStructureImpl
	 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getPhysicalStructure()
	 * @generated
	 */
	int PHYSICAL_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Physical Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__COMPOSITION = 2;

	/**
	 * The number of structural features of the '<em>Physical Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Physical Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.physicalStructure.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.physicalStructure.ResourceType
	 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link maia.physicalStructure.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component</em>'.
	 * @see maia.physicalStructure.PhysicalComponent
	 * @generated
	 */
	EClass getPhysicalComponent();

	/**
	 * Returns the meta object for the attribute '{@link maia.physicalStructure.PhysicalComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maia.physicalStructure.PhysicalComponent#getType()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_Type();

	/**
	 * Returns the meta object for the reference list '{@link maia.physicalStructure.PhysicalComponent#getAffordance <em>Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affordance</em>'.
	 * @see maia.physicalStructure.PhysicalComponent#getAffordance()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_Affordance();

	/**
	 * Returns the meta object for the reference list '{@link maia.physicalStructure.PhysicalComponent#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviour</em>'.
	 * @see maia.physicalStructure.PhysicalComponent#getBehaviour()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_Behaviour();

	/**
	 * Returns the meta object for the reference list '{@link maia.physicalStructure.PhysicalComponent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see maia.physicalStructure.PhysicalComponent#getProperty()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_Property();

	/**
	 * Returns the meta object for class '{@link maia.physicalStructure.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see maia.physicalStructure.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link maia.physicalStructure.Connection#getConnectionName <em>Connection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Name</em>'.
	 * @see maia.physicalStructure.Connection#getConnectionName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionName();

	/**
	 * Returns the meta object for the reference '{@link maia.physicalStructure.Connection#getBeginNode <em>Begin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin Node</em>'.
	 * @see maia.physicalStructure.Connection#getBeginNode()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_BeginNode();

	/**
	 * Returns the meta object for the reference '{@link maia.physicalStructure.Connection#getEndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Node</em>'.
	 * @see maia.physicalStructure.Connection#getEndNode()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_EndNode();

	/**
	 * Returns the meta object for class '{@link maia.physicalStructure.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see maia.physicalStructure.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link maia.physicalStructure.Composition#getCompositionName <em>Composition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition Name</em>'.
	 * @see maia.physicalStructure.Composition#getCompositionName()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_CompositionName();

	/**
	 * Returns the meta object for the reference '{@link maia.physicalStructure.Composition#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composition</em>'.
	 * @see maia.physicalStructure.Composition#getComposition()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Composition();

	/**
	 * Returns the meta object for the attribute '{@link maia.physicalStructure.Composition#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see maia.physicalStructure.Composition#getCardinality()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link maia.physicalStructure.Composition#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see maia.physicalStructure.Composition#getComponent()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Component();

	/**
	 * Returns the meta object for class '{@link maia.physicalStructure.PhysicalStructure <em>Physical Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Structure</em>'.
	 * @see maia.physicalStructure.PhysicalStructure
	 * @generated
	 */
	EClass getPhysicalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.physicalStructure.PhysicalStructure#getPhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Component</em>'.
	 * @see maia.physicalStructure.PhysicalStructure#getPhysicalComponent()
	 * @see #getPhysicalStructure()
	 * @generated
	 */
	EReference getPhysicalStructure_PhysicalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.physicalStructure.PhysicalStructure#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see maia.physicalStructure.PhysicalStructure#getConnection()
	 * @see #getPhysicalStructure()
	 * @generated
	 */
	EReference getPhysicalStructure_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.physicalStructure.PhysicalStructure#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see maia.physicalStructure.PhysicalStructure#getComposition()
	 * @see #getPhysicalStructure()
	 * @generated
	 */
	EReference getPhysicalStructure_Composition();

	/**
	 * Returns the meta object for enum '{@link maia.physicalStructure.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see maia.physicalStructure.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhysicalStructureFactory getPhysicalStructureFactory();

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
		 * The meta object literal for the '{@link maia.physicalStructure.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.physicalStructure.impl.PhysicalComponentImpl
		 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getPhysicalComponent()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT = eINSTANCE.getPhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__TYPE = eINSTANCE.getPhysicalComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Affordance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__AFFORDANCE = eINSTANCE.getPhysicalComponent_Affordance();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__BEHAVIOUR = eINSTANCE.getPhysicalComponent_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__PROPERTY = eINSTANCE.getPhysicalComponent_Property();

		/**
		 * The meta object literal for the '{@link maia.physicalStructure.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.physicalStructure.impl.ConnectionImpl
		 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_NAME = eINSTANCE.getConnection_ConnectionName();

		/**
		 * The meta object literal for the '<em><b>Begin Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BEGIN_NODE = eINSTANCE.getConnection_BeginNode();

		/**
		 * The meta object literal for the '<em><b>End Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__END_NODE = eINSTANCE.getConnection_EndNode();

		/**
		 * The meta object literal for the '{@link maia.physicalStructure.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.physicalStructure.impl.CompositionImpl
		 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Composition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__COMPOSITION_NAME = eINSTANCE.getComposition_CompositionName();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__COMPOSITION = eINSTANCE.getComposition_Composition();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__CARDINALITY = eINSTANCE.getComposition_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__COMPONENT = eINSTANCE.getComposition_Component();

		/**
		 * The meta object literal for the '{@link maia.physicalStructure.impl.PhysicalStructureImpl <em>Physical Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.physicalStructure.impl.PhysicalStructureImpl
		 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getPhysicalStructure()
		 * @generated
		 */
		EClass PHYSICAL_STRUCTURE = eINSTANCE.getPhysicalStructure();

		/**
		 * The meta object literal for the '<em><b>Physical Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT = eINSTANCE.getPhysicalStructure_PhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_STRUCTURE__CONNECTION = eINSTANCE.getPhysicalStructure_Connection();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_STRUCTURE__COMPOSITION = eINSTANCE.getPhysicalStructure_Composition();

		/**
		 * The meta object literal for the '{@link maia.physicalStructure.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.physicalStructure.ResourceType
		 * @see maia.physicalStructure.impl.PhysicalStructurePackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} //PhysicalStructurePackage
