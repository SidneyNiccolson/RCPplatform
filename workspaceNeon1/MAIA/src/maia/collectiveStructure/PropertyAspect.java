/**
 */
package maia.collectiveStructure;

import maia.ontologicalStructure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maia.collectiveStructure.PropertyAspect#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see maia.collectiveStructure.CollectiveStructurePackage#getPropertyAspect()
 * @model
 * @generated
 */
public interface PropertyAspect extends DecisionCriterion {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see maia.collectiveStructure.CollectiveStructurePackage#getPropertyAspect_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link maia.collectiveStructure.PropertyAspect#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyAspect
