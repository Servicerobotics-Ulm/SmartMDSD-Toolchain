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
package org.xtext.service.parameterDefinition.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.resource.ResourceSet
import org.junit.Assert
import org.ecore.service.parameterDefinition.ParamDefModel
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

@RunWith(XtextRunner)
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
		Assert.assertNull( lib.getDefaultParameterSetObject(context) )
	}

	@Test def void testParameterDefinitionObjectWithLibraryLoaded() {
		val context = loadLibAndParse('''
			ParameterSetRepository MyRepo {
				ParameterSet MyParameters { }
			}
		''')
		Assert.assertNotNull( lib.getDefaultParameterSetObject(context) )
	}
	
	def private loadLibAndParse(CharSequence p) {
		val resourceSet = rsp.get
		lib.loadLib(resourceSet)
		p.parse(resourceSet)
	}
}