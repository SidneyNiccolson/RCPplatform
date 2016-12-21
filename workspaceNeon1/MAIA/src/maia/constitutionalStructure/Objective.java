/**
 */
package maia.constitutionalStructure;

import maia.ontologicalStructure.Condition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.Objective#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Objective#getMeetingCondition <em>Meeting Condition</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends EObject {
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
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getObjective_Label()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Objective#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Meeting Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting Condition</em>' reference.
	 * @see #setMeetingCondition(Condition)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getObjective_MeetingCondition()
	 * @model required="true"
	 * @generated
	 */
	Condition getMeetingCondition();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Objective#getMeetingCondition <em>Meeting Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting Condition</em>' reference.
	 * @see #getMeetingCondition()
	 * @generated
	 */
	void setMeetingCondition(Condition value);

} // Objective
