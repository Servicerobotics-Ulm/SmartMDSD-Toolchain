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
package org.eclipse.smartmdsd.xtext.component.componentDefinition

import com.google.inject.Binder
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Names
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.smartmdsd.xtext.component.componentDefinition.scoping.ComponentDefinitionImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ComponentDefinitionRuntimeModule extends AbstractComponentDefinitionRuntimeModule {
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ComponentDefinitionQNameProvider
	}
	
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
			.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
			.to(ComponentDefinitionImportedNamespaceAwareLocalScopeProvider)
//		super.configureIScopeProviderDelegate(binder)
	}
}
