/**
 */
package maia.operationalStructure.impl;

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

import maia.operationalStructure.ActionArena;
import maia.operationalStructure.ActionBody;
import maia.operationalStructure.ActionSituation;
import maia.operationalStructure.EntityAction;
import maia.operationalStructure.OperationalStructure;
import maia.operationalStructure.OperationalStructureFactory;
import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Performer;
import maia.operationalStructure.Plan;
import maia.operationalStructure.PlanAlternative;
import maia.operationalStructure.PlanCondition;
import maia.operationalStructure.PlanLoop;
import maia.operationalStructure.PlanSequence;
import maia.operationalStructure.RoleEnactment;

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
public class OperationalStructurePackageImpl extends EPackageImpl implements OperationalStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionArenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEnactmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planAlternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planConditionEClass = null;

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
	 * @see maia.operationalStructure.OperationalStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationalStructurePackageImpl() {
		super(eNS_URI, OperationalStructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OperationalStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationalStructurePackage init() {
		if (isInited) return (OperationalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI);

		// Obtain or create and register package
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationalStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) : MaiaPackage.eINSTANCE);
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) : PhysicalStructurePackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) : ConstitutionalStructurePackage.eINSTANCE);
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) : CollectiveStructurePackage.eINSTANCE);
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI) : OntologicalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theOperationalStructurePackage.createPackageContents();
		theMaiaPackage.createPackageContents();
		thePhysicalStructurePackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theConstitutionalStructurePackage.createPackageContents();
		theCollectiveStructurePackage.createPackageContents();
		theOntologicalStructurePackage.createPackageContents();

		// Initialize created meta-data
		theOperationalStructurePackage.initializePackageContents();
		theMaiaPackage.initializePackageContents();
		thePhysicalStructurePackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theConstitutionalStructurePackage.initializePackageContents();
		theCollectiveStructurePackage.initializePackageContents();
		theOntologicalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationalStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationalStructurePackage.eNS_URI, theOperationalStructurePackage);
		return theOperationalStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBody() {
		return actionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBody_ActionName() {
		return (EAttribute)actionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAction() {
		return entityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_ActionBody() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_PostCondition() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_PreCondition() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_Perfomer() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_RoleEnactment() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_DecisionMaking() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_Institution() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAction_PostConditionNotDo() {
		return (EReference)entityActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSituation() {
		return actionSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionSituation_Label() {
		return (EAttribute)actionSituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSituation_Actions() {
		return (EReference)actionSituationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSituation_PreCondition() {
		return (EReference)actionSituationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSituation_PostCondition() {
		return (EReference)actionSituationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionArena() {
		return actionArenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionArena_ActionSituation() {
		return (EReference)actionArenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleEnactment() {
		return roleEnactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleEnactment_Role() {
		return (EReference)roleEnactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleEnactment_Agent() {
		return (EReference)roleEnactmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleEnactment_Label() {
		return (EAttribute)roleEnactmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Name() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanSequence() {
		return planSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanSequence_Plan1() {
		return (EReference)planSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanSequence_Plan2() {
		return (EReference)planSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanAlternative() {
		return planAlternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanAlternative_Plan1() {
		return (EReference)planAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanAlternative_Plan2() {
		return (EReference)planAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanLoop() {
		return planLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanLoop_Plan() {
		return (EReference)planLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanLoop_Condition() {
		return (EReference)planLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalStructure() {
		return operationalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalStructure_ActionPlans() {
		return (EReference)operationalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalStructure_Actionsituation() {
		return (EReference)operationalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalStructure_ActionArena() {
		return (EReference)operationalStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalStructure_RoleEnactments() {
		return (EReference)operationalStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalStructure_ActionBody() {
		return (EReference)operationalStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformer() {
		return performerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformer_Name() {
		return (EAttribute)performerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanCondition() {
		return planConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanCondition_Plan() {
		return (EReference)planConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanCondition_Condition() {
		return (EReference)planConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureFactory getOperationalStructureFactory() {
		return (OperationalStructureFactory)getEFactoryInstance();
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
		actionBodyEClass = createEClass(ACTION_BODY);
		createEAttribute(actionBodyEClass, ACTION_BODY__ACTION_NAME);

		entityActionEClass = createEClass(ENTITY_ACTION);
		createEReference(entityActionEClass, ENTITY_ACTION__ACTION_BODY);
		createEReference(entityActionEClass, ENTITY_ACTION__POST_CONDITION);
		createEReference(entityActionEClass, ENTITY_ACTION__PRE_CONDITION);
		createEReference(entityActionEClass, ENTITY_ACTION__PERFOMER);
		createEReference(entityActionEClass, ENTITY_ACTION__ROLE_ENACTMENT);
		createEReference(entityActionEClass, ENTITY_ACTION__DECISION_MAKING);
		createEReference(entityActionEClass, ENTITY_ACTION__INSTITUTION);
		createEReference(entityActionEClass, ENTITY_ACTION__POST_CONDITION_NOT_DO);

		actionSituationEClass = createEClass(ACTION_SITUATION);
		createEAttribute(actionSituationEClass, ACTION_SITUATION__LABEL);
		createEReference(actionSituationEClass, ACTION_SITUATION__ACTIONS);
		createEReference(actionSituationEClass, ACTION_SITUATION__PRE_CONDITION);
		createEReference(actionSituationEClass, ACTION_SITUATION__POST_CONDITION);

		actionArenaEClass = createEClass(ACTION_ARENA);
		createEReference(actionArenaEClass, ACTION_ARENA__ACTION_SITUATION);

		roleEnactmentEClass = createEClass(ROLE_ENACTMENT);
		createEReference(roleEnactmentEClass, ROLE_ENACTMENT__ROLE);
		createEReference(roleEnactmentEClass, ROLE_ENACTMENT__AGENT);
		createEAttribute(roleEnactmentEClass, ROLE_ENACTMENT__LABEL);

		planEClass = createEClass(PLAN);
		createEAttribute(planEClass, PLAN__NAME);

		planSequenceEClass = createEClass(PLAN_SEQUENCE);
		createEReference(planSequenceEClass, PLAN_SEQUENCE__PLAN1);
		createEReference(planSequenceEClass, PLAN_SEQUENCE__PLAN2);

		planAlternativeEClass = createEClass(PLAN_ALTERNATIVE);
		createEReference(planAlternativeEClass, PLAN_ALTERNATIVE__PLAN1);
		createEReference(planAlternativeEClass, PLAN_ALTERNATIVE__PLAN2);

		planLoopEClass = createEClass(PLAN_LOOP);
		createEReference(planLoopEClass, PLAN_LOOP__PLAN);
		createEReference(planLoopEClass, PLAN_LOOP__CONDITION);

		operationalStructureEClass = createEClass(OPERATIONAL_STRUCTURE);
		createEReference(operationalStructureEClass, OPERATIONAL_STRUCTURE__ACTION_PLANS);
		createEReference(operationalStructureEClass, OPERATIONAL_STRUCTURE__ACTIONSITUATION);
		createEReference(operationalStructureEClass, OPERATIONAL_STRUCTURE__ACTION_ARENA);
		createEReference(operationalStructureEClass, OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS);
		createEReference(operationalStructureEClass, OPERATIONAL_STRUCTURE__ACTION_BODY);

		performerEClass = createEClass(PERFORMER);
		createEAttribute(performerEClass, PERFORMER__NAME);

		planConditionEClass = createEClass(PLAN_CONDITION);
		createEReference(planConditionEClass, PLAN_CONDITION__PLAN);
		createEReference(planConditionEClass, PLAN_CONDITION__CONDITION);
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
		OntologicalStructurePackage theOntologicalStructurePackage = (OntologicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI);
		CollectiveStructurePackage theCollectiveStructurePackage = (CollectiveStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI);
		ConstitutionalStructurePackage theConstitutionalStructurePackage = (ConstitutionalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityActionEClass.getESuperTypes().add(this.getPlan());
		planSequenceEClass.getESuperTypes().add(this.getPlan());
		planAlternativeEClass.getESuperTypes().add(this.getPlan());
		planLoopEClass.getESuperTypes().add(this.getPlan());
		planConditionEClass.getESuperTypes().add(this.getPlan());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionBodyEClass, ActionBody.class, "ActionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionBody_ActionName(), ecorePackage.getEString(), "actionName", null, 1, 1, ActionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityActionEClass, EntityAction.class, "EntityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityAction_ActionBody(), this.getActionBody(), null, "actionBody", null, 1, 1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_PostCondition(), theOntologicalStructurePackage.getCondition(), null, "postCondition", null, 1, -1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_PreCondition(), theOntologicalStructurePackage.getCondition(), null, "preCondition", null, 1, -1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_Perfomer(), this.getPerformer(), null, "perfomer", null, 1, 1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_RoleEnactment(), this.getRoleEnactment(), null, "roleEnactment", null, 0, 1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_DecisionMaking(), theCollectiveStructurePackage.getMCDA(), null, "decisionMaking", null, 0, 1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_Institution(), theConstitutionalStructurePackage.getInstitutionalStatement(), null, "institution", null, 0, -1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAction_PostConditionNotDo(), theOntologicalStructurePackage.getCondition(), null, "postConditionNotDo", null, 1, -1, EntityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionSituationEClass, ActionSituation.class, "ActionSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionSituation_Label(), ecorePackage.getEString(), "label", null, 1, 1, ActionSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionSituation_Actions(), this.getPlan(), null, "actions", null, 1, -1, ActionSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionSituation_PreCondition(), theOntologicalStructurePackage.getCondition(), null, "preCondition", null, 1, 1, ActionSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionSituation_PostCondition(), theOntologicalStructurePackage.getCondition(), null, "postCondition", null, 1, 1, ActionSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionArenaEClass, ActionArena.class, "ActionArena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionArena_ActionSituation(), this.getActionSituation(), null, "actionSituation", null, 1, -1, ActionArena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEnactmentEClass, RoleEnactment.class, "RoleEnactment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleEnactment_Role(), theConstitutionalStructurePackage.getRole(), null, "role", null, 1, 1, RoleEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleEnactment_Agent(), theCollectiveStructurePackage.getAgent(), null, "agent", null, 1, 1, RoleEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleEnactment_Label(), ecorePackage.getEString(), "label", null, 1, 1, RoleEnactment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planSequenceEClass, PlanSequence.class, "PlanSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanSequence_Plan1(), this.getPlan(), null, "plan1", null, 1, 1, PlanSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanSequence_Plan2(), this.getPlan(), null, "plan2", null, 1, 1, PlanSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planAlternativeEClass, PlanAlternative.class, "PlanAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanAlternative_Plan1(), this.getPlan(), null, "plan1", null, 1, 1, PlanAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanAlternative_Plan2(), this.getPlan(), null, "plan2", null, 1, -1, PlanAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planLoopEClass, PlanLoop.class, "PlanLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanLoop_Plan(), this.getPlan(), null, "plan", null, 1, 1, PlanLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanLoop_Condition(), theOntologicalStructurePackage.getCondition(), null, "condition", null, 1, 1, PlanLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalStructureEClass, OperationalStructure.class, "OperationalStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalStructure_ActionPlans(), this.getPlan(), null, "actionPlans", null, 1, -1, OperationalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalStructure_Actionsituation(), this.getActionSituation(), null, "actionsituation", null, 1, -1, OperationalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalStructure_ActionArena(), this.getActionArena(), null, "actionArena", null, 1, -1, OperationalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalStructure_RoleEnactments(), this.getRoleEnactment(), null, "roleEnactments", null, 0, -1, OperationalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalStructure_ActionBody(), this.getActionBody(), null, "actionBody", null, 1, -1, OperationalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performerEClass, Performer.class, "Performer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformer_Name(), ecorePackage.getEString(), "name", null, 1, 1, Performer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planConditionEClass, PlanCondition.class, "PlanCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanCondition_Plan(), this.getPlan(), null, "plan", null, 1, 1, PlanCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanCondition_Condition(), theOntologicalStructurePackage.getCondition(), null, "condition", null, 1, 1, PlanCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //OperationalStructurePackageImpl
