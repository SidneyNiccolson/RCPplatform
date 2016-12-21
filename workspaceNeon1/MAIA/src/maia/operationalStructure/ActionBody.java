/**
 */
package maia.operationalStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.ActionBody#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @see maia.operationalStructure.OperationalStructurePackage#getActionBody()
 * @model
 * @generated
 */
public interface ActionBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see maia.operationalStructure.OperationalStructurePackage#getActionBody_ActionName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link maia.operationalStructure.ActionBody#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

} // ActionBody
