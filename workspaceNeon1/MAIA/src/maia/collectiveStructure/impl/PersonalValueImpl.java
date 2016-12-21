/**
 */
package maia.collectiveStructure.impl;

import maia.collectiveStructure.CollectiveStructurePackage;
import maia.collectiveStructure.DecisionInfluence;
import maia.collectiveStructure.PersonalValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.impl.PersonalValueImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.PersonalValueImpl#getDecisionInfluence <em>Decision Influence</em>}</li>
 *   <li>{@link maia.collectiveStructure.impl.PersonalValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalValueImpl extends MinimalEObjectImpl.Container implements PersonalValue {
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
	 * The cached value of the '{@link #getDecisionInfluence() <em>Decision Influence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInfluence()
	 * @generated
	 * @ordered
	 */
	protected DecisionInfluence decisionInfluence;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectiveStructurePackage.Literals.PERSONAL_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.PERSONAL_VALUE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionInfluence getDecisionInfluence() {
		return decisionInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionInfluence(DecisionInfluence newDecisionInfluence, NotificationChain msgs) {
		DecisionInfluence oldDecisionInfluence = decisionInfluence;
		decisionInfluence = newDecisionInfluence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE, oldDecisionInfluence, newDecisionInfluence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInfluence(DecisionInfluence newDecisionInfluence) {
		if (newDecisionInfluence != decisionInfluence) {
			NotificationChain msgs = null;
			if (decisionInfluence != null)
				msgs = ((InternalEObject)decisionInfluence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE, null, msgs);
			if (newDecisionInfluence != null)
				msgs = ((InternalEObject)newDecisionInfluence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE, null, msgs);
			msgs = basicSetDecisionInfluence(newDecisionInfluence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE, newDecisionInfluence, newDecisionInfluence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectiveStructurePackage.PERSONAL_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE:
				return basicSetDecisionInfluence(null, msgs);
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
			case CollectiveStructurePackage.PERSONAL_VALUE__LABEL:
				return getLabel();
			case CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE:
				return getDecisionInfluence();
			case CollectiveStructurePackage.PERSONAL_VALUE__VALUE:
				return getValue();
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
			case CollectiveStructurePackage.PERSONAL_VALUE__LABEL:
				setLabel((String)newValue);
				return;
			case CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE:
				setDecisionInfluence((DecisionInfluence)newValue);
				return;
			case CollectiveStructurePackage.PERSONAL_VALUE__VALUE:
				setValue((Double)newValue);
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
			case CollectiveStructurePackage.PERSONAL_VALUE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE:
				setDecisionInfluence((DecisionInfluence)null);
				return;
			case CollectiveStructurePackage.PERSONAL_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case CollectiveStructurePackage.PERSONAL_VALUE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CollectiveStructurePackage.PERSONAL_VALUE__DECISION_INFLUENCE:
				return decisionInfluence != null;
			case CollectiveStructurePackage.PERSONAL_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //PersonalValueImpl
