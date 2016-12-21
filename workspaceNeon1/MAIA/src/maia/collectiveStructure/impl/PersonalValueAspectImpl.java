/**
 */
package maia.collectiveStructure.impl;

import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.PersonalValue;
import maia.collectiveStructure.PersonalValueAspect;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Value Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.impl.PersonalValueAspectImpl#getPersonalValue <em>Personal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalValueAspectImpl extends DecisionCriterionImpl implements PersonalValueAspect {
	/**
	 * The cached value of the '{@link #getPersonalValue() <em>Personal Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalValue()
	 * @generated
	 * @ordered
	 */
	protected PersonalValue personalValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalValueAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectiveStructurePackage.Literals.PERSONAL_VALUE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalValue getPersonalValue() {
		if (personalValue != null && personalValue.eIsProxy()) {
			InternalEObject oldPersonalValue = (InternalEObject)personalValue;
			personalValue = (PersonalValue)eResolveProxy(oldPersonalValue);
			if (personalValue != oldPersonalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE, oldPersonalValue, personalValue));
			}
		}
		return personalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalValue basicGetPersonalValue() {
		return personalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalValue(PersonalValue newPersonalValue) {
		PersonalValue oldPersonalValue = personalValue;
		personalValue = newPersonalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE, oldPersonalValue, personalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE:
				if (resolve) return getPersonalValue();
				return basicGetPersonalValue();
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
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE:
				setPersonalValue((PersonalValue)newValue);
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
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE:
				setPersonalValue((PersonalValue)null);
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
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT__PERSONAL_VALUE:
				return personalValue != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonalValueAspectImpl
