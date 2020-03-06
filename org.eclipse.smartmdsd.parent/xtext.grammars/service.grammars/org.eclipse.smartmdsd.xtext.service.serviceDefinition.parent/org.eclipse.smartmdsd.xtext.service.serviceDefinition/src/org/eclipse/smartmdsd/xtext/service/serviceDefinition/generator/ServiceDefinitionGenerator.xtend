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
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.generator

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
class ServiceDefinitionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// get all generators plugged-in as extensions
		val IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.smartmdsd.xtext.service.serviceDefinition.ServiceDefinitionGeneratorEP")
		try {
			// for each extension
			for(ext: config) {
				// get the "class" object from the extension (which should implement the AbstractGenerator interface)
				val obj = ext.createExecutableExtension("class")
				if(obj instanceof AbstractGenerator) {
					var ISafeRunnable runnable = new ISafeRunnable() {
						override void handleException(Throwable e) {
							println("ServiceDefinitionGenerator Exception")
							e.printStackTrace
						}
						override void run() throws Exception {
							obj.doGenerate(resource, fsa, context)
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
