/**
 */
package maia.ontologicalStructure.util;

import maia.ontologicalStructure.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see maia.ontologicalStructure.OntologicalStructurePackage
 * @generated
 */
public class OntologicalStructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntologicalStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = OntologicalStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE: {
				OntologicalStructure ontologicalStructure = (OntologicalStructure)theEObject;
				T result = caseOntologicalStructure(ontologicalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.ONTOLOGICAL_CONCEPT: {
				OntologicalConcept ontologicalConcept = (OntologicalConcept)theEObject;
				T result = caseOntologicalConcept(ontologicalConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.LOGICAL_CONDITION: {
				LogicalCondition logicalCondition = (LogicalCondition)theEObject;
				T result = caseLogicalCondition(logicalCondition);
				if (result == null) result = caseCondition(logicalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.NATURAL_LANG_CONDITION: {
				NaturalLangCondition naturalLangCondition = (NaturalLangCondition)theEObject;
				T result = caseNaturalLangCondition(naturalLangCondition);
				if (result == null) result = caseCondition(naturalLangCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.MATH_CONDITION: {
				MathCondition mathCondition = (MathCondition)theEObject;
				T result = caseMathCondition(mathCondition);
				if (result == null) result = caseCondition(mathCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.NEGFORMULA: {
				Negformula negformula = (Negformula)theEObject;
				T result = caseNegformula(negformula);
				if (result == null) result = caseLogicalCondition(negformula);
				if (result == null) result = caseCondition(negformula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.ORFORMULA: {
				ORformula oRformula = (ORformula)theEObject;
				T result = caseORformula(oRformula);
				if (result == null) result = caseLogicalCondition(oRformula);
				if (result == null) result = caseCondition(oRformula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.AN_DFORMULA: {
				ANDformula anDformula = (ANDformula)theEObject;
				T result = caseANDformula(anDformula);
				if (result == null) result = caseLogicalCondition(anDformula);
				if (result == null) result = caseCondition(anDformula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.EQUAL_FORMULA: {
				equalFormula equalFormula = (equalFormula)theEObject;
				T result = caseequalFormula(equalFormula);
				if (result == null) result = caseMathCondition(equalFormula);
				if (result == null) result = caseCondition(equalFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.MORE_EQFORMULA: {
				moreEqformula moreEqformula = (moreEqformula)theEObject;
				T result = casemoreEqformula(moreEqformula);
				if (result == null) result = caseMathCondition(moreEqformula);
				if (result == null) result = caseCondition(moreEqformula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.LESSFORMULA: {
				lessformula lessformula = (lessformula)theEObject;
				T result = caselessformula(lessformula);
				if (result == null) result = caseMathCondition(lessformula);
				if (result == null) result = caseCondition(lessformula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.NUMBER_PROPERTY: {
				NumberProperty numberProperty = (NumberProperty)theEObject;
				T result = caseNumberProperty(numberProperty);
				if (result == null) result = caseProperty(numberProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.BOOLEAN_PROPERTY: {
				BooleanProperty booleanProperty = (BooleanProperty)theEObject;
				T result = caseBooleanProperty(booleanProperty);
				if (result == null) result = caseProperty(booleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologicalStructurePackage.STRING_PROPERTY: {
				StringProperty stringProperty = (StringProperty)theEObject;
				T result = caseStringProperty(stringProperty);
				if (result == null) result = caseProperty(stringProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontological Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontological Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalStructure(OntologicalStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontological Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontological Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologicalConcept(OntologicalConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalCondition(LogicalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Lang Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Lang Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalLangCondition(NaturalLangCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathCondition(MathCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negformula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negformula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegformula(Negformula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORformula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORformula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORformula(ORformula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AN Dformula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AN Dformula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDformula(ANDformula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equal Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequalFormula(equalFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>more Eqformula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>more Eqformula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoreEqformula(moreEqformula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>lessformula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>lessformula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselessformula(lessformula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberProperty(NumberProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanProperty(BooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringProperty(StringProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OntologicalStructureSwitch
