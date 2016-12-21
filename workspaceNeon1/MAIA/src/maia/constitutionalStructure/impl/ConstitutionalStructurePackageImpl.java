/**
 */
package maia.constitutionalStructure.impl;

import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructurePackage;

import maia.collectiveStructure.impl.CollectiveStructurePackageImpl;

import maia.constitutionalStructure.ConstitutionalStructure;
import maia.constitutionalStructure.ConstitutionalStructureFactory;
import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Dependency;
import maia.constitutionalStructure.InstitutionalStatement;
import maia.constitutionalStructure.Norm;
import maia.constitutionalStructure.Objective;
import maia.constitutionalStructure.Role;
import maia.constitutionalStructure.Rule;
import maia.constitutionalStructure.Sanction;
import maia.constitutionalStructure.SharedStrategy;
import maia.constitutionalStructure.deonLogicType;

import maia.evaluativeStructure.EvaluativeStructurePackage;

import maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl;

import maia.impl.MaiaPackageImpl;

import maia.ontologicalStructure.OntologicalStructurePackage;

import maia.ontologicalStructure.impl.OntologicalStructurePackageImpl;

import maia.operationalStructure.OperationalStructurePackage;

import maia.operationalStructure.impl.OperationalStructurePackageImpl;

import maia.physicalStructure.PhysicalStructurePackage;

