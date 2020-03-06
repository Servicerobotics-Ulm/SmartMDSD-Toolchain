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