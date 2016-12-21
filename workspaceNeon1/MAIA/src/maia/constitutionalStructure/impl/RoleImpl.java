/**
 */
package maia.constitutionalStructure.impl;

import java.util.Collection;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.InstitutionalStatement;
import maia.constitutionalStructure.Objective;
import maia.constitutionalStructure.Role;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.ActionBody;

import maia.operationalStructure.impl.PerformerImpl;

import maia.physicalStructure.PhysicalComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getInstitutionalCapability <em>Institutional Capability</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getEntryCondition <em>Entry Condition</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getPhysicalComponent <em>Physical Component</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.RoleImpl#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends PerformerImpl implements Role {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective objective;

	/**
	 * The cached value of the '{@link #getInstitutionalCapability() <em>Institutional Capability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionalCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBody> institutionalCapability;

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
	 * The cached value of the '{@link #getEntryCondition() <em>Entry Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition entryCondition;

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
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> information;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getObjective() {
		if (objective != null && objective.eIsProxy()) {
			InternalEObject oldObjective = (InternalEObject)objective;
			objective = (Objective)eResolveProxy(oldObjective);
			if (objective != oldObjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.ROLE__OBJECTIVE, oldObjective, objective));
			}
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(Objective newObjective) {
		Objective oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.ROLE__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBody> getInstitutionalCapability() {
		if (institutionalCapability == null) {
			institutionalCapability = new EObjectResolvingEList<ActionBody>(ActionBody.class, this, ConstitutionalStructurePackage.ROLE__INSTITUTIONAL_CAPABILITY);
		}
		return institutionalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstitutionalStatement> getInstitution() {
		if (institution == null) {
			institution = new EObjectResolvingEList<InstitutionalStatement>(InstitutionalStatement.class, this, ConstitutionalStructurePackage.ROLE__INSTITUTION);
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getEntryCondition() {
		if (entryCondition != null && entryCondition.eIsProxy()) {
			InternalEObject oldEntryCondition = (InternalEObject)entryCondition;
			entryCondition = (Condition)eResolveProxy(oldEntryCondition);
			if (entryCondition != oldEntryCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION, oldEntryCondition, entryCondition));
			}
		}
		return entryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetEntryCondition() {
		return entryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryCondition(Condition newEntryCondition) {
		Condition oldEntryCondition = entryCondition;
		entryCondition = newEntryCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION, oldEntryCondition, entryCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getPhysicalComponent() {
		if (physicalComponent == null) {
			physicalComponent = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, ConstitutionalStructurePackage.ROLE__PHYSICAL_COMPONENT);
		}
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getInformation() {
		if (information == null) {
			information = new EObjectResolvingEList<Condition>(Condition.class, this, ConstitutionalStructurePackage.ROLE__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.ROLE__OBJECTIVE:
				if (resolve) return getObjective();
				return basicGetObjective();
			case ConstitutionalStructurePackage.ROLE__INSTITUTIONAL_CAPABILITY:
				return getInstitutionalCapability();
			case ConstitutionalStructurePackage.ROLE__INSTITUTION:
				return getInstitution();
			case ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION:
				if (resolve) return getEntryCondition();
				return basicGetEntryCondition();
			case ConstitutionalStructurePackage.ROLE__PHYSICAL_COMPONENT:
				return getPhysicalComponent();
			case ConstitutionalStructurePackage.ROLE__INFORMATION:
				return getInformation();
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
			case ConstitutionalStructurePackage.ROLE__OBJECTIVE:
				setObjective((Objective)newValue);
				return;
			case ConstitutionalStructurePackage.ROLE__INSTITUTIONAL_CAPABILITY:
				getInstitutionalCapability().clear();
				getInstitutionalCapability().addAll((Collection<? extends ActionBody>)newValue);
				return;
			case ConstitutionalStructurePackage.ROLE__INSTITUTION:
				getInstitution().clear();
				getInstitution().addAll((Collection<? extends InstitutionalStatement>)newValue);
				return;
			case ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION:
				setEntryCondition((Condition)newValue);
				return;
			case ConstitutionalStructurePackage.ROLE__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				getPhysicalComponent().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case ConstitutionalStructurePackage.ROLE__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends Condition>)newValue);
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
			case ConstitutionalStructurePackage.ROLE__OBJECTIVE:
				setObjective((Objective)null);
				return;
			case ConstitutionalStructurePackage.ROLE__INSTITUTIONAL_CAPABILITY:
				getInstitutionalCapability().clear();
				return;
			case ConstitutionalStructurePackage.ROLE__INSTITUTION:
				getInstitution().clear();
				return;
			case ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION:
				setEntryCondition((Condition)null);
				return;
			case ConstitutionalStructurePackage.ROLE__PHYSICAL_COMPONENT:
				getPhysicalComponent().clear();
				return;
			case ConstitutionalStructurePackage.ROLE__INFORMATION:
				getInformation().clear();
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
			case ConstitutionalStructurePackage.ROLE__OBJECTIVE:
				return objective != null;
			case ConstitutionalStructurePackage.ROLE__INSTITUTIONAL_CAPABILITY:
				return institutionalCapability != null && !institutionalCapability.isEmpty();
			case ConstitutionalStructurePackage.ROLE__INSTITUTION:
				return institution != null && !institution.isEmpty();
			case ConstitutionalStructurePackage.ROLE__ENTRY_CONDITION:
				return entryCondition != null;
			case ConstitutionalStructurePackage.ROLE__PHYSICAL_COMPONENT:
				return physicalComponent != null && !physicalComponent.isEmpty();
			case ConstitutionalStructurePackage.ROLE__INFORMATION:
				return information != null && !information.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
