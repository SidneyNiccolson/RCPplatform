/**
 */
package maia.collectiveStructure.impl;

import maia.MaiaPackage;

import maia.collectiveStructure.Agent;
import maia.collectiveStructure.CollectiveStructure;
import maia.collectiveStructure.CollectiveStructureFactory;
import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.ConditionAspect;
import maia.collectiveStructure.DecisionCriterion;
import maia.collectiveStructure.DecisionInfluence;
import maia.collectiveStructure.PersonalValue;
import maia.collectiveStructure.PersonalValueAspect;
import maia.collectiveStructure.PropertyAspect;
import maia.collectiveStructure.SanctionAspect;

import maia.constitutionalStructure.ConstitutionalStructurePackage;

import maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectiveStructurePackageImpl extends EPackageImpl implements CollectiveStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionInfluenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectiveStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalValueAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanctionAspectEClass = null;

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
	 * @see maia.collectiveStructure.CollectiveStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectiveStructurePackageImpl() {
		super(eNS_URI, CollectiveStructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CollectiveStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectiveStructurePackage init() {
		if (isInited) return (CollectiveStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI);

		// Obtain or create and register package
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectiveStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) : MaiaPackage.eINSTANCE);
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) : PhysicalStructurePackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) : ConstitutionalStructurePackage.eINSTANCE);
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) : OperationalStructurePackage.eINSTANCE);
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) : OntologicalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theCollectiveStructurePackage.createPackageContents();
		theMaiaPackage.createPackageContents();
		thePhysicalStructurePackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theConstitutionalStructurePackage.createPackageContents();
		theOperationalStructurePackage.createPackageContents();
		theOntologicalStructurePackage.createPackageContents();

		// Initialize created meta-data
		theCollectiveStructurePackage.initializePackageContents();
		theMaiaPackage.initializePackageContents();
		thePhysicalStructurePackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theConstitutionalStructurePackage.initializePackageContents();
		theOperationalStructurePackage.initializePackageContents();
		theOntologicalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectiveStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectiveStructurePackage.eNS_URI, theCollectiveStructurePackage);
		return theCollectiveStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_PersonalValue() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_PhysicalComponent() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_PossibleRole() {
		return (EReference)agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_IntrinsicBehaviour() {
		return (EReference)agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Property() {
		return (EReference)agentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Information() {
		return (EReference)agentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Decision() {
		return (EReference)agentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalValue() {
		return personalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalValue_Label() {
		return (EAttribute)personalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalValue_DecisionInfluence() {
		return (EReference)personalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalValue_Value() {
		return (EAttribute)personalValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionInfluence() {
		return decisionInfluenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionInfluence_Name() {
		return (EAttribute)decisionInfluenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionInfluence_Limit() {
		return (EAttribute)decisionInfluenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectiveStructure() {
		return collectiveStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveStructure_Agent() {
		return (EReference)collectiveStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveStructure_DecisionCriteria() {
		return (EReference)collectiveStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectiveStructure_PersonalValue() {
		return (EReference)collectiveStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMCDA() {
		return mcdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMCDA_Label() {
		return (EAttribute)mcdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMCDA_Threshold() {
		return (EAttribute)mcdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMCDA_Aspects() {
		return (EReference)mcdaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMCDA_Conditions() {
		return (EReference)mcdaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionCriterion() {
		return decisionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionCriterion_Label() {
		return (EAttribute)decisionCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionCriterion_Weight() {
		return (EAttribute)decisionCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalValueAspect() {
		return personalValueAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalValueAspect_PersonalValue() {
		return (EReference)personalValueAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAspect() {
		return propertyAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAspect_Property() {
		return (EReference)propertyAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionAspect() {
		return conditionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionAspect_Condition() {
		return (EReference)conditionAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSanctionAspect() {
		return sanctionAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSanctionAspect_Sanction() {
		return (EReference)sanctionAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSanctionAspect_FineValue() {
		return (EAttribute)sanctionAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructureFactory getCollectiveStructureFactory() {
		return (CollectiveStructureFactory)getEFactoryInstance();
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
		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__PERSONAL_VALUE);
		createEReference(agentEClass, AGENT__PHYSICAL_COMPONENT);
		createEReference(agentEClass, AGENT__POSSIBLE_ROLE);
		createEReference(agentEClass, AGENT__INTRINSIC_BEHAVIOUR);
		createEReference(agentEClass, AGENT__PROPERTY);
		createEReference(agentEClass, AGENT__INFORMATION);
		createEReference(agentEClass, AGENT__DECISION);

		personalValueEClass = createEClass(PERSONAL_VALUE);
		createEAttribute(personalValueEClass, PERSONAL_VALUE__LABEL);
		createEReference(personalValueEClass, PERSONAL_VALUE__DECISION_INFLUENCE);
		createEAttribute(personalValueEClass, PERSONAL_VALUE__VALUE);

		decisionInfluenceEClass = createEClass(DECISION_INFLUENCE);
		createEAttribute(decisionInfluenceEClass, DECISION_INFLUENCE__NAME);
		createEAttribute(decisionInfluenceEClass, DECISION_INFLUENCE__LIMIT);

		collectiveStructureEClass = createEClass(COLLECTIVE_STRUCTURE);
		createEReference(collectiveStructureEClass, COLLECTIVE_STRUCTURE__AGENT);
		createEReference(collectiveStructureEClass, COLLECTIVE_STRUCTURE__DECISION_CRITERIA);
		createEReference(collectiveStructureEClass, COLLECTIVE_STRUCTURE__PERSONAL_VALUE);

		mcdaEClass = createEClass(MCDA);
		createEAttribute(mcdaEClass, MCDA__LABEL);
		createEAttribute(mcdaEClass, MCDA__THRESHOLD);
		createEReference(mcdaEClass, MCDA__ASPECTS);
		createEReference(mcdaEClass, MCDA__CONDITIONS);

		decisionCriterionEClass = createEClass(DECISION_CRITERION);
		createEAttribute(decisionCriterionEClass, DECISION_CRITERION__LABEL);
		createEAttribute(decisionCriterionEClass, DECISION_CRITERION__WEIGHT);

		personalValueAspectEClass = createEClass(PERSONAL_VALUE_ASPECT);
		createEReference(personalValueAspectEClass, PERSONAL_VALUE_ASPECT__PERSONAL_VALUE);

		propertyAspectEClass = createEClass(PROPERTY_ASPECT);
		createEReference(propertyAspectEClass, PROPERTY_ASPECT__PROPERTY);

		conditionAspectEClass = createEClass(CONDITION_ASPECT);
		createEReference(conditionAspectEClass, CONDITION_ASPECT__CONDITION);

		sanctionAspectEClass = createEClass(SANCTION_ASPECT);
		createEReference(sanctionAspectEClass, SANCTION_ASPECT__SANCTION);
		createEAttribute(sanctionAspectEClass, SANCTION_ASPECT__FINE_VALUE);
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
		PhysicalStructurePackage thePhysicalStructurePackage = (PhysicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI);
		ConstitutionalStructurePackage theConstitutionalStructurePackage = (ConstitutionalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI);
		OntologicalStructurePackage theOntologicalStructurePackage = (OntologicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(theOperationalStructurePackage.getPerformer());
		personalValueAspectEClass.getESuperTypes().add(this.getDecisionCriterion());
		propertyAspectEClass.getESuperTypes().add(this.getDecisionCriterion());
		conditionAspectEClass.getESuperTypes().add(this.getDecisionCriterion());
		sanctionAspectEClass.getESuperTypes().add(this.getDecisionCriterion());

		// Initialize classes, features, and operations; add parameters
		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_PersonalValue(), this.getPersonalValue(), null, "personalValue", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_PhysicalComponent(), thePhysicalStructurePackage.getPhysicalComponent(), null, "physicalComponent", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_PossibleRole(), theConstitutionalStructurePackage.getRole(), null, "possibleRole", null, 1, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_IntrinsicBehaviour(), theOperationalStructurePackage.getActionBody(), null, "intrinsicBehaviour", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Property(), theOntologicalStructurePackage.getProperty(), null, "property", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Information(), theOntologicalStructurePackage.getCondition(), null, "information", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Decision(), this.getMCDA(), null, "decision", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalValueEClass, PersonalValue.class, "PersonalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalValue_Label(), ecorePackage.getEString(), "label", null, 1, 1, PersonalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalValue_DecisionInfluence(), this.getDecisionInfluence(), null, "decisionInfluence", null, 1, 1, PersonalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, PersonalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionInfluenceEClass, DecisionInfluence.class, "DecisionInfluence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionInfluence_Name(), ecorePackage.getEString(), "name", null, 1, 1, DecisionInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionInfluence_Limit(), ecorePackage.getEString(), "limit", null, 1, 1, DecisionInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectiveStructureEClass, CollectiveStructure.class, "CollectiveStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectiveStructure_Agent(), this.getAgent(), null, "agent", null, 1, -1, CollectiveStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveStructure_DecisionCriteria(), this.getMCDA(), null, "decisionCriteria", null, 0, -1, CollectiveStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectiveStructure_PersonalValue(), this.getPersonalValue(), null, "personalValue", null, 0, -1, CollectiveStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mcdaEClass, maia.collectiveStructure.MCDA.class, "MCDA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCDA_Label(), ecorePackage.getEString(), "label", null, 1, 1, maia.collectiveStructure.MCDA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCDA_Threshold(), ecorePackage.getEDouble(), "threshold", null, 0, 1, maia.collectiveStructure.MCDA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCDA_Aspects(), this.getDecisionCriterion(), null, "aspects", null, 1, -1, maia.collectiveStructure.MCDA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCDA_Conditions(), theOntologicalStructurePackage.getCondition(), null, "conditions", null, 0, -1, maia.collectiveStructure.MCDA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionCriterionEClass, DecisionCriterion.class, "DecisionCriterion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionCriterion_Label(), ecorePackage.getEString(), "label", null, 1, 1, DecisionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionCriterion_Weight(), ecorePackage.getEDouble(), "weight", null, 1, 1, DecisionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalValueAspectEClass, PersonalValueAspect.class, "PersonalValueAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonalValueAspect_PersonalValue(), this.getPersonalValue(), null, "personalValue", null, 1, 1, PersonalValueAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAspectEClass, PropertyAspect.class, "PropertyAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAspect_Property(), theOntologicalStructurePackage.getProperty(), null, "property", null, 1, 1, PropertyAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionAspectEClass, ConditionAspect.class, "ConditionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionAspect_Condition(), theOntologicalStructurePackage.getCondition(), null, "condition", null, 1, 1, ConditionAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sanctionAspectEClass, SanctionAspect.class, "SanctionAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSanctionAspect_Sanction(), theConstitutionalStructurePackage.getSanction(), null, "sanction", null, 1, 1, SanctionAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSanctionAspect_FineValue(), ecorePackage.getEDouble(), "fineValue", null, 1, 1, SanctionAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CollectiveStructurePackageImpl
