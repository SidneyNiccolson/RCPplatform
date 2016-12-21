/**
 */
package maia.constitutionalStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.Norm#getDeonticType <em>Deontic Type</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getNorm()
 * @model
 * @generated
 */
public interface Norm extends InstitutionalStatement, Sanction {
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
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getNorm_DeonticType()
	 * @model required="true"
	 * @generated
	 */
	deonLogicType getDeonticType();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Norm#getDeonticType <em>Deontic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deontic Type</em>' attribute.
	 * @see maia.constitutionalStructure.deonLogicType
	 * @see #getDeonticType()
	 * @generated
	 */
	void setDeonticType(deonLogicType value);

} // Norm
