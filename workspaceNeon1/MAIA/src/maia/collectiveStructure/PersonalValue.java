/**
 */
package maia.collectiveStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.PersonalValue#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.collectiveStructure.PersonalValue#getDecisionInfluence <em>Decision Influence</em>}</li>
 *   <li>{@link maia.collectiveStructure.PersonalValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValue()
 * @model
 * @generated
 */
public interface PersonalValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValue_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.PersonalValue#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Decision Influence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Influence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Influence</em>' containment reference.
	 * @see #setDecisionInfluence(DecisionInfluence)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValue_DecisionInfluence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DecisionInfluence getDecisionInfluence();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.PersonalValue#getDecisionInfluence <em>Decision Influence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Influence</em>' containment reference.
	 * @see #getDecisionInfluence()
	 * @generated
	 */
	void setDecisionInfluence(DecisionInfluence value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getPersonalValue_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.PersonalValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // PersonalValue
