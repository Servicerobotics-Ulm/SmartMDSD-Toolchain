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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

class ServiceDefinitionImportedNamespaceAwareLocalScopeProvider 
	extends ImportedNamespaceAwareLocalScopeProvider {
		
	override protected getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(
				QualifiedName.create(ParameterDefinitionDefaultLib.DEFAULT_PARAM_PACKAGE),
				true, // wildcard
				ignoreCase
			)
		)
	}	
}