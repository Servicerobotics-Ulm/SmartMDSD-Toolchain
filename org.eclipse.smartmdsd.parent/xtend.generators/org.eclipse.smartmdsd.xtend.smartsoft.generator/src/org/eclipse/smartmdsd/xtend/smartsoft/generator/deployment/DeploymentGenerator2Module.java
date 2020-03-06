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
package org.eclipse.smartmdsd.xtend.smartsoft.generator.deployment;

import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class DeploymentGenerator2Module extends AbstractModule {

	@Override
	protected void configure() {
		// bind the component code generator to the Xtend implementation root class
		binder().bind(AbstractGenerator.class).to(DeploymentGenerator2Impl.class);
		
		// bind a default encoding provider and a custom output configuration provider
		binder().bind(IEncodingProvider.class).to(IEncodingProvider.Runtime.class);
		binder().bind(IOutputConfigurationProvider.class).to(ExtendedOutputConfigurationProvider.class).in(Singleton.class);
	}

}
