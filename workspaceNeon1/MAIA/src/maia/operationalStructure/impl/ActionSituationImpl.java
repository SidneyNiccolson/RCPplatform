/**
 */
package maia.operationalStructure.impl;

import java.util.Collection;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.ActionSituation;
import maia.operationalStructure.OperationalStructurePackage;
import maia.operationalStructure.Plan;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.ActionSituationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.ActionSituationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.ActionSituationImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link maia.operationalStructure.impl.ActionSituationImpl#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionSituationImpl extends MinimalEObjectImpl.Container implements ActionSituation {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> actions;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition postCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSituationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.ACTION_SITUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ACTION_SITUATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Plan>(Plan.class, this, OperationalStructurePackage.ACTION_SITUATION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (Condition)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Condition newPreCondition) {
		Condition oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPostCondition() {
		if (postCondition != null && postCondition.eIsProxy()) {
			InternalEObject oldPostCondition = (InternalEObject)postCondition;
			postCondition = (Condition)eResolveProxy(oldPostCondition);
			if (postCondition != oldPostCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION, oldPostCondition, postCondition));
			}
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Condition newPostCondition) {
		Condition oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationalStructurePackage.ACTION_SITUATION__LABEL:
				return getLabel();
			case OperationalStructurePackage.ACTION_SITUATION__ACTIONS:
				return getActions();
			case OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
			case OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION:
				if (resolve) return getPostCondition();
				return basicGetPostCondition();
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
			case OperationalStructurePackage.ACTION_SITUATION__LABEL:
				setLabel((String)newValue);
				return;
			case OperationalStructurePackage.ACTION_SITUATION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Plan>)newValue);
				return;
			case OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION:
				setPreCondition((Condition)newValue);
				return;
			case OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION:
				setPostCondition((Condition)newValue);
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
			case OperationalStructurePackage.ACTION_SITUATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case OperationalStructurePackage.ACTION_SITUATION__ACTIONS:
				getActions().clear();
				return;
			case OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION:
				setPreCondition((Condition)null);
				return;
			case OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION:
				setPostCondition((Condition)null);
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
			case OperationalStructurePackage.ACTION_SITUATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case OperationalStructurePackage.ACTION_SITUATION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OperationalStructurePackage.ACTION_SITUATION__PRE_CONDITION:
				return preCondition != null;
			case OperationalStructurePackage.ACTION_SITUATION__POST_CONDITION:
				return postCondition != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActionSituationImpl
