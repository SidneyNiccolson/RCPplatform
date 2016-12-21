/**
 */
package maia.physicalStructure;

import maia.ontologicalStructure.Property;

import maia.operationalStructure.ActionBody;
import maia.operationalStructure.Performer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.PhysicalComponent#getType <em>Type</em>}</li>
 *   <li>{@link maia.physicalStructure.PhysicalComponent#getAffordance <em>Affordance</em>}</li>
 *   <li>{@link maia.physicalStructure.PhysicalComponent#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link maia.physicalStructure.PhysicalComponent#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalComponent()
 * @model
 * @generated
 */
public interface PhysicalComponent extends Performer {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maia.physicalStructure.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see maia.physicalStructure.ResourceType
	 * @see #setType(ResourceType)
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalComponent_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getType();

	/**
	 * Sets the value of the '{@link maia.physicalStructure.PhysicalComponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see maia.physicalStructure.ResourceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Affordance</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affordance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affordance</em>' reference list.
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalComponent_Affordance()
	 * @model
	 * @generated
	 */
	EList<ActionBody> getAffordance();

	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' reference list.
	 * The list contents are of type {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' reference list.
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalComponent_Behaviour()
	 * @model
	 * @generated
	 */
	EList<ActionBody> getBehaviour();

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
	 * @see maia.physicalStructure.PhysicalStructurePackage#getPhysicalComponent_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

} // PhysicalComponent
