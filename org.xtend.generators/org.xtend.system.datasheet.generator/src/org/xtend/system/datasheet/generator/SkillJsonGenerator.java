//===============================================================
//
//  Copyright (C) 2019 Matthias Lutz, Alex Lotz, Dennis Stampfer
//
//        lutz@hs-ulm.de
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================
package org.xtend.system.datasheet.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SkillJsonGenerator extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		// use google Guice to resolve all injected Xtend classes!
		Injector injector = Guice.createInjector(new SkillJsonGeneratorModule());
		SkillJsonGeneratorImpl gen = injector.getInstance(SkillJsonGeneratorImpl.class);
		
		// use the generator-helper class
		GeneratorHelper genHelper = new GeneratorHelper(injector,resource);

		// create the datasheet folder (if not already created)
		genHelper.createFolder(IFileSystemAccess.DEFAULT_OUTPUT);
		
		// clean-up the "datasheet/src-gen" directory
		genHelper.invokeDirectoryCleaner(IFileSystemAccess2.DEFAULT_OUTPUT);
		
		// execute generator using a configured FileSystemAccess
		gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(), context);
		
		// refresh the source-folder (and its subfolders down to depth 3) for making changes visible
		genHelper.refreshFolder(IFileSystemAccess.DEFAULT_OUTPUT, 2);
	}
	

}
