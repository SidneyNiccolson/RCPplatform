/**
 */
package maia.operationalStructure.impl;

import java.util.Collection;

import maia.operationalStructure.ActionArena;
import maia.operationalStructure.ActionBody;
import maia.operationalStructure.ActionSituation;
import maia.operationalStructure.OperationalStructure;
import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Plan;
import maia.operationalStructure.RoleEnactment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.OperationalStructureImpl#getActionPlans <em>Action Plans</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.OperationalStructureImpl#getActionsituation <em>Actionsituation</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.OperationalStructureImpl#getActionArena <em>Action Arena</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.OperationalStructureImpl#getRoleEnactments <em>Role Enactments</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.OperationalStructureImpl#getActionBody <em>Action Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalStructureImpl extends MinimalEObjectImpl.Container implements OperationalStructure {
	/**
	 * The cached value of the '{@link #getActionPlans() <em>Action Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> actionPlans;

	/**
	 * The cached value of the '{@link #getActionsituation() <em>Actionsituation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsituation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionSituation> actionsituation;

	/**
	 * The cached value of the '{@link #getActionArena() <em>Action Arena</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionArena()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionArena> actionArena;

	/**
	 * The cached value of the '{@link #getRoleEnactments() <em>Role Enactments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleEnactments()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleEnactment> roleEnactments;

	/**
	 * The cached value of the '{@link #getActionBody() <em>Action Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBody()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBody> actionBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getActionPlans() {
		if (actionPlans == null) {
			actionPlans = new EObjectContainmentEList<Plan>(Plan.class, this, OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS);
		}
		return actionPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionSituation> getActionsituation() {
		if (actionsituation == null) {
			actionsituation = new EObjectContainmentEList<ActionSituation>(ActionSituation.class, this, OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION);
		}
		return actionsituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionArena> getActionArena() {
		if (actionArena == null) {
			actionArena = new EObjectContainmentEList<ActionArena>(ActionArena.class, this, OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA);
		}
		return actionArena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleEnactment> getRoleEnactments() {
		if (roleEnactments == null) {
			roleEnactments = new EObjectContainmentEList<RoleEnactment>(RoleEnactment.class, this, OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS);
		}
		return roleEnactments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBody> getActionBody() {
		if (actionBody == null) {
			actionBody = new EObjectContainmentEList<ActionBody>(ActionBody.class, this, OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY);
		}
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
				return ((InternalEList<?>)getActionPlans()).basicRemove(otherEnd, msgs);
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
				return ((InternalEList<?>)getActionsituation()).basicRemove(otherEnd, msgs);
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
				return ((InternalEList<?>)getActionArena()).basicRemove(otherEnd, msgs);
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
				return ((InternalEList<?>)getRoleEnactments()).basicRemove(otherEnd, msgs);
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				return ((InternalEList<?>)getActionBody()).basicRemove(otherEnd, msgs);
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
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
				return getActionPlans();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
				return getActionsituation();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
				return getActionArena();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
				return getRoleEnactments();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				return getActionBody();
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
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
				getActionPlans().clear();
				getActionPlans().addAll((Collection<? extends Plan>)newValue);
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
				getActionsituation().clear();
				getActionsituation().addAll((Collection<? extends ActionSituation>)newValue);
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
				getActionArena().clear();
				getActionArena().addAll((Collection<? extends ActionArena>)newValue);
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
				getRoleEnactments().clear();
				getRoleEnactments().addAll((Collection<? extends RoleEnactment>)newValue);
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				getActionBody().clear();
				getActionBody().addAll((Collection<? extends ActionBody>)newValue);
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
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
				getActionPlans().clear();
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
				getActionsituation().clear();
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
				getActionArena().clear();
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
				getRoleEnactments().clear();
				return;
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				getActionBody().clear();
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
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
				return actionPlans != null && !actionPlans.isEmpty();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
				return actionsituation != null && !actionsituation.isEmpty();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
				return actionArena != null && !actionArena.isEmpty();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
				return roleEnactments != null && !roleEnactments.isEmpty();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				return actionBody != null && !actionBody.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalStructureImpl
