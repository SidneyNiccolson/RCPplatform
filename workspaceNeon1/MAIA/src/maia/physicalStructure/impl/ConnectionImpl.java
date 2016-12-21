/**
 */
package maia.physicalStructure.impl;

import maia.physicalStructure.Connection;
import maia.physicalStructure.PhysicalComponent;
import maia.physicalStructure.PhysicalStructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.physicalStructure.impl.ConnectionImpl#getConnectionName <em>Connection Name</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.ConnectionImpl#getBeginNode <em>Begin Node</em>}</li>
 *   <li>{@link maia.physicalStructure.impl.ConnectionImpl#getEndNode <em>End Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getConnectionName() <em>Connection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionName() <em>Connection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionName()
	 * @generated
	 * @ordered
	 */
	protected String connectionName = CONNECTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeginNode() <em>Begin Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginNode()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent beginNode;

	/**
	 * The cached value of the '{@link #getEndNode() <em>End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNode()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent endNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhysicalStructurePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionName() {
		return connectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionName(String newConnectionName) {
		String oldConnectionName = connectionName;
		connectionName = newConnectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.CONNECTION__CONNECTION_NAME, oldConnectionName, connectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getBeginNode() {
		if (beginNode != null && beginNode.eIsProxy()) {
			InternalEObject oldBeginNode = (InternalEObject)beginNode;
			beginNode = (PhysicalComponent)eResolveProxy(oldBeginNode);
			if (beginNode != oldBeginNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalStructurePackage.CONNECTION__BEGIN_NODE, oldBeginNode, beginNode));
			}
		}
		return beginNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent basicGetBeginNode() {
		return beginNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginNode(PhysicalComponent newBeginNode) {
		PhysicalComponent oldBeginNode = beginNode;
		beginNode = newBeginNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.CONNECTION__BEGIN_NODE, oldBeginNode, beginNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getEndNode() {
		if (endNode != null && endNode.eIsProxy()) {
			InternalEObject oldEndNode = (InternalEObject)endNode;
			endNode = (PhysicalComponent)eResolveProxy(oldEndNode);
			if (endNode != oldEndNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhysicalStructurePackage.CONNECTION__END_NODE, oldEndNode, endNode));
			}
		}
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent basicGetEndNode() {
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndNode(PhysicalComponent newEndNode) {
		PhysicalComponent oldEndNode = endNode;
		endNode = newEndNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhysicalStructurePackage.CONNECTION__END_NODE, oldEndNode, endNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhysicalStructurePackage.CONNECTION__CONNECTION_NAME:
				return getConnectionName();
			case PhysicalStructurePackage.CONNECTION__BEGIN_NODE:
				if (resolve) return getBeginNode();
				return basicGetBeginNode();
			case PhysicalStructurePackage.CONNECTION__END_NODE:
				if (resolve) return getEndNode();
				return basicGetEndNode();
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
			case PhysicalStructurePackage.CONNECTION__CONNECTION_NAME:
				setConnectionName((String)newValue);
				return;
			case PhysicalStructurePackage.CONNECTION__BEGIN_NODE:
				setBeginNode((PhysicalComponent)newValue);
				return;
			case PhysicalStructurePackage.CONNECTION__END_NODE:
				setEndNode((PhysicalComponent)newValue);
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
			case PhysicalStructurePackage.CONNECTION__CONNECTION_NAME:
				setConnectionName(CONNECTION_NAME_EDEFAULT);
				return;
			case PhysicalStructurePackage.CONNECTION__BEGIN_NODE:
				setBeginNode((PhysicalComponent)null);
				return;
			case PhysicalStructurePackage.CONNECTION__END_NODE:
				setEndNode((PhysicalComponent)null);
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
			case PhysicalStructurePackage.CONNECTION__CONNECTION_NAME:
				return CONNECTION_NAME_EDEFAULT == null ? connectionName != null : !CONNECTION_NAME_EDEFAULT.equals(connectionName);
			case PhysicalStructurePackage.CONNECTION__BEGIN_NODE:
				return beginNode != null;
			case PhysicalStructurePackage.CONNECTION__END_NODE:
				return endNode != null;
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
		result.append(" (connectionName: ");
		result.append(connectionName);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
