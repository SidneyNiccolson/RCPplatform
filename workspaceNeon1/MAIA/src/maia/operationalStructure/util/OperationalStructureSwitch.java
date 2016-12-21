/**
 */
package maia.operationalStructure.util;

import maia.operationalStructure.*;

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
 * @see maia.operationalStructure.OperationalStructurePackage
 * @generated
 */
public class OperationalStructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = OperationalStructurePackage.eINSTANCE;
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
			case OperationalStructurePackage.ACTION_BODY: {
				ActionBody actionBody = (ActionBody)theEObject;
				T result = caseActionBody(actionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.ENTITY_ACTION: {
				EntityAction entityAction = (EntityAction)theEObject;
				T result = caseEntityAction(entityAction);
				if (result == null) result = casePlan(entityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.ACTION_SITUATION: {
				ActionSituation actionSituation = (ActionSituation)theEObject;
				T result = caseActionSituation(actionSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.ACTION_ARENA: {
				ActionArena actionArena = (ActionArena)theEObject;
				T result = caseActionArena(actionArena);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.ROLE_ENACTMENT: {
				RoleEnactment roleEnactment = (RoleEnactment)theEObject;
				T result = caseRoleEnactment(roleEnactment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PLAN: {
				Plan plan = (Plan)theEObject;
				T result = casePlan(plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PLAN_SEQUENCE: {
				PlanSequence planSequence = (PlanSequence)theEObject;
				T result = casePlanSequence(planSequence);
				if (result == null) result = casePlan(planSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PLAN_ALTERNATIVE: {
				PlanAlternative planAlternative = (PlanAlternative)theEObject;
				T result = casePlanAlternative(planAlternative);
				if (result == null) result = casePlan(planAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PLAN_LOOP: {
				PlanLoop planLoop = (PlanLoop)theEObject;
				T result = casePlanLoop(planLoop);
				if (result == null) result = casePlan(planLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE: {
				OperationalStructure operationalStructure = (OperationalStructure)theEObject;
				T result = caseOperationalStructure(operationalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PERFORMER: {
				Performer performer = (Performer)theEObject;
				T result = casePerformer(performer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalStructurePackage.PLAN_CONDITION: {
				PlanCondition planCondition = (PlanCondition)theEObject;
				T result = casePlanCondition(planCondition);
				if (result == null) result = casePlan(planCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBody(ActionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAction(EntityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSituation(ActionSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Arena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Arena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionArena(ActionArena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Enactment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleEnactment(RoleEnactment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlan(Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanSequence(PlanSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanAlternative(PlanAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanLoop(PlanLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalStructure(OperationalStructure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plan Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanCondition(PlanCondition object) {
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

} //OperationalStructureSwitch
