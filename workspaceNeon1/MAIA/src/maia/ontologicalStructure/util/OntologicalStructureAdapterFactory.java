/**
 */
package maia.ontologicalStructure.util;

import maia.ontologicalStructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maia.ontologicalStructure.OntologicalStructurePackage
 * @generated
 */
public class OntologicalStructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OntologicalStructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OntologicalStructurePackage.eINSTANCE;
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
	protected OntologicalStructureSwitch<Adapter> modelSwitch =
		new OntologicalStructureSwitch<Adapter>() {
			@Override
			public Adapter caseOntologicalStructure(OntologicalStructure object) {
				return createOntologicalStructureAdapter();
			}
			@Override
			public Adapter caseOntologicalConcept(OntologicalConcept object) {
				return createOntologicalConceptAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseLogicalCondition(LogicalCondition object) {
				return createLogicalConditionAdapter();
			}
			@Override
			public Adapter caseNaturalLangCondition(NaturalLangCondition object) {
				return createNaturalLangConditionAdapter();
			}
			@Override
			public Adapter caseMathCondition(MathCondition object) {
				return createMathConditionAdapter();
			}
			@Override
			public Adapter caseNegformula(Negformula object) {
				return createNegformulaAdapter();
			}
			@Override
			public Adapter caseORformula(ORformula object) {
				return createORformulaAdapter();
			}
			@Override
			public Adapter caseANDformula(ANDformula object) {
				return createANDformulaAdapter();
			}
			@Override
			public Adapter caseequalFormula(equalFormula object) {
				return createequalFormulaAdapter();
			}
			@Override
			public Adapter casemoreEqformula(moreEqformula object) {
				return createmoreEqformulaAdapter();
			}
			@Override
			public Adapter caselessformula(lessformula object) {
				return createlessformulaAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseNumberProperty(NumberProperty object) {
				return createNumberPropertyAdapter();
			}
			@Override
			public Adapter caseBooleanProperty(BooleanProperty object) {
				return createBooleanPropertyAdapter();
			}
			@Override
			public Adapter caseStringProperty(StringProperty object) {
				return createStringPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.OntologicalStructure <em>Ontological Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.OntologicalStructure
	 * @generated
	 */
	public Adapter createOntologicalStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.OntologicalConcept <em>Ontological Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.OntologicalConcept
	 * @generated
	 */
	public Adapter createOntologicalConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.LogicalCondition
	 * @generated
	 */
	public Adapter createLogicalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.NaturalLangCondition <em>Natural Lang Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.NaturalLangCondition
	 * @generated
	 */
	public Adapter createNaturalLangConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.MathCondition <em>Math Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.MathCondition
	 * @generated
	 */
	public Adapter createMathConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.Negformula <em>Negformula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.Negformula
	 * @generated
	 */
	public Adapter createNegformulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.ORformula <em>ORformula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.ORformula
	 * @generated
	 */
	public Adapter createORformulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.ANDformula <em>AN Dformula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.ANDformula
	 * @generated
	 */
	public Adapter createANDformulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.equalFormula <em>equal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.equalFormula
	 * @generated
	 */
	public Adapter createequalFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.moreEqformula <em>more Eqformula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.moreEqformula
	 * @generated
	 */
	public Adapter createmoreEqformulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.lessformula <em>lessformula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.lessformula
	 * @generated
	 */
	public Adapter createlessformulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.NumberProperty <em>Number Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.NumberProperty
	 * @generated
	 */
	public Adapter createNumberPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.BooleanProperty
	 * @generated
	 */
	public Adapter createBooleanPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maia.ontologicalStructure.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maia.ontologicalStructure.StringProperty
	 * @generated
	 */
	public Adapter createStringPropertyAdapter() {
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

} //OntologicalStructureAdapterFactory
