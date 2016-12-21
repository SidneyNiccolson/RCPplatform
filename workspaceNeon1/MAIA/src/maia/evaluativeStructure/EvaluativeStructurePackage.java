/**
 */
package maia.evaluativeStructure;

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
 * @see maia.evaluativeStructure.EvaluativeStructureFactory
 * @model kind="package"
 * @generated
 */
public interface EvaluativeStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evaluativeStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/evaluativeStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evaluativeStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvaluativeStructurePackage eINSTANCE = maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.DebuggingImpl <em>Debugging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.DebuggingImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getDebugging()
	 * @generated
	 */
	int DEBUGGING = 0;

	/**
	 * The feature id for the '<em><b>Dependent Variable Debug</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__DEPENDENT_VARIABLE_DEBUG = 0;

	/**
	 * The feature id for the '<em><b>Related Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__RELATED_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Independent Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__INDEPENDENT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Update Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__UPDATE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING__CALCULATION = 5;

	/**
	 * The number of structural features of the '<em>Debugging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Debugging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGGING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.EvaluationImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 1;

	/**
	 * The feature id for the '<em><b>Dependent Variable Eval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__DEPENDENT_VARIABLE_EVAL = 0;

	/**
	 * The feature id for the '<em><b>Related Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__RELATED_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Independent Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__INDEPENDENT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Update Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__UPDATE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__CALCULATION = 5;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl <em>Evaluative Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.EvaluativeStructureImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getEvaluativeStructure()
	 * @generated
	 */
	int EVALUATIVE_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE__EVALUATION = 0;

	/**
	 * The feature id for the '<em><b>Debugging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE__DEBUGGING = 1;

	/**
	 * The feature id for the '<em><b>Property Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Ontological Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Personal Value Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Evaluative Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Evaluative Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATIVE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.VariableImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.PropertyVariableImpl <em>Property Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.PropertyVariableImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getPropertyVariable()
	 * @generated
	 */
	int PROPERTY_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VARIABLE__LABEL = VARIABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VARIABLE__PROPERTY = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.PersonalValueVariableImpl <em>Personal Value Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.PersonalValueVariableImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getPersonalValueVariable()
	 * @generated
	 */
	int PERSONAL_VALUE_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_VARIABLE__LABEL = VARIABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Personal Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_VARIABLE__PERSONAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Personal Value Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Personal Value Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_VALUE_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.impl.OntologicalConceptVariableImpl <em>Ontological Concept Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.impl.OntologicalConceptVariableImpl
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getOntologicalConceptVariable()
	 * @generated
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE__LABEL = VARIABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Ontolgical Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ontological Concept Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ontological Concept Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.evaluativeStructure.relationType <em>relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.evaluativeStructure.relationType
	 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getrelationType()
	 * @generated
	 */
	int RELATION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.Debugging <em>Debugging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debugging</em>'.
	 * @see maia.evaluativeStructure.Debugging
	 * @generated
	 */
	EClass getDebugging();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Debugging#getDependentVariableDebug <em>Dependent Variable Debug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Variable Debug</em>'.
	 * @see maia.evaluativeStructure.Debugging#getDependentVariableDebug()
	 * @see #getDebugging()
	 * @generated
	 */
	EReference getDebugging_DependentVariableDebug();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Debugging#getRelatedAction <em>Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Action</em>'.
	 * @see maia.evaluativeStructure.Debugging#getRelatedAction()
	 * @see #getDebugging()
	 * @generated
	 */
	EReference getDebugging_RelatedAction();

	/**
	 * Returns the meta object for the reference list '{@link maia.evaluativeStructure.Debugging#getIndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Independent Variables</em>'.
	 * @see maia.evaluativeStructure.Debugging#getIndependentVariables()
	 * @see #getDebugging()
	 * @generated
	 */
	EReference getDebugging_IndependentVariables();

	/**
	 * Returns the meta object for the attribute '{@link maia.evaluativeStructure.Debugging#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maia.evaluativeStructure.Debugging#getType()
	 * @see #getDebugging()
	 * @generated
	 */
	EAttribute getDebugging_Type();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Debugging#getUpdateValue <em>Update Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Value</em>'.
	 * @see maia.evaluativeStructure.Debugging#getUpdateValue()
	 * @see #getDebugging()
	 * @generated
	 */
	EReference getDebugging_UpdateValue();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Debugging#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculation</em>'.
	 * @see maia.evaluativeStructure.Debugging#getCalculation()
	 * @see #getDebugging()
	 * @generated
	 */
	EReference getDebugging_Calculation();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see maia.evaluativeStructure.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Evaluation#getDependentVariableEval <em>Dependent Variable Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Variable Eval</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getDependentVariableEval()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_DependentVariableEval();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Evaluation#getRelatedAction <em>Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Action</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getRelatedAction()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_RelatedAction();

	/**
	 * Returns the meta object for the reference list '{@link maia.evaluativeStructure.Evaluation#getIndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Independent Variables</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getIndependentVariables()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_IndependentVariables();

	/**
	 * Returns the meta object for the attribute '{@link maia.evaluativeStructure.Evaluation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getType()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Type();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Evaluation#getUpdateValue <em>Update Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Value</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getUpdateValue()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_UpdateValue();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.Evaluation#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculation</em>'.
	 * @see maia.evaluativeStructure.Evaluation#getCalculation()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Calculation();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.EvaluativeStructure <em>Evaluative Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluative Structure</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure
	 * @generated
	 */
	EClass getEvaluativeStructure();

	/**
	 * Returns the meta object for the containment reference '{@link maia.evaluativeStructure.EvaluativeStructure#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure#getEvaluation()
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	EReference getEvaluativeStructure_Evaluation();

	/**
	 * Returns the meta object for the containment reference '{@link maia.evaluativeStructure.EvaluativeStructure#getDebugging <em>Debugging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debugging</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure#getDebugging()
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	EReference getEvaluativeStructure_Debugging();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.evaluativeStructure.EvaluativeStructure#getPropertyVariable <em>Property Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Variable</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure#getPropertyVariable()
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	EReference getEvaluativeStructure_PropertyVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.evaluativeStructure.EvaluativeStructure#getOntologicalVariable <em>Ontological Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontological Variable</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure#getOntologicalVariable()
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	EReference getEvaluativeStructure_OntologicalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.evaluativeStructure.EvaluativeStructure#getPersonalValueVariable <em>Personal Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Value Variable</em>'.
	 * @see maia.evaluativeStructure.EvaluativeStructure#getPersonalValueVariable()
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	EReference getEvaluativeStructure_PersonalValueVariable();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see maia.evaluativeStructure.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link maia.evaluativeStructure.Variable#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.evaluativeStructure.Variable#getLabel()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Label();

	/**
	 * Returns the meta object for the attribute '{@link maia.evaluativeStructure.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maia.evaluativeStructure.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.PropertyVariable <em>Property Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Variable</em>'.
	 * @see maia.evaluativeStructure.PropertyVariable
	 * @generated
	 */
	EClass getPropertyVariable();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.PropertyVariable#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see maia.evaluativeStructure.PropertyVariable#getProperty()
	 * @see #getPropertyVariable()
	 * @generated
	 */
	EReference getPropertyVariable_Property();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.PersonalValueVariable <em>Personal Value Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Value Variable</em>'.
	 * @see maia.evaluativeStructure.PersonalValueVariable
	 * @generated
	 */
	EClass getPersonalValueVariable();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.PersonalValueVariable#getPersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Value</em>'.
	 * @see maia.evaluativeStructure.PersonalValueVariable#getPersonalValue()
	 * @see #getPersonalValueVariable()
	 * @generated
	 */
	EReference getPersonalValueVariable_PersonalValue();

	/**
	 * Returns the meta object for class '{@link maia.evaluativeStructure.OntologicalConceptVariable <em>Ontological Concept Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontological Concept Variable</em>'.
	 * @see maia.evaluativeStructure.OntologicalConceptVariable
	 * @generated
	 */
	EClass getOntologicalConceptVariable();

	/**
	 * Returns the meta object for the reference '{@link maia.evaluativeStructure.OntologicalConceptVariable#getOntolgicalConcept <em>Ontolgical Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ontolgical Concept</em>'.
	 * @see maia.evaluativeStructure.OntologicalConceptVariable#getOntolgicalConcept()
	 * @see #getOntologicalConceptVariable()
	 * @generated
	 */
	EReference getOntologicalConceptVariable_OntolgicalConcept();

	/**
	 * Returns the meta object for enum '{@link maia.evaluativeStructure.relationType <em>relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>relation Type</em>'.
	 * @see maia.evaluativeStructure.relationType
	 * @generated
	 */
	EEnum getrelationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvaluativeStructureFactory getEvaluativeStructureFactory();

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
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.DebuggingImpl <em>Debugging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.DebuggingImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getDebugging()
		 * @generated
		 */
		EClass DEBUGGING = eINSTANCE.getDebugging();

		/**
		 * The meta object literal for the '<em><b>Dependent Variable Debug</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGGING__DEPENDENT_VARIABLE_DEBUG = eINSTANCE.getDebugging_DependentVariableDebug();

		/**
		 * The meta object literal for the '<em><b>Related Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGGING__RELATED_ACTION = eINSTANCE.getDebugging_RelatedAction();

		/**
		 * The meta object literal for the '<em><b>Independent Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGGING__INDEPENDENT_VARIABLES = eINSTANCE.getDebugging_IndependentVariables();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBUGGING__TYPE = eINSTANCE.getDebugging_Type();

		/**
		 * The meta object literal for the '<em><b>Update Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGGING__UPDATE_VALUE = eINSTANCE.getDebugging_UpdateValue();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGGING__CALCULATION = eINSTANCE.getDebugging_Calculation();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.EvaluationImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Dependent Variable Eval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__DEPENDENT_VARIABLE_EVAL = eINSTANCE.getEvaluation_DependentVariableEval();

		/**
		 * The meta object literal for the '<em><b>Related Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__RELATED_ACTION = eINSTANCE.getEvaluation_RelatedAction();

		/**
		 * The meta object literal for the '<em><b>Independent Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__INDEPENDENT_VARIABLES = eINSTANCE.getEvaluation_IndependentVariables();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__TYPE = eINSTANCE.getEvaluation_Type();

		/**
		 * The meta object literal for the '<em><b>Update Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__UPDATE_VALUE = eINSTANCE.getEvaluation_UpdateValue();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__CALCULATION = eINSTANCE.getEvaluation_Calculation();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl <em>Evaluative Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.EvaluativeStructureImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getEvaluativeStructure()
		 * @generated
		 */
		EClass EVALUATIVE_STRUCTURE = eINSTANCE.getEvaluativeStructure();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIVE_STRUCTURE__EVALUATION = eINSTANCE.getEvaluativeStructure_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Debugging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIVE_STRUCTURE__DEBUGGING = eINSTANCE.getEvaluativeStructure_Debugging();

		/**
		 * The meta object literal for the '<em><b>Property Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE = eINSTANCE.getEvaluativeStructure_PropertyVariable();

		/**
		 * The meta object literal for the '<em><b>Ontological Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE = eINSTANCE.getEvaluativeStructure_OntologicalVariable();

		/**
		 * The meta object literal for the '<em><b>Personal Value Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE = eINSTANCE.getEvaluativeStructure_PersonalValueVariable();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.VariableImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LABEL = eINSTANCE.getVariable_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.PropertyVariableImpl <em>Property Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.PropertyVariableImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getPropertyVariable()
		 * @generated
		 */
		EClass PROPERTY_VARIABLE = eINSTANCE.getPropertyVariable();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VARIABLE__PROPERTY = eINSTANCE.getPropertyVariable_Property();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.PersonalValueVariableImpl <em>Personal Value Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.PersonalValueVariableImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getPersonalValueVariable()
		 * @generated
		 */
		EClass PERSONAL_VALUE_VARIABLE = eINSTANCE.getPersonalValueVariable();

		/**
		 * The meta object literal for the '<em><b>Personal Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_VALUE_VARIABLE__PERSONAL_VALUE = eINSTANCE.getPersonalValueVariable_PersonalValue();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.impl.OntologicalConceptVariableImpl <em>Ontological Concept Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.impl.OntologicalConceptVariableImpl
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getOntologicalConceptVariable()
		 * @generated
		 */
		EClass ONTOLOGICAL_CONCEPT_VARIABLE = eINSTANCE.getOntologicalConceptVariable();

		/**
		 * The meta object literal for the '<em><b>Ontolgical Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT = eINSTANCE.getOntologicalConceptVariable_OntolgicalConcept();

		/**
		 * The meta object literal for the '{@link maia.evaluativeStructure.relationType <em>relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.evaluativeStructure.relationType
		 * @see maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl#getrelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getrelationType();

	}

} //EvaluativeStructurePackage
