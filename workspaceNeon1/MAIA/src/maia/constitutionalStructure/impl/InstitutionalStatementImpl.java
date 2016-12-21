/**
 */
package maia.constitutionalStructure.impl;

import java.util.Collection;

import maia.constitutionalStructure.ConstitutionalStructurePackage;
import maia.constitutionalStructure.InstitutionalStatement;
import maia.constitutionalStructure.Role;

import maia.ontologicalStructure.Condition;

import maia.operationalStructure.Plan;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Institutional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl#getAIm <em>AIm</em>}</li>
 *   <li>{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstitutionalStatementImpl extends MinimalEObjectImpl.Container implements InstitutionalStatement {
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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> attribute;

	/**
	 * The cached value of the '{@link #getAIm() <em>AIm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIm()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> aIm;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstitutionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstitutionalStructurePackage.Literals.INSTITUTIONAL_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Role>(Role.class, this, ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getAIm() {
		if (aIm == null) {
			aIm = new EObjectResolvingEList<Plan>(Plan.class, this, ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__AIM);
		}
		return aIm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__LABEL:
				return getLabel();
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__ATTRIBUTE:
				return getAttribute();
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__AIM:
				return getAIm();
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Role>)newValue);
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__AIM:
				getAIm().clear();
				getAIm().addAll((Collection<? extends Plan>)newValue);
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION:
				setCondition((Condition)newValue);
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
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__AIM:
				getAIm().clear();
				return;
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION:
				setCondition((Condition)null);
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
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__AIM:
				return aIm != null && !aIm.isEmpty();
			case ConstitutionalStructurePackage.INSTITUTIONAL_STATEMENT__CONDITION:
				return condition != null;
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

} //InstitutionalStatementImpl
