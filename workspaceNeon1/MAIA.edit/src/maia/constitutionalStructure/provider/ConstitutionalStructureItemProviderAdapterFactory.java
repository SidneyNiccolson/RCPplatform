/**
 */
package maia.constitutionalStructure.provider;

import java.util.ArrayList;
import java.util.Collection;

import maia.constitutionalStructure.util.ConstitutionalStructureAdapterFactory;

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
public class ConstitutionalStructureItemProviderAdapterFactory extends ConstitutionalStructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ConstitutionalStructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.SharedStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedStrategyItemProvider sharedStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.SharedStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSharedStrategyAdapter() {
		if (sharedStrategyItemProvider == null) {
			sharedStrategyItemProvider = new SharedStrategyItemProvider(this);
		}

		return sharedStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.Norm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormItemProvider normItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.Norm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormAdapter() {
		if (normItemProvider == null) {
			normItemProvider = new NormItemProvider(this);
		}

		return normItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.Objective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveItemProvider objectiveItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectiveAdapter() {
		if (objectiveItemProvider == null) {
			objectiveItemProvider = new ObjectiveItemProvider(this);
		}

		return objectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link maia.constitutionalStructure.ConstitutionalStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstitutionalStructureItemProvider constitutionalStructureItemProvider;

	/**
	 * This creates an adapter for a {@link maia.constitutionalStructure.ConstitutionalStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstitutionalStructureAdapter() {
		if (constitutionalStructureItemProvider == null) {
			constitutionalStructureItemProvider = new ConstitutionalStructureItemProvider(this);
		}

		return constitutionalStructureItemProvider;
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
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (sharedStrategyItemProvider != null) sharedStrategyItemProvider.dispose();
		if (normItemProvider != null) normItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (dependencyItemProvider != null) dependencyItemProvider.dispose();
		if (objectiveItemProvider != null) objectiveItemProvider.dispose();
		if (constitutionalStructureItemProvider != null) constitutionalStructureItemProvider.dispose();
	}

}