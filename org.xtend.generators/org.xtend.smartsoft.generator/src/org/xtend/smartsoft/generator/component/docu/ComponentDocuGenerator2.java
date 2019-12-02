//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
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
package org.xtend.smartsoft.generator.component.docu;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;
import org.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ComponentDocuGenerator2 extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		// use google Guice to resolve all injected Xtend classes!
		Injector injector = Guice.createInjector(new ComponentDocuGenerator2Module());
		ComponentDocuGenerator2Impl gen = injector.getInstance(ComponentDocuGenerator2Impl.class);
		
		// use the generator-helper class
		GeneratorHelper genHelper = new GeneratorHelper(injector,resource);
		
		// create the smartsoft folder (if not already created)
		genHelper.createFolder(ExtendedOutputConfigurationProvider.SMARTSOFT_OUTPUT);
				
		// execute generator using a configured FileSystemAccess
		gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(),context);
		
		// refresh the source-folder (and its subfolders down to depth 1) for making changes visible
		genHelper.refreshFolder(ExtendedOutputConfigurationProvider.PROJECT_ROOT_FOLDER, 1);
		
		// copy README.md file into ProjectRoot
		IProject project = GeneratorHelper.getCurrentProjectFrom(resource);
		IFile readmeFile = project.getFolder("smartsoft/src-gen/docu").getFile("README.md");
		if(readmeFile.exists()) {
			IPath path = project.getFullPath().append(readmeFile.getName());
			IFile readmeRootFile = project.getFile(readmeFile.getName());
			IProgressMonitor monitor = new NullProgressMonitor();
			try {
				if(readmeRootFile.exists()) {
					readmeRootFile.delete(true, monitor);
				}
				readmeFile.copy(path, true, monitor);
				project.refreshLocal(1, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
