/**
 */
package maia.ontologicalStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negformula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.Negformula#getConditionStatement <em>Condition Statement</em>}</li>
 * </ul>
 *
 * @see maia.ontologicalStructure.OntologicalStructurePackage#getNegformula()
 * @model
 * @generated
 */
public interface Negformula extends LogicalCondition {
	/**
	 * Returns the value of the '<em><b>Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Statement</em>' reference.
	 * @see #setConditionStatement(Condition)
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getNegformula_ConditionStatement()
	 * @model
	 * @generated
	 */
	Condition getConditionStatement();

	/**
	 * Sets the value of the '{@link maia.ontologicalStructure.Negformula#getConditionStatement <em>Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Statement</em>' reference.
	 * @see #getConditionStatement()
	 * @generated
	 */
	void setConditionStatement(Condition value);

} // Negformula
