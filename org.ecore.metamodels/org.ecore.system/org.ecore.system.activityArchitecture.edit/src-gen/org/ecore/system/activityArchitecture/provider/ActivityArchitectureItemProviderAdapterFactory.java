/**
 */
package org.ecore.system.activityArchitecture.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.ecore.system.activityArchitecture.util.ActivityArchitectureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityArchitectureItemProviderAdapterFactory extends ActivityArchitectureAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			ActivityArchitectureEditPlugin.INSTANCE, ActivityArchitecturePackage.eNS_URI);

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
	public ActivityArchitectureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.ActivityArchitectureModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityArchitectureModelItemProvider activityArchitectureModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.ActivityArchitectureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityArchitectureModelAdapter() {
		if (activityArchitectureModelItemProvider == null) {
			activityArchitectureModelItemProvider = new ActivityArchitectureModelItemProvider(this);
		}

		return activityArchitectureModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.ActivityNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeItemProvider activityNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityNodeAdapter() {
		if (activityNodeItemProvider == null) {
			activityNodeItemProvider = new ActivityNodeItemProvider(this);
		}

		return activityNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.InputHandlerNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputHandlerNodeItemProvider inputHandlerNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.InputHandlerNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputHandlerNodeAdapter() {
		if (inputHandlerNodeItemProvider == null) {
			inputHandlerNodeItemProvider = new InputHandlerNodeItemProvider(this);
		}

		return inputHandlerNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.RegisterInputNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterInputNodeItemProvider registerInputNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.RegisterInputNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisterInputNodeAdapter() {
		if (registerInputNodeItemProvider == null) {
			registerInputNodeItemProvider = new RegisterInputNodeItemProvider(this);
		}

		return registerInputNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.TriggerInputNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerInputNodeItemProvider triggerInputNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.TriggerInputNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerInputNodeAdapter() {
		if (triggerInputNodeItemProvider == null) {
			triggerInputNodeItemProvider = new TriggerInputNodeItemProvider(this);
		}

		return triggerInputNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.DataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFlowAdapter() {
		if (dataFlowItemProvider == null) {
			dataFlowItemProvider = new DataFlowItemProvider(this);
		}

		return dataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.Sporadic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicItemProvider sporadicItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.Sporadic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSporadicAdapter() {
		if (sporadicItemProvider == null) {
			sporadicItemProvider = new SporadicItemProvider(this);
		}

		return sporadicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.DataTriggered} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTriggeredItemProvider dataTriggeredItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.DataTriggered}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTriggeredAdapter() {
		if (dataTriggeredItemProvider == null) {
			dataTriggeredItemProvider = new DataTriggeredItemProvider(this);
		}

		return dataTriggeredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.PeriodicTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicTimerItemProvider periodicTimerItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.PeriodicTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeriodicTimerAdapter() {
		if (periodicTimerItemProvider == null) {
			periodicTimerItemProvider = new PeriodicTimerItemProvider(this);
		}

		return periodicTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.CPUCore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUCoreItemProvider cpuCoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.CPUCore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCPUCoreAdapter() {
		if (cpuCoreItemProvider == null) {
			cpuCoreItemProvider = new CPUCoreItemProvider(this);
		}

		return cpuCoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.Scheduler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerItemProvider schedulerItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.Scheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulerAdapter() {
		if (schedulerItemProvider == null) {
			schedulerItemProvider = new SchedulerItemProvider(this);
		}

		return schedulerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.ExecutionTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTimeItemProvider executionTimeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.ExecutionTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionTimeAdapter() {
		if (executionTimeItemProvider == null) {
			executionTimeItemProvider = new ExecutionTimeItemProvider(this);
		}

		return executionTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.system.activityArchitecture.TimeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueItemProvider timeValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.system.activityArchitecture.TimeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeValueAdapter() {
		if (timeValueItemProvider == null) {
			timeValueItemProvider = new TimeValueItemProvider(this);
		}

		return timeValueItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
		if (activityArchitectureModelItemProvider != null)
			activityArchitectureModelItemProvider.dispose();
		if (activityNodeItemProvider != null)
			activityNodeItemProvider.dispose();
		if (inputHandlerNodeItemProvider != null)
			inputHandlerNodeItemProvider.dispose();
		if (registerInputNodeItemProvider != null)
			registerInputNodeItemProvider.dispose();
		if (triggerInputNodeItemProvider != null)
			triggerInputNodeItemProvider.dispose();
		if (dataFlowItemProvider != null)
			dataFlowItemProvider.dispose();
		if (sporadicItemProvider != null)
			sporadicItemProvider.dispose();
		if (dataTriggeredItemProvider != null)
			dataTriggeredItemProvider.dispose();
		if (periodicTimerItemProvider != null)
			periodicTimerItemProvider.dispose();
		if (cpuCoreItemProvider != null)
			cpuCoreItemProvider.dispose();
		if (schedulerItemProvider != null)
			schedulerItemProvider.dispose();
		if (executionTimeItemProvider != null)
			executionTimeItemProvider.dispose();
		if (timeValueItemProvider != null)
			timeValueItemProvider.dispose();
	}

}
