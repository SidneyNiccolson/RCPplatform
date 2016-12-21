/**
 */
package maia.collectiveStructure;

import maia.ontologicalStructure.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.ConditionAspect#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getConditionAspect()
 * @model
 * @generated
 */
public interface ConditionAspect extends DecisionCriterion {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getConditionAspect_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.ConditionAspect#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // ConditionAspect
