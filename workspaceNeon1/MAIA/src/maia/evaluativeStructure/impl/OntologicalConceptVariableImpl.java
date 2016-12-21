/**
 */
package maia.evaluativeStructure.impl;

import maia.evaluativeStructure.EvaluativeStructurePackage;
import maia.evaluativeStructure.OntologicalConceptVariable;

import maia.ontologicalStructure.OntologicalConcept;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontological Concept Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.impl.OntologicalConceptVariableImpl#getOntolgicalConcept <em>Ontolgical Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalConceptVariableImpl extends VariableImpl implements OntologicalConceptVariable {
	/**
	 * The cached value of the '{@link #getOntolgicalConcept() <em>Ontolgical Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntolgicalConcept()
	 * @generated
	 * @ordered
	 */
	protected OntologicalConcept ontolgicalConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalConceptVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaluativeStructurePackage.Literals.ONTOLOGICAL_CONCEPT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalConcept getOntolgicalConcept() {
		if (ontolgicalConcept != null && ontolgicalConcept.eIsProxy()) {
			InternalEObject oldOntolgicalConcept = (InternalEObject)ontolgicalConcept;
			ontolgicalConcept = (OntologicalConcept)eResolveProxy(oldOntolgicalConcept);
			if (ontolgicalConcept != oldOntolgicalConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT, oldOntolgicalConcept, ontolgicalConcept));
			}
		}
		return ontolgicalConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalConcept basicGetOntolgicalConcept() {
		return ontolgicalConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntolgicalConcept(OntologicalConcept newOntolgicalConcept) {
		OntologicalConcept oldOntolgicalConcept = ontolgicalConcept;
		ontolgicalConcept = newOntolgicalConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT, oldOntolgicalConcept, ontolgicalConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT:
				if (resolve) return getOntolgicalConcept();
				return basicGetOntolgicalConcept();
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
			case EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT:
				setOntolgicalConcept((OntologicalConcept)newValue);
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
			case EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT:
				setOntolgicalConcept((OntologicalConcept)null);
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
			case EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE__ONTOLGICAL_CONCEPT:
				return ontolgicalConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //OntologicalConceptVariableImpl
