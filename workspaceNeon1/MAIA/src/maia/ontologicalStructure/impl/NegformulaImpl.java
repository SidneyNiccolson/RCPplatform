/**
 */
package maia.ontologicalStructure.impl;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.Negformula;
import maia.ontologicalStructure.OntologicalStructurePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negformula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.impl.NegformulaImpl#getConditionStatement <em>Condition Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegformulaImpl extends LogicalConditionImpl implements Negformula {
	/**
	 * The cached value of the '{@link #getConditionStatement() <em>Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected Condition conditionStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegformulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalStructurePackage.Literals.NEGFORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getConditionStatement() {
		if (conditionStatement != null && conditionStatement.eIsProxy()) {
			InternalEObject oldConditionStatement = (InternalEObject)conditionStatement;
			conditionStatement = (Condition)eResolveProxy(oldConditionStatement);
			if (conditionStatement != oldConditionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT, oldConditionStatement, conditionStatement));
			}
		}
		return conditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetConditionStatement() {
		return conditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionStatement(Condition newConditionStatement) {
		Condition oldConditionStatement = conditionStatement;
		conditionStatement = newConditionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT, oldConditionStatement, conditionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT:
				if (resolve) return getConditionStatement();
				return basicGetConditionStatement();
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
			case OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT:
				setConditionStatement((Condition)newValue);
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
			case OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT:
				setConditionStatement((Condition)null);
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
			case OntologicalStructurePackage.NEGFORMULA__CONDITION_STATEMENT:
				return conditionStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //NegformulaImpl
