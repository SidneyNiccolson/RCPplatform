/**
 */
package maia.ontologicalStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontological Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.ontologicalStructure.OntologicalStructure#getOntologicalConcepts <em>Ontological Concepts</em>}</li>
 *   <li>{@link maia.ontologicalStructure.OntologicalStructure#getConditions <em>Conditions</em>}</li>
 *   <li>{@link maia.ontologicalStructure.OntologicalStructure#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see maia.ontologicalStructure.OntologicalStructurePackage#getOntologicalStructure()
 * @model
 * @generated
 */
public interface OntologicalStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontological Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.OntologicalConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontological Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontological Concepts</em>' containment reference list.
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getOntologicalStructure_OntologicalConcepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalConcept> getOntologicalConcepts();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getOntologicalStructure_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link maia.ontologicalStructure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#getOntologicalStructure_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // OntologicalStructure
