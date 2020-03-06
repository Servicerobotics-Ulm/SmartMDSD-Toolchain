/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.smartsoft.generator.targetPlatform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.smartmdsd.xtext.system.deployment.ui.internal.DeploymentActivator;

import com.google.inject.Injector;

public class TargetPlatformGenerator2 extends AbstractGenerator {

	private Injector getDeploymentInjector() {
		return DeploymentActivator.getInstance().getInjector(DeploymentActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_DEPLOYMENT_DEPLOYMENT);
	}
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// here we redirect/delegate the code generation to the deployment code generator as it might use this targetPlatform model as reference
		Injector injector = getDeploymentInjector();
		String fileExtension = injector.getInstance(FileExtensionProvider.class).getPrimaryFileExtension();
		URI deploymentModelFileURI = input.getURI().trimFileExtension().appendFileExtension(fileExtension);
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		// check if the resource exists
		boolean resourceExists = resourceSet.getURIConverter().exists(deploymentModelFileURI, null);
		if(resourceExists == true) {
			// load resource
			Resource resource = resourceSet.getResource(deploymentModelFileURI, true);
			if(resource.isLoaded() == true) {
				GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
				generator.doGenerate(resource, fsa);
			}
		} else {
			System.out.println("non-existing resource: "+deploymentModelFileURI);
		}
		
	}

}
