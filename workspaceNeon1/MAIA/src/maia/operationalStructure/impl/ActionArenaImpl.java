/**
 */
package maia.operationalStructure.impl;

import java.util.Collection;

import maia.operationalStructure.ActionArena;
import maia.operationalStructure.ActionSituation;
import maia.operationalStructure.OperationalStructurePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Arena</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.operationalStructure.impl.ActionArenaImpl#getActionSituation <em>Action Situation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionArenaImpl extends MinimalEObjectImpl.Container implements ActionArena {
	/**
	 * The cached value of the '{@link #getActionSituation() <em>Action Situation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSituation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionSituation> actionSituation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionArenaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalStructurePackage.Literals.ACTION_ARENA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionSituation> getActionSituation() {
		if (actionSituation == null) {
			actionSituation = new EObjectResolvingEList<ActionSituation>(ActionSituation.class, this, OperationalStructurePackage.ACTION_ARENA__ACTION_SITUATION);
		}
		return actionSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationalStructurePackage.ACTION_ARENA__ACTION_SITUATION:
				return getActionSituation();
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
			case OperationalStructurePackage.ACTION_ARENA__ACTION_SITUATION:
				getActionSituation().clear();
				getActionSituation().addAll((Collection<? extends ActionSituation>)newValue);
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
			case OperationalStructurePackage.ACTION_ARENA__ACTION_SITUATION:
				getActionSituation().clear();
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
			case OperationalStructurePackage.ACTION_ARENA__ACTION_SITUATION:
				return actionSituation != null && !actionSituation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionArenaImpl
