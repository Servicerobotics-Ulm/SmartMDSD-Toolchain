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
package org.eclipse.smartmdsd.sirius.system.deployment.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;
import org.eclipse.smartmdsd.sirius.utils.DiagramHelperServices;
import org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.internal.ComponentArchitectureActivator;
import org.eclipse.smartmdsd.xtext.system.targetPlatform.ui.internal.TargetPlatformActivator;

import com.google.inject.Injector;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public String getProjectName(EObject obj) {
    	return DiagramHelperServices.getProjectName(obj);
    }
	
    public Collection<EObject> getLoginAccounts(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	EObject parent = context.eContainer();
    	if(parent instanceof TargetPlatformReference) {
    		TargetPlatformReference target = (TargetPlatformReference)parent;
    		for(EObject obj: target.getPlatform().getElements()) {
    			if(obj instanceof LoginAccount) {
    				objects.add(obj);
    			}
    		}
    	}
    	return objects;
    }
    
    public Collection<EObject> getNetworkInterfaces(EObject context) {
    	Collection<EObject> objects = new ArrayList<EObject>();
    	EObject parent = context.eContainer();
    	if(parent instanceof TargetPlatformReference) {
    		TargetPlatformReference target = (TargetPlatformReference)parent;
    		for(EObject obj: target.getPlatform().getElements()) {
    			if(obj instanceof NetworkInterface) {
    				objects.add(obj);
    			}
    		}
    	}
    	return objects;
    }
	
	public Iterable<EObject> getAllComponentInstances(EObject context) {
		Injector injector = getComponentArchitectureInjector();
		return geXtextIndexEObjetcsByType(injector, context, ComponentArchitecturePackage.eINSTANCE.getComponentInstance());
	}
	
	public Iterable<EObject> getAllComputationPlatforms(EObject context) {
		Injector injector = getTargetPlatformInjector();
		return geXtextIndexEObjetcsByType(injector, context, TargetPlatformPackage.eINSTANCE.getTargetPlatformDefinition());
	}
	
    private Injector getTargetPlatformInjector() {
    	return TargetPlatformActivator.getInstance().getInjector(TargetPlatformActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_TARGETPLATFORM_TARGETPLATFORM);
    }
    
    private Injector getComponentArchitectureInjector() {
    	return ComponentArchitectureActivator.getInstance().getInjector(ComponentArchitectureActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_COMPONENTARCHITECTURE_COMPONENTARCHITECTURE);
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
    			EObject serviceRepoProxy = objectDescription.getEObjectOrProxy();
    			if(serviceRepoProxy.eIsProxy()) {
    				EObject serviceRepo = context.eResource().getResourceSet().getEObject(objectDescription.getEObjectURI(), true);
    				objects.add(serviceRepo);
    			} else {
    				objects.add(serviceRepoProxy);
    			}
    		}
    	}
    	return objects;
    }
}
