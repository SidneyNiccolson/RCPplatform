/**
 */
package maia.constitutionalStructure.impl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.Objective;

import maia.ontologicalStructure.Condition;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.ObjectiveImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.ObjectiveImpl#getMeetingCondition <em>Meeting Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends MinimalEObjectImpl.Container implements Objective {
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
	 * The cached value of the '{@link #getMeetingCondition() <em>Meeting Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition meetingCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.OBJECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.OBJECTIVE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getMeetingCondition() {
		if (meetingCondition != null && meetingCondition.eIsProxy()) {
			InternalEObject oldMeetingCondition = (InternalEObject)meetingCondition;
			meetingCondition = (Condition)eResolveProxy(oldMeetingCondition);
			if (meetingCondition != oldMeetingCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION, oldMeetingCondition, meetingCondition));
			}
		}
		return meetingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetMeetingCondition() {
		return meetingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetingCondition(Condition newMeetingCondition) {
		Condition oldMeetingCondition = meetingCondition;
		meetingCondition = newMeetingCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION, oldMeetingCondition, meetingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.OBJECTIVE__LABEL:
				return getLabel();
			case ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION:
				if (resolve) return getMeetingCondition();
				return basicGetMeetingCondition();
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
			case ConstitutionalStructurePackage.OBJECTIVE__LABEL:
				setLabel((String)newValue);
				return;
			case ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION:
				setMeetingCondition((Condition)newValue);
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
			case ConstitutionalStructurePackage.OBJECTIVE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION:
				setMeetingCondition((Condition)null);
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
			case ConstitutionalStructurePackage.OBJECTIVE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ConstitutionalStructurePackage.OBJECTIVE__MEETING_CONDITION:
				return meetingCondition != null;
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

} //ObjectiveImpl
