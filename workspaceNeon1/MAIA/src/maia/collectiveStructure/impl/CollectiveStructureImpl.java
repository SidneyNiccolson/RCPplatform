/**
 */
package maia.collectiveStructure.impl;

import java.util.Collection;

import maia.collectiveStructure.Agent;
import maia.collectiveStructure.CollectiveStructure;
import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.MCDA;
import maia.collectiveStructure.PersonalValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.impl.CollectiveStructureImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.CollectiveStructureImpl#getDecisionCriteria <em>Decision Criteria</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.CollectiveStructureImpl#getPersonalValue <em>Personal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectiveStructureImpl extends MinimalEObjectImpl.Container implements CollectiveStructure {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

	/**
	 * The cached value of the '{@link #getDecisionCriteria() <em>Decision Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<MCDA> decisionCriteria;

	/**
	 * The cached value of the '{@link #getPersonalValue() <em>Personal Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalValue> personalValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectiveStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectiveStructurePackage.Literals.COLLECTIVE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<Agent>(Agent.class, this, CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MCDA> getDecisionCriteria() {
		if (decisionCriteria == null) {
			decisionCriteria = new EObjectContainmentEList<MCDA>(MCDA.class, this, CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA);
		}
		return decisionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalValue> getPersonalValue() {
		if (personalValue == null) {
			personalValue = new EObjectContainmentEList<PersonalValue>(PersonalValue.class, this, CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE);
		}
		return personalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA:
				return ((InternalEList<?>)getDecisionCriteria()).basicRemove(otherEnd, msgs);
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE:
				return ((InternalEList<?>)getPersonalValue()).basicRemove(otherEnd, msgs);
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
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT:
				return getAgent();
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA:
				return getDecisionCriteria();
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE:
				return getPersonalValue();
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
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends Agent>)newValue);
				return;
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA:
				getDecisionCriteria().clear();
				getDecisionCriteria().addAll((Collection<? extends MCDA>)newValue);
				return;
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE:
				getPersonalValue().clear();
				getPersonalValue().addAll((Collection<? extends PersonalValue>)newValue);
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
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT:
				getAgent().clear();
				return;
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA:
				getDecisionCriteria().clear();
				return;
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE:
				getPersonalValue().clear();
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
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__AGENT:
				return agent != null && !agent.isEmpty();
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__DECISION_CRITERIA:
				return decisionCriteria != null && !decisionCriteria.isEmpty();
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE__PERSONAL_VALUE:
				return personalValue != null && !personalValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectiveStructureImpl
