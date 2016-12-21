/**
 */
package maia.collectiveStructure.util;

import maia.collectiveStructure.*;

import maia.operationalStructure.Performer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maia.collectiveStructure.CollectiveStructurePackage
 * @generated
 */
public class CollectiveStructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectiveStructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CollectiveStructurePackage.eINSTANCE;
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
	protected CollectiveStructureSwitch<Adapter> modelSwitch =
		new CollectiveStructureSwitch<Adapter>() {
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter casePersonalValue(PersonalValue object) {
				return createPersonalValueAdapter();
			}
			@Override
			public Adapter caseDecisionInfluence(DecisionInfluence object) {
				return createDecisionInfluenceAdapter();
			}
			@Override
			public Adapter caseCollectiveStructure(CollectiveStructure object) {
				return createCollectiveStructureAdapter();
			}
			@Override
			public Adapter caseMCDA(MCDA object) {
				return createMCDAAdapter();
			}
			@Override
			public Adapter caseDecisionCriterion(DecisionCriterion object) {
				return createDecisionCriterionAdapter();
			}
			@Override
			public Adapter casePersonalValueAspect(PersonalValueAspect object) {
				return createPersonalValueAspectAdapter();
			}
			@Override
			public Adapter casePropertyAspect(PropertyAspect object) {
				return createPropertyAspectAdapter();
			}
			@Override
			public Adapter caseConditionAspect(ConditionAspect object) {
				return createConditionAspectAdapter();
			}
			@Override
			public Adapter caseSanctionAspect(SanctionAspect object) {
				return createSanctionAspectAdapter();
			}
			@Override
			public Adapter casePerformer(Performer object) {
				return createPerformerAdapter();
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
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.PersonalValue <em>Personal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.PersonalValue
	 * @generated
	 */
	public Adapter createPersonalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.DecisionInfluence <em>Decision Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.DecisionInfluence
	 * @generated
	 */
	public Adapter createDecisionInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.CollectiveStructure <em>Collective Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.CollectiveStructure
	 * @generated
	 */
	public Adapter createCollectiveStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.MCDA <em>MCDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.MCDA
	 * @generated
	 */
	public Adapter createMCDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.DecisionCriterion <em>Decision Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.DecisionCriterion
	 * @generated
	 */
	public Adapter createDecisionCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.PersonalValueAspect <em>Personal Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.PersonalValueAspect
	 * @generated
	 */
	public Adapter createPersonalValueAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.PropertyAspect <em>Property Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.PropertyAspect
	 * @generated
	 */
	public Adapter createPropertyAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.ConditionAspect <em>Condition Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.ConditionAspect
	 * @generated
	 */
	public Adapter createConditionAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.collectiveStructure.SanctionAspect <em>Sanction Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.collectiveStructure.SanctionAspect
	 * @generated
	 */
	public Adapter createSanctionAspectAdapter() {
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

} //CollectiveStructureAdapterFactory
