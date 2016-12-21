/**
 */
package maia.physicalStructure.impl;

import maia.physicalStructure.Composition;
import maia.physicalStructure.PhysicalComponent;
import maia.physicalStructure.PhysicalStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.impl.CompositionImpl#getCompositionName <em>Composition Name</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.CompositionImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.CompositionImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.CompositionImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends MinimalEObjectImpl.Container implements Composition {
	/**
	 * The default value of the '{@link #getCompositionName() <em>Composition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompositionName() <em>Composition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionName()
	 * @generated
	 * @ordered
	 */
	protected String compositionName = COMPOSITION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent composition;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalStructurePackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompositionName() {
		return compositionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionName(String newCompositionName) {
		String oldCompositionName = compositionName;
		compositionName = newCompositionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.COMPOSITION__COMPOSITION_NAME, oldCompositionName, compositionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getComposition() {
		if (composition != null && composition.eIsProxy()) {
			InternalEObject oldComposition = (InternalEObject)composition;
			composition = (PhysicalComponent)eResolveProxy(oldComposition);
			if (composition != oldComposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalStructurePackage.COMPOSITION__COMPOSITION, oldComposition, composition));
			}
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent basicGetComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(PhysicalComponent newComposition) {
		PhysicalComponent oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.COMPOSITION__COMPOSITION, oldComposition, composition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.COMPOSITION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (PhysicalComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalStructurePackage.COMPOSITION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(PhysicalComponent newComponent) {
		PhysicalComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.COMPOSITION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION_NAME:
				return getCompositionName();
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION:
				if (resolve) return getComposition();
				return basicGetComposition();
			case PhysicalStructurePackage.COMPOSITION__CARDINALITY:
				return getCardinality();
			case PhysicalStructurePackage.COMPOSITION__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION_NAME:
				setCompositionName((String)newValue);
				return;
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION:
				setComposition((PhysicalComponent)newValue);
				return;
			case PhysicalStructurePackage.COMPOSITION__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case PhysicalStructurePackage.COMPOSITION__COMPONENT:
				setComponent((PhysicalComponent)newValue);
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
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION_NAME:
				setCompositionName(COMPOSITION_NAME_EDEFAULT);
				return;
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION:
				setComposition((PhysicalComponent)null);
				return;
			case PhysicalStructurePackage.COMPOSITION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case PhysicalStructurePackage.COMPOSITION__COMPONENT:
				setComponent((PhysicalComponent)null);
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
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION_NAME:
				return COMPOSITION_NAME_EDEFAULT == null ? compositionName != null : !COMPOSITION_NAME_EDEFAULT.equals(compositionName);
			case PhysicalStructurePackage.COMPOSITION__COMPOSITION:
				return composition != null;
			case PhysicalStructurePackage.COMPOSITION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case PhysicalStructurePackage.COMPOSITION__COMPONENT:
				return component != null;
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
		result.append(" (compositionName: ");
		result.append(compositionName);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl
