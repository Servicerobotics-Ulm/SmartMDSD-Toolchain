/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CommObjGenerator2 extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		// use google Guice to resolve all injected Xtend classes!
		Injector injector = Guice.createInjector(new CommObjGenerator2Module());
		CommObjGenerator2Impl gen = injector.getInstance(CommObjGenerator2Impl.class);
		
		// use the generator-helper class
		GeneratorHelper genHelper = new GeneratorHelper(injector, resource);
		
		// create the smartsoft folder (if not already created)
		genHelper.createFolder(ExtendedOutputConfigurationProvider.SMARTSOFT_OUTPUT);
		
		// clean-up the "smartsoft/src-gen" directory
		genHelper.invokeDirectoryCleaner();
		
		// execute generator using a configured FileSystemAccess
		gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(),context);
		
		// refresh the source-folder (and its subfolders down to depth 2) for making changes visible
		genHelper.refreshFolder(ExtendedOutputConfigurationProvider.SMARTSOFT_OUTPUT, 2);
	}
}
