/**
 */
package maia.operationalStructure.impl;

import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Plan;
import maia.operationalStructure.PlanSequence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.PlanSequenceImpl#getPlan1 <em>Plan1</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.PlanSequenceImpl#getPlan2 <em>Plan2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanSequenceImpl extends PlanImpl implements PlanSequence {
	/**
	 * The cached value of the '{@link #getPlan1() <em>Plan1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan1()
	 * @generated
	 * @ordered
	 */
	protected Plan plan1;

	/**
	 * The cached value of the '{@link #getPlan2() <em>Plan2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan2()
	 * @generated
	 * @ordered
	 */
	protected Plan plan2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.PLAN_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan1() {
		if (plan1 != null && plan1.eIsProxy()) {
			InternalEObject oldPlan1 = (InternalEObject)plan1;
			plan1 = (Plan)eResolveProxy(oldPlan1);
			if (plan1 != oldPlan1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.PLAN_SEQUENCE__PLAN1, oldPlan1, plan1));
			}
		}
		return plan1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan basicGetPlan1() {
		return plan1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan1(Plan newPlan1) {
		Plan oldPlan1 = plan1;
		plan1 = newPlan1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.PLAN_SEQUENCE__PLAN1, oldPlan1, plan1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan2() {
		if (plan2 != null && plan2.eIsProxy()) {
			InternalEObject oldPlan2 = (InternalEObject)plan2;
			plan2 = (Plan)eResolveProxy(oldPlan2);
			if (plan2 != oldPlan2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.PLAN_SEQUENCE__PLAN2, oldPlan2, plan2));
			}
		}
		return plan2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan basicGetPlan2() {
		return plan2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan2(Plan newPlan2) {
		Plan oldPlan2 = plan2;
		plan2 = newPlan2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.PLAN_SEQUENCE__PLAN2, oldPlan2, plan2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN1:
				if (resolve) return getPlan1();
				return basicGetPlan1();
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN2:
				if (resolve) return getPlan2();
				return basicGetPlan2();
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
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN1:
				setPlan1((Plan)newValue);
				return;
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN2:
				setPlan2((Plan)newValue);
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
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN1:
				setPlan1((Plan)null);
				return;
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN2:
				setPlan2((Plan)null);
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
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN1:
				return plan1 != null;
			case OperationalStructurePackage.PLAN_SEQUENCE__PLAN2:
				return plan2 != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanSequenceImpl
