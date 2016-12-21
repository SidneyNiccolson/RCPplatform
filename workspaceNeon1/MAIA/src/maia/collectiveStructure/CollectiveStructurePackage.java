/**
 */
package maia.collectiveStructure;

import maia.operationalStructure.OperationalStructurePackage;

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
 * @see maia.collectiveStructure.CollectiveStructureFactory
 * @model kind="package"
 * @generated
 */
public interface CollectiveStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collectiveStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/collectiveStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collectiveStruct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectiveStructurePackage eINSTANCE = maia.collectiveStructure.impl.CollectiveStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.AgentImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = OperationalStructurePackage.PERFORMER__NAME;

	/**
	 * The feature id for the '<em><b>Personal Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PERSONAL_VALUE = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PHYSICAL_COMPONENT = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Possible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__POSSIBLE_ROLE = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Intrinsic Behaviour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INTRINSIC_BEHAVIOUR = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PROPERTY = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INFORMATION = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DECISION = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = OperationalStructurePackage.PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.PersonalValueImpl <em>Personal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.PersonalValueImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPersonalValue()
	 * @generated
	 */
	int PERSONAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Decision Influence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE__DECISION_INFLUENCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Personal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.DecisionInfluenceImpl <em>Decision Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.DecisionInfluenceImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getDecisionInfluence()
	 * @generated
	 */
	int DECISION_INFLUENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INFLUENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INFLUENCE__LIMIT = 1;

	/**
	 * The number of structural features of the '<em>Decision Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INFLUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_INFLUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.CollectiveStructureImpl <em>Collective Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.CollectiveStructureImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getCollectiveStructure()
	 * @generated
	 */
	int COLLECTIVE_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_STRUCTURE__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Decision Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_STRUCTURE__DECISION_CRITERIA = 1;

	/**
	 * The feature id for the '<em><b>Personal Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_STRUCTURE__PERSONAL_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Collective Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Collective Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.MCDAImpl <em>MCDA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.MCDAImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getMCDA()
	 * @generated
	 */
	int MCDA = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA__THRESHOLD = 1;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA__ASPECTS = 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA__CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>MCDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>MCDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.DecisionCriterionImpl <em>Decision Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.DecisionCriterionImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getDecisionCriterion()
	 * @generated
	 */
	int DECISION_CRITERION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_CRITERION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_CRITERION__WEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Decision Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_CRITERION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_CRITERION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.PersonalValueAspectImpl <em>Personal Value Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.PersonalValueAspectImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPersonalValueAspect()
	 * @generated
	 */
	int PERSONAL_VALUE_ASPECT = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_ASPECT__LABEL = DECISION_CRITERION__LABEL;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_ASPECT__WEIGHT = DECISION_CRITERION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Personal Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_ASPECT__PERSONAL_VALUE = DECISION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Personal Value Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_ASPECT_FEATURE_COUNT = DECISION_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Personal Value Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_ASPECT_OPERATION_COUNT = DECISION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.PropertyAspectImpl <em>Property Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.PropertyAspectImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPropertyAspect()
	 * @generated
	 */
	int PROPERTY_ASPECT = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASPECT__LABEL = DECISION_CRITERION__LABEL;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASPECT__WEIGHT = DECISION_CRITERION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASPECT__PROPERTY = DECISION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASPECT_FEATURE_COUNT = DECISION_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASPECT_OPERATION_COUNT = DECISION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.ConditionAspectImpl <em>Condition Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.ConditionAspectImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getConditionAspect()
	 * @generated
	 */
	int CONDITION_ASPECT = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ASPECT__LABEL = DECISION_CRITERION__LABEL;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ASPECT__WEIGHT = DECISION_CRITERION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ASPECT__CONDITION = DECISION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ASPECT_FEATURE_COUNT = DECISION_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ASPECT_OPERATION_COUNT = DECISION_CRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.collectiveStructure.impl.SanctionAspectImpl <em>Sanction Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.collectiveStructure.impl.SanctionAspectImpl
	 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getSanctionAspect()
	 * @generated
	 */
	int SANCTION_ASPECT = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT__LABEL = DECISION_CRITERION__LABEL;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT__WEIGHT = DECISION_CRITERION__WEIGHT;

	/**
	 * The feature id for the '<em><b>Sanction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT__SANCTION = DECISION_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fine Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT__FINE_VALUE = DECISION_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sanction Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT_FEATURE_COUNT = DECISION_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sanction Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_ASPECT_OPERATION_COUNT = DECISION_CRITERION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see maia.collectiveStructure.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getPersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personal Value</em>'.
	 * @see maia.collectiveStructure.Agent#getPersonalValue()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_PersonalValue();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getPhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical Component</em>'.
	 * @see maia.collectiveStructure.Agent#getPhysicalComponent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_PhysicalComponent();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getPossibleRole <em>Possible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Role</em>'.
	 * @see maia.collectiveStructure.Agent#getPossibleRole()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_PossibleRole();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getIntrinsicBehaviour <em>Intrinsic Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intrinsic Behaviour</em>'.
	 * @see maia.collectiveStructure.Agent#getIntrinsicBehaviour()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_IntrinsicBehaviour();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see maia.collectiveStructure.Agent#getProperty()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Property();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information</em>'.
	 * @see maia.collectiveStructure.Agent#getInformation()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Information();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.Agent#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decision</em>'.
	 * @see maia.collectiveStructure.Agent#getDecision()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Decision();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.PersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Value</em>'.
	 * @see maia.collectiveStructure.PersonalValue
	 * @generated
	 */
	EClass getPersonalValue();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.PersonalValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.collectiveStructure.PersonalValue#getLabel()
	 * @see #getPersonalValue()
	 * @generated
	 */
	EAttribute getPersonalValue_Label();

	/**
	 * Returns the meta object for the containment reference '{@link maia.collectiveStructure.PersonalValue#getDecisionInfluence <em>Decision Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Influence</em>'.
	 * @see maia.collectiveStructure.PersonalValue#getDecisionInfluence()
	 * @see #getPersonalValue()
	 * @generated
	 */
	EReference getPersonalValue_DecisionInfluence();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.PersonalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maia.collectiveStructure.PersonalValue#getValue()
	 * @see #getPersonalValue()
	 * @generated
	 */
	EAttribute getPersonalValue_Value();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.DecisionInfluence <em>Decision Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Influence</em>'.
	 * @see maia.collectiveStructure.DecisionInfluence
	 * @generated
	 */
	EClass getDecisionInfluence();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.DecisionInfluence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maia.collectiveStructure.DecisionInfluence#getName()
	 * @see #getDecisionInfluence()
	 * @generated
	 */
	EAttribute getDecisionInfluence_Name();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.DecisionInfluence#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see maia.collectiveStructure.DecisionInfluence#getLimit()
	 * @see #getDecisionInfluence()
	 * @generated
	 */
	EAttribute getDecisionInfluence_Limit();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.CollectiveStructure <em>Collective Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Structure</em>'.
	 * @see maia.collectiveStructure.CollectiveStructure
	 * @generated
	 */
	EClass getCollectiveStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.collectiveStructure.CollectiveStructure#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see maia.collectiveStructure.CollectiveStructure#getAgent()
	 * @see #getCollectiveStructure()
	 * @generated
	 */
	EReference getCollectiveStructure_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.collectiveStructure.CollectiveStructure#getDecisionCriteria <em>Decision Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Criteria</em>'.
	 * @see maia.collectiveStructure.CollectiveStructure#getDecisionCriteria()
	 * @see #getCollectiveStructure()
	 * @generated
	 */
	EReference getCollectiveStructure_DecisionCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.collectiveStructure.CollectiveStructure#getPersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Value</em>'.
	 * @see maia.collectiveStructure.CollectiveStructure#getPersonalValue()
	 * @see #getCollectiveStructure()
	 * @generated
	 */
	EReference getCollectiveStructure_PersonalValue();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.MCDA <em>MCDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCDA</em>'.
	 * @see maia.collectiveStructure.MCDA
	 * @generated
	 */
	EClass getMCDA();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.MCDA#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.collectiveStructure.MCDA#getLabel()
	 * @see #getMCDA()
	 * @generated
	 */
	EAttribute getMCDA_Label();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.MCDA#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see maia.collectiveStructure.MCDA#getThreshold()
	 * @see #getMCDA()
	 * @generated
	 */
	EAttribute getMCDA_Threshold();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.collectiveStructure.MCDA#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see maia.collectiveStructure.MCDA#getAspects()
	 * @see #getMCDA()
	 * @generated
	 */
	EReference getMCDA_Aspects();

	/**
	 * Returns the meta object for the reference list '{@link maia.collectiveStructure.MCDA#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see maia.collectiveStructure.MCDA#getConditions()
	 * @see #getMCDA()
	 * @generated
	 */
	EReference getMCDA_Conditions();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.DecisionCriterion <em>Decision Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Criterion</em>'.
	 * @see maia.collectiveStructure.DecisionCriterion
	 * @generated
	 */
	EClass getDecisionCriterion();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.DecisionCriterion#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.collectiveStructure.DecisionCriterion#getLabel()
	 * @see #getDecisionCriterion()
	 * @generated
	 */
	EAttribute getDecisionCriterion_Label();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.DecisionCriterion#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see maia.collectiveStructure.DecisionCriterion#getWeight()
	 * @see #getDecisionCriterion()
	 * @generated
	 */
	EAttribute getDecisionCriterion_Weight();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.PersonalValueAspect <em>Personal Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Value Aspect</em>'.
	 * @see maia.collectiveStructure.PersonalValueAspect
	 * @generated
	 */
	EClass getPersonalValueAspect();

	/**
	 * Returns the meta object for the reference '{@link maia.collectiveStructure.PersonalValueAspect#getPersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Value</em>'.
	 * @see maia.collectiveStructure.PersonalValueAspect#getPersonalValue()
	 * @see #getPersonalValueAspect()
	 * @generated
	 */
	EReference getPersonalValueAspect_PersonalValue();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.PropertyAspect <em>Property Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Aspect</em>'.
	 * @see maia.collectiveStructure.PropertyAspect
	 * @generated
	 */
	EClass getPropertyAspect();

	/**
	 * Returns the meta object for the reference '{@link maia.collectiveStructure.PropertyAspect#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see maia.collectiveStructure.PropertyAspect#getProperty()
	 * @see #getPropertyAspect()
	 * @generated
	 */
	EReference getPropertyAspect_Property();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.ConditionAspect <em>Condition Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Aspect</em>'.
	 * @see maia.collectiveStructure.ConditionAspect
	 * @generated
	 */
	EClass getConditionAspect();

	/**
	 * Returns the meta object for the reference '{@link maia.collectiveStructure.ConditionAspect#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see maia.collectiveStructure.ConditionAspect#getCondition()
	 * @see #getConditionAspect()
	 * @generated
	 */
	EReference getConditionAspect_Condition();

	/**
	 * Returns the meta object for class '{@link maia.collectiveStructure.SanctionAspect <em>Sanction Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sanction Aspect</em>'.
	 * @see maia.collectiveStructure.SanctionAspect
	 * @generated
	 */
	EClass getSanctionAspect();

	/**
	 * Returns the meta object for the reference '{@link maia.collectiveStructure.SanctionAspect#getSanction <em>Sanction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sanction</em>'.
	 * @see maia.collectiveStructure.SanctionAspect#getSanction()
	 * @see #getSanctionAspect()
	 * @generated
	 */
	EReference getSanctionAspect_Sanction();

	/**
	 * Returns the meta object for the attribute '{@link maia.collectiveStructure.SanctionAspect#getFineValue <em>Fine Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine Value</em>'.
	 * @see maia.collectiveStructure.SanctionAspect#getFineValue()
	 * @see #getSanctionAspect()
	 * @generated
	 */
	EAttribute getSanctionAspect_FineValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectiveStructureFactory getCollectiveStructureFactory();

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
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.AgentImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Personal Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PERSONAL_VALUE = eINSTANCE.getAgent_PersonalValue();

		/**
		 * The meta object literal for the '<em><b>Physical Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PHYSICAL_COMPONENT = eINSTANCE.getAgent_PhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Possible Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__POSSIBLE_ROLE = eINSTANCE.getAgent_PossibleRole();

		/**
		 * The meta object literal for the '<em><b>Intrinsic Behaviour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__INTRINSIC_BEHAVIOUR = eINSTANCE.getAgent_IntrinsicBehaviour();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PROPERTY = eINSTANCE.getAgent_Property();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__INFORMATION = eINSTANCE.getAgent_Information();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__DECISION = eINSTANCE.getAgent_Decision();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.PersonalValueImpl <em>Personal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.PersonalValueImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPersonalValue()
		 * @generated
		 */
		EClass PERSONAL_VALUE = eINSTANCE.getPersonalValue();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_VALUE__LABEL = eINSTANCE.getPersonalValue_Label();

		/**
		 * The meta object literal for the '<em><b>Decision Influence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_VALUE__DECISION_INFLUENCE = eINSTANCE.getPersonalValue_DecisionInfluence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_VALUE__VALUE = eINSTANCE.getPersonalValue_Value();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.DecisionInfluenceImpl <em>Decision Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.DecisionInfluenceImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getDecisionInfluence()
		 * @generated
		 */
		EClass DECISION_INFLUENCE = eINSTANCE.getDecisionInfluence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_INFLUENCE__NAME = eINSTANCE.getDecisionInfluence_Name();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_INFLUENCE__LIMIT = eINSTANCE.getDecisionInfluence_Limit();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.CollectiveStructureImpl <em>Collective Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.CollectiveStructureImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getCollectiveStructure()
		 * @generated
		 */
		EClass COLLECTIVE_STRUCTURE = eINSTANCE.getCollectiveStructure();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_STRUCTURE__AGENT = eINSTANCE.getCollectiveStructure_Agent();

		/**
		 * The meta object literal for the '<em><b>Decision Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_STRUCTURE__DECISION_CRITERIA = eINSTANCE.getCollectiveStructure_DecisionCriteria();

		/**
		 * The meta object literal for the '<em><b>Personal Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_STRUCTURE__PERSONAL_VALUE = eINSTANCE.getCollectiveStructure_PersonalValue();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.MCDAImpl <em>MCDA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.MCDAImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getMCDA()
		 * @generated
		 */
		EClass MCDA = eINSTANCE.getMCDA();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCDA__LABEL = eINSTANCE.getMCDA_Label();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCDA__THRESHOLD = eINSTANCE.getMCDA_Threshold();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCDA__ASPECTS = eINSTANCE.getMCDA_Aspects();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCDA__CONDITIONS = eINSTANCE.getMCDA_Conditions();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.DecisionCriterionImpl <em>Decision Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.DecisionCriterionImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getDecisionCriterion()
		 * @generated
		 */
		EClass DECISION_CRITERION = eINSTANCE.getDecisionCriterion();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_CRITERION__LABEL = eINSTANCE.getDecisionCriterion_Label();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_CRITERION__WEIGHT = eINSTANCE.getDecisionCriterion_Weight();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.PersonalValueAspectImpl <em>Personal Value Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.PersonalValueAspectImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPersonalValueAspect()
		 * @generated
		 */
		EClass PERSONAL_VALUE_ASPECT = eINSTANCE.getPersonalValueAspect();

		/**
		 * The meta object literal for the '<em><b>Personal Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_VALUE_ASPECT__PERSONAL_VALUE = eINSTANCE.getPersonalValueAspect_PersonalValue();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.PropertyAspectImpl <em>Property Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.PropertyAspectImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getPropertyAspect()
		 * @generated
		 */
		EClass PROPERTY_ASPECT = eINSTANCE.getPropertyAspect();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASPECT__PROPERTY = eINSTANCE.getPropertyAspect_Property();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.ConditionAspectImpl <em>Condition Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.ConditionAspectImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getConditionAspect()
		 * @generated
		 */
		EClass CONDITION_ASPECT = eINSTANCE.getConditionAspect();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ASPECT__CONDITION = eINSTANCE.getConditionAspect_Condition();

		/**
		 * The meta object literal for the '{@link maia.collectiveStructure.impl.SanctionAspectImpl <em>Sanction Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.collectiveStructure.impl.SanctionAspectImpl
		 * @see maia.collectiveStructure.impl.CollectiveStructurePackageImpl#getSanctionAspect()
		 * @generated
		 */
		EClass SANCTION_ASPECT = eINSTANCE.getSanctionAspect();

		/**
		 * The meta object literal for the '<em><b>Sanction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANCTION_ASPECT__SANCTION = eINSTANCE.getSanctionAspect_Sanction();

		/**
		 * The meta object literal for the '<em><b>Fine Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANCTION_ASPECT__FINE_VALUE = eINSTANCE.getSanctionAspect_FineValue();

	}

} //CollectiveStructurePackage
