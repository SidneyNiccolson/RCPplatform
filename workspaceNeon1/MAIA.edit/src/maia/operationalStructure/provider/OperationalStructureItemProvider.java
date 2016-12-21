/**
 */
package maia.operationalStructure.provider;


import java.util.Collection;
import java.util.List;

import maia.operationalStructure.OperationalStructure;
import maia.operationalStructure.OperationalStructureFactory;
import maia.operationalStructure.OperationalStructurePackage;

import maia.provider.MaiaNewEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link maia.operationalStructure.OperationalStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalStructureItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS);
			childrenFeatures.add(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTIONSITUATION);
			childrenFeatures.add(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_ARENA);
			childrenFeatures.add(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS);
			childrenFeatures.add(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OperationalStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationalStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_OperationalStructure_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OperationalStructure.class)) {
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_PLANS:
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTIONSITUATION:
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_ARENA:
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS:
			case OperationalStructurePackage.OPERATIONAL_STRUCTURE__ACTION_BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS,
				 OperationalStructureFactory.eINSTANCE.createEntityAction()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS,
				 OperationalStructureFactory.eINSTANCE.createPlanSequence()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS,
				 OperationalStructureFactory.eINSTANCE.createPlanAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS,
				 OperationalStructureFactory.eINSTANCE.createPlanLoop()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_PLANS,
				 OperationalStructureFactory.eINSTANCE.createPlanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTIONSITUATION,
				 OperationalStructureFactory.eINSTANCE.createActionSituation()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_ARENA,
				 OperationalStructureFactory.eINSTANCE.createActionArena()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ROLE_ENACTMENTS,
				 OperationalStructureFactory.eINSTANCE.createRoleEnactment()));

		newChildDescriptors.add
			(createChildParameter
				(OperationalStructurePackage.Literals.OPERATIONAL_STRUCTURE__ACTION_BODY,
				 OperationalStructureFactory.eINSTANCE.createActionBody()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MaiaNewEditPlugin.INSTANCE;
	}

}
