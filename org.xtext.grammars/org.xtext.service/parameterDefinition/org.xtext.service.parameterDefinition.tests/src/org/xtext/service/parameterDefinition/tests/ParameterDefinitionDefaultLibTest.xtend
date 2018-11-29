//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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