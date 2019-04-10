//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Matthias Lutz, Alex Lotz, Dennis Stampfer
//
//        lutz@hs-ulm.de
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.xtend.system.datasheet.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.component.coordinationExtension.CoordinationSlavePort
//import org.ecore.component.coordinationExtension.SkillRealizationsRef
import com.google.inject.Inject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.PrimitiveType
import org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.ecore.component.coordinationExtension.SkillRealizationsRef

class SkillJsonGeneratorImpl extends AbstractGenerator {
	@Inject DefaultDeclarativeQualifiedNameProvider fqn;
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model: resource.allContents.toIterable.filter(typeof(SystemComponentArchitecture))) {
			fsa.generateFile(model.name+".skills.json", model.compileJson)
		}
	}
	
	def CharSequence compileJson(SystemComponentArchitecture model)
	'''
	
	«FOR comp: model.components»
		«FOR slave: comp.component.elements.filter(CoordinationSlavePort)»
			«FOR skillSet: slave.elements.filter(SkillRealizationsRef)»
				[
				«FOR skill: skillSet.skillRealizationCoordModuleRef.skills»
					{"skill" :
						{ 
							"name" : "«skill.skillDef.name»",
							"skill-definition-fqn" : "«fqn.getFullyQualifiedName(skill.skillDef)»",
							"in-attribute" : {
								«FOR inAttr: skill.skillDef.inAttribute»
									"«inAttr.name»" : "«inAttr.type.typeString»"«IF inAttr!=skill.skillDef.inAttribute.last»,«ENDIF»
								«ENDFOR»
							},
							"out-attribute" : {
								«FOR outAttr: skill.skillDef.outAttribute»
								 "«outAttr.name»" : "«outAttr.type.typeString»"«IF outAttr!=skill.skillDef.outAttribute.last»,«ENDIF»
								«ENDFOR»
							},
							"results" : [ 
								«FOR result: skill.skillDef.results»
									{ "result" : "«result.result.literal»", "result-value" : "«result.resultValue»" }«IF result!=skill.skillDef.results.last»,«ENDIF»
								«ENDFOR» 
							]
						}
					}«IF skill != skillSet.skillRealizationCoordModuleRef.skills.last»,«ENDIF»
				«ENDFOR»
				]
			«ENDFOR»
		«ENDFOR»
	«ENDFOR»
	'''
	
	def getTypeString(AbstractAttributeType attrType) {
		if(attrType instanceof PrimitiveType) {
			val typeName = attrType.typeName
			if(typeName == PRIMITIVE_TYPE_NAME.DOUBLE) {
				return "Double"
			} else if (typeName == PRIMITIVE_TYPE_NAME.FLOAT)
			{
				return "Double"	
			} else if (typeName == PRIMITIVE_TYPE_NAME.STRING)
			{
				return "String"	
			} else if (typeName == PRIMITIVE_TYPE_NAME.BOOLEAN)
			{
				return "Bool"	
			} else	{
				return "Int"	
			}
		}
	}
}