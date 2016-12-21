/**
 */
package maia.evaluativeStructure;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.NaturalLangCondition;

import maia.operationalStructure.EntityAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getDependentVariableEval <em>Dependent Variable Eval</em>}</li>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getType <em>Type</em>}</li>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getUpdateValue <em>Update Value</em>}</li>
 *   <li>{@link maia.evaluativeStructure.Evaluation#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependent Variable Eval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Variable Eval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Variable Eval</em>' reference.
	 * @see #setDependentVariableEval(Variable)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_DependentVariableEval()
	 * @model
	 * @generated
	 */
	Variable getDependentVariableEval();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.Evaluation#getDependentVariableEval <em>Dependent Variable Eval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Variable Eval</em>' reference.
	 * @see #getDependentVariableEval()
	 * @generated
	 */
	void setDependentVariableEval(Variable value);

	/**
	 * Returns the value of the '<em><b>Related Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Action</em>' reference.
	 * @see #setRelatedAction(EntityAction)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_RelatedAction()
	 * @model required="true"
	 * @generated
	 */
	EntityAction getRelatedAction();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.Evaluation#getRelatedAction <em>Related Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Action</em>' reference.
	 * @see #getRelatedAction()
	 * @generated
	 */
	void setRelatedAction(EntityAction value);

	/**
	 * Returns the value of the '<em><b>Independent Variables</b></em>' reference list.
	 * The list contents are of type {@link maia.evaluativeStructure.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Independent Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Independent Variables</em>' reference list.
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_IndependentVariables()
	 * @model
	 * @generated
	 */
	EList<Variable> getIndependentVariables();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maia.evaluativeStructure.relationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see maia.evaluativeStructure.relationType
	 * @see #setType(relationType)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_Type()
	 * @model
	 * @generated
	 */
	relationType getType();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.Evaluation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see maia.evaluativeStructure.relationType
	 * @see #getType()
	 * @generated
	 */
	void setType(relationType value);

	/**
	 * Returns the value of the '<em><b>Update Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Value</em>' reference.
	 * @see #setUpdateValue(Condition)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_UpdateValue()
	 * @model
	 * @generated
	 */
	Condition getUpdateValue();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.Evaluation#getUpdateValue <em>Update Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Value</em>' reference.
	 * @see #getUpdateValue()
	 * @generated
	 */
	void setUpdateValue(Condition value);

	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation</em>' reference.
	 * @see #setCalculation(NaturalLangCondition)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluation_Calculation()
	 * @model
	 * @generated
	 */
	NaturalLangCondition getCalculation();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.Evaluation#getCalculation <em>Calculation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation</em>' reference.
	 * @see #getCalculation()
	 * @generated
	 */
	void setCalculation(NaturalLangCondition value);

} // Evaluation
