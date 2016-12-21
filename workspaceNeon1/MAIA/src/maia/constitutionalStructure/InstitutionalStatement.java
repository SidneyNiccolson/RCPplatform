/**
 */
package maia.constitutionalStructure;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.Plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Institutional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.InstitutionalStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.constitutionalStructure.InstitutionalStatement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link maia.constitutionalStructure.InstitutionalStatement#getAIm <em>AIm</em>}</li>
 *   <li>{@link maia.constitutionalStructure.InstitutionalStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getInstitutionalStatement()
 * @model abstract="true"
 * @generated
 */
public interface InstitutionalStatement extends EObject {
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
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getInstitutionalStatement_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.InstitutionalStatement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getInstitutionalStatement_Attribute()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getAttribute();

	/**
	 * Returns the value of the '<em><b>AIm</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIm</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getInstitutionalStatement_AIm()
	 * @model required="true"
	 * @generated
	 */
	EList<Plan> getAIm();

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
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getInstitutionalStatement_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.InstitutionalStatement#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // InstitutionalStatement
