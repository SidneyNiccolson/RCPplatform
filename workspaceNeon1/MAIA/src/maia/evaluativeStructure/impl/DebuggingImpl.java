/**
 */
package maia.evaluativeStructure.impl;

import java.util.Collection;

import maia.evaluativeStructure.Debugging;
import maia.evaluativeStructure.EvaluativeStructurePackage;
import maia.evaluativeStructure.Variable;
import maia.evaluativeStructure.relationType;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.NaturalLangCondition;

import maia.operationalStructure.EntityAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debugging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getDependentVariableDebug <em>Dependent Variable Debug</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getType <em>Type</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getUpdateValue <em>Update Value</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.DebuggingImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DebuggingImpl extends MinimalEObjectImpl.Container implements Debugging {
	/**
	 * The cached value of the '{@link #getDependentVariableDebug() <em>Dependent Variable Debug</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentVariableDebug()
	 * @generated
	 * @ordered
	 */
	protected Variable dependentVariableDebug;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected EntityAction relatedAction;

	/**
	 * The cached value of the '{@link #getIndependentVariables() <em>Independent Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> independentVariables;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final relationType TYPE_EDEFAULT = relationType.DIRECT_RELATIONSHIP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected relationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateValue() <em>Update Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateValue()
	 * @generated
	 * @ordered
	 */
	protected Condition updateValue;

	/**
	 * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected NaturalLangCondition calculation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebuggingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluativeStructurePackage.Literals.DEBUGGING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getDependentVariableDebug() {
		if (dependentVariableDebug != null && dependentVariableDebug.eIsProxy()) {
			InternalEObject oldDependentVariableDebug = (InternalEObject)dependentVariableDebug;
			dependentVariableDebug = (Variable)eResolveProxy(oldDependentVariableDebug);
			if (dependentVariableDebug != oldDependentVariableDebug) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG, oldDependentVariableDebug, dependentVariableDebug));
			}
		}
		return dependentVariableDebug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetDependentVariableDebug() {
		return dependentVariableDebug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentVariableDebug(Variable newDependentVariableDebug) {
		Variable oldDependentVariableDebug = dependentVariableDebug;
		dependentVariableDebug = newDependentVariableDebug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG, oldDependentVariableDebug, dependentVariableDebug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAction getRelatedAction() {
		if (relatedAction != null && relatedAction.eIsProxy()) {
			InternalEObject oldRelatedAction = (InternalEObject)relatedAction;
			relatedAction = (EntityAction)eResolveProxy(oldRelatedAction);
			if (relatedAction != oldRelatedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION, oldRelatedAction, relatedAction));
			}
		}
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAction basicGetRelatedAction() {
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAction(EntityAction newRelatedAction) {
		EntityAction oldRelatedAction = relatedAction;
		relatedAction = newRelatedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION, oldRelatedAction, relatedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getIndependentVariables() {
		if (independentVariables == null) {
			independentVariables = new EObjectResolvingEList<Variable>(Variable.class, this, EvaluativeStructurePackage.DEBUGGING__INDEPENDENT_VARIABLES);
		}
		return independentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public relationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(relationType newType) {
		relationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.DEBUGGING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getUpdateValue() {
		if (updateValue != null && updateValue.eIsProxy()) {
			InternalEObject oldUpdateValue = (InternalEObject)updateValue;
			updateValue = (Condition)eResolveProxy(oldUpdateValue);
			if (updateValue != oldUpdateValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE, oldUpdateValue, updateValue));
			}
		}
		return updateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetUpdateValue() {
		return updateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateValue(Condition newUpdateValue) {
		Condition oldUpdateValue = updateValue;
		updateValue = newUpdateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE, oldUpdateValue, updateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLangCondition getCalculation() {
		if (calculation != null && calculation.eIsProxy()) {
			InternalEObject oldCalculation = (InternalEObject)calculation;
			calculation = (NaturalLangCondition)eResolveProxy(oldCalculation);
			if (calculation != oldCalculation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluativeStructurePackage.DEBUGGING__CALCULATION, oldCalculation, calculation));
			}
		}
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLangCondition basicGetCalculation() {
		return calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculation(NaturalLangCondition newCalculation) {
		NaturalLangCondition oldCalculation = calculation;
		calculation = newCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.DEBUGGING__CALCULATION, oldCalculation, calculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG:
				if (resolve) return getDependentVariableDebug();
				return basicGetDependentVariableDebug();
			case EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION:
				if (resolve) return getRelatedAction();
				return basicGetRelatedAction();
			case EvaluativeStructurePackage.DEBUGGING__INDEPENDENT_VARIABLES:
				return getIndependentVariables();
			case EvaluativeStructurePackage.DEBUGGING__TYPE:
				return getType();
			case EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE:
				if (resolve) return getUpdateValue();
				return basicGetUpdateValue();
			case EvaluativeStructurePackage.DEBUGGING__CALCULATION:
				if (resolve) return getCalculation();
				return basicGetCalculation();
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
			case EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG:
				setDependentVariableDebug((Variable)newValue);
				return;
			case EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION:
				setRelatedAction((EntityAction)newValue);
				return;
			case EvaluativeStructurePackage.DEBUGGING__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				getIndependentVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case EvaluativeStructurePackage.DEBUGGING__TYPE:
				setType((relationType)newValue);
				return;
			case EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE:
				setUpdateValue((Condition)newValue);
				return;
			case EvaluativeStructurePackage.DEBUGGING__CALCULATION:
				setCalculation((NaturalLangCondition)newValue);
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
			case EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG:
				setDependentVariableDebug((Variable)null);
				return;
			case EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION:
				setRelatedAction((EntityAction)null);
				return;
			case EvaluativeStructurePackage.DEBUGGING__INDEPENDENT_VARIABLES:
				getIndependentVariables().clear();
				return;
			case EvaluativeStructurePackage.DEBUGGING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE:
				setUpdateValue((Condition)null);
				return;
			case EvaluativeStructurePackage.DEBUGGING__CALCULATION:
				setCalculation((NaturalLangCondition)null);
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
			case EvaluativeStructurePackage.DEBUGGING__DEPENDENT_VARIABLE_DEBUG:
				return dependentVariableDebug != null;
			case EvaluativeStructurePackage.DEBUGGING__RELATED_ACTION:
				return relatedAction != null;
			case EvaluativeStructurePackage.DEBUGGING__INDEPENDENT_VARIABLES:
				return independentVariables != null && !independentVariables.isEmpty();
			case EvaluativeStructurePackage.DEBUGGING__TYPE:
				return type != TYPE_EDEFAULT;
			case EvaluativeStructurePackage.DEBUGGING__UPDATE_VALUE:
				return updateValue != null;
			case EvaluativeStructurePackage.DEBUGGING__CALCULATION:
				return calculation != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DebuggingImpl
