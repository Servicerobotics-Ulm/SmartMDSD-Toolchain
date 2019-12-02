/**
 */
package org.ecore.component.coordinationExtension.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

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

import org.ecore.component.componentDefinition.Activity;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.componentDefinition.util.ComponentDefinitionSwitch;

import org.ecore.component.coordinationExtension.CoordinationExtensionFactory;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;

import org.ecore.component.coordinationExtension.util.CoordinationExtensionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationExtensionItemProviderAdapterFactory extends CoordinationExtensionAdapterFactory
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
			CoordinationExtensionEditPlugin.INSTANCE, CoordinationExtensionPackage.eNS_URI);

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
	public CoordinationExtensionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.PublicOperationMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicOperationModeItemProvider publicOperationModeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.PublicOperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublicOperationModeAdapter() {
		if (publicOperationModeItemProvider == null) {
			publicOperationModeItemProvider = new PublicOperationModeItemProvider(this);
		}

		return publicOperationModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.PrivateOperationMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateOperationModeItemProvider privateOperationModeItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.PrivateOperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrivateOperationModeAdapter() {
		if (privateOperationModeItemProvider == null) {
			privateOperationModeItemProvider = new PrivateOperationModeItemProvider(this);
		}

		return privateOperationModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.CoordinationSlavePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSlavePortItemProvider coordinationSlavePortItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.CoordinationSlavePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinationSlavePortAdapter() {
		if (coordinationSlavePortItemProvider == null) {
			coordinationSlavePortItemProvider = new CoordinationSlavePortItemProvider(this);
		}

		return coordinationSlavePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.CoordinationMasterPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationMasterPortItemProvider coordinationMasterPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.CoordinationMasterPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinationMasterPortAdapter() {
		if (coordinationMasterPortItemProvider == null) {
			coordinationMasterPortItemProvider = new CoordinationMasterPortItemProvider(this);
		}

		return coordinationMasterPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.OperationModeBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationModeBindingItemProvider operationModeBindingItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.OperationModeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationModeBindingAdapter() {
		if (operationModeBindingItemProvider == null) {
			operationModeBindingItemProvider = new OperationModeBindingItemProvider(this);
		}

		return operationModeBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationServiceUsageRealizationItemProvider communicationServiceUsageRealizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationServiceUsageRealizationAdapter() {
		if (communicationServiceUsageRealizationItemProvider == null) {
			communicationServiceUsageRealizationItemProvider = new CommunicationServiceUsageRealizationItemProvider(
					this);
		}

		return communicationServiceUsageRealizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ecore.component.coordinationExtension.SkillRealizationsRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillRealizationsRefItemProvider skillRealizationsRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.ecore.component.coordinationExtension.SkillRealizationsRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSkillRealizationsRefAdapter() {
		if (skillRealizationsRefItemProvider == null) {
			skillRealizationsRefItemProvider = new SkillRealizationsRefItemProvider(this);
		}

		return skillRealizationsRefItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (publicOperationModeItemProvider != null)
			publicOperationModeItemProvider.dispose();
		if (privateOperationModeItemProvider != null)
			privateOperationModeItemProvider.dispose();
		if (coordinationSlavePortItemProvider != null)
			coordinationSlavePortItemProvider.dispose();
		if (coordinationMasterPortItemProvider != null)
			coordinationMasterPortItemProvider.dispose();
		if (operationModeBindingItemProvider != null)
			operationModeBindingItemProvider.dispose();
		if (communicationServiceUsageRealizationItemProvider != null)
			communicationServiceUsageRealizationItemProvider.dispose();
		if (skillRealizationsRefItemProvider != null)
			skillRealizationsRefItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ComponentDefinitionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ComponentDefinitionChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ComponentDefinitionSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseComponentDefinition(ComponentDefinition object) {
				newChildDescriptors
						.add(createChildParameter(ComponentDefinitionPackage.Literals.COMPONENT_DEFINITION__ELEMENTS,
								CoordinationExtensionFactory.eINSTANCE.createCoordinationSlavePort()));

				newChildDescriptors
						.add(createChildParameter(ComponentDefinitionPackage.Literals.COMPONENT_DEFINITION__ELEMENTS,
								CoordinationExtensionFactory.eINSTANCE.createCoordinationMasterPort()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseActivity(Activity object) {
				newChildDescriptors.add(createChildParameter(ComponentDefinitionPackage.Literals.ACTIVITY__EXTENSIONS,
						CoordinationExtensionFactory.eINSTANCE.createOperationModeBinding()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return CoordinationExtensionEditPlugin.INSTANCE;
		}
	}

}
