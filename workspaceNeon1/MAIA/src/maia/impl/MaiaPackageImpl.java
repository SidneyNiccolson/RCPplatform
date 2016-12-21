/**
 */
package maia.impl;

import maia.MaiaFactory;
import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructurePackage;

import maia.collectiveStructure.impl.CollectiveStructurePackageImpl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;

import maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl;

import maia.evaluativeStructure.EvaluativeStructurePackage;

import maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl;

import maia.ontologicalStructure.OntologicalStructurePackage;

import maia.ontologicalStructure.impl.OntologicalStructurePackageImpl;

import maia.operationalStructure.OperationalStructurePackage;

import maia.operationalStructure.impl.OperationalStructurePackageImpl;

import maia.physicalStructure.PhysicalStructurePackage;

import maia.physicalStructure.impl.PhysicalStructurePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaiaPackageImpl extends EPackageImpl implements MaiaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maiaEClass = null;

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
	 * @see maia.MaiaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaiaPackageImpl() {
		super(eNS_URI, MaiaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaiaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaiaPackage init() {
		if (isInited) return (MaiaPackage)EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI);

		// Obtain or create and register package
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaiaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) : PhysicalStructurePackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) : ConstitutionalStructurePackage.eINSTANCE);
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) : CollectiveStructurePackage.eINSTANCE);
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) : OperationalStructurePackage.eINSTANCE);
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) : OntologicalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theMaiaPackage.createPackageContents();
		thePhysicalStructurePackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theConstitutionalStructurePackage.createPackageContents();
		theCollectiveStructurePackage.createPackageContents();
		theOperationalStructurePackage.createPackageContents();
		theOntologicalStructurePackage.createPackageContents();

		// Initialize created meta-data
		theMaiaPackage.initializePackageContents();
		thePhysicalStructurePackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theConstitutionalStructurePackage.initializePackageContents();
		theCollectiveStructurePackage.initializePackageContents();
		theOperationalStructurePackage.initializePackageContents();
		theOntologicalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaiaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaiaPackage.eNS_URI, theMaiaPackage);
		return theMaiaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAIA() {
		return maiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_ConstitutionalStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_CollectiveStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_PhysicalStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_OperationalStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_EvaluativeStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAIA_OntologicalStructure() {
		return (EReference)maiaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaiaFactory getMaiaFactory() {
		return (MaiaFactory)getEFactoryInstance();
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
		maiaEClass = createEClass(MAIA);
		createEReference(maiaEClass, MAIA__CONSTITUTIONAL_STRUCTURE);
		createEReference(maiaEClass, MAIA__COLLECTIVE_STRUCTURE);
		createEReference(maiaEClass, MAIA__PHYSICAL_STRUCTURE);
		createEReference(maiaEClass, MAIA__OPERATIONAL_STRUCTURE);
		createEReference(maiaEClass, MAIA__EVALUATIVE_STRUCTURE);
		createEReference(maiaEClass, MAIA__ONTOLOGICAL_STRUCTURE);
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
		PhysicalStructurePackage thePhysicalStructurePackage = (PhysicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI);
		EvaluativeStructurePackage theEvaluativeStructurePackage = (EvaluativeStructurePackage)EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI);
		ConstitutionalStructurePackage theConstitutionalStructurePackage = (ConstitutionalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI);
		CollectiveStructurePackage theCollectiveStructurePackage = (CollectiveStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI);
		OperationalStructurePackage theOperationalStructurePackage = (OperationalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI);
		OntologicalStructurePackage theOntologicalStructurePackage = (OntologicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePhysicalStructurePackage);
		getESubpackages().add(theEvaluativeStructurePackage);
		getESubpackages().add(theConstitutionalStructurePackage);
		getESubpackages().add(theCollectiveStructurePackage);
		getESubpackages().add(theOperationalStructurePackage);
		getESubpackages().add(theOntologicalStructurePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(maiaEClass, maia.MAIA.class, "MAIA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAIA_ConstitutionalStructure(), theConstitutionalStructurePackage.getConstitutionalStructure(), null, "constitutionalStructure", null, 1, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAIA_CollectiveStructure(), theCollectiveStructurePackage.getCollectiveStructure(), null, "collectiveStructure", null, 1, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAIA_PhysicalStructure(), thePhysicalStructurePackage.getPhysicalStructure(), null, "physicalStructure", null, 0, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAIA_OperationalStructure(), theOperationalStructurePackage.getOperationalStructure(), null, "operationalStructure", null, 1, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAIA_EvaluativeStructure(), theEvaluativeStructurePackage.getEvaluativeStructure(), null, "evaluativeStructure", null, 1, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAIA_OntologicalStructure(), theOntologicalStructurePackage.getOntologicalStructure(), null, "ontologicalStructure", null, 1, 1, maia.MAIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MaiaPackageImpl
