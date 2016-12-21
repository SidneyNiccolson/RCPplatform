/**
 */
package maia.constitutionalStructure;

import maia.operationalStructure.OperationalStructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maia.constitutionalStructure.ConstitutionalStructureFactory
 * @model kind="package"
 * @generated
 */
public interface ConstitutionalStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constitutionalStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/constitutionalStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constitutionalStruct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstitutionalStructurePackage eINSTANCE = maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.RoleImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = OperationalStructurePackage.PERFORMER__NAME;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OBJECTIVE = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Institutional Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INSTITUTIONAL_CAPABILITY = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INSTITUTION = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTRY_CONDITION = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PHYSICAL_COMPONENT = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INFORMATION = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = OperationalStructurePackage.PERFORMER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = OperationalStructurePackage.PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl <em>Institutional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.InstitutionalStatementImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getInstitutionalStatement()
	 * @generated
	 */
	int INSTITUTIONAL_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>AIm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT__AIM = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Institutional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Institutional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTIONAL_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.SharedStrategyImpl <em>Shared Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.SharedStrategyImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getSharedStrategy()
	 * @generated
	 */
	int SHARED_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY__LABEL = INSTITUTIONAL_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY__ATTRIBUTE = INSTITUTIONAL_STATEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>AIm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY__AIM = INSTITUTIONAL_STATEMENT__AIM;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY__CONDITION = INSTITUTIONAL_STATEMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>Shared Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY_FEATURE_COUNT = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STRATEGY_OPERATION_COUNT = INSTITUTIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.NormImpl <em>Norm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.NormImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getNorm()
	 * @generated
	 */
	int NORM = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__LABEL = INSTITUTIONAL_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__ATTRIBUTE = INSTITUTIONAL_STATEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>AIm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__AIM = INSTITUTIONAL_STATEMENT__AIM;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__CONDITION = INSTITUTIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Deontic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM__DEONTIC_TYPE = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Norm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_FEATURE_COUNT = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Norm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_OPERATION_COUNT = INSTITUTIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.RuleImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LABEL = INSTITUTIONAL_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTE = INSTITUTIONAL_STATEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>AIm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__AIM = INSTITUTIONAL_STATEMENT__AIM;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = INSTITUTIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Deontic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DEONTIC_TYPE = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Or Else</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OR_ELSE = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = INSTITUTIONAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = INSTITUTIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.DependencyImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Dependant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDANT = 0;

	/**
	 * The feature id for the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDEE = 1;

	/**
	 * The feature id for the '<em><b>Dependant Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDANT_OBJECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.ObjectiveImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Meeting Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__MEETING_CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.SanctionImpl <em>Sanction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.SanctionImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getSanction()
	 * @generated
	 */
	int SANCTION = 7;

	/**
	 * The number of structural features of the '<em>Sanction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sanction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl <em>Constitutional Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructureImpl
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getConstitutionalStructure()
	 * @generated
	 */
	int CONSTITUTIONAL_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Institutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE__INSTITUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE__DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Sanctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE__SANCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE__OBJECTIVES = 4;

	/**
	 * The number of structural features of the '<em>Constitutional Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Constitutional Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUTIONAL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.constitutionalStructure.deonLogicType <em>deon Logic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.constitutionalStructure.deonLogicType
	 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getdeonLogicType()
	 * @generated
	 */
	int DEON_LOGIC_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see maia.constitutionalStructure.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Role#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objective</em>'.
	 * @see maia.constitutionalStructure.Role#getObjective()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Objective();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.Role#getInstitutionalCapability <em>Institutional Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Institutional Capability</em>'.
	 * @see maia.constitutionalStructure.Role#getInstitutionalCapability()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InstitutionalCapability();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.Role#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Institution</em>'.
	 * @see maia.constitutionalStructure.Role#getInstitution()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Institution();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Role#getEntryCondition <em>Entry Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Condition</em>'.
	 * @see maia.constitutionalStructure.Role#getEntryCondition()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_EntryCondition();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.Role#getPhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physical Component</em>'.
	 * @see maia.constitutionalStructure.Role#getPhysicalComponent()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_PhysicalComponent();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.Role#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information</em>'.
	 * @see maia.constitutionalStructure.Role#getInformation()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Information();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.InstitutionalStatement <em>Institutional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institutional Statement</em>'.
	 * @see maia.constitutionalStructure.InstitutionalStatement
	 * @generated
	 */
	EClass getInstitutionalStatement();

	/**
	 * Returns the meta object for the attribute '{@link maia.constitutionalStructure.InstitutionalStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.constitutionalStructure.InstitutionalStatement#getLabel()
	 * @see #getInstitutionalStatement()
	 * @generated
	 */
	EAttribute getInstitutionalStatement_Label();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.InstitutionalStatement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see maia.constitutionalStructure.InstitutionalStatement#getAttribute()
	 * @see #getInstitutionalStatement()
	 * @generated
	 */
	EReference getInstitutionalStatement_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.InstitutionalStatement#getAIm <em>AIm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>AIm</em>'.
	 * @see maia.constitutionalStructure.InstitutionalStatement#getAIm()
	 * @see #getInstitutionalStatement()
	 * @generated
	 */
	EReference getInstitutionalStatement_AIm();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.InstitutionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see maia.constitutionalStructure.InstitutionalStatement#getCondition()
	 * @see #getInstitutionalStatement()
	 * @generated
	 */
	EReference getInstitutionalStatement_Condition();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.SharedStrategy <em>Shared Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Strategy</em>'.
	 * @see maia.constitutionalStructure.SharedStrategy
	 * @generated
	 */
	EClass getSharedStrategy();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Norm <em>Norm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm</em>'.
	 * @see maia.constitutionalStructure.Norm
	 * @generated
	 */
	EClass getNorm();

	/**
	 * Returns the meta object for the attribute '{@link maia.constitutionalStructure.Norm#getDeonticType <em>Deontic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deontic Type</em>'.
	 * @see maia.constitutionalStructure.Norm#getDeonticType()
	 * @see #getNorm()
	 * @generated
	 */
	EAttribute getNorm_DeonticType();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see maia.constitutionalStructure.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link maia.constitutionalStructure.Rule#getDeonticType <em>Deontic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deontic Type</em>'.
	 * @see maia.constitutionalStructure.Rule#getDeonticType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_DeonticType();

	/**
	 * Returns the meta object for the reference list '{@link maia.constitutionalStructure.Rule#getOrElse <em>Or Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Or Else</em>'.
	 * @see maia.constitutionalStructure.Rule#getOrElse()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_OrElse();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see maia.constitutionalStructure.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Dependency#getDependant <em>Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant</em>'.
	 * @see maia.constitutionalStructure.Dependency#getDependant()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependant();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Dependency#getDependee <em>Dependee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependee</em>'.
	 * @see maia.constitutionalStructure.Dependency#getDependee()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependee();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Dependency#getDependantObjective <em>Dependant Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant Objective</em>'.
	 * @see maia.constitutionalStructure.Dependency#getDependantObjective()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependantObjective();

	/**
	 * Returns the meta object for the attribute '{@link maia.constitutionalStructure.Dependency#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.constitutionalStructure.Dependency#getLabel()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Label();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see maia.constitutionalStructure.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the attribute '{@link maia.constitutionalStructure.Objective#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.constitutionalStructure.Objective#getLabel()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Label();

	/**
	 * Returns the meta object for the reference '{@link maia.constitutionalStructure.Objective#getMeetingCondition <em>Meeting Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meeting Condition</em>'.
	 * @see maia.constitutionalStructure.Objective#getMeetingCondition()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_MeetingCondition();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.Sanction <em>Sanction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sanction</em>'.
	 * @see maia.constitutionalStructure.Sanction
	 * @generated
	 */
	EClass getSanction();

	/**
	 * Returns the meta object for class '{@link maia.constitutionalStructure.ConstitutionalStructure <em>Constitutional Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constitutional Structure</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure
	 * @generated
	 */
	EClass getConstitutionalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.constitutionalStructure.ConstitutionalStructure#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure#getRoles()
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	EReference getConstitutionalStructure_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.constitutionalStructure.ConstitutionalStructure#getInstitutions <em>Institutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institutions</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure#getInstitutions()
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	EReference getConstitutionalStructure_Institutions();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.constitutionalStructure.ConstitutionalStructure#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure#getDependencies()
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	EReference getConstitutionalStructure_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.constitutionalStructure.ConstitutionalStructure#getSanctions <em>Sanctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sanctions</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure#getSanctions()
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	EReference getConstitutionalStructure_Sanctions();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.constitutionalStructure.ConstitutionalStructure#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see maia.constitutionalStructure.ConstitutionalStructure#getObjectives()
	 * @see #getConstitutionalStructure()
	 * @generated
	 */
	EReference getConstitutionalStructure_Objectives();

	/**
	 * Returns the meta object for enum '{@link maia.constitutionalStructure.deonLogicType <em>deon Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>deon Logic Type</em>'.
	 * @see maia.constitutionalStructure.deonLogicType
	 * @generated
	 */
	EEnum getdeonLogicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstitutionalStructureFactory getConstitutionalStructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.RoleImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OBJECTIVE = eINSTANCE.getRole_Objective();

		/**
		 * The meta object literal for the '<em><b>Institutional Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INSTITUTIONAL_CAPABILITY = eINSTANCE.getRole_InstitutionalCapability();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INSTITUTION = eINSTANCE.getRole_Institution();

		/**
		 * The meta object literal for the '<em><b>Entry Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ENTRY_CONDITION = eINSTANCE.getRole_EntryCondition();

		/**
		 * The meta object literal for the '<em><b>Physical Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PHYSICAL_COMPONENT = eINSTANCE.getRole_PhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INFORMATION = eINSTANCE.getRole_Information();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.InstitutionalStatementImpl <em>Institutional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.InstitutionalStatementImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getInstitutionalStatement()
		 * @generated
		 */
		EClass INSTITUTIONAL_STATEMENT = eINSTANCE.getInstitutionalStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTIONAL_STATEMENT__LABEL = eINSTANCE.getInstitutionalStatement_Label();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTIONAL_STATEMENT__ATTRIBUTE = eINSTANCE.getInstitutionalStatement_Attribute();

		/**
		 * The meta object literal for the '<em><b>AIm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTIONAL_STATEMENT__AIM = eINSTANCE.getInstitutionalStatement_AIm();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTIONAL_STATEMENT__CONDITION = eINSTANCE.getInstitutionalStatement_Condition();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.SharedStrategyImpl <em>Shared Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.SharedStrategyImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getSharedStrategy()
		 * @generated
		 */
		EClass SHARED_STRATEGY = eINSTANCE.getSharedStrategy();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.NormImpl <em>Norm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.NormImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getNorm()
		 * @generated
		 */
		EClass NORM = eINSTANCE.getNorm();

		/**
		 * The meta object literal for the '<em><b>Deontic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORM__DEONTIC_TYPE = eINSTANCE.getNorm_DeonticType();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.RuleImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Deontic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DEONTIC_TYPE = eINSTANCE.getRule_DeonticType();

		/**
		 * The meta object literal for the '<em><b>Or Else</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OR_ELSE = eINSTANCE.getRule_OrElse();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.DependencyImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dependant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDANT = eINSTANCE.getDependency_Dependant();

		/**
		 * The meta object literal for the '<em><b>Dependee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDEE = eINSTANCE.getDependency_Dependee();

		/**
		 * The meta object literal for the '<em><b>Dependant Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDANT_OBJECTIVE = eINSTANCE.getDependency_DependantObjective();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__LABEL = eINSTANCE.getDependency_Label();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.ObjectiveImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__LABEL = eINSTANCE.getObjective_Label();

		/**
		 * The meta object literal for the '<em><b>Meeting Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__MEETING_CONDITION = eINSTANCE.getObjective_MeetingCondition();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.SanctionImpl <em>Sanction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.SanctionImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getSanction()
		 * @generated
		 */
		EClass SANCTION = eINSTANCE.getSanction();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.impl.ConstitutionalStructureImpl <em>Constitutional Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructureImpl
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getConstitutionalStructure()
		 * @generated
		 */
		EClass CONSTITUTIONAL_STRUCTURE = eINSTANCE.getConstitutionalStructure();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUTIONAL_STRUCTURE__ROLES = eINSTANCE.getConstitutionalStructure_Roles();

		/**
		 * The meta object literal for the '<em><b>Institutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUTIONAL_STRUCTURE__INSTITUTIONS = eINSTANCE.getConstitutionalStructure_Institutions();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUTIONAL_STRUCTURE__DEPENDENCIES = eINSTANCE.getConstitutionalStructure_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Sanctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUTIONAL_STRUCTURE__SANCTIONS = eINSTANCE.getConstitutionalStructure_Sanctions();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUTIONAL_STRUCTURE__OBJECTIVES = eINSTANCE.getConstitutionalStructure_Objectives();

		/**
		 * The meta object literal for the '{@link maia.constitutionalStructure.deonLogicType <em>deon Logic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.constitutionalStructure.deonLogicType
		 * @see maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl#getdeonLogicType()
		 * @generated
		 */
		EEnum DEON_LOGIC_TYPE = eINSTANCE.getdeonLogicType();

	}

} //ConstitutionalStructurePackage
