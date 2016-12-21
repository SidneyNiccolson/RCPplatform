/**
 */
package maia.provider;


import java.util.Collection;
import java.util.List;

import maia.MAIA;
import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructureFactory;

import maia.constitutionalStructure.ConstitutionalStructureFactory;

import maia.evaluativeStructure.EvaluativeStructureFactory;

import maia.ontologicalStructure.OntologicalStructureFactory;

import maia.operationalStructure.OperationalStructureFactory;

import maia.physicalStructure.PhysicalStructureFactory;

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
 * This is the item provider adapter for a {@link maia.MAIA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MAIAItemProvider 
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
	public MAIAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MaiaPackage.Literals.MAIA__CONSTITUTIONAL_STRUCTURE);
			childrenFeatures.add(MaiaPackage.Literals.MAIA__COLLECTIVE_STRUCTURE);
			childrenFeatures.add(MaiaPackage.Literals.MAIA__PHYSICAL_STRUCTURE);
			childrenFeatures.add(MaiaPackage.Literals.MAIA__OPERATIONAL_STRUCTURE);
			childrenFeatures.add(MaiaPackage.Literals.MAIA__EVALUATIVE_STRUCTURE);
			childrenFeatures.add(MaiaPackage.Literals.MAIA__ONTOLOGICAL_STRUCTURE);
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
	 * This returns MAIA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MAIA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MAIA_type");
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

		switch (notification.getFeatureID(MAIA.class)) {
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
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
				(MaiaPackage.Literals.MAIA__CONSTITUTIONAL_STRUCTURE,
				 ConstitutionalStructureFactory.eINSTANCE.createConstitutionalStructure()));

		newChildDescriptors.add
			(createChildParameter
				(MaiaPackage.Literals.MAIA__COLLECTIVE_STRUCTURE,
				 CollectiveStructureFactory.eINSTANCE.createCollectiveStructure()));

		newChildDescriptors.add
			(createChildParameter
				(MaiaPackage.Literals.MAIA__PHYSICAL_STRUCTURE,
				 PhysicalStructureFactory.eINSTANCE.createPhysicalStructure()));

		newChildDescriptors.add
			(createChildParameter
				(MaiaPackage.Literals.MAIA__OPERATIONAL_STRUCTURE,
				 OperationalStructureFactory.eINSTANCE.createOperationalStructure()));

		newChildDescriptors.add
			(createChildParameter
				(MaiaPackage.Literals.MAIA__EVALUATIVE_STRUCTURE,
				 EvaluativeStructureFactory.eINSTANCE.createEvaluativeStructure()));

		newChildDescriptors.add
			(createChildParameter
				(MaiaPackage.Literals.MAIA__ONTOLOGICAL_STRUCTURE,
				 OntologicalStructureFactory.eINSTANCE.createOntologicalStructure()));
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
