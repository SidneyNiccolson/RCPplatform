/**
 */
package maia.collectiveStructure.util;

import maia.collectiveStructure.*;

import maia.operationalStructure.Performer;

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
 * @see maia.collectiveStructure.CollectiveStructurePackage
 * @generated
 */
public class CollectiveStructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectiveStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = CollectiveStructurePackage.eINSTANCE;
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
			case CollectiveStructurePackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = casePerformer(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.PERSONAL_VALUE: {
				PersonalValue personalValue = (PersonalValue)theEObject;
				T result = casePersonalValue(personalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.DECISION_INFLUENCE: {
				DecisionInfluence decisionInfluence = (DecisionInfluence)theEObject;
				T result = caseDecisionInfluence(decisionInfluence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE: {
				CollectiveStructure collectiveStructure = (CollectiveStructure)theEObject;
				T result = caseCollectiveStructure(collectiveStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.MCDA: {
				MCDA mcda = (MCDA)theEObject;
				T result = caseMCDA(mcda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.DECISION_CRITERION: {
				DecisionCriterion decisionCriterion = (DecisionCriterion)theEObject;
				T result = caseDecisionCriterion(decisionCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT: {
				PersonalValueAspect personalValueAspect = (PersonalValueAspect)theEObject;
				T result = casePersonalValueAspect(personalValueAspect);
				if (result == null) result = caseDecisionCriterion(personalValueAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.PROPERTY_ASPECT: {
				PropertyAspect propertyAspect = (PropertyAspect)theEObject;
				T result = casePropertyAspect(propertyAspect);
				if (result == null) result = caseDecisionCriterion(propertyAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.CONDITION_ASPECT: {
				ConditionAspect conditionAspect = (ConditionAspect)theEObject;
				T result = caseConditionAspect(conditionAspect);
				if (result == null) result = caseDecisionCriterion(conditionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectiveStructurePackage.SANCTION_ASPECT: {
				SanctionAspect sanctionAspect = (SanctionAspect)theEObject;
				T result = caseSanctionAspect(sanctionAspect);
				if (result == null) result = caseDecisionCriterion(sanctionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalValue(PersonalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionInfluence(DecisionInfluence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collective Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collective Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectiveStructure(CollectiveStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCDA(MCDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionCriterion(DecisionCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Value Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Value Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalValueAspect(PersonalValueAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAspect(PropertyAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAspect(ConditionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanction Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanction Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSanctionAspect(SanctionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer(Performer object) {
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

} //CollectiveStructureSwitch
