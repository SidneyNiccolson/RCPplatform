/**
 */
package maia.collectiveStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.CollectiveStructure#getAgent <em>Agent</em>}</li>
 *   <li>{@link maia.collectiveStructure.CollectiveStructure#getDecisionCriteria <em>Decision Criteria</em>}</li>
 *   <li>{@link maia.collectiveStructure.CollectiveStructure#getPersonalValue <em>Personal Value</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getCollectiveStructure()
 * @model
 * @generated
 */
public interface CollectiveStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link maia.collectiveStructure.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getCollectiveStructure_Agent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Agent> getAgent();

	/**
	 * Returns the value of the '<em><b>Decision Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link maia.collectiveStructure.MCDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Criteria</em>' containment reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getCollectiveStructure_DecisionCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCDA> getDecisionCriteria();

	/**
	 * Returns the value of the '<em><b>Personal Value</b></em>' containment reference list.
	 * The list contents are of type {@link maia.collectiveStructure.PersonalValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Value</em>' containment reference list.
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getCollectiveStructure_PersonalValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalValue> getPersonalValue();

} // CollectiveStructure
