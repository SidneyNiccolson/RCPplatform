/**
 */
package maia.physicalStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.Connection#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link maia.physicalStructure.Connection#getBeginNode <em>Begin Node</em>}</li>
 *   <li>{@link maia.physicalStructure.Connection#getEndNode <em>End Node</em>}</li>
 * </ul>
 *
 * @see maia.physicalStructure.PhysicalStructurePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Name</em>' attribute.
	 * @see #setConnectionName(String)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getConnection_ConnectionName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getConnectionName();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Connection#getConnectionName <em>Connection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Name</em>' attribute.
	 * @see #getConnectionName()
	 * @generated
	 */
	void setConnectionName(String value);

	/**
	 * Returns the value of the '<em><b>Begin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Node</em>' reference.
	 * @see #setBeginNode(PhysicalComponent)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getConnection_BeginNode()
	 * @model required="true"
	 * @generated
	 */
	PhysicalComponent getBeginNode();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Connection#getBeginNode <em>Begin Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Node</em>' reference.
	 * @see #getBeginNode()
	 * @generated
	 */
	void setBeginNode(PhysicalComponent value);

	/**
	 * Returns the value of the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Node</em>' reference.
	 * @see #setEndNode(PhysicalComponent)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getConnection_EndNode()
	 * @model required="true"
	 * @generated
	 */
	PhysicalComponent getEndNode();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Connection#getEndNode <em>End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Node</em>' reference.
	 * @see #getEndNode()
	 * @generated
	 */
	void setEndNode(PhysicalComponent value);

} // Connection
