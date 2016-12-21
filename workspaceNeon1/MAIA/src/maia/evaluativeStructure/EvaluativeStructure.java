/**
 */
package maia.evaluativeStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluative Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.evaluativeStructure.EvaluativeStructure#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link maia.evaluativeStructure.EvaluativeStructure#getDebugging <em>Debugging</em>}</li>
 *   <li>{@link maia.evaluativeStructure.EvaluativeStructure#getPropertyVariable <em>Property Variable</em>}</li>
 *   <li>{@link maia.evaluativeStructure.EvaluativeStructure#getOntologicalVariable <em>Ontological Variable</em>}</li>
 *   <li>{@link maia.evaluativeStructure.EvaluativeStructure#getPersonalValueVariable <em>Personal Value Variable</em>}</li>
 * </ul>
 *
 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure()
 * @model
 * @generated
 */
public interface EvaluativeStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(Evaluation)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure_Evaluation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.EvaluativeStructure#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

	/**
	 * Returns the value of the '<em><b>Debugging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debugging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debugging</em>' containment reference.
	 * @see #setDebugging(Debugging)
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure_Debugging()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Debugging getDebugging();

	/**
	 * Sets the value of the '{@link maia.evaluativeStructure.EvaluativeStructure#getDebugging <em>Debugging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debugging</em>' containment reference.
	 * @see #getDebugging()
	 * @generated
	 */
	void setDebugging(Debugging value);

	/**
	 * Returns the value of the '<em><b>Property Variable</b></em>' containment reference list.
	 * The list contents are of type {@link maia.evaluativeStructure.PropertyVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Variable</em>' containment reference list.
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure_PropertyVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyVariable> getPropertyVariable();

	/**
	 * Returns the value of the '<em><b>Ontological Variable</b></em>' containment reference list.
	 * The list contents are of type {@link maia.evaluativeStructure.OntologicalConceptVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontological Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontological Variable</em>' containment reference list.
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure_OntologicalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologicalConceptVariable> getOntologicalVariable();

	/**
	 * Returns the value of the '<em><b>Personal Value Variable</b></em>' containment reference list.
	 * The list contents are of type {@link maia.evaluativeStructure.PersonalValueVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Value Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Value Variable</em>' containment reference list.
	 * @see maia.evaluativeStructure.EvaluativeStructurePackage#getEvaluativeStructure_PersonalValueVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalValueVariable> getPersonalValueVariable();

} // EvaluativeStructure
