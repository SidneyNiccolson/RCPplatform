/**
 */
package maia.constitutionalStructure.impl;

import java.util.Collection;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Rule;
import maia.constitutionalStructure.Sanction;
import maia.constitutionalStructure.deonLogicType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.RuleImpl#getDeonticType <em>Deontic Type</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RuleImpl#getOrElse <em>Or Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends InstitutionalStatementImpl implements Rule {
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
	 * The cached value of the '{@link #getOrElse() <em>Or Else</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Sanction> orElse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.RULE__DEONTIC_TYPE, oldDeonticType, deonticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sanction> getOrElse() {
		if (orElse == null) {
			orElse = new EObjectResolvingEList<Sanction>(Sanction.class, this, ConstitutionalStructurePackage.RULE__OR_ELSE);
		}
		return orElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.RULE__DEONTIC_TYPE:
				return getDeonticType();
			case ConstitutionalStructurePackage.RULE__OR_ELSE:
				return getOrElse();
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
			case ConstitutionalStructurePackage.RULE__DEONTIC_TYPE:
				setDeonticType((deonLogicType)newValue);
				return;
			case ConstitutionalStructurePackage.RULE__OR_ELSE:
				getOrElse().clear();
				getOrElse().addAll((Collection<? extends Sanction>)newValue);
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
			case ConstitutionalStructurePackage.RULE__DEONTIC_TYPE:
				setDeonticType(DEONTIC_TYPE_EDEFAULT);
				return;
			case ConstitutionalStructurePackage.RULE__OR_ELSE:
				getOrElse().clear();
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
			case ConstitutionalStructurePackage.RULE__DEONTIC_TYPE:
				return deonticType != DEONTIC_TYPE_EDEFAULT;
			case ConstitutionalStructurePackage.RULE__OR_ELSE:
				return orElse != null && !orElse.isEmpty();
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

} //RuleImpl
