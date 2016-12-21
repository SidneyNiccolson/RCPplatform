/**
 */
package maia.physicalStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.Composition#getCompositionName <em>Composition Name</em>}</li>
 *   <li>{@link maia.physicalStructure.Composition#getComposition <em>Composition</em>}</li>
 *   <li>{@link maia.physicalStructure.Composition#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link maia.physicalStructure.Composition#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see maia.physicalStructure.PhysicalStructurePackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject {
	/**
	 * Returns the value of the '<em><b>Composition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Name</em>' attribute.
	 * @see #setCompositionName(String)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getComposition_CompositionName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCompositionName();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Composition#getCompositionName <em>Composition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Name</em>' attribute.
	 * @see #getCompositionName()
	 * @generated
	 */
	void setCompositionName(String value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference.
	 * @see #setComposition(PhysicalComponent)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getComposition_Composition()
	 * @model required="true"
	 * @generated
	 */
	PhysicalComponent getComposition();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Composition#getComposition <em>Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(PhysicalComponent value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getComposition_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Composition#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(PhysicalComponent)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getComposition_Component()
	 * @model required="true"
	 * @generated
	 */
	PhysicalComponent getComponent();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.Composition#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(PhysicalComponent value);

} // Composition
