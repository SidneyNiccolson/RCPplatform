/**
 */
package maia.evaluativeStructure.impl;

import java.util.Collection;

import maia.evaluativeStructure.Debugging;
import maia.evaluativeStructure.Evaluation;
import maia.evaluativeStructure.EvaluativeStructure;
import maia.evaluativeStructure.EvaluativeStructurePackage;
import maia.evaluativeStructure.OntologicalConceptVariable;
import maia.evaluativeStructure.PersonalValueVariable;
import maia.evaluativeStructure.PropertyVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluative Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl#getDebugging <em>Debugging</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl#getPropertyVariable <em>Property Variable</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl#getOntologicalVariable <em>Ontological Variable</em>}</li>
 *   <li>{@link maia.evaluativeStructure.impl.EvaluativeStructureImpl#getPersonalValueVariable <em>Personal Value Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluativeStructureImpl extends MinimalEObjectImpl.Container implements EvaluativeStructure {
	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation;

	/**
	 * The cached value of the '{@link #getDebugging() <em>Debugging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugging()
	 * @generated
	 * @ordered
	 */
	protected Debugging debugging;

	/**
	 * The cached value of the '{@link #getPropertyVariable() <em>Property Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyVariable> propertyVariable;

	/**
	 * The cached value of the '{@link #getOntologicalVariable() <em>Ontological Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologicalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalConceptVariable> ontologicalVariable;

	/**
	 * The cached value of the '{@link #getPersonalValueVariable() <em>Personal Value Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalValueVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonalValueVariable> personalValueVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluativeStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluativeStructurePackage.Literals.EVALUATIVE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION, oldEvaluation, newEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		if (newEvaluation != evaluation) {
			NotificationChain msgs = null;
			if (evaluation != null)
				msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION, null, msgs);
			if (newEvaluation != null)
				msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION, null, msgs);
			msgs = basicSetEvaluation(newEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION, newEvaluation, newEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debugging getDebugging() {
		return debugging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebugging(Debugging newDebugging, NotificationChain msgs) {
		Debugging oldDebugging = debugging;
		debugging = newDebugging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING, oldDebugging, newDebugging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugging(Debugging newDebugging) {
		if (newDebugging != debugging) {
			NotificationChain msgs = null;
			if (debugging != null)
				msgs = ((InternalEObject)debugging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING, null, msgs);
			if (newDebugging != null)
				msgs = ((InternalEObject)newDebugging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING, null, msgs);
			msgs = basicSetDebugging(newDebugging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING, newDebugging, newDebugging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyVariable> getPropertyVariable() {
		if (propertyVariable == null) {
			propertyVariable = new EObjectContainmentEList<PropertyVariable>(PropertyVariable.class, this, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE);
		}
		return propertyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologicalConceptVariable> getOntologicalVariable() {
		if (ontologicalVariable == null) {
			ontologicalVariable = new EObjectContainmentEList<OntologicalConceptVariable>(OntologicalConceptVariable.class, this, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE);
		}
		return ontologicalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonalValueVariable> getPersonalValueVariable() {
		if (personalValueVariable == null) {
			personalValueVariable = new EObjectContainmentEList<PersonalValueVariable>(PersonalValueVariable.class, this, EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE);
		}
		return personalValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION:
				return basicSetEvaluation(null, msgs);
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING:
				return basicSetDebugging(null, msgs);
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE:
				return ((InternalEList<?>)getPropertyVariable()).basicRemove(otherEnd, msgs);
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE:
				return ((InternalEList<?>)getOntologicalVariable()).basicRemove(otherEnd, msgs);
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE:
				return ((InternalEList<?>)getPersonalValueVariable()).basicRemove(otherEnd, msgs);
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
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION:
				return getEvaluation();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING:
				return getDebugging();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE:
				return getPropertyVariable();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE:
				return getOntologicalVariable();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE:
				return getPersonalValueVariable();
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
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION:
				setEvaluation((Evaluation)newValue);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING:
				setDebugging((Debugging)newValue);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE:
				getPropertyVariable().clear();
				getPropertyVariable().addAll((Collection<? extends PropertyVariable>)newValue);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE:
				getOntologicalVariable().clear();
				getOntologicalVariable().addAll((Collection<? extends OntologicalConceptVariable>)newValue);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE:
				getPersonalValueVariable().clear();
				getPersonalValueVariable().addAll((Collection<? extends PersonalValueVariable>)newValue);
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
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION:
				setEvaluation((Evaluation)null);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING:
				setDebugging((Debugging)null);
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE:
				getPropertyVariable().clear();
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE:
				getOntologicalVariable().clear();
				return;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE:
				getPersonalValueVariable().clear();
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
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__EVALUATION:
				return evaluation != null;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__DEBUGGING:
				return debugging != null;
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PROPERTY_VARIABLE:
				return propertyVariable != null && !propertyVariable.isEmpty();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__ONTOLOGICAL_VARIABLE:
				return ontologicalVariable != null && !ontologicalVariable.isEmpty();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE__PERSONAL_VALUE_VARIABLE:
				return personalValueVariable != null && !personalValueVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluativeStructureImpl
