/**
 */
package maia.ontologicalStructure.impl;

import maia.ontologicalStructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalStructureFactoryImpl extends EFactoryImpl implements OntologicalStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OntologicalStructureFactory init() {
		try {
			OntologicalStructureFactory theOntologicalStructureFactory = (OntologicalStructureFactory)EPackage.Registry.INSTANCE.getEFactory(OntologicalStructurePackage.eNS_URI);
			if (theOntologicalStructureFactory != null) {
				return theOntologicalStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OntologicalStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OntologicalStructurePackage.ONTOLOGICAL_STRUCTURE: return createOntologicalStructure();
			case OntologicalStructurePackage.ONTOLOGICAL_CONCEPT: return createOntologicalConcept();
			case OntologicalStructurePackage.NATURAL_LANG_CONDITION: return createNaturalLangCondition();
			case OntologicalStructurePackage.NEGFORMULA: return createNegformula();
			case OntologicalStructurePackage.ORFORMULA: return createORformula();
			case OntologicalStructurePackage.AN_DFORMULA: return createANDformula();
			case OntologicalStructurePackage.EQUAL_FORMULA: return createequalFormula();
			case OntologicalStructurePackage.MORE_EQFORMULA: return createmoreEqformula();
			case OntologicalStructurePackage.LESSFORMULA: return createlessformula();
			case OntologicalStructurePackage.NUMBER_PROPERTY: return createNumberProperty();
			case OntologicalStructurePackage.BOOLEAN_PROPERTY: return createBooleanProperty();
			case OntologicalStructurePackage.STRING_PROPERTY: return createStringProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructure createOntologicalStructure() {
		OntologicalStructureImpl ontologicalStructure = new OntologicalStructureImpl();
		return ontologicalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalConcept createOntologicalConcept() {
		OntologicalConceptImpl ontologicalConcept = new OntologicalConceptImpl();
		return ontologicalConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLangCondition createNaturalLangCondition() {
		NaturalLangConditionImpl naturalLangCondition = new NaturalLangConditionImpl();
		return naturalLangCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negformula createNegformula() {
		NegformulaImpl negformula = new NegformulaImpl();
		return negformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORformula createORformula() {
		ORformulaImpl oRformula = new ORformulaImpl();
		return oRformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDformula createANDformula() {
		ANDformulaImpl anDformula = new ANDformulaImpl();
		return anDformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equalFormula createequalFormula() {
		equalFormulaImpl equalFormula = new equalFormulaImpl();
		return equalFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moreEqformula createmoreEqformula() {
		moreEqformulaImpl moreEqformula = new moreEqformulaImpl();
		return moreEqformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lessformula createlessformula() {
		lessformulaImpl lessformula = new lessformulaImpl();
		return lessformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberProperty createNumberProperty() {
		NumberPropertyImpl numberProperty = new NumberPropertyImpl();
		return numberProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanProperty createBooleanProperty() {
		BooleanPropertyImpl booleanProperty = new BooleanPropertyImpl();
		return booleanProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringProperty createStringProperty() {
		StringPropertyImpl stringProperty = new StringPropertyImpl();
		return stringProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructurePackage getOntologicalStructurePackage() {
		return (OntologicalStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OntologicalStructurePackage getPackage() {
		return OntologicalStructurePackage.eINSTANCE;
	}

} //OntologicalStructureFactoryImpl
