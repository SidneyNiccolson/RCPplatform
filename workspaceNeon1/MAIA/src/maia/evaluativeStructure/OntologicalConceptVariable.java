/**
 */
package maia.evaluativeStructure;

import maia.ontologicalStructure.OntologicalConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontological Concept Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.OntologicalConceptVariable#getOntolgicalConcept <em>Ontolgical Concept</em>}</li>
 * </ul>
 *
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getOntologicalConceptVariable()
 * @model
 * @generated
 */
public interface OntologicalConceptVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Ontolgical Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontolgical Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontolgical Concept</em>' reference.
	 * @see #setOntolgicalConcept(OntologicalConcept)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getOntologicalConceptVariable_OntolgicalConcept()
	 * @model
	 * @generated
	 */
	OntologicalConcept getOntolgicalConcept();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.OntologicalConceptVariable#getOntolgicalConcept <em>Ontolgical Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontolgical Concept</em>' reference.
	 * @see #getOntolgicalConcept()
	 * @generated
	 */
	void setOntolgicalConcept(OntologicalConcept value);

} // OntologicalConceptVariable
