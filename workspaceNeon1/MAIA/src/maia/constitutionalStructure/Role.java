/**
 */
package maia.constitutionalStructure;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.ActionBody;
import maia.operationalStructure.Performer;

import maia.physicalStructure.PhysicalComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.Role#getObjective <em>Objective</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Role#getInstitutionalCapability <em>Institutional Capability</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Role#getInstitution <em>Institution</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Role#getEntryCondition <em>Entry Condition</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Role#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Role#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Performer {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' reference.
	 * @see #setObjective(Objective)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_Objective()
	 * @model required="true"
	 * @generated
	 */
	Objective getObjective();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Role#getObjective <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objective value);

	/**
	 * Returns the value of the '<em><b>Institutional Capability</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institutional Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institutional Capability</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_InstitutionalCapability()
	 * @model
	 * @generated
	 */
	EList<ActionBody> getInstitutionalCapability();

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.InstitutionalStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_Institution()
	 * @model
	 * @generated
	 */
	EList<InstitutionalStatement> getInstitution();

	/**
	 * Returns the value of the '<em><b>Entry Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Condition</em>' reference.
	 * @see #setEntryCondition(Condition)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_EntryCondition()
	 * @model required="true"
	 * @generated
	 */
	Condition getEntryCondition();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Role#getEntryCondition <em>Entry Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Condition</em>' reference.
	 * @see #getEntryCondition()
	 * @generated
	 */
	void setEntryCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Physical Component</b></em>' reference list.
	 * The list contents are of type {@link maia.physicalStructure.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Component</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_PhysicalComponent()
	 * @model
	 * @generated
	 */
	EList<PhysicalComponent> getPhysicalComponent();

	/**
	 * Returns the value of the '<em><b>Information</b></em>' reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' reference list.
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getRole_Information()
	 * @model
	 * @generated
	 */
	EList<Condition> getInformation();

} // Role
