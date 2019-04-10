//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        nagrath@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.xtend.plainOPCUA.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ecore.component.seronetExtension.PlainOpcUaPort;
import org.xtend.smartsoft.generator.GeneratorHelper;

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
