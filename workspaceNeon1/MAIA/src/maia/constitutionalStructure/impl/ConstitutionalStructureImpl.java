/**
 */
package maia.constitutionalStructure.impl;

import java.util.Collection;

import maia.constitutionalStructure.ConstitutionalStructure;
import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Dependency;
import maia.constitutionalStructure.InstitutionalStatement;
import maia.constitutionalStructure.Objective;
import maia.constitutionalStructure.Role;
import maia.constitutionalStructure.Sanction;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constitutional Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl#getInstitutions <em>Institutions</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl#getSanctions <em>Sanctions</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstitutionalStructureImpl extends MinimalEObjectImpl.Container implements ConstitutionalStructure {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getInstitutions() <em>Institutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<InstitutionalStatement> institutions;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The cached value of the '{@link #getSanctions() <em>Sanctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSanctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Sanction> sanctions;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstitutionalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.CONSTITUTIONAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstitutionalStatement> getInstitutions() {
		if (institutions == null) {
			institutions = new EObjectContainmentEList<InstitutionalStatement>(InstitutionalStatement.class, this, ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS);
		}
		return institutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sanction> getSanctions() {
		if (sanctions == null) {
			sanctions = new EObjectContainmentEList<Sanction>(Sanction.class, this, ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS);
		}
		return sanctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<Objective>(Objective.class, this, ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS:
				return ((InternalEList<?>)getInstitutions()).basicRemove(otherEnd, msgs);
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS:
				return ((InternalEList<?>)getSanctions()).basicRemove(otherEnd, msgs);
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
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
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES:
				return getRoles();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS:
				return getInstitutions();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES:
				return getDependencies();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS:
				return getSanctions();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES:
				return getObjectives();
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
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS:
				getInstitutions().clear();
				getInstitutions().addAll((Collection<? extends InstitutionalStatement>)newValue);
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS:
				getSanctions().clear();
				getSanctions().addAll((Collection<? extends Sanction>)newValue);
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
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
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES:
				getRoles().clear();
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS:
				getInstitutions().clear();
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS:
				getSanctions().clear();
				return;
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES:
				getObjectives().clear();
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
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__ROLES:
				return roles != null && !roles.isEmpty();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__INSTITUTIONS:
				return institutions != null && !institutions.isEmpty();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__SANCTIONS:
				return sanctions != null && !sanctions.isEmpty();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstitutionalStructureImpl
