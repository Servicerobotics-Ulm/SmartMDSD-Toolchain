//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.deployment.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.ISafeRunnable
import org.eclipse.core.runtime.SafeRunner
import org.eclipse.core.runtime.CoreException

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DeploymentGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// get all generators plugged-in as extensions
		val IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.xtext.system.deployment.DeploymentGeneratorEP")
		try {
			// for each extension
			for(ext: config) {
				// get the "class" object from the extension (which should implement the AbstractGenerator interface)
				val obj = ext.createExecutableExtension("class")
				if(obj instanceof AbstractGenerator) {
					var ISafeRunnable runnable = new ISafeRunnable() {
						override void handleException(Throwable e) {
							println("DeploymentGenerator Exception")
							e.printStackTrace
						}
						override void run() throws Exception {
							(obj as AbstractGenerator).doGenerate(resource, fsa, context)
						}
					};
					// execute generator
					SafeRunner.run(runnable)
				}
			}
		} catch (CoreException ex) {
			println(ex.message)
		}
	}
}
