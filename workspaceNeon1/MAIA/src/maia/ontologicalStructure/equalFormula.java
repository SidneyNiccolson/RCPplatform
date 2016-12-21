/**
 */
package maia.ontologicalStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equal Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.equalFormula#getLeftConditionStatement <em>Left Condition Statement</em>}</li>
 *   <li>{@link maia.ontologicalStructure.equalFormula#getRightConditionStatement <em>Right Condition Statement</em>}</li>
 * </ul>
 *
 * @see maia.ontologicalStructure.OntologicalStructurePackage#getequalFormula()
 * @model
 * @generated
 */
public interface equalFormula extends MathCondition {
	/**
	 * Returns the value of the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Condition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Condition Statement</em>' reference.
	 * @see #setLeftConditionStatement(Condition)
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getequalFormula_LeftConditionStatement()
	 * @model required="true"
	 * @generated
	 */
	Condition getLeftConditionStatement();

	/**
	 * Sets the value of the '{@link maia.ontologicalStructure.equalFormula#getLeftConditionStatement <em>Left Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Condition Statement</em>' reference.
	 * @see #getLeftConditionStatement()
	 * @generated
	 */
	void setLeftConditionStatement(Condition value);

	/**
	 * Returns the value of the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Condition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Condition Statement</em>' reference.
	 * @see #setRightConditionStatement(Condition)
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getequalFormula_RightConditionStatement()
	 * @model required="true"
	 * @generated
	 */
	Condition getRightConditionStatement();

	/**
	 * Sets the value of the '{@link maia.ontologicalStructure.equalFormula#getRightConditionStatement <em>Right Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Condition Statement</em>' reference.
	 * @see #getRightConditionStatement()
	 * @generated
	 */
	void setRightConditionStatement(Condition value);

} // equalFormula
