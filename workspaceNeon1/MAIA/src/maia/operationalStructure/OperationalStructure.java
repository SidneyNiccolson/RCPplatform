/**
 */
package maia.operationalStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.OperationalStructure#getActionPlans <em>Action Plans</em>}</li>
 *   <li>{@link maia.operationalStructure.OperationalStructure#getActionsituation <em>Actionsituation</em>}</li>
 *   <li>{@link maia.operationalStructure.OperationalStructure#getActionArena <em>Action Arena</em>}</li>
 *   <li>{@link maia.operationalStructure.OperationalStructure#getRoleEnactments <em>Role Enactments</em>}</li>
 *   <li>{@link maia.operationalStructure.OperationalStructure#getActionBody <em>Action Body</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure()
 * @model
 * @generated
 */
public interface OperationalStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Plans</b></em>' containment reference list.
	 * The list contents are of type {@link maia.operationalStructure.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Plans</em>' containment reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure_ActionPlans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plan> getActionPlans();

	/**
	 * Returns the value of the '<em><b>Actionsituation</b></em>' containment reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionsituation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionsituation</em>' containment reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure_Actionsituation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionSituation> getActionsituation();

	/**
	 * Returns the value of the '<em><b>Action Arena</b></em>' containment reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionArena}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Arena</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Arena</em>' containment reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure_ActionArena()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionArena> getActionArena();

	/**
	 * Returns the value of the '<em><b>Role Enactments</b></em>' containment reference list.
	 * The list contents are of type {@link maia.operationalStructure.RoleEnactment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Enactments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Enactments</em>' containment reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure_RoleEnactments()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleEnactment> getRoleEnactments();

	/**
	 * Returns the value of the '<em><b>Action Body</b></em>' containment reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Body</em>' containment reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getOperationalStructure_ActionBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionBody> getActionBody();

} // OperationalStructure
