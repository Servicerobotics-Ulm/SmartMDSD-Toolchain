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
package org.xtext.service.communicationObject.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.service.communicationObject.ide.contentassist.antlr.internal.InternalCommunicationObjectParser;
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;

public class CommunicationObjectParser extends AbstractContentAssistParser {

	@Inject
	private CommunicationObjectGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCommunicationObjectParser createParser() {
		InternalCommunicationObjectParser result = new InternalCommunicationObjectParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractCommElementAccess().getAlternatives(), "rule__AbstractCommElement__Alternatives");
					put(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives(), "rule__AbstractAttributeType__Alternatives");
					put(grammarAccess.getSingleValueAccess().getAlternatives(), "rule__SingleValue__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives(), "superAbstractAttributeType__Alternatives");
					put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
					put(grammarAccess.getAbstractValueAccess().getAlternatives(), "rule__AbstractValue__Alternatives");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives(), "superSingleValue__Alternatives");
					put(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives(), "rule__PRIMITIVE_TYPE_NAME__Alternatives");
					put(grammarAccess.getCommObjectModelAccess().getGroup(), "rule__CommObjectModel__Group__0");
					put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
					put(grammarAccess.getCommRepositoryImportAccess().getGroup(), "rule__CommRepositoryImport__Group__0");
					put(grammarAccess.getCommObjectsRepositoryAccess().getGroup(), "rule__CommObjectsRepository__Group__0");
					put(grammarAccess.getCommObjectsRepositoryAccess().getGroup_2(), "rule__CommObjectsRepository__Group_2__0");
					put(grammarAccess.getCommObjectsRepositoryAccess().getGroup_4(), "rule__CommObjectsRepository__Group_4__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_3(), "rule__Version__Group_3__0");
					put(grammarAccess.getCommunicationObjectAccess().getGroup(), "rule__CommunicationObject__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getCommElementReferenceAccess().getGroup(), "rule__CommElementReference__Group__0");
					put(grammarAccess.getSingleValueAccess().getGroup_0(), "rule__SingleValue__Group_0__0");
					put(grammarAccess.getAttributeDefinitionAccess().getGroup(), "rule__AttributeDefinition__Group__0");
					put(grammarAccess.getAttributeDefinitionAccess().getGroup_3(), "rule__AttributeDefinition__Group_3__0");
					put(grammarAccess.getAttributeRefinementAccess().getGroup(), "rule__AttributeRefinement__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getEnumerationElementAccess().getGroup(), "rule__EnumerationElement__Group__0");
					put(grammarAccess.getEnumerationElementAccess().getGroup_1(), "rule__EnumerationElement__Group_1__0");
					put(grammarAccess.getInlineEnumerationTypeAccess().getGroup(), "rule__InlineEnumerationType__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0(), "superSingleValue__Group_0__0");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1(), "superSingleValue__Group_1__0");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2(), "superSingleValue__Group_2__0");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3(), "superSingleValue__Group_3__0");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4(), "superSingleValue__Group_4__0");
					put(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0(), "rule__CommObjectModel__ImportsAssignment_0");
					put(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1(), "rule__CommObjectModel__RepositoryAssignment_1");
					put(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1(), "rule__CommRepositoryImport__ImportedNamespaceAssignment_1");
					put(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_1(), "rule__CommObjectsRepository__NameAssignment_1");
					put(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_2_1(), "rule__CommObjectsRepository__VersionAssignment_2_1");
					put(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_4_1(), "rule__CommObjectsRepository__DependencyAssignment_4_1");
					put(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_5(), "rule__CommObjectsRepository__ElementsAssignment_5");
					put(grammarAccess.getVersionAccess().getMajorAssignment_0(), "rule__Version__MajorAssignment_0");
					put(grammarAccess.getVersionAccess().getMinorAssignment_2(), "rule__Version__MinorAssignment_2");
					put(grammarAccess.getVersionAccess().getPatchAssignment_3_1(), "rule__Version__PatchAssignment_3_1");
					put(grammarAccess.getCommunicationObjectAccess().getNameAssignment_1(), "rule__CommunicationObject__NameAssignment_1");
					put(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_3(), "rule__CommunicationObject__AttributesAssignment_3");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
					put(grammarAccess.getEnumerationAccess().getEnumsAssignment_3(), "rule__Enumeration__EnumsAssignment_3");
					put(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0(), "rule__CommElementReference__TypeNameAssignment_0");
					put(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1(), "rule__CommElementReference__ArrayAssignment_1");
					put(grammarAccess.getSingleValueAccess().getValueAssignment_0_1(), "rule__SingleValue__ValueAssignment_0_1");
					put(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0(), "rule__AttributeDefinition__NameAssignment_0");
					put(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2(), "rule__AttributeDefinition__TypeAssignment_2");
					put(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1(), "rule__AttributeDefinition__DefaultvalueAssignment_3_1");
					put(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0(), "rule__AttributeRefinement__AttributeAssignment_0");
					put(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2(), "rule__AttributeRefinement__ValueAssignment_2");
					put(grammarAccess.getEnumerationElementAccess().getNameAssignment_0(), "rule__EnumerationElement__NameAssignment_0");
					put(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1(), "rule__EnumerationElement__ValueAssignment_1_1");
					put(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1(), "rule__InlineEnumerationType__ArrayAssignment_1");
					put(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3(), "rule__InlineEnumerationType__EnumsAssignment_3");
					put(grammarAccess.getArrayTypeAccess().getLengthAssignment_2(), "rule__ArrayType__LengthAssignment_2");
					put(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0(), "rule__PrimitiveType__TypeNameAssignment_0");
					put(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1(), "rule__PrimitiveType__ArrayAssignment_1");
					put(grammarAccess.getArrayValueAccess().getValuesAssignment_1(), "rule__ArrayValue__ValuesAssignment_1");
					put(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1(), "rule__ArrayValue__ValuesAssignment_2_1");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1(), "superSingleValue__ValueAssignment_0_1");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1(), "superSingleValue__ValueAssignment_1_1");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1(), "superSingleValue__ValueAssignment_2_1");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1(), "superSingleValue__ValueAssignment_3_1");
					put(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1(), "superSingleValue__ValueAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CommunicationObjectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CommunicationObjectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
