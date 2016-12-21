/**
 */
package maia.collectiveStructure.impl;

import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.SanctionAspect;

import maia.constitutionalStructure.Sanction;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sanction Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.impl.SanctionAspectImpl#getSanction <em>Sanction</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.SanctionAspectImpl#getFineValue <em>Fine Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SanctionAspectImpl extends DecisionCriterionImpl implements SanctionAspect {
	/**
	 * The cached value of the '{@link #getSanction() <em>Sanction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSanction()
	 * @generated
	 * @ordered
	 */
	protected Sanction sanction;

	/**
	 * The default value of the '{@link #getFineValue() <em>Fine Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FINE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFineValue() <em>Fine Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineValue()
	 * @generated
	 * @ordered
	 */
	protected double fineValue = FINE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SanctionAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectiveStructurePackage.Literals.SANCTION_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sanction getSanction() {
		if (sanction != null && sanction.eIsProxy()) {
			InternalEObject oldSanction = (InternalEObject)sanction;
			sanction = (Sanction)eResolveProxy(oldSanction);
			if (sanction != oldSanction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectiveStructurePackage.SANCTION_ASPECT__SANCTION, oldSanction, sanction));
			}
		}
		return sanction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sanction basicGetSanction() {
		return sanction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSanction(Sanction newSanction) {
		Sanction oldSanction = sanction;
		sanction = newSanction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.SANCTION_ASPECT__SANCTION, oldSanction, sanction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFineValue() {
		return fineValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFineValue(double newFineValue) {
		double oldFineValue = fineValue;
		fineValue = newFineValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.SANCTION_ASPECT__FINE_VALUE, oldFineValue, fineValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectiveStructurePackage.SANCTION_ASPECT__SANCTION:
				if (resolve) return getSanction();
				return basicGetSanction();
			case CollectiveStructurePackage.SANCTION_ASPECT__FINE_VALUE:
				return getFineValue();
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
			case CollectiveStructurePackage.SANCTION_ASPECT__SANCTION:
				setSanction((Sanction)newValue);
				return;
			case CollectiveStructurePackage.SANCTION_ASPECT__FINE_VALUE:
				setFineValue((Double)newValue);
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
			case CollectiveStructurePackage.SANCTION_ASPECT__SANCTION:
				setSanction((Sanction)null);
				return;
			case CollectiveStructurePackage.SANCTION_ASPECT__FINE_VALUE:
				setFineValue(FINE_VALUE_EDEFAULT);
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
			case CollectiveStructurePackage.SANCTION_ASPECT__SANCTION:
				return sanction != null;
			case CollectiveStructurePackage.SANCTION_ASPECT__FINE_VALUE:
				return fineValue != FINE_VALUE_EDEFAULT;
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
		result.append(" (fineValue: ");
		result.append(fineValue);
		result.append(')');
		return result.toString();
	}

} //SanctionAspectImpl
