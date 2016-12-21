/**
 */
package maia.constitutionalStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constitutional Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.ConstitutionalStructure#getRoles <em>Roles</em>}</li>
 *   <li>{@link maia.constitutionalStructure.ConstitutionalStructure#getInstitutions <em>Institutions</em>}</li>
 *   <li>{@link maia.constitutionalStructure.ConstitutionalStructure#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link maia.constitutionalStructure.ConstitutionalStructure#getSanctions <em>Sanctions</em>}</li>
 *   <li>{@link maia.constitutionalStructure.ConstitutionalStructure#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure()
 * @model
 * @generated
 */
public interface ConstitutionalStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Institutions</b></em>' containment reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.InstitutionalStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institutions</em>' containment reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure_Institutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstitutionalStatement> getInstitutions();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Sanctions</b></em>' containment reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Sanction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sanctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sanctions</em>' containment reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure_Sanctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sanction> getSanctions();

	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getConstitutionalStructure_Objectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objective> getObjectives();

} // ConstitutionalStructure
