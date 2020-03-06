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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet

@ExtendWith(InjectionExtension)
@InjectWith(ParameterDefinitionInjectorProvider)
class ParameterDefinitionDefaultLibTest {
	@Inject extension ParseHelper<ParamDefModel>
	@Inject extension ValidationTestHelper
	@Inject ParameterDefinitionDefaultLib lib
	@Inject Provider<ResourceSet> rsp
	
	@Test def void testImplicitImports() {
		'''
		ParameterSetRepository MyRepo {
			ParameterSet SomeParameters extends EmptyDefaultParameterSet { }
		}
		'''.loadLibAndParse.assertNoErrors
	}
	
	@Test def void testLibraryContainsNoError() {
		val resourceSet = rsp.get
		lib.loadLib(resourceSet)
		resourceSet.resources.head.contents.head.assertNoErrors
	}
	
	@Test def void testParameterDefinitionObjectWithoutLibraryLoaded() {
		val context = 
		'''
		ParameterSetRepository MyRepo {
			ParameterSet MyParameters { }
		}
		'''.parse
		Assertions.assertNull( lib.getDefaultParameterSetObject(context) )
	}

	@Test def void testParameterDefinitionObjectWithLibraryLoaded() {
		val context = loadLibAndParse('''
			ParameterSetRepository MyRepo {
				ParameterSet MyParameters { }
			}
		''')
		Assertions.assertNotNull( lib.getDefaultParameterSetObject(context) )
	}
	
	def private loadLibAndParse(CharSequence p) {
		val resourceSet = rsp.get
		lib.loadLib(resourceSet)
		p.parse(resourceSet)
	}
}