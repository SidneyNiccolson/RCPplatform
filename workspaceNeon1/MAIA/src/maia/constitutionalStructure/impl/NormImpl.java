/**
 */
package maia.constitutionalStructure.impl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Norm;
import maia.constitutionalStructure.deonLogicType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Norm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.NormImpl#getDeonticType <em>Deontic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormImpl extends InstitutionalStatementImpl implements Norm {
	/**
	 * The default value of the '{@link #getDeonticType() <em>Deontic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeonticType()
	 * @generated
	 * @ordered
	 */
	protected static final deonLogicType DEONTIC_TYPE_EDEFAULT = deonLogicType.OBLIGES;

	/**
	 * The cached value of the '{@link #getDeonticType() <em>Deontic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeonticType()
	 * @generated
	 * @ordered
	 */
	protected deonLogicType deonticType = DEONTIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.NORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deonLogicType getDeonticType() {
		return deonticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeonticType(deonLogicType newDeonticType) {
		deonLogicType oldDeonticType = deonticType;
		deonticType = newDeonticType == null ? DEONTIC_TYPE_EDEFAULT : newDeonticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.NORM__DEONTIC_TYPE, oldDeonticType, deonticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.NORM__DEONTIC_TYPE:
				return getDeonticType();
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
			case ConstitutionalStructurePackage.NORM__DEONTIC_TYPE:
				setDeonticType((deonLogicType)newValue);
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
			case ConstitutionalStructurePackage.NORM__DEONTIC_TYPE:
				setDeonticType(DEONTIC_TYPE_EDEFAULT);
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
			case ConstitutionalStructurePackage.NORM__DEONTIC_TYPE:
				return deonticType != DEONTIC_TYPE_EDEFAULT;
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
		result.append(" (deonticType: ");
		result.append(deonticType);
		result.append(')');
		return result.toString();
	}

} //NormImpl
