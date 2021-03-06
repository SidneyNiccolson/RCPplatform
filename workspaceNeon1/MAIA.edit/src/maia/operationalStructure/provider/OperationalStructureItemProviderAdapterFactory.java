/**
 */
package maia.operationalStructure.provider;

import java.util.ArrayList;
import java.util.Collection;

import maia.operationalStructure.util.OperationalStructureAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalStructureItemProviderAdapterFactory extends OperationalStructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.ActionBody} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBodyItemProvider actionBodyItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.ActionBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionBodyAdapter() {
		if (actionBodyItemProvider == null) {
			actionBodyItemProvider = new ActionBodyItemProvider(this);
		}

		return actionBodyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.EntityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityActionItemProvider entityActionItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.EntityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityActionAdapter() {
		if (entityActionItemProvider == null) {
			entityActionItemProvider = new EntityActionItemProvider(this);
		}

		return entityActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.ActionSituation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSituationItemProvider actionSituationItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.ActionSituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionSituationAdapter() {
		if (actionSituationItemProvider == null) {
			actionSituationItemProvider = new ActionSituationItemProvider(this);
		}

		return actionSituationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.ActionArena} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionArenaItemProvider actionArenaItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.ActionArena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionArenaAdapter() {
		if (actionArenaItemProvider == null) {
			actionArenaItemProvider = new ActionArenaItemProvider(this);
		}

		return actionArenaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.RoleEnactment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleEnactmentItemProvider roleEnactmentItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.RoleEnactment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleEnactmentAdapter() {
		if (roleEnactmentItemProvider == null) {
			roleEnactmentItemProvider = new RoleEnactmentItemProvider(this);
		}

		return roleEnactmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.PlanSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanSequenceItemProvider planSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.PlanSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanSequenceAdapter() {
		if (planSequenceItemProvider == null) {
			planSequenceItemProvider = new PlanSequenceItemProvider(this);
		}

		return planSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.PlanAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanAlternativeItemProvider planAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.PlanAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanAlternativeAdapter() {
		if (planAlternativeItemProvider == null) {
			planAlternativeItemProvider = new PlanAlternativeItemProvider(this);
		}

		return planAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.PlanLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanLoopItemProvider planLoopItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.PlanLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanLoopAdapter() {
		if (planLoopItemProvider == null) {
			planLoopItemProvider = new PlanLoopItemProvider(this);
		}

		return planLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.OperationalStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalStructureItemProvider operationalStructureItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.OperationalStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalStructureAdapter() {
		if (operationalStructureItemProvider == null) {
			operationalStructureItemProvider = new OperationalStructureItemProvider(this);
		}

		return operationalStructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.Performer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformerItemProvider performerItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.Performer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformerAdapter() {
		if (performerItemProvider == null) {
			performerItemProvider = new PerformerItemProvider(this);
		}

		return performerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.operationalStructure.PlanCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanConditionItemProvider planConditionItemProvider;

	/**
	 * This creates an adapter for a {@link maia.operationalStructure.PlanCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanConditionAdapter() {
		if (planConditionItemProvider == null) {
			planConditionItemProvider = new PlanConditionItemProvider(this);
		}

		return planConditionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (actionBodyItemProvider != null) actionBodyItemProvider.dispose();
		if (entityActionItemProvider != null) entityActionItemProvider.dispose();
		if (actionSituationItemProvider != null) actionSituationItemProvider.dispose();
		if (actionArenaItemProvider != null) actionArenaItemProvider.dispose();
		if (roleEnactmentItemProvider != null) roleEnactmentItemProvider.dispose();
		if (planSequenceItemProvider != null) planSequenceItemProvider.dispose();
		if (planAlternativeItemProvider != null) planAlternativeItemProvider.dispose();
		if (planLoopItemProvider != null) planLoopItemProvider.dispose();
		if (operationalStructureItemProvider != null) operationalStructureItemProvider.dispose();
		if (performerItemProvider != null) performerItemProvider.dispose();
		if (planConditionItemProvider != null) planConditionItemProvider.dispose();
	}

}
