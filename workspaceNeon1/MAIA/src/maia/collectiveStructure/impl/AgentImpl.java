/**
 */
package maia.collectiveStructure.impl;

import java.util.Collection;

import maia.collectiveStructure.Agent;
import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.MCDA;
import maia.collectiveStructure.PersonalValue;

import maia.constitutionalStructure.Role;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.Property;

import maia.operationalStructure.ActionBody;

import maia.operationalStructure.impl.PerformerImpl;

import maia.physicalStructure.PhysicalComponent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getPersonalValue <em>Personal Value</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getPossibleRole <em>Possible Role</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getIntrinsicBehaviour <em>Intrinsic Behaviour</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.AgentImpl#getDecision <em>Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends PerformerImpl implements Agent{
	/**
	 * The cached value of the '{@link #getPersonalValue() <em>Personal Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalValue()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalValue> personalValue;

	/**
	 * The cached value of the '{@link #getPhysicalComponent() <em>Physical Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> physicalComponent;

	/**
	 * The cached value of the '{@link #getPossibleRole() <em>Possible Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> possibleRole;

	/**
	 * The cached value of the '{@link #getIntrinsicBehaviour() <em>Intrinsic Behaviour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrinsicBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBody> intrinsicBehaviour;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> information;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<MCDA> decision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectiveStructurePackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalValue> getPersonalValue() {
		if (personalValue == null) {
			personalValue = new EObjectResolvingEList<PersonalValue>(PersonalValue.class, this, CollectiveStructurePackage.AGENT__PERSONAL_VALUE);
		}
		return personalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getPhysicalComponent() {
		if (physicalComponent == null) {
			physicalComponent = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, CollectiveStructurePackage.AGENT__PHYSICAL_COMPONENT);
		}
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPossibleRole() {
		if (possibleRole == null) {
			possibleRole = new EObjectResolvingEList<Role>(Role.class, this, CollectiveStructurePackage.AGENT__POSSIBLE_ROLE);
		}
		return possibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBody> getIntrinsicBehaviour() {
		if (intrinsicBehaviour == null) {
			intrinsicBehaviour = new EObjectResolvingEList<ActionBody>(ActionBody.class, this, CollectiveStructurePackage.AGENT__INTRINSIC_BEHAVIOUR);
		}
		return intrinsicBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, CollectiveStructurePackage.AGENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getInformation() {
		if (information == null) {
			information = new EObjectResolvingEList<Condition>(Condition.class, this, CollectiveStructurePackage.AGENT__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MCDA> getDecision() {
		if (decision == null) {
			decision = new EObjectResolvingEList<MCDA>(MCDA.class, this, CollectiveStructurePackage.AGENT__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectiveStructurePackage.AGENT__PERSONAL_VALUE:
				return getPersonalValue();
			case CollectiveStructurePackage.AGENT__PHYSICAL_COMPONENT:
				return getPhysicalComponent();
			case CollectiveStructurePackage.AGENT__POSSIBLE_ROLE:
				return getPossibleRole();
			case CollectiveStructurePackage.AGENT__INTRINSIC_BEHAVIOUR:
				return getIntrinsicBehaviour();
			case CollectiveStructurePackage.AGENT__PROPERTY:
				return getProperty();
			case CollectiveStructurePackage.AGENT__INFORMATION:
				return getInformation();
			case CollectiveStructurePackage.AGENT__DECISION:
				return getDecision();
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
			case CollectiveStructurePackage.AGENT__PERSONAL_VALUE:
				getPersonalValue().clear();
				getPersonalValue().addAll((Collection<? extends PersonalValue>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				getPhysicalComponent().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__POSSIBLE_ROLE:
				getPossibleRole().clear();
				getPossibleRole().addAll((Collection<? extends Role>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__INTRINSIC_BEHAVIOUR:
				getIntrinsicBehaviour().clear();
				getIntrinsicBehaviour().addAll((Collection<? extends ActionBody>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends Condition>)newValue);
				return;
			case CollectiveStructurePackage.AGENT__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends MCDA>)newValue);
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
			case CollectiveStructurePackage.AGENT__PERSONAL_VALUE:
				getPersonalValue().clear();
				return;
			case CollectiveStructurePackage.AGENT__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				return;
			case CollectiveStructurePackage.AGENT__POSSIBLE_ROLE:
				getPossibleRole().clear();
				return;
			case CollectiveStructurePackage.AGENT__INTRINSIC_BEHAVIOUR:
				getIntrinsicBehaviour().clear();
				return;
			case CollectiveStructurePackage.AGENT__PROPERTY:
				getProperty().clear();
				return;
			case CollectiveStructurePackage.AGENT__INFORMATION:
				getInformation().clear();
				return;
			case CollectiveStructurePackage.AGENT__DECISION:
				getDecision().clear();
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
			case CollectiveStructurePackage.AGENT__PERSONAL_VALUE:
				return personalValue != null && !personalValue.isEmpty();
			case CollectiveStructurePackage.AGENT__PHYSICAL_COMPONENT:
				return physicalComponent != null && !physicalComponent.isEmpty();
			case CollectiveStructurePackage.AGENT__POSSIBLE_ROLE:
				return possibleRole != null && !possibleRole.isEmpty();
			case CollectiveStructurePackage.AGENT__INTRINSIC_BEHAVIOUR:
				return intrinsicBehaviour != null && !intrinsicBehaviour.isEmpty();
			case CollectiveStructurePackage.AGENT__PROPERTY:
				return property != null && !property.isEmpty();
			case CollectiveStructurePackage.AGENT__INFORMATION:
				return information != null && !information.isEmpty();
			case CollectiveStructurePackage.AGENT__DECISION:
				return decision != null && !decision.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
