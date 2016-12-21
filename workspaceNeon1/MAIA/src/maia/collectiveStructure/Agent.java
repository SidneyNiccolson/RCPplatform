/**
 */
package maia.collectiveStructure;

import maia.constitutionalStructure.Role;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.Property;

import maia.operationalStructure.ActionBody;
import maia.operationalStructure.Performer;

import maia.physicalStructure.PhysicalComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.Agent#getPersonalValue <em>Personal Value</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getPossibleRole <em>Possible Role</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getIntrinsicBehaviour <em>Intrinsic Behaviour</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getProperty <em>Property</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getInformation <em>Information</em>}</li>
 *   <li>{@link maia.collectiveStructure.Agent#getDecision <em>Decision</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Performer  {
	/**
	 * Returns the value of the '<em><b>Personal Value</b></em>' reference list.
	 * The list contents are of type {@link maia.collectiveStructure.PersonalValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Value</em>' reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_PersonalValue()
	 * @model
	 * @generated
	 */
	EList<PersonalValue> getPersonalValue();

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
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_PhysicalComponent()
	 * @model
	 * @generated
	 */
	EList<PhysicalComponent> getPhysicalComponent();

	/**
	 * Returns the value of the '<em><b>Possible Role</b></em>' reference list.
	 * The list contents are of type {@link maia.constitutionalStructure.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Role</em>' reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_PossibleRole()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getPossibleRole();

	/**
	 * Returns the value of the '<em><b>Intrinsic Behaviour</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intrinsic Behaviour</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intrinsic Behaviour</em>' reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_IntrinsicBehaviour()
	 * @model
	 * @generated
	 */
	EList<ActionBody> getIntrinsicBehaviour();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

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
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_Information()
	 * @model
	 * @generated
	 */
	EList<Condition> getInformation();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' reference list.
	 * The list contents are of type {@link maia.collectiveStructure.MCDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getAgent_Decision()
	 * @model
	 * @generated
	 */
	EList<MCDA> getDecision();

} // Agent
