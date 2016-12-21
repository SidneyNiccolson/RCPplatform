/**
 */
package maia.constitutionalStructure.impl;

import maia.constitutionalStructure.*;

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
public class ConstitutionalStructureFactoryImpl extends EFactoryImpl implements ConstitutionalStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstitutionalStructureFactory init() {
		try {
			ConstitutionalStructureFactory theConstitutionalStructureFactory = (ConstitutionalStructureFactory)EPackage.Registry.INSTANCE.getEFactory(ConstitutionalStructurePackage.eNS_URI);
			if (theConstitutionalStructureFactory != null) {
				return theConstitutionalStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstitutionalStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstitutionalStructureFactoryImpl() {
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
			case ConstitutionalStructurePackage.ROLE: return createRole();
			case ConstitutionalStructurePackage.SHARED_STRATEGY: return createSharedStrategy();
			case ConstitutionalStructurePackage.NORM: return createNorm();
			case ConstitutionalStructurePackage.RULE: return createRule();
			case ConstitutionalStructurePackage.DEPENDENCY: return createDependency();
			case ConstitutionalStructurePackage.OBJECTIVE: return createObjective();
			case ConstitutionalStructurePackage.CONSTITUTIONAL_STRUCTURE: return createConstitutionalStructure();
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
			case ConstitutionalStructurePackage.DEON_LOGIC_TYPE:
				return createdeonLogicTypeFromString(eDataType, initialValue);
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
			case ConstitutionalStructurePackage.DEON_LOGIC_TYPE:
				return convertdeonLogicTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedStrategy createSharedStrategy() {
		SharedStrategyImpl sharedStrategy = new SharedStrategyImpl();
		return sharedStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Norm createNorm() {
		NormImpl norm = new NormImpl();
		return norm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstitutionalStructure createConstitutionalStructure() {
		ConstitutionalStructureImpl constitutionalStructure = new ConstitutionalStructureImpl();
		return constitutionalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deonLogicType createdeonLogicTypeFromString(EDataType eDataType, String initialValue) {
		deonLogicType result = deonLogicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdeonLogicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstitutionalStructurePackage getConstitutionalStructurePackage() {
		return (ConstitutionalStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstitutionalStructurePackage getPackage() {
		return ConstitutionalStructurePackage.eINSTANCE;
	}

} //ConstitutionalStructureFactoryImpl
