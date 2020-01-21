//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.eclipse.smartmdsd.ui.factories;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider;

import com.google.inject.Injector;

public class XtextResourceFactory {
	private final IProject project;
	private final IFolder modelFolder;
	
	public XtextResourceFactory(final IProject project, final IFolder modelFolder) {
		this.project = project;
		this.modelFolder = modelFolder;
	}
	
	public final IProject getProject() {
		return project;
	}
	
	public final IFolder getModelFolder() {
		return modelFolder;
	}
	
	private String getModelFileExtension(Injector injector) {
		return injector.getInstance(FileExtensionProvider.class).getPrimaryFileExtension();
	}
	
	public Resource loadEMFResource(Injector injector) {
		if(modelFolder.exists()) {
			String modelFileExtrnsion = getModelFileExtension(injector);
			IFile modelFile = modelFolder.getFile(project.getName()+"."+modelFileExtrnsion);
			if(modelFile.exists()) {
				IResourceSetProvider resourceSetProvider = injector.getInstance(IResourceSetProvider.class);
				ResourceSet resourceSet = resourceSetProvider.get(project);
				// get an existing resource for the current model
				URI uri = URI.createURI("platform:/resource/" + project.getName()+ "/" + modelFile.getProjectRelativePath());
				boolean loadOnDemand = true;
				return resourceSet.getResource(uri, loadOnDemand);
			}
		}
		return null;
	}
	
	public Resource createNewXtextResource(Injector injector, List<Resource> relatedResources) {
		if(modelFolder.exists()) {
			String modelFileExtrnsion = getModelFileExtension(injector);
			// don't use the default IResourceSetProvider here as it will cause linker errors towards the relatedResources when saving this resource
			// see also: https://www.eclipse.org/forums/index.php/m/1803259/
			XtextLiveScopeResourceSetProvider resourceSetProvider = injector.getInstance(XtextLiveScopeResourceSetProvider.class);
			ResourceSet resourceSet = resourceSetProvider.get(project);
			
			// add related resources (if there are any) to the resource-set
			if(relatedResources != null) {
				for(Resource relatedResource: relatedResources) {
					resourceSet.getResources().add(relatedResource);
				}
			}
			
			// get an existing resource for the current model
			URI uri = URI.createURI("platform:/resource/" 
					+ project.getName()+ "/" 
					+ modelFolder.getProjectRelativePath() + "/"
					+ project.getName()+ "." + modelFileExtrnsion);
			return resourceSet.createResource(uri);
		}
		return null;
	}
	
	public void saveEMFModelInResource(EObject emfModel, Resource newResource) {
		// add emfModel to the new resource
		newResource.getContents().add(emfModel);
		try {
			// the resource will internally parse and save the newly added EMF model
			SaveOptions saveOptions = SaveOptions.newBuilder().format().getOptions();
			newResource.save(saveOptions.toOptionsMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
