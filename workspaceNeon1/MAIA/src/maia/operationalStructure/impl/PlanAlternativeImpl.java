/**
 */
package maia.operationalStructure.impl;

import java.util.Collection;

import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Plan;
import maia.operationalStructure.PlanAlternative;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.PlanAlternativeImpl#getPlan1 <em>Plan1</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.PlanAlternativeImpl#getPlan2 <em>Plan2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanAlternativeImpl extends PlanImpl implements PlanAlternative {
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
	 * The cached value of the '{@link #getPlan2() <em>Plan2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan2()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> plan2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.PLAN_ALTERNATIVE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1, oldPlan1, plan1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1, oldPlan1, plan1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getPlan2() {
		if (plan2 == null) {
			plan2 = new EObjectResolvingEList<Plan>(Plan.class, this, OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN2);
		}
		return plan2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1:
				if (resolve) return getPlan1();
				return basicGetPlan1();
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN2:
				return getPlan2();
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
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1:
				setPlan1((Plan)newValue);
				return;
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN2:
				getPlan2().clear();
				getPlan2().addAll((Collection<? extends Plan>)newValue);
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
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1:
				setPlan1((Plan)null);
				return;
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN2:
				getPlan2().clear();
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
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN1:
				return plan1 != null;
			case OperationalStructurePackage.PLAN_ALTERNATIVE__PLAN2:
				return plan2 != null && !plan2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanAlternativeImpl
