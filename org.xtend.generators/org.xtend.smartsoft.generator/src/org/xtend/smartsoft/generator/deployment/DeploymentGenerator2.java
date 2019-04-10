//===================================================================================
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================

package org.xtend.smartsoft.generator.deployment;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;
import org.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DeploymentGenerator2 extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		// use google Guice to resolve all injected Xtend classes!
		Injector injector = Guice.createInjector(new DeploymentGenerator2Module());
		DeploymentGenerator2Impl gen = injector.getInstance(DeploymentGenerator2Impl.class);
		
		// use the generator-helper class
		GeneratorHelper genHelper = new GeneratorHelper(injector,resource);
		
		// create the smartsoft folder (if not already created)
		genHelper.createFolder(ExtendedOutputConfigurationProvider.SMARTSOFT_OUTPUT);
		genHelper.createFolder(ExtendedOutputConfigurationProvider.SRC_OUTPUT);
		genHelper.createFolder(IFileSystemAccess2.DEFAULT_OUTPUT);
		
		// clean-up the "smartsoft/src-gen/params" directory
		genHelper.invokeDirectoryCleaner(ExtendedOutputConfigurationProvider.SRC_GEN_SYS_DEPLOY);
		
		// execute generator using a configured FileSystemAccess
		gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(), context);
		
		// refresh the source-folder (and its subfolders down to depth 3) for making changes visible
		genHelper.refreshFolder(ExtendedOutputConfigurationProvider.SMARTSOFT_OUTPUT, 3);
	}

}
