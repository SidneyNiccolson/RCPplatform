/**
 */
package maia.physicalStructure.impl;

import java.util.Collection;

import maia.physicalStructure.Composition;
import maia.physicalStructure.Connection;
import maia.physicalStructure.PhysicalComponent;
import maia.physicalStructure.PhysicalStructure;
import maia.physicalStructure.PhysicalStructurePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.impl.PhysicalStructureImpl#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.PhysicalStructureImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.PhysicalStructureImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalStructureImpl extends MinimalEObjectImpl.Container implements PhysicalStructure {
	/**
	 * The cached value of the '{@link #getPhysicalComponent() <em>Physical Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> physicalComponent;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> composition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalStructurePackage.Literals.PHYSICAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getPhysicalComponent() {
		if (physicalComponent == null) {
			physicalComponent = new EObjectContainmentEList<PhysicalComponent>(PhysicalComponent.class, this, PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT);
		}
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<Composition>(Composition.class, this, PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT:
				return ((InternalEList<?>)getPhysicalComponent()).basicRemove(otherEnd, msgs);
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION:
				return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT:
				return getPhysicalComponent();
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION:
				return getConnection();
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION:
				return getComposition();
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
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				getPhysicalComponent().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends Composition>)newValue);
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
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				return;
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION:
				getConnection().clear();
				return;
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION:
				getComposition().clear();
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
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__PHYSICAL_COMPONENT:
				return physicalComponent != null && !physicalComponent.isEmpty();
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case PhysicalStructurePackage.PHYSICAL_STRUCTURE__COMPOSITION:
				return composition != null && !composition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalStructureImpl
