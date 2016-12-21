/**
 */
package maia.evaluativeStructure.impl;

import maia.evaluativeStructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EvaluativeStructureFactoryImpl extends EFactoryImpl implements EvaluativeStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluativeStructureFactory init() {
		try {
			EvaluativeStructureFactory theEvaluativeStructureFactory = (EvaluativeStructureFactory)EPackage.Registry.INSTANCE.getEFactory(EvaluativeStructurePackage.eNS_URI);
			if (theEvaluativeStructureFactory != null) {
				return theEvaluativeStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvaluativeStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluativeStructureFactoryImpl() {
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
			case EvaluativeStructurePackage.DEBUGGING: return createDebugging();
			case EvaluativeStructurePackage.EVALUATION: return createEvaluation();
			case EvaluativeStructurePackage.EVALUATIVE_STRUCTURE: return createEvaluativeStructure();
			case EvaluativeStructurePackage.PROPERTY_VARIABLE: return createPropertyVariable();
			case EvaluativeStructurePackage.PERSONAL_VALUE_VARIABLE: return createPersonalValueVariable();
			case EvaluativeStructurePackage.ONTOLOGICAL_CONCEPT_VARIABLE: return createOntologicalConceptVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EvaluativeStructurePackage.RELATION_TYPE:
				return createrelationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EvaluativeStructurePackage.RELATION_TYPE:
				return convertrelationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debugging createDebugging() {
		DebuggingImpl debugging = new DebuggingImpl();
		return debugging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluativeStructure createEvaluativeStructure() {
		EvaluativeStructureImpl evaluativeStructure = new EvaluativeStructureImpl();
		return evaluativeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyVariable createPropertyVariable() {
		PropertyVariableImpl propertyVariable = new PropertyVariableImpl();
		return propertyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalValueVariable createPersonalValueVariable() {
		PersonalValueVariableImpl personalValueVariable = new PersonalValueVariableImpl();
		return personalValueVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalConceptVariable createOntologicalConceptVariable() {
		OntologicalConceptVariableImpl ontologicalConceptVariable = new OntologicalConceptVariableImpl();
		return ontologicalConceptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public relationType createrelationTypeFromString(EDataType eDataType, String initialValue) {
		relationType result = relationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertrelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluativeStructurePackage getEvaluativeStructurePackage() {
		return (EvaluativeStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvaluativeStructurePackage getPackage() {
		return EvaluativeStructurePackage.eINSTANCE;
	}

} //EvaluativeStructureFactoryImpl
