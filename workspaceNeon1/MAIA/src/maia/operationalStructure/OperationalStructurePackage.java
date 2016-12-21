/**
 */
package maia.operationalStructure;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see maia.operationalStructure.OperationalStructureFactory
 * @model kind="package"
 * @generated
 */
public interface OperationalStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operationalStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/operationalStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operationalStruct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalStructurePackage eINSTANCE = maia.operationalStructure.impl.OperationalStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.ActionBodyImpl <em>Action Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.ActionBodyImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionBody()
	 * @generated
	 */
	int ACTION_BODY = 0;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BODY__ACTION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PlanImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.EntityActionImpl <em>Entity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.EntityActionImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getEntityAction()
	 * @generated
	 */
	int ENTITY_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__NAME = PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__ACTION_BODY = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__POST_CONDITION = PLAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__PRE_CONDITION = PLAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perfomer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__PERFOMER = PLAN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__ROLE_ENACTMENT = PLAN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decision Making</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__DECISION_MAKING = PLAN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__INSTITUTION = PLAN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Post Condition Not Do</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION__POST_CONDITION_NOT_DO = PLAN_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Entity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION_FEATURE_COUNT = PLAN_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Entity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ACTION_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.ActionSituationImpl <em>Action Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.ActionSituationImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionSituation()
	 * @generated
	 */
	int ACTION_SITUATION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION__PRE_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION__POST_CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Action Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SITUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.ActionArenaImpl <em>Action Arena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.ActionArenaImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionArena()
	 * @generated
	 */
	int ACTION_ARENA = 3;

	/**
	 * The feature id for the '<em><b>Action Situation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ARENA__ACTION_SITUATION = 0;

	/**
	 * The number of structural features of the '<em>Action Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ARENA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ARENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.RoleEnactmentImpl <em>Role Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.RoleEnactmentImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getRoleEnactment()
	 * @generated
	 */
	int ROLE_ENACTMENT = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENACTMENT__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENACTMENT__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENACTMENT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Role Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENACTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ENACTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PlanSequenceImpl <em>Plan Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PlanSequenceImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanSequence()
	 * @generated
	 */
	int PLAN_SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SEQUENCE__NAME = PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Plan1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SEQUENCE__PLAN1 = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plan2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SEQUENCE__PLAN2 = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SEQUENCE_FEATURE_COUNT = PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plan Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_SEQUENCE_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PlanAlternativeImpl <em>Plan Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PlanAlternativeImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanAlternative()
	 * @generated
	 */
	int PLAN_ALTERNATIVE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ALTERNATIVE__NAME = PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Plan1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ALTERNATIVE__PLAN1 = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plan2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ALTERNATIVE__PLAN2 = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ALTERNATIVE_FEATURE_COUNT = PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plan Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_ALTERNATIVE_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PlanLoopImpl <em>Plan Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PlanLoopImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanLoop()
	 * @generated
	 */
	int PLAN_LOOP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_LOOP__NAME = PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_LOOP__PLAN = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_LOOP__CONDITION = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_LOOP_FEATURE_COUNT = PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plan Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_LOOP_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.OperationalStructureImpl <em>Operational Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.OperationalStructureImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getOperationalStructure()
	 * @generated
	 */
	int OPERATIONAL_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Action Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE__ACTION_PLANS = 0;

	/**
	 * The feature id for the '<em><b>Actionsituation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE__ACTIONSITUATION = 1;

	/**
	 * The feature id for the '<em><b>Action Arena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE__ACTION_ARENA = 2;

	/**
	 * The feature id for the '<em><b>Role Enactments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS = 3;

	/**
	 * The feature id for the '<em><b>Action Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE__ACTION_BODY = 4;

	/**
	 * The number of structural features of the '<em>Operational Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operational Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PerformerImpl <em>Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PerformerImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPerformer()
	 * @generated
	 */
	int PERFORMER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.operationalStructure.impl.PlanConditionImpl <em>Plan Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.operationalStructure.impl.PlanConditionImpl
	 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanCondition()
	 * @generated
	 */
	int PLAN_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CONDITION__NAME = PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CONDITION__PLAN = PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CONDITION__CONDITION = PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CONDITION_FEATURE_COUNT = PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plan Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CONDITION_OPERATION_COUNT = PLAN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.ActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Body</em>'.
	 * @see maia.operationalStructure.ActionBody
	 * @generated
	 */
	EClass getActionBody();

	/**
	 * Returns the meta object for the attribute '{@link maia.operationalStructure.ActionBody#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see maia.operationalStructure.ActionBody#getActionName()
	 * @see #getActionBody()
	 * @generated
	 */
	EAttribute getActionBody_ActionName();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.EntityAction <em>Entity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Action</em>'.
	 * @see maia.operationalStructure.EntityAction
	 * @generated
	 */
	EClass getEntityAction();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.EntityAction#getActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Body</em>'.
	 * @see maia.operationalStructure.EntityAction#getActionBody()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_ActionBody();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.EntityAction#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post Condition</em>'.
	 * @see maia.operationalStructure.EntityAction#getPostCondition()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_PostCondition();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.EntityAction#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre Condition</em>'.
	 * @see maia.operationalStructure.EntityAction#getPreCondition()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.EntityAction#getPerfomer <em>Perfomer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perfomer</em>'.
	 * @see maia.operationalStructure.EntityAction#getPerfomer()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_Perfomer();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.EntityAction#getRoleEnactment <em>Role Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Enactment</em>'.
	 * @see maia.operationalStructure.EntityAction#getRoleEnactment()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_RoleEnactment();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.EntityAction#getDecisionMaking <em>Decision Making</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Making</em>'.
	 * @see maia.operationalStructure.EntityAction#getDecisionMaking()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_DecisionMaking();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.EntityAction#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Institution</em>'.
	 * @see maia.operationalStructure.EntityAction#getInstitution()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_Institution();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.EntityAction#getPostConditionNotDo <em>Post Condition Not Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post Condition Not Do</em>'.
	 * @see maia.operationalStructure.EntityAction#getPostConditionNotDo()
	 * @see #getEntityAction()
	 * @generated
	 */
	EReference getEntityAction_PostConditionNotDo();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.ActionSituation <em>Action Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Situation</em>'.
	 * @see maia.operationalStructure.ActionSituation
	 * @generated
	 */
	EClass getActionSituation();

	/**
	 * Returns the meta object for the attribute '{@link maia.operationalStructure.ActionSituation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.operationalStructure.ActionSituation#getLabel()
	 * @see #getActionSituation()
	 * @generated
	 */
	EAttribute getActionSituation_Label();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.ActionSituation#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see maia.operationalStructure.ActionSituation#getActions()
	 * @see #getActionSituation()
	 * @generated
	 */
	EReference getActionSituation_Actions();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.ActionSituation#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see maia.operationalStructure.ActionSituation#getPreCondition()
	 * @see #getActionSituation()
	 * @generated
	 */
	EReference getActionSituation_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.ActionSituation#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see maia.operationalStructure.ActionSituation#getPostCondition()
	 * @see #getActionSituation()
	 * @generated
	 */
	EReference getActionSituation_PostCondition();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.ActionArena <em>Action Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Arena</em>'.
	 * @see maia.operationalStructure.ActionArena
	 * @generated
	 */
	EClass getActionArena();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.ActionArena#getActionSituation <em>Action Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Situation</em>'.
	 * @see maia.operationalStructure.ActionArena#getActionSituation()
	 * @see #getActionArena()
	 * @generated
	 */
	EReference getActionArena_ActionSituation();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.RoleEnactment <em>Role Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Enactment</em>'.
	 * @see maia.operationalStructure.RoleEnactment
	 * @generated
	 */
	EClass getRoleEnactment();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.RoleEnactment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see maia.operationalStructure.RoleEnactment#getRole()
	 * @see #getRoleEnactment()
	 * @generated
	 */
	EReference getRoleEnactment_Role();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.RoleEnactment#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see maia.operationalStructure.RoleEnactment#getAgent()
	 * @see #getRoleEnactment()
	 * @generated
	 */
	EReference getRoleEnactment_Agent();

	/**
	 * Returns the meta object for the attribute '{@link maia.operationalStructure.RoleEnactment#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.operationalStructure.RoleEnactment#getLabel()
	 * @see #getRoleEnactment()
	 * @generated
	 */
	EAttribute getRoleEnactment_Label();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see maia.operationalStructure.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link maia.operationalStructure.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maia.operationalStructure.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.PlanSequence <em>Plan Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Sequence</em>'.
	 * @see maia.operationalStructure.PlanSequence
	 * @generated
	 */
	EClass getPlanSequence();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanSequence#getPlan1 <em>Plan1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan1</em>'.
	 * @see maia.operationalStructure.PlanSequence#getPlan1()
	 * @see #getPlanSequence()
	 * @generated
	 */
	EReference getPlanSequence_Plan1();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanSequence#getPlan2 <em>Plan2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan2</em>'.
	 * @see maia.operationalStructure.PlanSequence#getPlan2()
	 * @see #getPlanSequence()
	 * @generated
	 */
	EReference getPlanSequence_Plan2();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.PlanAlternative <em>Plan Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Alternative</em>'.
	 * @see maia.operationalStructure.PlanAlternative
	 * @generated
	 */
	EClass getPlanAlternative();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanAlternative#getPlan1 <em>Plan1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan1</em>'.
	 * @see maia.operationalStructure.PlanAlternative#getPlan1()
	 * @see #getPlanAlternative()
	 * @generated
	 */
	EReference getPlanAlternative_Plan1();

	/**
	 * Returns the meta object for the reference list '{@link maia.operationalStructure.PlanAlternative#getPlan2 <em>Plan2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plan2</em>'.
	 * @see maia.operationalStructure.PlanAlternative#getPlan2()
	 * @see #getPlanAlternative()
	 * @generated
	 */
	EReference getPlanAlternative_Plan2();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.PlanLoop <em>Plan Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Loop</em>'.
	 * @see maia.operationalStructure.PlanLoop
	 * @generated
	 */
	EClass getPlanLoop();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanLoop#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see maia.operationalStructure.PlanLoop#getPlan()
	 * @see #getPlanLoop()
	 * @generated
	 */
	EReference getPlanLoop_Plan();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanLoop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see maia.operationalStructure.PlanLoop#getCondition()
	 * @see #getPlanLoop()
	 * @generated
	 */
	EReference getPlanLoop_Condition();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.OperationalStructure <em>Operational Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Structure</em>'.
	 * @see maia.operationalStructure.OperationalStructure
	 * @generated
	 */
	EClass getOperationalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.operationalStructure.OperationalStructure#getActionPlans <em>Action Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Plans</em>'.
	 * @see maia.operationalStructure.OperationalStructure#getActionPlans()
	 * @see #getOperationalStructure()
	 * @generated
	 */
	EReference getOperationalStructure_ActionPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.operationalStructure.OperationalStructure#getActionsituation <em>Actionsituation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionsituation</em>'.
	 * @see maia.operationalStructure.OperationalStructure#getActionsituation()
	 * @see #getOperationalStructure()
	 * @generated
	 */
	EReference getOperationalStructure_Actionsituation();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.operationalStructure.OperationalStructure#getActionArena <em>Action Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Arena</em>'.
	 * @see maia.operationalStructure.OperationalStructure#getActionArena()
	 * @see #getOperationalStructure()
	 * @generated
	 */
	EReference getOperationalStructure_ActionArena();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.operationalStructure.OperationalStructure#getRoleEnactments <em>Role Enactments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Enactments</em>'.
	 * @see maia.operationalStructure.OperationalStructure#getRoleEnactments()
	 * @see #getOperationalStructure()
	 * @generated
	 */
	EReference getOperationalStructure_RoleEnactments();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.operationalStructure.OperationalStructure#getActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Body</em>'.
	 * @see maia.operationalStructure.OperationalStructure#getActionBody()
	 * @see #getOperationalStructure()
	 * @generated
	 */
	EReference getOperationalStructure_ActionBody();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performer</em>'.
	 * @see maia.operationalStructure.Performer
	 * @generated
	 */
	EClass getPerformer();

	/**
	 * Returns the meta object for the attribute '{@link maia.operationalStructure.Performer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maia.operationalStructure.Performer#getName()
	 * @see #getPerformer()
	 * @generated
	 */
	EAttribute getPerformer_Name();

	/**
	 * Returns the meta object for class '{@link maia.operationalStructure.PlanCondition <em>Plan Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Condition</em>'.
	 * @see maia.operationalStructure.PlanCondition
	 * @generated
	 */
	EClass getPlanCondition();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanCondition#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see maia.operationalStructure.PlanCondition#getPlan()
	 * @see #getPlanCondition()
	 * @generated
	 */
	EReference getPlanCondition_Plan();

	/**
	 * Returns the meta object for the reference '{@link maia.operationalStructure.PlanCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see maia.operationalStructure.PlanCondition#getCondition()
	 * @see #getPlanCondition()
	 * @generated
	 */
	EReference getPlanCondition_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationalStructureFactory getOperationalStructureFactory();

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
		 * The meta object literal for the '{@link maia.operationalStructure.impl.ActionBodyImpl <em>Action Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.ActionBodyImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionBody()
		 * @generated
		 */
		EClass ACTION_BODY = eINSTANCE.getActionBody();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BODY__ACTION_NAME = eINSTANCE.getActionBody_ActionName();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.EntityActionImpl <em>Entity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.EntityActionImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getEntityAction()
		 * @generated
		 */
		EClass ENTITY_ACTION = eINSTANCE.getEntityAction();

		/**
		 * The meta object literal for the '<em><b>Action Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__ACTION_BODY = eINSTANCE.getEntityAction_ActionBody();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__POST_CONDITION = eINSTANCE.getEntityAction_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__PRE_CONDITION = eINSTANCE.getEntityAction_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Perfomer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__PERFOMER = eINSTANCE.getEntityAction_Perfomer();

		/**
		 * The meta object literal for the '<em><b>Role Enactment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__ROLE_ENACTMENT = eINSTANCE.getEntityAction_RoleEnactment();

		/**
		 * The meta object literal for the '<em><b>Decision Making</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__DECISION_MAKING = eINSTANCE.getEntityAction_DecisionMaking();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__INSTITUTION = eINSTANCE.getEntityAction_Institution();

		/**
		 * The meta object literal for the '<em><b>Post Condition Not Do</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_ACTION__POST_CONDITION_NOT_DO = eINSTANCE.getEntityAction_PostConditionNotDo();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.ActionSituationImpl <em>Action Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.ActionSituationImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionSituation()
		 * @generated
		 */
		EClass ACTION_SITUATION = eINSTANCE.getActionSituation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_SITUATION__LABEL = eINSTANCE.getActionSituation_Label();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SITUATION__ACTIONS = eINSTANCE.getActionSituation_Actions();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SITUATION__PRE_CONDITION = eINSTANCE.getActionSituation_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SITUATION__POST_CONDITION = eINSTANCE.getActionSituation_PostCondition();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.ActionArenaImpl <em>Action Arena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.ActionArenaImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getActionArena()
		 * @generated
		 */
		EClass ACTION_ARENA = eINSTANCE.getActionArena();

		/**
		 * The meta object literal for the '<em><b>Action Situation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ARENA__ACTION_SITUATION = eINSTANCE.getActionArena_ActionSituation();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.RoleEnactmentImpl <em>Role Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.RoleEnactmentImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getRoleEnactment()
		 * @generated
		 */
		EClass ROLE_ENACTMENT = eINSTANCE.getRoleEnactment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ENACTMENT__ROLE = eINSTANCE.getRoleEnactment_Role();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ENACTMENT__AGENT = eINSTANCE.getRoleEnactment_Agent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ENACTMENT__LABEL = eINSTANCE.getRoleEnactment_Label();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PlanImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PlanSequenceImpl <em>Plan Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PlanSequenceImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanSequence()
		 * @generated
		 */
		EClass PLAN_SEQUENCE = eINSTANCE.getPlanSequence();

		/**
		 * The meta object literal for the '<em><b>Plan1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_SEQUENCE__PLAN1 = eINSTANCE.getPlanSequence_Plan1();

		/**
		 * The meta object literal for the '<em><b>Plan2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_SEQUENCE__PLAN2 = eINSTANCE.getPlanSequence_Plan2();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PlanAlternativeImpl <em>Plan Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PlanAlternativeImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanAlternative()
		 * @generated
		 */
		EClass PLAN_ALTERNATIVE = eINSTANCE.getPlanAlternative();

		/**
		 * The meta object literal for the '<em><b>Plan1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ALTERNATIVE__PLAN1 = eINSTANCE.getPlanAlternative_Plan1();

		/**
		 * The meta object literal for the '<em><b>Plan2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_ALTERNATIVE__PLAN2 = eINSTANCE.getPlanAlternative_Plan2();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PlanLoopImpl <em>Plan Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PlanLoopImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanLoop()
		 * @generated
		 */
		EClass PLAN_LOOP = eINSTANCE.getPlanLoop();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_LOOP__PLAN = eINSTANCE.getPlanLoop_Plan();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_LOOP__CONDITION = eINSTANCE.getPlanLoop_Condition();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.OperationalStructureImpl <em>Operational Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.OperationalStructureImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getOperationalStructure()
		 * @generated
		 */
		EClass OPERATIONAL_STRUCTURE = eINSTANCE.getOperationalStructure();

		/**
		 * The meta object literal for the '<em><b>Action Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_STRUCTURE__ACTION_PLANS = eINSTANCE.getOperationalStructure_ActionPlans();

		/**
		 * The meta object literal for the '<em><b>Actionsituation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_STRUCTURE__ACTIONSITUATION = eINSTANCE.getOperationalStructure_Actionsituation();

		/**
		 * The meta object literal for the '<em><b>Action Arena</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_STRUCTURE__ACTION_ARENA = eINSTANCE.getOperationalStructure_ActionArena();

		/**
		 * The meta object literal for the '<em><b>Role Enactments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS = eINSTANCE.getOperationalStructure_RoleEnactments();

		/**
		 * The meta object literal for the '<em><b>Action Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_STRUCTURE__ACTION_BODY = eINSTANCE.getOperationalStructure_ActionBody();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PerformerImpl <em>Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PerformerImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPerformer()
		 * @generated
		 */
		EClass PERFORMER = eINSTANCE.getPerformer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMER__NAME = eINSTANCE.getPerformer_Name();

		/**
		 * The meta object literal for the '{@link maia.operationalStructure.impl.PlanConditionImpl <em>Plan Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.operationalStructure.impl.PlanConditionImpl
		 * @see maia.operationalStructure.impl.OperationalStructurePackageImpl#getPlanCondition()
		 * @generated
		 */
		EClass PLAN_CONDITION = eINSTANCE.getPlanCondition();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_CONDITION__PLAN = eINSTANCE.getPlanCondition_Plan();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_CONDITION__CONDITION = eINSTANCE.getPlanCondition_Condition();

	}

} //OperationalStructurePackage
