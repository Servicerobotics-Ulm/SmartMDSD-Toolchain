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
package org.xtext.service.communicationObject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.service.communicationObject.CommObjectModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.base.basicAttributes.PrimitiveType

@RunWith(XtextRunner)
@InjectWith(CommunicationObjectInjectorProvider)
class CommunicationObjectParsingTest {
	@Inject
	ParseHelper<CommObjectModel> parseHelper
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			CommObjectsRepository MyRepo {
				CommObject MyCommObject {
					attr1: Int32
					attr2: Double
					attr3: String
				}
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		// validation helper
		result.assertNoErrors
		
		val repo = result.repository
		Assert.assertEquals("MyRepo", repo.name)
		val commObj = repo.elements.get(0)
		Assert.assertEquals("MyCommObject", commObj.name)
		val attr1 = (commObj as CommunicationObject).attributes.get(0)
		Assert.assertEquals("attr1", attr1.name)
		val attr1Type = (attr1.type as PrimitiveType).typeName
		Assert.assertEquals("Int32", attr1Type.literal)
	}
}
