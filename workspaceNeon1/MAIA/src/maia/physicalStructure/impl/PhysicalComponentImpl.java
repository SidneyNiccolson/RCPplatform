/**
 */
package maia.physicalStructure.impl;

import java.util.Collection;

import maia.ontologicalStructure.Property;

import maia.operationalStructure.ActionBody;

import maia.operationalStructure.impl.PerformerImpl;

import maia.physicalStructure.PhysicalComponent;
import maia.physicalStructure.PhysicalStructurePackage;
import maia.physicalStructure.ResourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.impl.PhysicalComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.PhysicalComponentImpl#getAffordance <em>Affordance</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.PhysicalComponentImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.PhysicalComponentImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalComponentImpl extends PerformerImpl implements PhysicalComponent {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceType TYPE_EDEFAULT = ResourceType.OPEN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ResourceType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffordance() <em>Affordance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffordance()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBody> affordance;

	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBody> behaviour;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalStructurePackage.Literals.PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ResourceType newType) {
		ResourceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.PHYSICAL_COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBody> getAffordance() {
		if (affordance == null) {
			affordance = new EObjectResolvingEList<ActionBody>(ActionBody.class, this, PhysicalStructurePackage.PHYSICAL_COMPONENT__AFFORDANCE);
		}
		return affordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBody> getBehaviour() {
		if (behaviour == null) {
			behaviour = new EObjectResolvingEList<ActionBody>(ActionBody.class, this, PhysicalStructurePackage.PHYSICAL_COMPONENT__BEHAVIOUR);
		}
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, PhysicalStructurePackage.PHYSICAL_COMPONENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__TYPE:
				return getType();
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__AFFORDANCE:
				return getAffordance();
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__BEHAVIOUR:
				return getBehaviour();
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__PROPERTY:
				return getProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__TYPE:
				setType((ResourceType)newValue);
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__AFFORDANCE:
				getAffordance().clear();
				getAffordance().addAll((Collection<? extends ActionBody>)newValue);
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__BEHAVIOUR:
				getBehaviour().clear();
				getBehaviour().addAll((Collection<? extends ActionBody>)newValue);
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__AFFORDANCE:
				getAffordance().clear();
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__BEHAVIOUR:
				getBehaviour().clear();
				return;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__PROPERTY:
				getProperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__TYPE:
				return type != TYPE_EDEFAULT;
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__AFFORDANCE:
				return affordance != null && !affordance.isEmpty();
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__BEHAVIOUR:
				return behaviour != null && !behaviour.isEmpty();
			case PhysicalStructurePackage.PHYSICAL_COMPONENT__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PhysicalComponentImpl
