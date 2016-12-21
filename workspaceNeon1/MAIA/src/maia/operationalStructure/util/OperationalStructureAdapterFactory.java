/**
 */
package maia.operationalStructure.util;

import maia.operationalStructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maia.operationalStructure.OperationalStructurePackage
 * @generated
 */
public class OperationalStructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalStructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperationalStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalStructureSwitch<Adapter> modelSwitch =
		new OperationalStructureSwitch<Adapter>() {
			@Override
			public Adapter caseActionBody(ActionBody object) {
				return createActionBodyAdapter();
			}
			@Override
			public Adapter caseEntityAction(EntityAction object) {
				return createEntityActionAdapter();
			}
			@Override
			public Adapter caseActionSituation(ActionSituation object) {
				return createActionSituationAdapter();
			}
			@Override
			public Adapter caseActionArena(ActionArena object) {
				return createActionArenaAdapter();
			}
			@Override
			public Adapter caseRoleEnactment(RoleEnactment object) {
				return createRoleEnactmentAdapter();
			}
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter casePlanSequence(PlanSequence object) {
				return createPlanSequenceAdapter();
			}
			@Override
			public Adapter casePlanAlternative(PlanAlternative object) {
				return createPlanAlternativeAdapter();
			}
			@Override
			public Adapter casePlanLoop(PlanLoop object) {
				return createPlanLoopAdapter();
			}
			@Override
			public Adapter caseOperationalStructure(OperationalStructure object) {
				return createOperationalStructureAdapter();
			}
			@Override
			public Adapter casePerformer(Performer object) {
				return createPerformerAdapter();
			}
			@Override
			public Adapter casePlanCondition(PlanCondition object) {
				return createPlanConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.ActionBody <em>Action Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.ActionBody
	 * @generated
	 */
	public Adapter createActionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.EntityAction <em>Entity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.EntityAction
	 * @generated
	 */
	public Adapter createEntityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.ActionSituation <em>Action Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.ActionSituation
	 * @generated
	 */
	public Adapter createActionSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.ActionArena <em>Action Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.ActionArena
	 * @generated
	 */
	public Adapter createActionArenaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.RoleEnactment <em>Role Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.RoleEnactment
	 * @generated
	 */
	public Adapter createRoleEnactmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.PlanSequence <em>Plan Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.PlanSequence
	 * @generated
	 */
	public Adapter createPlanSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.PlanAlternative <em>Plan Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.PlanAlternative
	 * @generated
	 */
	public Adapter createPlanAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.PlanLoop <em>Plan Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.PlanLoop
	 * @generated
	 */
	public Adapter createPlanLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.OperationalStructure <em>Operational Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.OperationalStructure
	 * @generated
	 */
	public Adapter createOperationalStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.Performer
	 * @generated
	 */
	public Adapter createPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.operationalStructure.PlanCondition <em>Plan Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.operationalStructure.PlanCondition
	 * @generated
	 */
	public Adapter createPlanConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperationalStructureAdapterFactory
