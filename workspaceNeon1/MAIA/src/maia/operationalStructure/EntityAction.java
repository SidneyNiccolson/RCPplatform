/**
 */
package maia.operationalStructure;

import maia.collectiveStructure.MCDA;

import maia.constitutionalStructure.InstitutionalStatement;

import maia.ontologicalStructure.Condition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.EntityAction#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getPerfomer <em>Perfomer</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getRoleEnactment <em>Role Enactment</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getDecisionMaking <em>Decision Making</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getInstitution <em>Institution</em>}</li>
 *   <li>{@link maia.operationalStructure.EntityAction#getPostConditionNotDo <em>Post Condition Not Do</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction()
 * @model
 * @generated
 */
public interface EntityAction extends Plan {
	/**
	 * Returns the value of the '<em><b>Action Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Body</em>' reference.
	 * @see #setActionBody(ActionBody)
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_ActionBody()
	 * @model required="true"
	 * @generated
	 */
	ActionBody getActionBody();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.EntityAction#getActionBody <em>Action Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Body</em>' reference.
	 * @see #getActionBody()
	 * @generated
	 */
	void setActionBody(ActionBody value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_PostCondition()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getPostCondition();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_PreCondition()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getPreCondition();

	/**
	 * Returns the value of the '<em><b>Perfomer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfomer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfomer</em>' reference.
	 * @see #setPerfomer(Performer)
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_Perfomer()
	 * @model required="true"
	 * @generated
	 */
	Performer getPerfomer();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.EntityAction#getPerfomer <em>Perfomer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perfomer</em>' reference.
	 * @see #getPerfomer()
	 * @generated
	 */
	void setPerfomer(Performer value);

	/**
	 * Returns the value of the '<em><b>Role Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Enactment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Enactment</em>' reference.
	 * @see #setRoleEnactment(RoleEnactment)
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_RoleEnactment()
	 * @model
	 * @generated
	 */
	RoleEnactment getRoleEnactment();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.EntityAction#getRoleEnactment <em>Role Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Enactment</em>' reference.
	 * @see #getRoleEnactment()
	 * @generated
	 */
	void setRoleEnactment(RoleEnactment value);

	/**
	 * Returns the value of the '<em><b>Decision Making</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Making</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Making</em>' reference.
	 * @see #setDecisionMaking(MCDA)
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_DecisionMaking()
	 * @model
	 * @generated
	 */
	MCDA getDecisionMaking();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.EntityAction#getDecisionMaking <em>Decision Making</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Making</em>' reference.
	 * @see #getDecisionMaking()
	 * @generated
	 */
	void setDecisionMaking(MCDA value);

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
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_Institution()
	 * @model
	 * @generated
	 */
	EList<InstitutionalStatement> getInstitution();

	/**
	 * Returns the value of the '<em><b>Post Condition Not Do</b></em>' reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition Not Do</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition Not Do</em>' reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getEntityAction_PostConditionNotDo()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getPostConditionNotDo();

} // EntityAction
