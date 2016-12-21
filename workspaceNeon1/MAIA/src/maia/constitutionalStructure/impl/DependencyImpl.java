/**
 */
package maia.constitutionalStructure.impl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Dependency;
import maia.constitutionalStructure.Objective;
import maia.constitutionalStructure.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.DependencyImpl#getDependant <em>Dependant</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.DependencyImpl#getDependee <em>Dependee</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.DependencyImpl#getDependantObjective <em>Dependant Objective</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.DependencyImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The cached value of the '{@link #getDependant() <em>Dependant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependant()
	 * @generated
	 * @ordered
	 */
	protected Role dependant;

	/**
	 * The cached value of the '{@link #getDependee() <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependee()
	 * @generated
	 * @ordered
	 */
	protected Role dependee;

	/**
	 * The cached value of the '{@link #getDependantObjective() <em>Dependant Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective dependantObjective;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDependant() {
		if (dependant != null && dependant.eIsProxy()) {
			InternalEObject oldDependant = (InternalEObject)dependant;
			dependant = (Role)eResolveProxy(oldDependant);
			if (dependant != oldDependant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT, oldDependant, dependant));
			}
		}
		return dependant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDependant() {
		return dependant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependant(Role newDependant) {
		Role oldDependant = dependant;
		dependant = newDependant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT, oldDependant, dependant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDependee() {
		if (dependee != null && dependee.eIsProxy()) {
			InternalEObject oldDependee = (InternalEObject)dependee;
			dependee = (Role)eResolveProxy(oldDependee);
			if (dependee != oldDependee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE, oldDependee, dependee));
			}
		}
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDependee() {
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependee(Role newDependee) {
		Role oldDependee = dependee;
		dependee = newDependee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE, oldDependee, dependee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getDependantObjective() {
		if (dependantObjective != null && dependantObjective.eIsProxy()) {
			InternalEObject oldDependantObjective = (InternalEObject)dependantObjective;
			dependantObjective = (Objective)eResolveProxy(oldDependantObjective);
			if (dependantObjective != oldDependantObjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE, oldDependantObjective, dependantObjective));
			}
		}
		return dependantObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetDependantObjective() {
		return dependantObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependantObjective(Objective newDependantObjective) {
		Objective oldDependantObjective = dependantObjective;
		dependantObjective = newDependantObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE, oldDependantObjective, dependantObjective));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.DEPENDENCY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT:
				if (resolve) return getDependant();
				return basicGetDependant();
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE:
				if (resolve) return getDependee();
				return basicGetDependee();
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE:
				if (resolve) return getDependantObjective();
				return basicGetDependantObjective();
			case ConstitutionalStructurePackage.DEPENDENCY__LABEL:
				return getLabel();
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
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT:
				setDependant((Role)newValue);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE:
				setDependee((Role)newValue);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE:
				setDependantObjective((Objective)newValue);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__LABEL:
				setLabel((String)newValue);
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
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT:
				setDependant((Role)null);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE:
				setDependee((Role)null);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE:
				setDependantObjective((Objective)null);
				return;
			case ConstitutionalStructurePackage.DEPENDENCY__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT:
				return dependant != null;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDEE:
				return dependee != null;
			case ConstitutionalStructurePackage.DEPENDENCY__DEPENDANT_OBJECTIVE:
				return dependantObjective != null;
			case ConstitutionalStructurePackage.DEPENDENCY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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

} //DependencyImpl
