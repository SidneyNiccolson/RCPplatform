/**
 */
package maia.collectiveStructure;

import maia.constitutionalStructure.Sanction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sanction Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.SanctionAspect#getSanction <em>Sanction</em>}</li>
 *   <li>{@link maia.collectiveStructure.SanctionAspect#getFineValue <em>Fine Value</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getSanctionAspect()
 * @model
 * @generated
 */
public interface SanctionAspect extends DecisionCriterion {
	/**
	 * Returns the value of the '<em><b>Sanction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sanction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sanction</em>' reference.
	 * @see #setSanction(Sanction)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getSanctionAspect_Sanction()
	 * @model required="true"
	 * @generated
	 */
	Sanction getSanction();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.SanctionAspect#getSanction <em>Sanction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sanction</em>' reference.
	 * @see #getSanction()
	 * @generated
	 */
	void setSanction(Sanction value);

	/**
	 * Returns the value of the '<em><b>Fine Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fine Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fine Value</em>' attribute.
	 * @see #setFineValue(double)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getSanctionAspect_FineValue()
	 * @model required="true"
	 * @generated
	 */
	double getFineValue();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.SanctionAspect#getFineValue <em>Fine Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fine Value</em>' attribute.
	 * @see #getFineValue()
	 * @generated
	 */
	void setFineValue(double value);

} // SanctionAspect
