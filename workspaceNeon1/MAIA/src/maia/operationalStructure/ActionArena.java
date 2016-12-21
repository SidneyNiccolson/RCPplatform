/**
 */
package maia.operationalStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Arena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.ActionArena#getActionSituation <em>Action Situation</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getActionArena()
 * @model
 * @generated
 */
public interface ActionArena extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Situation</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Situation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Situation</em>' reference list.
	 * @see maia.operationalStructure.OperationalStructurePackage#getActionArena_ActionSituation()
	 * @model required="true"
	 * @generated
	 */
	EList<ActionSituation> getActionSituation();

} // ActionArena
