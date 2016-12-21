/**
 */
package maia.operationalStructure.impl;

import maia.operationalStructure.*;

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
public class OperationalStructureFactoryImpl extends EFactoryImpl implements OperationalStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationalStructureFactory init() {
		try {
			OperationalStructureFactory theOperationalStructureFactory = (OperationalStructureFactory)EPackage.Registry.INSTANCE.getEFactory(OperationalStructurePackage.eNS_URI);
			if (theOperationalStructureFactory != null) {
				return theOperationalStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationalStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureFactoryImpl() {
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
			case OperationalStructurePackage.ACTION_BODY: return createActionBody();
			case OperationalStructurePackage.ENTITY_ACTION: return createEntityAction();
			case OperationalStructurePackage.ACTION_SITUATION: return createActionSituation();
			case OperationalStructurePackage.ACTION_ARENA: return createActionArena();
			case OperationalStructurePackage.ROLE_ENACTMENT: return createRoleEnactment();
			case OperationalStructurePackage.PLAN_SEQUENCE: return createPlanSequence();
			case OperationalStructurePackage.PLAN_ALTERNATIVE: return createPlanAlternative();
			case OperationalStructurePackage.PLAN_LOOP: return createPlanLoop();
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE: return createOperationalStructure();
			case OperationalStructurePackage.PERFORMER: return createPerformer();
			case OperationalStructurePackage.PLAN_CONDITION: return createPlanCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBody createActionBody() {
		ActionBodyImpl actionBody = new ActionBodyImpl();
		return actionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAction createEntityAction() {
		EntityActionImpl entityAction = new EntityActionImpl();
		return entityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSituation createActionSituation() {
		ActionSituationImpl actionSituation = new ActionSituationImpl();
		return actionSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionArena createActionArena() {
		ActionArenaImpl actionArena = new ActionArenaImpl();
		return actionArena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEnactment createRoleEnactment() {
		RoleEnactmentImpl roleEnactment = new RoleEnactmentImpl();
		return roleEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanSequence createPlanSequence() {
		PlanSequenceImpl planSequence = new PlanSequenceImpl();
		return planSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanAlternative createPlanAlternative() {
		PlanAlternativeImpl planAlternative = new PlanAlternativeImpl();
		return planAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanLoop createPlanLoop() {
		PlanLoopImpl planLoop = new PlanLoopImpl();
		return planLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructure createOperationalStructure() {
		OperationalStructureImpl operationalStructure = new OperationalStructureImpl();
		return operationalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanCondition createPlanCondition() {
		PlanConditionImpl planCondition = new PlanConditionImpl();
		return planCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructurePackage getOperationalStructurePackage() {
		return (OperationalStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationalStructurePackage getPackage() {
		return OperationalStructurePackage.eINSTANCE;
	}

} //OperationalStructureFactoryImpl
