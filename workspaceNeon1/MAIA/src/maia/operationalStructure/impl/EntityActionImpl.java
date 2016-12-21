/**
 */
package maia.operationalStructure.impl;

import java.util.Collection;

import maia.collectiveStructure.MCDA;

import maia.constitutionalStructure.InstitutionalStatement;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.ActionBody;
import maia.operationalStructure.EntityAction;
import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Performer;
import maia.operationalStructure.RoleEnactment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getActionBody <em>Action Body</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getPerfomer <em>Perfomer</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getRoleEnactment <em>Role Enactment</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getDecisionMaking <em>Decision Making</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.EntityActionImpl#getPostConditionNotDo <em>Post Condition Not Do</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityActionImpl extends PlanImpl implements EntityAction {
	/**
	 * The cached value of the '{@link #getActionBody() <em>Action Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionBody()
	 * @generated
	 * @ordered
	 */
	protected ActionBody actionBody;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> postCondition;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> preCondition;

	/**
	 * The cached value of the '{@link #getPerfomer() <em>Perfomer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfomer()
	 * @generated
	 * @ordered
	 */
	protected Performer perfomer;

	/**
	 * The cached value of the '{@link #getRoleEnactment() <em>Role Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleEnactment()
	 * @generated
	 * @ordered
	 */
	protected RoleEnactment roleEnactment;

	/**
	 * The cached value of the '{@link #getDecisionMaking() <em>Decision Making</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionMaking()
	 * @generated
	 * @ordered
	 */
	protected MCDA decisionMaking;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<InstitutionalStatement> institution;

	/**
	 * The cached value of the '{@link #getPostConditionNotDo() <em>Post Condition Not Do</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditionNotDo()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> postConditionNotDo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.ENTITY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBody getActionBody() {
		if (actionBody != null && actionBody.eIsProxy()) {
			InternalEObject oldActionBody = (InternalEObject)actionBody;
			actionBody = (ActionBody)eResolveProxy(oldActionBody);
			if (actionBody != oldActionBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY, oldActionBody, actionBody));
			}
		}
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBody basicGetActionBody() {
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionBody(ActionBody newActionBody) {
		ActionBody oldActionBody = actionBody;
		actionBody = newActionBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY, oldActionBody, actionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getPostCondition() {
		if (postCondition == null) {
			postCondition = new EObjectResolvingEList<Condition>(Condition.class, this, OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION);
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getPreCondition() {
		if (preCondition == null) {
			preCondition = new EObjectResolvingEList<Condition>(Condition.class, this, OperationalStructurePackage.ENTITY_ACTION__PRE_CONDITION);
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer getPerfomer() {
		if (perfomer != null && perfomer.eIsProxy()) {
			InternalEObject oldPerfomer = (InternalEObject)perfomer;
			perfomer = (Performer)eResolveProxy(oldPerfomer);
			if (perfomer != oldPerfomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ENTITY_ACTION__PERFOMER, oldPerfomer, perfomer));
			}
		}
		return perfomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer basicGetPerfomer() {
		return perfomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerfomer(Performer newPerfomer) {
		Performer oldPerfomer = perfomer;
		perfomer = newPerfomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ENTITY_ACTION__PERFOMER, oldPerfomer, perfomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEnactment getRoleEnactment() {
		if (roleEnactment != null && roleEnactment.eIsProxy()) {
			InternalEObject oldRoleEnactment = (InternalEObject)roleEnactment;
			roleEnactment = (RoleEnactment)eResolveProxy(oldRoleEnactment);
			if (roleEnactment != oldRoleEnactment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT, oldRoleEnactment, roleEnactment));
			}
		}
		return roleEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEnactment basicGetRoleEnactment() {
		return roleEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleEnactment(RoleEnactment newRoleEnactment) {
		RoleEnactment oldRoleEnactment = roleEnactment;
		roleEnactment = newRoleEnactment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT, oldRoleEnactment, roleEnactment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCDA getDecisionMaking() {
		if (decisionMaking != null && decisionMaking.eIsProxy()) {
			InternalEObject oldDecisionMaking = (InternalEObject)decisionMaking;
			decisionMaking = (MCDA)eResolveProxy(oldDecisionMaking);
			if (decisionMaking != oldDecisionMaking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING, oldDecisionMaking, decisionMaking));
			}
		}
		return decisionMaking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCDA basicGetDecisionMaking() {
		return decisionMaking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionMaking(MCDA newDecisionMaking) {
		MCDA oldDecisionMaking = decisionMaking;
		decisionMaking = newDecisionMaking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING, oldDecisionMaking, decisionMaking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstitutionalStatement> getInstitution() {
		if (institution == null) {
			institution = new EObjectResolvingEList<InstitutionalStatement>(InstitutionalStatement.class, this, OperationalStructurePackage.ENTITY_ACTION__INSTITUTION);
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getPostConditionNotDo() {
		if (postConditionNotDo == null) {
			postConditionNotDo = new EObjectResolvingEList<Condition>(Condition.class, this, OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION_NOT_DO);
		}
		return postConditionNotDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY:
				if (resolve) return getActionBody();
				return basicGetActionBody();
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION:
				return getPostCondition();
			case OperationalStructurePackage.ENTITY_ACTION__PRE_CONDITION:
				return getPreCondition();
			case OperationalStructurePackage.ENTITY_ACTION__PERFOMER:
				if (resolve) return getPerfomer();
				return basicGetPerfomer();
			case OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT:
				if (resolve) return getRoleEnactment();
				return basicGetRoleEnactment();
			case OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING:
				if (resolve) return getDecisionMaking();
				return basicGetDecisionMaking();
			case OperationalStructurePackage.ENTITY_ACTION__INSTITUTION:
				return getInstitution();
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION_NOT_DO:
				return getPostConditionNotDo();
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
			case OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY:
				setActionBody((ActionBody)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__PERFOMER:
				setPerfomer((Performer)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT:
				setRoleEnactment((RoleEnactment)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING:
				setDecisionMaking((MCDA)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionalStatement>)newValue);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION_NOT_DO:
				getPostConditionNotDo().clear();
				getPostConditionNotDo().addAll((Collection<? extends Condition>)newValue);
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
			case OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY:
				setActionBody((ActionBody)null);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case OperationalStructurePackage.ENTITY_ACTION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case OperationalStructurePackage.ENTITY_ACTION__PERFOMER:
				setPerfomer((Performer)null);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT:
				setRoleEnactment((RoleEnactment)null);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING:
				setDecisionMaking((MCDA)null);
				return;
			case OperationalStructurePackage.ENTITY_ACTION__INSTITUTION:
				getInstitution().clear();
				return;
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION_NOT_DO:
				getPostConditionNotDo().clear();
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
			case OperationalStructurePackage.ENTITY_ACTION__ACTION_BODY:
				return actionBody != null;
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION:
				return postCondition != null && !postCondition.isEmpty();
			case OperationalStructurePackage.ENTITY_ACTION__PRE_CONDITION:
				return preCondition != null && !preCondition.isEmpty();
			case OperationalStructurePackage.ENTITY_ACTION__PERFOMER:
				return perfomer != null;
			case OperationalStructurePackage.ENTITY_ACTION__ROLE_ENACTMENT:
				return roleEnactment != null;
			case OperationalStructurePackage.ENTITY_ACTION__DECISION_MAKING:
				return decisionMaking != null;
			case OperationalStructurePackage.ENTITY_ACTION__INSTITUTION:
				return institution != null && !institution.isEmpty();
			case OperationalStructurePackage.ENTITY_ACTION__POST_CONDITION_NOT_DO:
				return postConditionNotDo != null && !postConditionNotDo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityActionImpl
