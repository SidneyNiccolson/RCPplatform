/**
 */
package maia.ontologicalStructure.impl;

import maia.ontologicalStructure.ANDformula;
import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.OntologicalStructurePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AN Dformula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.impl.ANDformulaImpl#getLeftConditionStatement <em>Left Condition Statement</em>}</li>
 *   <li>{@link maia.ontologicalStructure.impl.ANDformulaImpl#getRightConditionStatement <em>Right Condition Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANDformulaImpl extends LogicalConditionImpl implements ANDformula {
	/**
	 * The cached value of the '{@link #getLeftConditionStatement() <em>Left Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected Condition leftConditionStatement;

	/**
	 * The cached value of the '{@link #getRightConditionStatement() <em>Right Condition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected Condition rightConditionStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDformulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalStructurePackage.Literals.AN_DFORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getLeftConditionStatement() {
		if (leftConditionStatement != null && leftConditionStatement.eIsProxy()) {
			InternalEObject oldLeftConditionStatement = (InternalEObject)leftConditionStatement;
			leftConditionStatement = (Condition)eResolveProxy(oldLeftConditionStatement);
			if (leftConditionStatement != oldLeftConditionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT, oldLeftConditionStatement, leftConditionStatement));
			}
		}
		return leftConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetLeftConditionStatement() {
		return leftConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftConditionStatement(Condition newLeftConditionStatement) {
		Condition oldLeftConditionStatement = leftConditionStatement;
		leftConditionStatement = newLeftConditionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT, oldLeftConditionStatement, leftConditionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getRightConditionStatement() {
		if (rightConditionStatement != null && rightConditionStatement.eIsProxy()) {
			InternalEObject oldRightConditionStatement = (InternalEObject)rightConditionStatement;
			rightConditionStatement = (Condition)eResolveProxy(oldRightConditionStatement);
			if (rightConditionStatement != oldRightConditionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT, oldRightConditionStatement, rightConditionStatement));
			}
		}
		return rightConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetRightConditionStatement() {
		return rightConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightConditionStatement(Condition newRightConditionStatement) {
		Condition oldRightConditionStatement = rightConditionStatement;
		rightConditionStatement = newRightConditionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT, oldRightConditionStatement, rightConditionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT:
				if (resolve) return getLeftConditionStatement();
				return basicGetLeftConditionStatement();
			case OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT:
				if (resolve) return getRightConditionStatement();
				return basicGetRightConditionStatement();
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
			case OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT:
				setLeftConditionStatement((Condition)newValue);
				return;
			case OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT:
				setRightConditionStatement((Condition)newValue);
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
			case OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT:
				setLeftConditionStatement((Condition)null);
				return;
			case OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT:
				setRightConditionStatement((Condition)null);
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
			case OntologicalStructurePackage.AN_DFORMULA__LEFT_CONDITION_STATEMENT:
				return leftConditionStatement != null;
			case OntologicalStructurePackage.AN_DFORMULA__RIGHT_CONDITION_STATEMENT:
				return rightConditionStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //ANDformulaImpl
