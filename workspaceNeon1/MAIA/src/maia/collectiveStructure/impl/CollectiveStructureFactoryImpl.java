/**
 */
package maia.collectiveStructure.impl;

import maia.collectiveStructure.*;

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
public class CollectiveStructureFactoryImpl extends EFactoryImpl implements CollectiveStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectiveStructureFactory init() {
		try {
			CollectiveStructureFactory theCollectiveStructureFactory = (CollectiveStructureFactory)EPackage.Registry.INSTANCE.getEFactory(CollectiveStructurePackage.eNS_URI);
			if (theCollectiveStructureFactory != null) {
				return theCollectiveStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollectiveStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructureFactoryImpl() {
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
			case CollectiveStructurePackage.AGENT: return createAgent();
			case CollectiveStructurePackage.PERSONAL_VALUE: return createPersonalValue();
			case CollectiveStructurePackage.DECISION_INFLUENCE: return createDecisionInfluence();
			case CollectiveStructurePackage.COLLECTIVE_STRUCTURE: return createCollectiveStructure();
			case CollectiveStructurePackage.MCDA: return createMCDA();
			case CollectiveStructurePackage.PERSONAL_VALUE_ASPECT: return createPersonalValueAspect();
			case CollectiveStructurePackage.PROPERTY_ASPECT: return createPropertyAspect();
			case CollectiveStructurePackage.CONDITION_ASPECT: return createConditionAspect();
			case CollectiveStructurePackage.SANCTION_ASPECT: return createSanctionAspect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalValue createPersonalValue() {
		PersonalValueImpl personalValue = new PersonalValueImpl();
		return personalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionInfluence createDecisionInfluence() {
		DecisionInfluenceImpl decisionInfluence = new DecisionInfluenceImpl();
		return decisionInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructure createCollectiveStructure() {
		CollectiveStructureImpl collectiveStructure = new CollectiveStructureImpl();
		return collectiveStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCDA createMCDA() {
		MCDAImpl mcda = new MCDAImpl();
		return mcda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalValueAspect createPersonalValueAspect() {
		PersonalValueAspectImpl personalValueAspect = new PersonalValueAspectImpl();
		return personalValueAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAspect createPropertyAspect() {
		PropertyAspectImpl propertyAspect = new PropertyAspectImpl();
		return propertyAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAspect createConditionAspect() {
		ConditionAspectImpl conditionAspect = new ConditionAspectImpl();
		return conditionAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SanctionAspect createSanctionAspect() {
		SanctionAspectImpl sanctionAspect = new SanctionAspectImpl();
		return sanctionAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructurePackage getCollectiveStructurePackage() {
		return (CollectiveStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollectiveStructurePackage getPackage() {
		return CollectiveStructurePackage.eINSTANCE;
	}

} //CollectiveStructureFactoryImpl
