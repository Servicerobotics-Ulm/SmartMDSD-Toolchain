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
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.service.parameterDefinition

import com.google.inject.Binder
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Names
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.scoping.ParameterDefinitionImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ParameterDefinitionRuntimeModule extends AbstractParameterDefinitionRuntimeModule {
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
			.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
			.to(ParameterDefinitionImportedNamespaceAwareLocalScopeProvider)
//		super.configureIScopeProviderDelegate(binder)
	}
}