import maia.physicalStructure.impl.PhysicalStructurePackageImpl;

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
public class ConstitutionalStructurePackageImpl extends EPackageImpl implements ConstitutionalStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass institutionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constitutionalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deonLogicTypeEEnum = null;

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
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstitutionalStructurePackageImpl() {
		super(eNS_URI, ConstitutionalStructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstitutionalStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstitutionalStructurePackage init() {
		if (isInited) return (ConstitutionalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI);

		// Obtain or create and register package
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstitutionalStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) : MaiaPackage.eINSTANCE);
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) : PhysicalStructurePackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) : CollectiveStructurePackage.eINSTANCE);
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) : OperationalStructurePackage.eINSTANCE);
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) : OntologicalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theConstitutionalStructurePackage.createPackageContents();
		theMaiaPackage.createPackageContents();
		thePhysicalStructurePackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theCollectiveStructurePackage.createPackageContents();
		theOperationalStructurePackage.createPackageContents();
		theOntologicalStructurePackage.createPackageContents();

		// Initialize created meta-data
		theConstitutionalStructurePackage.initializePackageContents();
		theMaiaPackage.initializePackageContents();
		thePhysicalStructurePackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theCollectiveStructurePackage.initializePackageContents();
		theOperationalStructurePackage.initializePackageContents();
		theOntologicalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstitutionalStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstitutionalStructurePackage.eNS_URI, theConstitutionalStructurePackage);
		return theConstitutionalStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Objective() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_InstitutionalCapability() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Institution() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_EntryCondition() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_PhysicalComponent() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Information() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstitutionalStatement() {
		return institutionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitutionalStatement_Label() {
		return (EAttribute)institutionalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitutionalStatement_Attribute() {
		return (EReference)institutionalStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitutionalStatement_AIm() {
		return (EReference)institutionalStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstitutionalStatement_Condition() {
		return (EReference)institutionalStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedStrategy() {
		return sharedStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNorm() {
		return normEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNorm_DeonticType() {
		return (EAttribute)normEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_DeonticType() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_OrElse() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Dependant() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Dependee() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_DependantObjective() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Label() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_Label() {
		return (EAttribute)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_MeetingCondition() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSanction() {
		return sanctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstitutionalStructure() {
		return constitutionalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstitutionalStructure_Roles() {
		return (EReference)constitutionalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstitutionalStructure_Institutions() {
		return (EReference)constitutionalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstitutionalStructure_Dependencies() {
		return (EReference)constitutionalStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstitutionalStructure_Sanctions() {
		return (EReference)constitutionalStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstitutionalStructure_Objectives() {
		return (EReference)constitutionalStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdeonLogicType() {
		return deonLogicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstitutionalStructureFactory getConstitutionalStructureFactory() {
		return (ConstitutionalStructureFactory)getEFactoryInstance();
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
		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__OBJECTIVE);
		createEReference(roleEClass, ROLE__INSTITUTIONAL_CAPABILITY);
		createEReference(roleEClass, ROLE__INSTITUTION);
		createEReference(roleEClass, ROLE__ENTRY_CONDITION);
		createEReference(roleEClass, ROLE__PHYSICAL_COMPONENT);
		createEReference(roleEClass, ROLE__INFORMATION);

		institutionalStatementEClass = createEClass(INSTITUTIONAL_STATEMENT);
		createEAttribute(institutionalStatementEClass, INSTITUTIONAL_STATEMENT__LABEL);
		createEReference(institutionalStatementEClass, INSTITUTIONAL_STATEMENT__ATTRIBUTE);
		createEReference(institutionalStatementEClass, INSTITUTIONAL_STATEMENT__AIM);
		createEReference(institutionalStatementEClass, INSTITUTIONAL_STATEMENT__CONDITION);

		sharedStrategyEClass = createEClass(SHARED_STRATEGY);

		normEClass = createEClass(NORM);
		createEAttribute(normEClass, NORM__DEONTIC_TYPE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__DEONTIC_TYPE);
		createEReference(ruleEClass, RULE__OR_ELSE);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__DEPENDANT);
		createEReference(dependencyEClass, DEPENDENCY__DEPENDEE);
		createEReference(dependencyEClass, DEPENDENCY__DEPENDANT_OBJECTIVE);
		createEAttribute(dependencyEClass, DEPENDENCY__LABEL);

		objectiveEClass = createEClass(OBJECTIVE);
		createEAttribute(objectiveEClass, OBJECTIVE__LABEL);
		createEReference(objectiveEClass, OBJECTIVE__MEETING_CONDITION);

		sanctionEClass = createEClass(SANCTION);

		constitutionalStructureEClass = createEClass(CONSTITUTIONAL_STRUCTURE);
		createEReference(constitutionalStructureEClass, CONSTITUTIONAL_STRUCTURE__ROLES);
		createEReference(constitutionalStructureEClass, CONSTITUTIONAL_STRUCTURE__INSTITUTIONS);
		createEReference(constitutionalStructureEClass, CONSTITUTIONAL_STRUCTURE__DEPENDENCIES);
		createEReference(constitutionalStructureEClass, CONSTITUTIONAL_STRUCTURE__SANCTIONS);
		createEReference(constitutionalStructureEClass, CONSTITUTIONAL_STRUCTURE__OBJECTIVES);

		// Create enums
		deonLogicTypeEEnum = createEEnum(DEON_LOGIC_TYPE);
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
		PhysicalStructurePackage thePhysicalStructurePackage = (PhysicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(theOperationalStructurePackage.getPerformer());
		sharedStrategyEClass.getESuperTypes().add(this.getInstitutionalStatement());
		sharedStrategyEClass.getESuperTypes().add(this.getSanction());
		normEClass.getESuperTypes().add(this.getInstitutionalStatement());
		normEClass.getESuperTypes().add(this.getSanction());
		ruleEClass.getESuperTypes().add(this.getInstitutionalStatement());
		ruleEClass.getESuperTypes().add(this.getSanction());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Objective(), this.getObjective(), null, "objective", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_InstitutionalCapability(), theOperationalStructurePackage.getActionBody(), null, "institutionalCapability", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Institution(), this.getInstitutionalStatement(), null, "institution", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_EntryCondition(), theOntologicalStructurePackage.getCondition(), null, "entryCondition", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_PhysicalComponent(), thePhysicalStructurePackage.getPhysicalComponent(), null, "physicalComponent", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Information(), theOntologicalStructurePackage.getCondition(), null, "information", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(institutionalStatementEClass, InstitutionalStatement.class, "InstitutionalStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstitutionalStatement_Label(), ecorePackage.getEString(), "label", null, 1, 1, InstitutionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitutionalStatement_Attribute(), this.getRole(), null, "attribute", null, 1, -1, InstitutionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitutionalStatement_AIm(), theOperationalStructurePackage.getPlan(), null, "aIm", null, 1, -1, InstitutionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstitutionalStatement_Condition(), theOntologicalStructurePackage.getCondition(), null, "condition", null, 1, 1, InstitutionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedStrategyEClass, SharedStrategy.class, "SharedStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normEClass, Norm.class, "Norm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNorm_DeonticType(), this.getdeonLogicType(), "deonticType", null, 1, 1, Norm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_DeonticType(), this.getdeonLogicType(), "deonticType", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_OrElse(), this.getSanction(), null, "OrElse", null, 1, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Dependant(), this.getRole(), null, "dependant", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Dependee(), this.getRole(), null, "dependee", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_DependantObjective(), this.getObjective(), null, "dependantObjective", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Label(), ecorePackage.getEString(), "label", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjective_Label(), ecorePackage.getEString(), "label", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_MeetingCondition(), theOntologicalStructurePackage.getCondition(), null, "meetingCondition", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sanctionEClass, Sanction.class, "Sanction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constitutionalStructureEClass, ConstitutionalStructure.class, "ConstitutionalStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstitutionalStructure_Roles(), this.getRole(), null, "roles", null, 1, -1, ConstitutionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstitutionalStructure_Institutions(), this.getInstitutionalStatement(), null, "institutions", null, 0, -1, ConstitutionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstitutionalStructure_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, ConstitutionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstitutionalStructure_Sanctions(), this.getSanction(), null, "sanctions", null, 0, -1, ConstitutionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstitutionalStructure_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, ConstitutionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deonLogicTypeEEnum, deonLogicType.class, "deonLogicType");
		addEEnumLiteral(deonLogicTypeEEnum, deonLogicType.OBLIGES);
		addEEnumLiteral(deonLogicTypeEEnum, deonLogicType.PERMITS);
		addEEnumLiteral(deonLogicTypeEEnum, deonLogicType.PROHIBITS);
	}

} //ConstitutionalStructurePackageImpl
