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
 *   Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.PlainOpcUaPort;
import org.eclipse.smartmdsd.xtend.plainOPCUA.generator.ExtendedOutputConfigurationProvider;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PlainOpcUaGenerator2 extends AbstractGenerator {
	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		// use google Guice to resolve all injected Xtend classes!
		Injector injector = Guice.createInjector(new PlainOpcUaGenerator2Module());
		PlainOpcUaGenerator2Impl gen = injector.getInstance(PlainOpcUaGenerator2Impl.class);
		
		// use the generator-helper class
		GeneratorHelper genHelper = new GeneratorHelper(injector,resource);

		// check if model has any definitions of PlainOpcUaPort at all (skip code generation if it has none)
		final Function1<EObject, Boolean> hasPlainOpcUa_function = (EObject it) -> {
			return Boolean.valueOf((it instanceof PlainOpcUaPort));
		};
		final boolean hasPlainOpcUaPorts = IteratorExtensions.<EObject>exists(resource.getAllContents(), hasPlainOpcUa_function);
		if(hasPlainOpcUaPorts == true) 
		{
			// create the SeRoNetSDK folder (if not already created)
			genHelper.createFolder(ExtendedOutputConfigurationProvider.PLAIN_OPCUA_OUTPUT);
			
			// clean-up the "SeRoNetSDK/src-gen" directory
			genHelper.invokeDirectoryCleaner(IFileSystemAccess2.DEFAULT_OUTPUT);
			
			// execute generator using a configured FileSystemAccess
			gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(), context);
			
			// refresh the source-folder (and its subfolders down to depth 3) for making changes visible
			genHelper.refreshFolder(ExtendedOutputConfigurationProvider.PLAIN_OPCUA_OUTPUT, 2);
		} else {
			// delete main folder if model does not have any related elements any more
			genHelper.deleteFolder(ExtendedOutputConfigurationProvider.PLAIN_OPCUA_OUTPUT);
		}
	}
}
