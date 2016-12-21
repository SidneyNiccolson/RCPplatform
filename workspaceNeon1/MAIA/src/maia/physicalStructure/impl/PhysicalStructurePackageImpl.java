/**
 */
package maia.physicalStructure.impl;

import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructurePackage;

import maia.collectiveStructure.impl.CollectiveStructurePackageImpl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;

import maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl;

import maia.evaluativeStructure.EvaluativeStructurePackage;

import maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl;

import maia.impl.MaiaPackageImpl;

import maia.ontologicalStructure.OntologicalStructurePackage;

import maia.ontologicalStructure.impl.OntologicalStructurePackageImpl;

import maia.operationalStructure.OperationalStructurePackage;

import maia.operationalStructure.impl.OperationalStructurePackageImpl;

import maia.physicalStructure.Composition;
import maia.physicalStructure.Connection;
import maia.physicalStructure.PhysicalComponent;
import maia.physicalStructure.PhysicalStructure;
import maia.physicalStructure.PhysicalStructureFactory;
import maia.physicalStructure.PhysicalStructurePackage;
import maia.physicalStructure.ResourceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalStructurePackageImpl extends EPackageImpl implements PhysicalStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see maia.physicalStructure.PhysicalStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhysicalStructurePackageImpl() {
		super(eNS_URI, PhysicalStructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PhysicalStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhysicalStructurePackage init() {
		if (isInited) return (PhysicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI);

		// Obtain or create and register package
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhysicalStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) : MaiaPackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) : ConstitutionalStructurePackage.eINSTANCE);
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) : CollectiveStructurePackage.eINSTANCE);
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) : OperationalStructurePackage.eINSTANCE);
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) : OntologicalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		thePhysicalStructurePackage.createPackageContents();
		theMaiaPackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theConstitutionalStructurePackage.createPackageContents();
		theCollectiveStructurePackage.createPackageContents();
		theOperationalStructurePackage.createPackageContents();
		theOntologicalStructurePackage.createPackageContents();

		// Initialize created meta-data
		thePhysicalStructurePackage.initializePackageContents();
		theMaiaPackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theConstitutionalStructurePackage.initializePackageContents();
		theCollectiveStructurePackage.initializePackageContents();
		theOperationalStructurePackage.initializePackageContents();
		theOntologicalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhysicalStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhysicalStructurePackage.eNS_URI, thePhysicalStructurePackage);
		return thePhysicalStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponent() {
		return physicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalComponent_Type() {
		return (EAttribute)physicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_Affordance() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_Behaviour() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_Property() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_ConnectionName() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_BeginNode() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_EndNode() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposition_CompositionName() {
		return (EAttribute)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Composition() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposition_Cardinality() {
		return (EAttribute)compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Component() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalStructure() {
		return physicalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalStructure_PhysicalComponent() {
		return (EReference)physicalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalStructure_Connection() {
		return (EReference)physicalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalStructure_Composition() {
		return (EReference)physicalStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalStructureFactory getPhysicalStructureFactory() {
		return (PhysicalStructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		physicalComponentEClass = createEClass(PHYSICAL_COMPONENT);
		createEAttribute(physicalComponentEClass, PHYSICAL_COMPONENT__TYPE);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__AFFORDANCE);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__BEHAVIOUR);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__PROPERTY);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_NAME);
		createEReference(connectionEClass, CONNECTION__BEGIN_NODE);
		createEReference(connectionEClass, CONNECTION__END_NODE);

		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__COMPOSITION_NAME);
		createEReference(compositionEClass, COMPOSITION__COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__CARDINALITY);
		createEReference(compositionEClass, COMPOSITION__COMPONENT);

		physicalStructureEClass = createEClass(PHYSICAL_STRUCTURE);
		createEReference(physicalStructureEClass, PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT);
		createEReference(physicalStructureEClass, PHYSICAL_STRUCTURE__CONNECTION);
		createEReference(physicalStructureEClass, PHYSICAL_STRUCTURE__COMPOSITION);

		// Create enums
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OperationalStructurePackage theOperationalStructurePackage = (OperationalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI);
		OntologicalStructurePackage theOntologicalStructurePackage = (OntologicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalComponentEClass.getESuperTypes().add(theOperationalStructurePackage.getPerformer());

		// Initialize classes, features, and operations; add parameters
		initEClass(physicalComponentEClass, PhysicalComponent.class, "PhysicalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalComponent_Type(), this.getResourceType(), "type", null, 1, 1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_Affordance(), theOperationalStructurePackage.getActionBody(), null, "affordance", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_Behaviour(), theOperationalStructurePackage.getActionBody(), null, "behaviour", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_Property(), theOntologicalStructurePackage.getProperty(), null, "property", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_ConnectionName(), ecorePackage.getEString(), "connectionName", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_BeginNode(), this.getPhysicalComponent(), null, "beginNode", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_EndNode(), this.getPhysicalComponent(), null, "endNode", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_CompositionName(), ecorePackage.getEString(), "compositionName", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Composition(), this.getPhysicalComponent(), null, "composition", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Component(), this.getPhysicalComponent(), null, "component", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalStructureEClass, PhysicalStructure.class, "PhysicalStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalStructure_PhysicalComponent(), this.getPhysicalComponent(), null, "physicalComponent", null, 0, -1, PhysicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalStructure_Connection(), this.getConnection(), null, "connection", null, 0, -1, PhysicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalStructure_Composition(), this.getComposition(), null, "composition", null, 0, -1, PhysicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OPEN);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FENCED);
	}

} //PhysicalStructurePackageImpl
