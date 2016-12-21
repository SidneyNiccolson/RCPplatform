/**
 */
package maia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maia.MaiaPackage
 * @generated
 */
public interface MaiaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaiaFactory eINSTANCE = maia.impl.MaiaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MAIA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAIA</em>'.
	 * @generated
	 */
	MAIA createMAIA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaiaPackage getMaiaPackage();

} //MaiaFactory
