/**
 */
package maia;

import maia.collectiveStructure.CollectiveStructure;

import maia.constitutionalStructure.ConstitutionalStructure;

import maia.evaluativeStructure.EvaluativeStructure;

import maia.ontologicalStructure.OntologicalStructure;

import maia.operationalStructure.OperationalStructure;

import maia.physicalStructure.PhysicalStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAIA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.MAIA#getConstitutionalStructure <em>Constitutional Structure</em>}</li>
 *   <li>{@link maia.MAIA#getCollectiveStructure <em>Collective Structure</em>}</li>
 *   <li>{@link maia.MAIA#getPhysicalStructure <em>Physical Structure</em>}</li>
 *   <li>{@link maia.MAIA#getOperationalStructure <em>Operational Structure</em>}</li>
 *   <li>{@link maia.MAIA#getEvaluativeStructure <em>Evaluative Structure</em>}</li>
 *   <li>{@link maia.MAIA#getOntologicalStructure <em>Ontological Structure</em>}</li>
 * </ul>
 *
 * @see maia.MaiaPackage#getMAIA()
 * @model
 * @generated
 */
public interface MAIA extends EObject {
	/**
	 * Returns the value of the '<em><b>Constitutional Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constitutional Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constitutional Structure</em>' containment reference.
	 * @see #setConstitutionalStructure(ConstitutionalStructure)
	 * @see maia.MaiaPackage#getMAIA_ConstitutionalStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstitutionalStructure getConstitutionalStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getConstitutionalStructure <em>Constitutional Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constitutional Structure</em>' containment reference.
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	void setConstitutionalStructure(ConstitutionalStructure value);

	/**
	 * Returns the value of the '<em><b>Collective Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collective Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collective Structure</em>' containment reference.
	 * @see #setCollectiveStructure(CollectiveStructure)
	 * @see maia.MaiaPackage#getMAIA_CollectiveStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectiveStructure getCollectiveStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getCollectiveStructure <em>Collective Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collective Structure</em>' containment reference.
	 * @see #getCollectiveStructure()
	 * @generated
	 */
	void setCollectiveStructure(CollectiveStructure value);

	/**
	 * Returns the value of the '<em><b>Physical Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Structure</em>' containment reference.
	 * @see #setPhysicalStructure(PhysicalStructure)
	 * @see maia.MaiaPackage#getMAIA_PhysicalStructure()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalStructure getPhysicalStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getPhysicalStructure <em>Physical Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Structure</em>' containment reference.
	 * @see #getPhysicalStructure()
	 * @generated
	 */
	void setPhysicalStructure(PhysicalStructure value);

	/**
	 * Returns the value of the '<em><b>Operational Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Structure</em>' containment reference.
	 * @see #setOperationalStructure(OperationalStructure)
	 * @see maia.MaiaPackage#getMAIA_OperationalStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationalStructure getOperationalStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getOperationalStructure <em>Operational Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Structure</em>' containment reference.
	 * @see #getOperationalStructure()
	 * @generated
	 */
	void setOperationalStructure(OperationalStructure value);

	/**
	 * Returns the value of the '<em><b>Evaluative Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluative Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluative Structure</em>' containment reference.
	 * @see #setEvaluativeStructure(EvaluativeStructure)
	 * @see maia.MaiaPackage#getMAIA_EvaluativeStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvaluativeStructure getEvaluativeStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getEvaluativeStructure <em>Evaluative Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluative Structure</em>' containment reference.
	 * @see #getEvaluativeStructure()
	 * @generated
	 */
	void setEvaluativeStructure(EvaluativeStructure value);

	/**
	 * Returns the value of the '<em><b>Ontological Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontological Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontological Structure</em>' containment reference.
	 * @see #setOntologicalStructure(OntologicalStructure)
	 * @see maia.MaiaPackage#getMAIA_OntologicalStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OntologicalStructure getOntologicalStructure();

	/**
	 * Sets the value of the '{@link maia.MAIA#getOntologicalStructure <em>Ontological Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontological Structure</em>' containment reference.
	 * @see #getOntologicalStructure()
	 * @generated
	 */
	void setOntologicalStructure(OntologicalStructure value);

} // MAIA
