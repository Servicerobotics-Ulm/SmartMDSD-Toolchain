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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition

import com.google.inject.Binder
import org.eclipse.xtext.scoping.IScopeProvider
import com.google.inject.name.Names
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.scoping.ServiceDefinitionImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ServiceDefinitionRuntimeModule extends AbstractServiceDefinitionRuntimeModule {
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
			.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
			.to(ServiceDefinitionImportedNamespaceAwareLocalScopeProvider)
//		super.configureIScopeProviderDelegate(binder)
	}
}
