/**
 */
package maia.ontologicalStructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see maia.ontologicalStructure.OntologicalStructureFactory
 * @model kind="package"
 * @generated
 */
public interface OntologicalStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ontologicalStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maia/ontologicalStructure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ontologicalStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntologicalStructurePackage eINSTANCE = maia.ontologicalStructure.impl.OntologicalStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.OntologicalStructureImpl <em>Ontological Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.OntologicalStructureImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getOntologicalStructure()
	 * @generated
	 */
	int ONTOLOGICAL_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Ontological Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_STRUCTURE__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_STRUCTURE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Ontological Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ontological Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.OntologicalConceptImpl <em>Ontological Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.OntologicalConceptImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getOntologicalConcept()
	 * @generated
	 */
	int ONTOLOGICAL_CONCEPT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT__URI = 1;

	/**
	 * The number of structural features of the '<em>Ontological Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ontological Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGICAL_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.ConditionImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.LogicalConditionImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getLogicalCondition()
	 * @generated
	 */
	int LOGICAL_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__LABEL = CONDITION__LABEL;

	/**
	 * The number of structural features of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.NaturalLangConditionImpl <em>Natural Lang Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.NaturalLangConditionImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNaturalLangCondition()
	 * @generated
	 */
	int NATURAL_LANG_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANG_CONDITION__LABEL = CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANG_CONDITION__STATEMENT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Natural Lang Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANG_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Natural Lang Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANG_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.MathConditionImpl <em>Math Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.MathConditionImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getMathCondition()
	 * @generated
	 */
	int MATH_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_CONDITION__LABEL = CONDITION__LABEL;

	/**
	 * The number of structural features of the '<em>Math Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Math Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.NegformulaImpl <em>Negformula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.NegformulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNegformula()
	 * @generated
	 */
	int NEGFORMULA = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGFORMULA__LABEL = LOGICAL_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGFORMULA__CONDITION_STATEMENT = LOGICAL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGFORMULA_FEATURE_COUNT = LOGICAL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGFORMULA_OPERATION_COUNT = LOGICAL_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.ORformulaImpl <em>ORformula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.ORformulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getORformula()
	 * @generated
	 */
	int ORFORMULA = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORFORMULA__LABEL = LOGICAL_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORFORMULA__LEFT_CONDITION_STATEMENT = LOGICAL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORFORMULA__RIGHT_CONDITION_STATEMENT = LOGICAL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ORformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORFORMULA_FEATURE_COUNT = LOGICAL_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ORformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORFORMULA_OPERATION_COUNT = LOGICAL_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.ANDformulaImpl <em>AN Dformula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.ANDformulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getANDformula()
	 * @generated
	 */
	int AN_DFORMULA = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DFORMULA__LABEL = LOGICAL_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DFORMULA__LEFT_CONDITION_STATEMENT = LOGICAL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DFORMULA__RIGHT_CONDITION_STATEMENT = LOGICAL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AN Dformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DFORMULA_FEATURE_COUNT = LOGICAL_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AN Dformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DFORMULA_OPERATION_COUNT = LOGICAL_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.equalFormulaImpl <em>equal Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.equalFormulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getequalFormula()
	 * @generated
	 */
	int EQUAL_FORMULA = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FORMULA__LABEL = MATH_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FORMULA__LEFT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FORMULA__RIGHT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>equal Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FORMULA_FEATURE_COUNT = MATH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>equal Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FORMULA_OPERATION_COUNT = MATH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.moreEqformulaImpl <em>more Eqformula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.moreEqformulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getmoreEqformula()
	 * @generated
	 */
	int MORE_EQFORMULA = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_EQFORMULA__LABEL = MATH_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_EQFORMULA__LEFT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_EQFORMULA__RIGHT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>more Eqformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_EQFORMULA_FEATURE_COUNT = MATH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>more Eqformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_EQFORMULA_OPERATION_COUNT = MATH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.lessformulaImpl <em>lessformula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.lessformulaImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getlessformula()
	 * @generated
	 */
	int LESSFORMULA = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSFORMULA__LABEL = MATH_CONDITION__LABEL;

	/**
	 * The feature id for the '<em><b>Left Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSFORMULA__LEFT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Condition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSFORMULA__RIGHT_CONDITION_STATEMENT = MATH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>lessformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSFORMULA_FEATURE_COUNT = MATH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>lessformula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSFORMULA_OPERATION_COUNT = MATH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.PropertyImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.NumberPropertyImpl <em>Number Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.NumberPropertyImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNumberProperty()
	 * @generated
	 */
	int NUMBER_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__LABEL = PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.BooleanPropertyImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getBooleanProperty()
	 * @generated
	 */
	int BOOLEAN_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__LABEL = PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maia.ontologicalStructure.impl.StringPropertyImpl <em>String Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maia.ontologicalStructure.impl.StringPropertyImpl
	 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getStringProperty()
	 * @generated
	 */
	int STRING_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__LABEL = PROPERTY__LABEL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.OntologicalStructure <em>Ontological Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontological Structure</em>'.
	 * @see maia.ontologicalStructure.OntologicalStructure
	 * @generated
	 */
	EClass getOntologicalStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.ontologicalStructure.OntologicalStructure#getOntologicalConcepts <em>Ontological Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontological Concepts</em>'.
	 * @see maia.ontologicalStructure.OntologicalStructure#getOntologicalConcepts()
	 * @see #getOntologicalStructure()
	 * @generated
	 */
	EReference getOntologicalStructure_OntologicalConcepts();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.ontologicalStructure.OntologicalStructure#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see maia.ontologicalStructure.OntologicalStructure#getConditions()
	 * @see #getOntologicalStructure()
	 * @generated
	 */
	EReference getOntologicalStructure_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link maia.ontologicalStructure.OntologicalStructure#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see maia.ontologicalStructure.OntologicalStructure#getProperties()
	 * @see #getOntologicalStructure()
	 * @generated
	 */
	EReference getOntologicalStructure_Properties();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.OntologicalConcept <em>Ontological Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontological Concept</em>'.
	 * @see maia.ontologicalStructure.OntologicalConcept
	 * @generated
	 */
	EClass getOntologicalConcept();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.OntologicalConcept#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.ontologicalStructure.OntologicalConcept#getLabel()
	 * @see #getOntologicalConcept()
	 * @generated
	 */
	EAttribute getOntologicalConcept_Label();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.OntologicalConcept#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see maia.ontologicalStructure.OntologicalConcept#getURI()
	 * @see #getOntologicalConcept()
	 * @generated
	 */
	EAttribute getOntologicalConcept_URI();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see maia.ontologicalStructure.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.Condition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.ontologicalStructure.Condition#getLabel()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Label();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Condition</em>'.
	 * @see maia.ontologicalStructure.LogicalCondition
	 * @generated
	 */
	EClass getLogicalCondition();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.NaturalLangCondition <em>Natural Lang Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Lang Condition</em>'.
	 * @see maia.ontologicalStructure.NaturalLangCondition
	 * @generated
	 */
	EClass getNaturalLangCondition();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.NaturalLangCondition#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see maia.ontologicalStructure.NaturalLangCondition#getStatement()
	 * @see #getNaturalLangCondition()
	 * @generated
	 */
	EAttribute getNaturalLangCondition_Statement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.MathCondition <em>Math Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Condition</em>'.
	 * @see maia.ontologicalStructure.MathCondition
	 * @generated
	 */
	EClass getMathCondition();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.Negformula <em>Negformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negformula</em>'.
	 * @see maia.ontologicalStructure.Negformula
	 * @generated
	 */
	EClass getNegformula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.Negformula#getConditionStatement <em>Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition Statement</em>'.
	 * @see maia.ontologicalStructure.Negformula#getConditionStatement()
	 * @see #getNegformula()
	 * @generated
	 */
	EReference getNegformula_ConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.ORformula <em>ORformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORformula</em>'.
	 * @see maia.ontologicalStructure.ORformula
	 * @generated
	 */
	EClass getORformula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.ORformula#getLeftConditionStatement <em>Left Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Condition Statement</em>'.
	 * @see maia.ontologicalStructure.ORformula#getLeftConditionStatement()
	 * @see #getORformula()
	 * @generated
	 */
	EReference getORformula_LeftConditionStatement();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.ORformula#getRightConditionStatement <em>Right Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Condition Statement</em>'.
	 * @see maia.ontologicalStructure.ORformula#getRightConditionStatement()
	 * @see #getORformula()
	 * @generated
	 */
	EReference getORformula_RightConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.ANDformula <em>AN Dformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AN Dformula</em>'.
	 * @see maia.ontologicalStructure.ANDformula
	 * @generated
	 */
	EClass getANDformula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.ANDformula#getLeftConditionStatement <em>Left Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Condition Statement</em>'.
	 * @see maia.ontologicalStructure.ANDformula#getLeftConditionStatement()
	 * @see #getANDformula()
	 * @generated
	 */
	EReference getANDformula_LeftConditionStatement();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.ANDformula#getRightConditionStatement <em>Right Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Condition Statement</em>'.
	 * @see maia.ontologicalStructure.ANDformula#getRightConditionStatement()
	 * @see #getANDformula()
	 * @generated
	 */
	EReference getANDformula_RightConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.equalFormula <em>equal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equal Formula</em>'.
	 * @see maia.ontologicalStructure.equalFormula
	 * @generated
	 */
	EClass getequalFormula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.equalFormula#getLeftConditionStatement <em>Left Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Condition Statement</em>'.
	 * @see maia.ontologicalStructure.equalFormula#getLeftConditionStatement()
	 * @see #getequalFormula()
	 * @generated
	 */
	EReference getequalFormula_LeftConditionStatement();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.equalFormula#getRightConditionStatement <em>Right Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Condition Statement</em>'.
	 * @see maia.ontologicalStructure.equalFormula#getRightConditionStatement()
	 * @see #getequalFormula()
	 * @generated
	 */
	EReference getequalFormula_RightConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.moreEqformula <em>more Eqformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>more Eqformula</em>'.
	 * @see maia.ontologicalStructure.moreEqformula
	 * @generated
	 */
	EClass getmoreEqformula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.moreEqformula#getLeftConditionStatement <em>Left Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Condition Statement</em>'.
	 * @see maia.ontologicalStructure.moreEqformula#getLeftConditionStatement()
	 * @see #getmoreEqformula()
	 * @generated
	 */
	EReference getmoreEqformula_LeftConditionStatement();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.moreEqformula#getRightConditionStatement <em>Right Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Condition Statement</em>'.
	 * @see maia.ontologicalStructure.moreEqformula#getRightConditionStatement()
	 * @see #getmoreEqformula()
	 * @generated
	 */
	EReference getmoreEqformula_RightConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.lessformula <em>lessformula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>lessformula</em>'.
	 * @see maia.ontologicalStructure.lessformula
	 * @generated
	 */
	EClass getlessformula();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.lessformula#getLeftConditionStatement <em>Left Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Condition Statement</em>'.
	 * @see maia.ontologicalStructure.lessformula#getLeftConditionStatement()
	 * @see #getlessformula()
	 * @generated
	 */
	EReference getlessformula_LeftConditionStatement();

	/**
	 * Returns the meta object for the reference '{@link maia.ontologicalStructure.lessformula#getRightConditionStatement <em>Right Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Condition Statement</em>'.
	 * @see maia.ontologicalStructure.lessformula#getRightConditionStatement()
	 * @see #getlessformula()
	 * @generated
	 */
	EReference getlessformula_RightConditionStatement();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see maia.ontologicalStructure.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.Property#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see maia.ontologicalStructure.Property#getLabel()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Label();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.NumberProperty <em>Number Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Property</em>'.
	 * @see maia.ontologicalStructure.NumberProperty
	 * @generated
	 */
	EClass getNumberProperty();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.NumberProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maia.ontologicalStructure.NumberProperty#getValue()
	 * @see #getNumberProperty()
	 * @generated
	 */
	EAttribute getNumberProperty_Value();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.BooleanProperty <em>Boolean Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Property</em>'.
	 * @see maia.ontologicalStructure.BooleanProperty
	 * @generated
	 */
	EClass getBooleanProperty();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.BooleanProperty#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maia.ontologicalStructure.BooleanProperty#isValue()
	 * @see #getBooleanProperty()
	 * @generated
	 */
	EAttribute getBooleanProperty_Value();

	/**
	 * Returns the meta object for class '{@link maia.ontologicalStructure.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Property</em>'.
	 * @see maia.ontologicalStructure.StringProperty
	 * @generated
	 */
	EClass getStringProperty();

	/**
	 * Returns the meta object for the attribute '{@link maia.ontologicalStructure.StringProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see maia.ontologicalStructure.StringProperty#getValue()
	 * @see #getStringProperty()
	 * @generated
	 */
	EAttribute getStringProperty_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntologicalStructureFactory getOntologicalStructureFactory();

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
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.OntologicalStructureImpl <em>Ontological Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.OntologicalStructureImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getOntologicalStructure()
		 * @generated
		 */
		EClass ONTOLOGICAL_STRUCTURE = eINSTANCE.getOntologicalStructure();

		/**
		 * The meta object literal for the '<em><b>Ontological Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_STRUCTURE__ONTOLOGICAL_CONCEPTS = eINSTANCE.getOntologicalStructure_OntologicalConcepts();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_STRUCTURE__CONDITIONS = eINSTANCE.getOntologicalStructure_Conditions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGICAL_STRUCTURE__PROPERTIES = eINSTANCE.getOntologicalStructure_Properties();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.OntologicalConceptImpl <em>Ontological Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.OntologicalConceptImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getOntologicalConcept()
		 * @generated
		 */
		EClass ONTOLOGICAL_CONCEPT = eINSTANCE.getOntologicalConcept();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_CONCEPT__LABEL = eINSTANCE.getOntologicalConcept_Label();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGICAL_CONCEPT__URI = eINSTANCE.getOntologicalConcept_URI();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.ConditionImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__LABEL = eINSTANCE.getCondition_Label();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.LogicalConditionImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getLogicalCondition()
		 * @generated
		 */
		EClass LOGICAL_CONDITION = eINSTANCE.getLogicalCondition();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.NaturalLangConditionImpl <em>Natural Lang Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.NaturalLangConditionImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNaturalLangCondition()
		 * @generated
		 */
		EClass NATURAL_LANG_CONDITION = eINSTANCE.getNaturalLangCondition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_LANG_CONDITION__STATEMENT = eINSTANCE.getNaturalLangCondition_Statement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.MathConditionImpl <em>Math Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.MathConditionImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getMathCondition()
		 * @generated
		 */
		EClass MATH_CONDITION = eINSTANCE.getMathCondition();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.NegformulaImpl <em>Negformula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.NegformulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNegformula()
		 * @generated
		 */
		EClass NEGFORMULA = eINSTANCE.getNegformula();

		/**
		 * The meta object literal for the '<em><b>Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGFORMULA__CONDITION_STATEMENT = eINSTANCE.getNegformula_ConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.ORformulaImpl <em>ORformula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.ORformulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getORformula()
		 * @generated
		 */
		EClass ORFORMULA = eINSTANCE.getORformula();

		/**
		 * The meta object literal for the '<em><b>Left Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORFORMULA__LEFT_CONDITION_STATEMENT = eINSTANCE.getORformula_LeftConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Right Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORFORMULA__RIGHT_CONDITION_STATEMENT = eINSTANCE.getORformula_RightConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.ANDformulaImpl <em>AN Dformula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.ANDformulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getANDformula()
		 * @generated
		 */
		EClass AN_DFORMULA = eINSTANCE.getANDformula();

		/**
		 * The meta object literal for the '<em><b>Left Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_DFORMULA__LEFT_CONDITION_STATEMENT = eINSTANCE.getANDformula_LeftConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Right Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_DFORMULA__RIGHT_CONDITION_STATEMENT = eINSTANCE.getANDformula_RightConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.equalFormulaImpl <em>equal Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.equalFormulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getequalFormula()
		 * @generated
		 */
		EClass EQUAL_FORMULA = eINSTANCE.getequalFormula();

		/**
		 * The meta object literal for the '<em><b>Left Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUAL_FORMULA__LEFT_CONDITION_STATEMENT = eINSTANCE.getequalFormula_LeftConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Right Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUAL_FORMULA__RIGHT_CONDITION_STATEMENT = eINSTANCE.getequalFormula_RightConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.moreEqformulaImpl <em>more Eqformula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.moreEqformulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getmoreEqformula()
		 * @generated
		 */
		EClass MORE_EQFORMULA = eINSTANCE.getmoreEqformula();

		/**
		 * The meta object literal for the '<em><b>Left Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_EQFORMULA__LEFT_CONDITION_STATEMENT = eINSTANCE.getmoreEqformula_LeftConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Right Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_EQFORMULA__RIGHT_CONDITION_STATEMENT = eINSTANCE.getmoreEqformula_RightConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.lessformulaImpl <em>lessformula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.lessformulaImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getlessformula()
		 * @generated
		 */
		EClass LESSFORMULA = eINSTANCE.getlessformula();

		/**
		 * The meta object literal for the '<em><b>Left Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESSFORMULA__LEFT_CONDITION_STATEMENT = eINSTANCE.getlessformula_LeftConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Right Condition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESSFORMULA__RIGHT_CONDITION_STATEMENT = eINSTANCE.getlessformula_RightConditionStatement();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.PropertyImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LABEL = eINSTANCE.getProperty_Label();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.NumberPropertyImpl <em>Number Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.NumberPropertyImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getNumberProperty()
		 * @generated
		 */
		EClass NUMBER_PROPERTY = eINSTANCE.getNumberProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY__VALUE = eINSTANCE.getNumberProperty_Value();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.BooleanPropertyImpl <em>Boolean Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.BooleanPropertyImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getBooleanProperty()
		 * @generated
		 */
		EClass BOOLEAN_PROPERTY = eINSTANCE.getBooleanProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PROPERTY__VALUE = eINSTANCE.getBooleanProperty_Value();

		/**
		 * The meta object literal for the '{@link maia.ontologicalStructure.impl.StringPropertyImpl <em>String Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maia.ontologicalStructure.impl.StringPropertyImpl
		 * @see maia.ontologicalStructure.impl.OntologicalStructurePackageImpl#getStringProperty()
		 * @generated
		 */
		EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PROPERTY__VALUE = eINSTANCE.getStringProperty_Value();

	}

} //OntologicalStructurePackage
