/**
 */
package maia.ontologicalStructure.impl;

import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructurePackage;

import maia.collectiveStructure.impl.CollectiveStructurePackageImpl;

import maia.constitutionalStructure.ConstitutionalStructurePackage;

import maia.constitutionalStructure.impl.ConstitutionalStructurePackageImpl;

import maia.evaluativeStructure.EvaluativeStructurePackage;

import maia.evaluativeStructure.impl.EvaluativeStructurePackageImpl;

import maia.impl.MaiaPackageImpl;

import maia.ontologicalStructure.ANDformula;
import maia.ontologicalStructure.BooleanProperty;
import maia.ontologicalStructure.Condition;
import maia.ontologicalStructure.LogicalCondition;
import maia.ontologicalStructure.MathCondition;
import maia.ontologicalStructure.NaturalLangCondition;
import maia.ontologicalStructure.Negformula;
import maia.ontologicalStructure.NumberProperty;
import maia.ontologicalStructure.ORformula;
import maia.ontologicalStructure.OntologicalConcept;
import maia.ontologicalStructure.OntologicalStructure;
import maia.ontologicalStructure.OntologicalStructureFactory;
import maia.ontologicalStructure.OntologicalStructurePackage;
import maia.ontologicalStructure.Property;
import maia.ontologicalStructure.StringProperty;
import maia.ontologicalStructure.equalFormula;
import maia.ontologicalStructure.lessformula;
import maia.ontologicalStructure.moreEqformula;

import maia.operationalStructure.OperationalStructurePackage;

import maia.operationalStructure.impl.OperationalStructurePackageImpl;

import maia.physicalStructure.PhysicalStructurePackage;

