/**
 */
package maia.constitutionalStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.constitutionalStructure.Dependency#getDependant <em>Dependant</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Dependency#getDependee <em>Dependee</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Dependency#getDependantObjective <em>Dependant Objective</em>}</li>
 *   <li>{@link maia.constitutionalStructure.Dependency#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant</em>' reference.
	 * @see #setDependant(Role)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getDependency_Dependant()
	 * @model
	 * @generated
	 */
	Role getDependant();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Dependency#getDependant <em>Dependant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant</em>' reference.
	 * @see #getDependant()
	 * @generated
	 */
	void setDependant(Role value);

	/**
	 * Returns the value of the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependee</em>' reference.
	 * @see #setDependee(Role)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getDependency_Dependee()
	 * @model required="true"
	 * @generated
	 */
	Role getDependee();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Dependency#getDependee <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependee</em>' reference.
	 * @see #getDependee()
	 * @generated
	 */
	void setDependee(Role value);

	/**
	 * Returns the value of the '<em><b>Dependant Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant Objective</em>' reference.
	 * @see #setDependantObjective(Objective)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getDependency_DependantObjective()
	 * @model required="true"
	 * @generated
	 */
	Objective getDependantObjective();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Dependency#getDependantObjective <em>Dependant Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant Objective</em>' reference.
	 * @see #getDependantObjective()
	 * @generated
	 */
	void setDependantObjective(Objective value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see maia.constitutionalStructure.ConstitutionalStructurePackage#getDependency_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link maia.constitutionalStructure.Dependency#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Dependency
