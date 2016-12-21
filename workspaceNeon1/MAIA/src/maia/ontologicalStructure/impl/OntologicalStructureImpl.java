/**
 */
package maia.ontologicalStructure.impl;

import java.util.Collection;

import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.OntologicalConcept;
import maia.ontologicalStructure.OntologicalStructure;
import maia.ontologicalStructure.OntologicalStructurePackage;
import maia.ontologicalStructure.Property;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontological Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.impl.OntologicalStructureImpl#getOntologicalConcepts <em>Ontological Concepts</em>}</li>
 *   <li>{@link maia.ontologicalStructure.impl.OntologicalStructureImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link maia.ontologicalStructure.impl.OntologicalStructureImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologicalStructureImpl extends MinimalEObjectImpl.Container implements OntologicalStructure {
	/**
	 * The cached value of the '{@link #getOntologicalConcepts() <em>Ontological Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologicalConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<OntologicalConcept> ontologicalConcepts;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologicalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntologicalStructurePackage.Literals.ONTOLOGICAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntologicalConcept> getOntologicalConcepts() {
		if (ontologicalConcepts == null) {
			ontologicalConcepts = new EObjectContainmentEList<OntologicalConcept>(OntologicalConcept.class, this, OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS);
		}
		return ontologicalConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS:
				return ((InternalEList<?>)getOntologicalConcepts()).basicRemove(otherEnd, msgs);
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS:
				return getOntologicalConcepts();
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS:
				return getConditions();
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES:
				return getProperties();
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
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS:
				getOntologicalConcepts().clear();
				getOntologicalConcepts().addAll((Collection<? extends OntologicalConcept>)newValue);
				return;
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS:
				getOntologicalConcepts().clear();
				return;
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS:
				getConditions().clear();
				return;
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES:
				getProperties().clear();
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
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS:
				return ontologicalConcepts != null && !ontologicalConcepts.isEmpty();
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OntologicalStructureImpl
