//================================================================
//
//  Copyright (C) 2016 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.eclipse.smartmdsd.sirius.component.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;
import org.eclipse.smartmdsd.ecore.base.mixedport.MixedportPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionFactory;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware;
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeCollection;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewareFactory;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.eclipse.smartmdsd.sirius.utils.DiagramHelperServices;
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator;
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.internal.ServiceDefinitionActivator;

import com.google.inject.Injector;

/**
 * The services class used by VSM.
 */
public class Services {
//	@Inject XtextResourceIndex index;
	
	public EObject print(EObject context) {
		System.out.println("context: "+context);
		return context;
	}
	
	public EObject importModels(EObject context) {
		DiagramHelperServices.triggerModelImportCommand();
		return context;
	}
	
	public Boolean hasLogo(EObject context) {
		if(context instanceof ComponentDefinition) {
			ComponentDefinition component = (ComponentDefinition)context;
			if(component.getLogo() != null) {
				String logoString = component.getLogo();
				IPath logoPath = new Path(logoString);
				IFile logoFile = ResourcesPlugin.getWorkspace().getRoot().getFile(logoPath);
				if(logoFile.exists()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String getDocumentationString(EObject context) {
		String text = context.eClass().getName();
		Object name_atribute = context.eGet(context.eClass().getEStructuralFeature("name"));
		if(name_atribute instanceof String) {
			String name = (String)name_atribute;
			text = text + ": " + name + "\n";
		} else {
			text = text + "\n";
		}
		if(context instanceof AbstractDocumentationElement) {
			AbstractDocumentationElement docu = (AbstractDocumentationElement)context;
			String short_description = docu.getFirstDocumentationLine();
			if(!short_description.isEmpty()) {
				text = text + short_description;
			}
		}
		return text;
	}
	
    public String getProjectName(EObject obj) {
    	return DiagramHelperServices.getProjectName(obj);
    }
    
    public String openXmlFileDialog(EObject context) {
    	// get the current project from context
    	Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    	IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
    	String currentProjectName = context.eResource().getURI().segment(1);
    	IProject currentProject = workspaceRoot.getProject(currentProjectName);

    	// we are not using the absolute file path (but a workspace related path, see below)
//    	FileDialog dialog = new FileDialog(shell, SWT.OPEN);
//    	dialog.setFilterExtensions(new String [] {"*.xml"});
////    	dialog.setFilterPath("/home");
//    	String result = dialog.open();
//    	if(result != null) {
//    		if(context instanceof OpcUaDeviceClient) {
//    			OpcUaDeviceClient client = (OpcUaDeviceClient)context;
//    			client.setOpcuaXmlFile(result);
//    		}
//    	}
//    	return result;
    	
    	// collect XML files from within the project's model folder
    	List<IResource> elements = new ArrayList<IResource>();
    	String fileExtension = "xml";
    	String modelFolderName = "model";
    	IFolder modelFolder = currentProject.getFolder(modelFolderName);
    	try {
			for(IResource member: modelFolder.members()) {
				if(member instanceof IFile) {
					IFile modelFile = (IFile)member;
					if(modelFile.getFileExtension().equals(fileExtension)) {
						elements.add(modelFile);
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	// create and open the XML file selection dialog
		ILabelProvider labelProvider = new WorkbenchLabelProvider();
		boolean multipleSelection = false;
		String dialogMessage = "Select XML file containing the device's OPC UA Information Model";
		// initialize dialog
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setTitle("OPC UA Information Model Selection");
		dialog.setMessage(dialogMessage);
		dialog.setElements(elements.toArray());
		dialog.setMultipleSelection(multipleSelection);
		
		// open dialog and get the selection results
		if(dialog.open() == Window.OK) {
			// get the selected XML file and store its workspace-related path as a OpcUaDeviceClient model parameter
			Object[] results = dialog.getResult();
			IFile modelFile = (IFile)results[0];
			String modelFilePath = "/"+currentProjectName+"/"+modelFile.getProjectRelativePath();
    		if(context instanceof OpcUaDeviceClient) {
    			OpcUaDeviceClient client = (OpcUaDeviceClient)context;
				client.setOpcuaXmlFile(modelFilePath);
    		}
		}
    	
    	return "";
    }

    
    public Boolean hasNoOpcUa(EObject context) {
    	return !hasOpcUaMW(context);
    }
    
    public Boolean hasOpcUaMW(EObject context) {
    	if(context instanceof ComponentPort) {
    		ComponentPort port = (ComponentPort)context;
    		for(ComponentPortExtension ex: port.getExtensions()) {
    			if(ex instanceof SupportedMiddleware) {
    				SupportedMiddleware sm = (SupportedMiddleware)ex;
    				if(sm.getMiddleware() instanceof OpcUa_SeRoNet) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }

    public EObject updateOpcUaMW(EObject context, Boolean newValue) {
    	if(context instanceof ComponentPort) {
    		if(newValue == true) {
    			if(hasOpcUaMW(context) == false) {
    				// add new OpcUa_SeRoNet mw
    				ComponentPort port = (ComponentPort)context;
    				SupportedMiddleware mw = SeronetExtensionFactory.eINSTANCE.createSupportedMiddleware();
    				mw.setMiddleware(RoboticMiddlewareFactory.eINSTANCE.createOpcUa_SeRoNet());
    				port.getExtensions().add(mw);
    			}
    		} else {
    			// remove all matching OpcUa_SeRoNet mw
    			ComponentPort port = (ComponentPort)context;
    			Iterator<ComponentPortExtension> it = port.getExtensions().iterator();
    			while(it.hasNext()) {
    				if(it.next() instanceof SupportedMiddleware) {
    					SupportedMiddleware sm = (SupportedMiddleware)it.next();
    					if(sm.getMiddleware() instanceof OpcUa_SeRoNet) {
    						it.remove();
    					}
    				}
    			}
    		}
    	}
    	return context;
    }
    
    public Boolean hasDDSMW(EObject context) {
    	if(context instanceof ComponentPort) {
    		ComponentPort port = (ComponentPort)context;
    		for(ComponentPortExtension ex: port.getExtensions()) {
    			if(ex instanceof SupportedMiddleware) {
    				SupportedMiddleware sm = (SupportedMiddleware)ex;
    				if(sm.getMiddleware() instanceof DDS_SmartSoft) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }

    public EObject updateDDSMW(EObject context, Boolean newValue) {
    	if(context instanceof ComponentPort) {
    		if(newValue == true) {
    			if(hasDDSMW(context) == false) {
    				// add new DDS_SmartSoft mw
    				ComponentPort port = (ComponentPort)context;
    				SupportedMiddleware mw = SeronetExtensionFactory.eINSTANCE.createSupportedMiddleware();
    				mw.setMiddleware(RoboticMiddlewareFactory.eINSTANCE.createDDS_SmartSoft());
    				port.getExtensions().add(mw);
    			}
    		} else {
    			// remove all matching DDS_SmartSoft mw
    			ComponentPort port = (ComponentPort)context;
    			Iterator<ComponentPortExtension> it = port.getExtensions().iterator();
    			while(it.hasNext()) {
    				if(it.next() instanceof SupportedMiddleware) {
    					SupportedMiddleware sm = (SupportedMiddleware)it.next();
    					if(sm.getMiddleware() instanceof DDS_SmartSoft) {
    						it.remove();
    					}
    				}
    			}
    		}
    	}
    	return context;
    }
    
    public Boolean hasACEMW(EObject context) {
    	if(context instanceof ComponentPort) {
    		ComponentPort port = (ComponentPort)context;
    		for(ComponentPortExtension ex: port.getExtensions()) {
    			if(ex instanceof SupportedMiddleware) {
    				SupportedMiddleware sm = (SupportedMiddleware)ex;
    				if(sm.getMiddleware() instanceof ACE_SmartSoft) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }

    public EObject updateACEMW(EObject context, Boolean newValue) {
    	if(context instanceof ComponentPort) {
    		if(newValue == true) {
    			if(hasACEMW(context) == false) {
    				// add new ACE_SmartSoft mw
    				ComponentPort port = (ComponentPort)context;
    				SupportedMiddleware mw = SeronetExtensionFactory.eINSTANCE.createSupportedMiddleware();
    				mw.setMiddleware(RoboticMiddlewareFactory.eINSTANCE.createACE_SmartSoft());
    				port.getExtensions().add(mw);
    			}
    		} else {
    			// remove all matching ACE_SmartSoft mw
    			ComponentPort port = (ComponentPort)context;
    			Iterator<ComponentPortExtension> it = port.getExtensions().iterator();
    			while(it.hasNext()) {
    				if(it.next() instanceof SupportedMiddleware) {
    					SupportedMiddleware sm = (SupportedMiddleware)it.next();
    					if(sm.getMiddleware() instanceof ACE_SmartSoft) {
    						it.remove();
    					}
    				}
    			}
    		}
    	}
    	return context;
    }
    
//    public Collection<EObject> getSubStates(EObject context) {
//    	Collection<EObject> objects = new ArrayList<EObject>();
//    	if(context instanceof Activity) {
//    		EObject parent = context.eContainer();
//    		if(parent instanceof ComponentDefinition) {
//    			ComponentDefinition component = (ComponentDefinition)parent;
//    			for(ComponentExtension ext: component.getExtensions()) {
//    				if(ext instanceof ComponentStates) {
//    					ComponentStates states = (ComponentStates)ext;
//    					objects.addAll(states.getSubstates());
//    				}
//    			}
//    		}
//    	}
//    	return objects;
//    }
//    
//    public EObject removePreviousSubStateBinding(EObject context) {
//    	if(context instanceof Activity) {
//    		Activity activity = (Activity)context;
//    		Predicate<ActivityExtension> pred = e -> e instanceof SubStateBinding; 
//    		activity.getExtensions().removeIf(pred);
//    	}
//    	return context;
//    }
    
    public Collection<EObject> getActivities(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(context instanceof ComponentDefinition) {
    		ComponentDefinition component = (ComponentDefinition)context;
    		for(AbstractComponentElement element: component.getElements()) {
    			if(element instanceof Activity) {
    				objects.add(element);
    			}
    		}
    	}
    	return objects;
    }
    
    public Collection<EObject> getAllComponentPorts(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(context instanceof ComponentDefModel) {
    		ComponentDefModel model = (ComponentDefModel)context;
    		ComponentDefinition component = model.getComponent();
    		if(component != null) {
    			for(AbstractComponentElement element: component.getElements()) {
    				if(element instanceof ComponentPort) {
    					objects.add(element);
    				}
    			}
    		}
    	}
    	return objects;
    }
    
    public Collection<EObject> getInputPorts(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(context instanceof ComponentDefinition) {
    		ComponentDefinition component = (ComponentDefinition)context;
    		for(AbstractComponentElement element: component.getElements()) {
    			if(element instanceof InputPort) {
    				objects.add(element);
    			}
    		}
    	}
    	return objects;
    }
    
    public Collection<EObject> getAnswerPorts(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(context instanceof ComponentDefinition) {
    		ComponentDefinition component = (ComponentDefinition)context;
    		for(AbstractComponentElement element: component.getElements()) {
    			if(element instanceof AnswerPort) {
    				objects.add(element);
    			}
    		}
    	}
    	return objects;
    }
    
//    public EObject saveCurrentSession(DNodeContainer container) {
//    	// get the current session
//    	IProgressMonitor monitor = new NullProgressMonitor();
//    	Session session = SessionManager.INSTANCE.getSession(container.getParentDiagram().eResource().getURI(),monitor);
//    	session.save(monitor);
//    	return container.getTarget();
//    }
    
//    public Collection<EObject> getOtherMainStates(EObject current) {
//    	Collection<EObject> objects = new ArrayList<EObject>();
//    	EObject parent = current.eContainer();
//    	if(parent instanceof ComponentStates) {
//    		ComponentStates automaton = (ComponentStates)parent;
//    		for(AbstractMainState main: automaton.getMainstates()) {
//    			if(!main.equals(current)) {
//    				objects.add(main);
//    			}
//    		}
//    	}
//    	return objects;
//    }
//    
//    public Collection<EObject> getDefaultMainStates(EObject context) {
//    	EClass type = StateMachinePackage.eINSTANCE.getMainState();
//    	Injector injector = getServiceDefinitionInjector();
//    	Collection<EObject> objects = geXtextIndexEObjetcsByType(injector, context, type);
//    	Collection<EObject> filtered = new ArrayList<EObject>();
//    	for(EObject object: objects) {
//    		if(object instanceof MainState) {
//    			MainState ms = (MainState)object;
//    			if(ms.isExtensible()) {
//    				filtered.add(ms);
//    			}
//    		}
//    	}
//    	return filtered;
//    }
    public Collection<EObject> getComponentOperationModes(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(context instanceof CoordinationSlavePort) {
    		CoordinationSlavePort port = (CoordinationSlavePort)context;
    		ComponentModeCollection collection = port.getService().getStatePattern().getModes();
//    		System.out.println("coll: "+collection);
    		if(collection != null) {
    			objects.addAll(collection.getModes());
    		}
    	}
    	return objects;
    }
    
    public Collection<EObject> getComponentParameter(EObject context) {
    	EClass type = ComponentParameterPackage.eINSTANCE.getComponentParameter();
    	Injector injector = getServiceDefinitionInjector();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    
    public Collection<EObject> getAllServices(EObject repo) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	if(repo instanceof ServiceDefRepository) {
    		objects.addAll(((ServiceDefRepository) repo).getServices());
    	}
    	return objects;
    }
    
    public Collection<EObject> getAllOneWayServiceRelatedCandidates(EObject context) {
    	Collection<EObject> objects = getServiceRepositories(context);
    	objects.addAll(getAllOneWayServices(context));
    	return objects;
    }
    public Collection<EObject> getAllTwoWayServiceRelatedCandidates(EObject context) {
    	Collection<EObject> objects = getServiceRepositories(context);
    	objects.addAll(getAllTwoWayServices(context));
    	return objects;
    }
    public Collection<EObject> getAllCoordinationServiceRelatedCandidates(EObject context) {
    	Collection<EObject> objects = getServiceRepositories(context);
    	objects.addAll(getAllCoordinationServices(context));
    	return objects;
    }
    
    public Collection<EObject> getServiceRepositories(EObject context) {
    	Injector injector = getServiceDefinitionInjector();
    	EClass type = ServiceDefinitionPackage.eINSTANCE.getServiceDefRepository();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    public Collection<EObject> getAllOneWayServices(EObject context) {
    	Injector injector = getServiceDefinitionInjector();
    	EClass type = ServiceDefinitionPackage.eINSTANCE.getOneWayCommunicationService();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    public Collection<EObject> getAllTwoWayServices(EObject context) {
    	Injector injector = getServiceDefinitionInjector();
    	EClass type = ServiceDefinitionPackage.eINSTANCE.getTwoWayCommunicationService();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    
    public Collection<EObject> getAllCoordinationServices(EObject context) {
    	Injector injector = getServiceDefinitionInjector();
    	EClass type = ServiceDefinitionPackage.eINSTANCE.getCoordinationServiceDefinition();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    
    private Injector getServiceDefinitionInjector() {
    	return ServiceDefinitionActivator.getInstance().getInjector(ServiceDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_SERVICEDEFINITION_SERVICEDEFINITION);
    }
    
    public Collection<EObject> getAllRosPorts(EObject context) {
    	Injector injector = getComponentDefinitionInjector();
    	EClass type = MixedportPackage.eINSTANCE.getMixedPortROSBase();
    	return geXtextIndexEObjetcsByType(injector, context, type);
    }
    
    private Injector getComponentDefinitionInjector( ) {
    	return ComponentDefinitionActivator.getInstance().getInjector(ComponentDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION);
    }
    
    private Collection<EObject> geXtextIndexEObjetcsByType(Injector injector, EObject context, EClass type) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	// get resource description from current "context"
    	ResourceDescriptionsProvider rdp = injector.getInstance(ResourceDescriptionsProvider.class);
    	IResourceDescriptions descriptions = rdp.getResourceDescriptions(context.eResource());
    	IResourceDescription description = descriptions.getResourceDescription(context.eResource().getURI());
    	// get all visible containers
    	IContainer.Manager manager = injector.getInstance(IContainer.Manager.class);
    	List<IContainer> containters = manager.getVisibleContainers(description, descriptions);
    	for(IContainer container: containters) {
    		// get object descriptions filtered by EClass type
    		Iterable<IEObjectDescription> objectDescriptions = container.getExportedObjectsByType(type);
    		for(IEObjectDescription objectDescription: objectDescriptions) {
    			EObject objectOrProxy = objectDescription.getEObjectOrProxy();
    			if(objectOrProxy.eIsProxy()) {
    				EObject resolvedObject = context.eResource().getResourceSet().getEObject(objectDescription.getEObjectURI(), true);
    				objects.add(resolvedObject);
    			} else {
    				objects.add(objectOrProxy);
    			}
    		}
    	}
    	return objects;
    }
}