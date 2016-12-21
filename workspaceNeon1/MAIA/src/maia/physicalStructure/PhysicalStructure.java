/**
 */
package maia.physicalStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.PhysicalStructure#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.physicalStructure.PhysicalStructure#getConnection <em>Connection</em>}</li>
 *   <li>{@link maia.physicalStructure.PhysicalStructure#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalStructure()
 * @model
 * @generated
 */
public interface PhysicalStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Component</b></em>' containment reference list.
	 * The list contents are of type {@link maia.physicalStructure.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Component</em>' containment reference list.
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalStructure_PhysicalComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponent> getPhysicalComponent();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link maia.physicalStructure.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalStructure_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link maia.physicalStructure.Composition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalStructure_Composition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composition> getComposition();

} // PhysicalStructure