import maia.physicalStructure.impl.PhysicalStructurePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologicalStructurePackageImpl extends EPackageImpl implements OntologicalStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologicalConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalLangConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negformulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oRformulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anDformulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moreEqformulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessformulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see maia.ontologicalStructure.OntologicalStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OntologicalStructurePackageImpl() {
		super(eNS_URI, OntologicalStructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OntologicalStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OntologicalStructurePackage init() {
		if (isInited) return (OntologicalStructurePackage)EPackage.Registry.INSTANCE.getEPackage(OntologicalStructurePackage.eNS_URI);

		// Obtain or create and register package
		OntologicalStructurePackageImpl theOntologicalStructurePackage = (OntologicalStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OntologicalStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OntologicalStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MaiaPackageImpl theMaiaPackage = (MaiaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) instanceof MaiaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaiaPackage.eNS_URI) : MaiaPackage.eINSTANCE);
		PhysicalStructurePackageImpl thePhysicalStructurePackage = (PhysicalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) instanceof PhysicalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhysicalStructurePackage.eNS_URI) : PhysicalStructurePackage.eINSTANCE);
		EvaluativeStructurePackageImpl theEvaluativeStructurePackage = (EvaluativeStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) instanceof EvaluativeStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvaluativeStructurePackage.eNS_URI) : EvaluativeStructurePackage.eINSTANCE);
		ConstitutionalStructurePackageImpl theConstitutionalStructurePackage = (ConstitutionalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) instanceof ConstitutionalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstitutionalStructurePackage.eNS_URI) : ConstitutionalStructurePackage.eINSTANCE);
		CollectiveStructurePackageImpl theCollectiveStructurePackage = (CollectiveStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) instanceof CollectiveStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectiveStructurePackage.eNS_URI) : CollectiveStructurePackage.eINSTANCE);
		OperationalStructurePackageImpl theOperationalStructurePackage = (OperationalStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) instanceof OperationalStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationalStructurePackage.eNS_URI) : OperationalStructurePackage.eINSTANCE);

		// Create package meta-data objects
		theOntologicalStructurePackage.createPackageContents();
		theMaiaPackage.createPackageContents();
		thePhysicalStructurePackage.createPackageContents();
		theEvaluativeStructurePackage.createPackageContents();
		theConstitutionalStructurePackage.createPackageContents();
		theCollectiveStructurePackage.createPackageContents();
		theOperationalStructurePackage.createPackageContents();

		// Initialize created meta-data
		theOntologicalStructurePackage.initializePackageContents();
		theMaiaPackage.initializePackageContents();
		thePhysicalStructurePackage.initializePackageContents();
		theEvaluativeStructurePackage.initializePackageContents();
		theConstitutionalStructurePackage.initializePackageContents();
		theCollectiveStructurePackage.initializePackageContents();
		theOperationalStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOntologicalStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OntologicalStructurePackage.eNS_URI, theOntologicalStructurePackage);
		return theOntologicalStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologicalStructure() {
		return ontologicalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntologicalStructure_OntologicalConcepts() {
		return (EReference)ontologicalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntologicalStructure_Conditions() {
		return (EReference)ontologicalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntologicalStructure_Properties() {
		return (EReference)ontologicalStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntologicalConcept() {
		return ontologicalConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntologicalConcept_Label() {
		return (EAttribute)ontologicalConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntologicalConcept_URI() {
		return (EAttribute)ontologicalConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Label() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCondition() {
		return logicalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalLangCondition() {
		return naturalLangConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalLangCondition_Statement() {
		return (EAttribute)naturalLangConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathCondition() {
		return mathConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegformula() {
		return negformulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegformula_ConditionStatement() {
		return (EReference)negformulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORformula() {
		return oRformulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORformula_LeftConditionStatement() {
		return (EReference)oRformulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORformula_RightConditionStatement() {
		return (EReference)oRformulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDformula() {
		return anDformulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANDformula_LeftConditionStatement() {
		return (EReference)anDformulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANDformula_RightConditionStatement() {
		return (EReference)anDformulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequalFormula() {
		return equalFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequalFormula_LeftConditionStatement() {
		return (EReference)equalFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getequalFormula_RightConditionStatement() {
		return (EReference)equalFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmoreEqformula() {
		return moreEqformulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmoreEqformula_LeftConditionStatement() {
		return (EReference)moreEqformulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmoreEqformula_RightConditionStatement() {
		return (EReference)moreEqformulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlessformula() {
		return lessformulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlessformula_LeftConditionStatement() {
		return (EReference)lessformulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlessformula_RightConditionStatement() {
		return (EReference)lessformulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Label() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberProperty() {
		return numberPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberProperty_Value() {
		return (EAttribute)numberPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanProperty() {
		return booleanPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanProperty_Value() {
		return (EAttribute)booleanPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringProperty() {
		return stringPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringProperty_Value() {
		return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructureFactory getOntologicalStructureFactory() {
		return (OntologicalStructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ontologicalStructureEClass = createEClass(ONTOLOGICAL_STRUCTURE);
		createEReference(ontologicalStructureEClass, ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS);
		createEReference(ontologicalStructureEClass, ONTOLOGICAL_STRUCTURE__CONDITIONS);
		createEReference(ontologicalStructureEClass, ONTOLOGICAL_STRUCTURE__PROPERTIES);

		ontologicalConceptEClass = createEClass(ONTOLOGICAL_CONCEPT);
		createEAttribute(ontologicalConceptEClass, ONTOLOGICAL_CONCEPT__LABEL);
		createEAttribute(ontologicalConceptEClass, ONTOLOGICAL_CONCEPT__URI);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__LABEL);

		logicalConditionEClass = createEClass(LOGICAL_CONDITION);

		naturalLangConditionEClass = createEClass(NATURAL_LANG_CONDITION);
		createEAttribute(naturalLangConditionEClass, NATURAL_LANG_CONDITION__STATEMENT);

		mathConditionEClass = createEClass(MATH_CONDITION);

		negformulaEClass = createEClass(NEGFORMULA);
		createEReference(negformulaEClass, NEGFORMULA__CONDITION_STATEMENT);

		oRformulaEClass = createEClass(ORFORMULA);
		createEReference(oRformulaEClass, ORFORMULA__LEFT_CONDITION_STATEMENT);
		createEReference(oRformulaEClass, ORFORMULA__RIGHT_CONDITION_STATEMENT);

		anDformulaEClass = createEClass(AN_DFORMULA);
		createEReference(anDformulaEClass, AN_DFORMULA__LEFT_CONDITION_STATEMENT);
		createEReference(anDformulaEClass, AN_DFORMULA__RIGHT_CONDITION_STATEMENT);

		equalFormulaEClass = createEClass(EQUAL_FORMULA);
		createEReference(equalFormulaEClass, EQUAL_FORMULA__LEFT_CONDITION_STATEMENT);
		createEReference(equalFormulaEClass, EQUAL_FORMULA__RIGHT_CONDITION_STATEMENT);

		moreEqformulaEClass = createEClass(MORE_EQFORMULA);
		createEReference(moreEqformulaEClass, MORE_EQFORMULA__LEFT_CONDITION_STATEMENT);
		createEReference(moreEqformulaEClass, MORE_EQFORMULA__RIGHT_CONDITION_STATEMENT);

		lessformulaEClass = createEClass(LESSFORMULA);
		createEReference(lessformulaEClass, LESSFORMULA__LEFT_CONDITION_STATEMENT);
		createEReference(lessformulaEClass, LESSFORMULA__RIGHT_CONDITION_STATEMENT);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__LABEL);

		numberPropertyEClass = createEClass(NUMBER_PROPERTY);
		createEAttribute(numberPropertyEClass, NUMBER_PROPERTY__VALUE);

		booleanPropertyEClass = createEClass(BOOLEAN_PROPERTY);
		createEAttribute(booleanPropertyEClass, BOOLEAN_PROPERTY__VALUE);

		stringPropertyEClass = createEClass(STRING_PROPERTY);
		createEAttribute(stringPropertyEClass, STRING_PROPERTY__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logicalConditionEClass.getESuperTypes().add(this.getCondition());
		naturalLangConditionEClass.getESuperTypes().add(this.getCondition());
		mathConditionEClass.getESuperTypes().add(this.getCondition());
		negformulaEClass.getESuperTypes().add(this.getLogicalCondition());
		oRformulaEClass.getESuperTypes().add(this.getLogicalCondition());
		anDformulaEClass.getESuperTypes().add(this.getLogicalCondition());
		equalFormulaEClass.getESuperTypes().add(this.getMathCondition());
		moreEqformulaEClass.getESuperTypes().add(this.getMathCondition());
		lessformulaEClass.getESuperTypes().add(this.getMathCondition());
		numberPropertyEClass.getESuperTypes().add(this.getProperty());
		booleanPropertyEClass.getESuperTypes().add(this.getProperty());
		stringPropertyEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(ontologicalStructureEClass, OntologicalStructure.class, "OntologicalStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntologicalStructure_OntologicalConcepts(), this.getOntologicalConcept(), null, "ontologicalConcepts", null, 0, -1, OntologicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntologicalStructure_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, OntologicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntologicalStructure_Properties(), this.getProperty(), null, "properties", null, 0, -1, OntologicalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologicalConceptEClass, OntologicalConcept.class, "OntologicalConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologicalConcept_Label(), ecorePackage.getEString(), "label", null, 1, 1, OntologicalConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologicalConcept_URI(), ecorePackage.getEString(), "URI", null, 1, 1, OntologicalConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Label(), ecorePackage.getEString(), "label", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalConditionEClass, LogicalCondition.class, "LogicalCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(naturalLangConditionEClass, NaturalLangCondition.class, "NaturalLangCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaturalLangCondition_Statement(), ecorePackage.getEString(), "statement", null, 1, 1, NaturalLangCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathConditionEClass, MathCondition.class, "MathCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negformulaEClass, Negformula.class, "Negformula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegformula_ConditionStatement(), this.getCondition(), null, "conditionStatement", null, 0, 1, Negformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oRformulaEClass, ORformula.class, "ORformula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getORformula_LeftConditionStatement(), this.getCondition(), null, "leftConditionStatement", null, 1, 1, ORformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getORformula_RightConditionStatement(), this.getCondition(), null, "rightConditionStatement", null, 1, 1, ORformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anDformulaEClass, ANDformula.class, "ANDformula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getANDformula_LeftConditionStatement(), this.getCondition(), null, "leftConditionStatement", null, 1, 1, ANDformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getANDformula_RightConditionStatement(), this.getCondition(), null, "rightConditionStatement", null, 1, 1, ANDformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalFormulaEClass, equalFormula.class, "equalFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getequalFormula_LeftConditionStatement(), this.getCondition(), null, "leftConditionStatement", null, 1, 1, equalFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getequalFormula_RightConditionStatement(), this.getCondition(), null, "rightConditionStatement", null, 1, 1, equalFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moreEqformulaEClass, moreEqformula.class, "moreEqformula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmoreEqformula_LeftConditionStatement(), this.getCondition(), null, "leftConditionStatement", null, 1, 1, moreEqformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmoreEqformula_RightConditionStatement(), this.getCondition(), null, "rightConditionStatement", null, 1, 1, moreEqformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessformulaEClass, lessformula.class, "lessformula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlessformula_LeftConditionStatement(), this.getCondition(), null, "leftConditionStatement", null, 1, 1, lessformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlessformula_RightConditionStatement(), this.getCondition(), null, "rightConditionStatement", null, 1, 1, lessformula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Label(), ecorePackage.getEString(), "label", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberPropertyEClass, NumberProperty.class, "NumberProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberProperty_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumberProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanPropertyEClass, BooleanProperty.class, "BooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanProperty_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //OntologicalStructurePackageImpl
