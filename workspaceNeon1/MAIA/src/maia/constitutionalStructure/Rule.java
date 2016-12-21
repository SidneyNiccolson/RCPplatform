/**
 */
package maia.constitutionalStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.Rule#getDeonticType <em>Deontic Type</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Rule#getOrElse <em>Or Else</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends InstitutionalStatement, Sanction {
	/**
	 * Returns the value of the '<em><b>Deontic Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maia.constitutionalStructure.deonLogicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deontic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deontic Type</em>' attribute.
	 * @see maia.constitutionalStructure.deonLogicType
	 * @see #setDeonticType(deonLogicType)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRule_DeonticType()
	 * @model required="true"
	 * @generated
	 */
	deonLogicType getDeonticType();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Rule#getDeonticType <em>Deontic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deontic Type</em>' attribute.
	 * @see maia.constitutionalStructure.deonLogicType
	 * @see #getDeonticType()
	 * @generated
	 */
	void setDeonticType(deonLogicType value);

	/**
	 * Returns the value of the '<em><b>Or Else</b></em>' reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Sanction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Else</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Else</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRule_OrElse()
	 * @model required="true"
	 * @generated
	 */
	EList<Sanction> getOrElse();

} // Rule
