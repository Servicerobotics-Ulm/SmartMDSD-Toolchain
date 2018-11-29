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
package org.xtext.component.componentDocumentation.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.component.componentDocumentation.ide.contentassist.antlr.internal.InternalComponentDocumentationParser;
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;

public class ComponentDocumentationParser extends AbstractContentAssistParser {

	@Inject
	private ComponentDocumentationGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalComponentDocumentationParser createParser() {
		InternalComponentDocumentationParser result = new InternalComponentDocumentationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractComponentDocuElementAccess().getAlternatives(), "rule__AbstractComponentDocuElement__Alternatives");
					put(grammarAccess.getAbstractModeDocuAccess().getAlternatives(), "rule__AbstractModeDocu__Alternatives");
					put(grammarAccess.getComponentDocumentationAccess().getGroup(), "rule__ComponentDocumentation__Group__0");
					put(grammarAccess.getComponentDocumentationAccess().getGroup_3_0(), "rule__ComponentDocumentation__Group_3_0__0");
					put(grammarAccess.getComponentDocumentationAccess().getGroup_3_1(), "rule__ComponentDocumentation__Group_3_1__0");
					put(grammarAccess.getComponentDocumentationAccess().getGroup_3_2(), "rule__ComponentDocumentation__Group_3_2__0");
					put(grammarAccess.getComponentDocumentationAccess().getGroup_3_3(), "rule__ComponentDocumentation__Group_3_3__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup(), "rule__CoordinationSlavePortDocu__Group__0");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_0(), "rule__CoordinationSlavePortDocu__Group_3_0__0");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_1(), "rule__CoordinationSlavePortDocu__Group_3_1__0");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_2(), "rule__CoordinationSlavePortDocu__Group_3_2__0");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_3(), "rule__CoordinationSlavePortDocu__Group_3_3__0");
					put(grammarAccess.getComponentServiceDocuAccess().getGroup(), "rule__ComponentServiceDocu__Group__0");
					put(grammarAccess.getComponentServiceDocuAccess().getGroup_3(), "rule__ComponentServiceDocu__Group_3__0");
					put(grammarAccess.getComponentModeDocuAccess().getGroup(), "rule__ComponentModeDocu__Group__0");
					put(grammarAccess.getNeutralModeDocuAccess().getGroup(), "rule__NeutralModeDocu__Group__0");
					put(grammarAccess.getComponentDocumentationAccess().getComponentAssignment_1(), "rule__ComponentDocumentation__ComponentAssignment_1");
					put(grammarAccess.getComponentDocumentationAccess().getDescriptionAssignment_3_0_2(), "rule__ComponentDocumentation__DescriptionAssignment_3_0_2");
					put(grammarAccess.getComponentDocumentationAccess().getPurposeAssignment_3_1_2(), "rule__ComponentDocumentation__PurposeAssignment_3_1_2");
					put(grammarAccess.getComponentDocumentationAccess().getLicenseAssignment_3_2_2(), "rule__ComponentDocumentation__LicenseAssignment_3_2_2");
					put(grammarAccess.getComponentDocumentationAccess().getHardwareAssignment_3_3_2(), "rule__ComponentDocumentation__HardwareAssignment_3_3_2");
					put(grammarAccess.getComponentDocumentationAccess().getElementsAssignment_4(), "rule__ComponentDocumentation__ElementsAssignment_4");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getPortAssignment_1(), "rule__CoordinationSlavePortDocu__PortAssignment_1");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionAssignment_3_0_2(), "rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringAssignment_3_1_2(), "rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getStateAssignment_3_2_2(), "rule__CoordinationSlavePortDocu__StateAssignment_3_2_2");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterAssignment_3_3_2(), "rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2");
					put(grammarAccess.getComponentServiceDocuAccess().getPortAssignment_1(), "rule__ComponentServiceDocu__PortAssignment_1");
					put(grammarAccess.getComponentServiceDocuAccess().getDescriptionAssignment_3_2(), "rule__ComponentServiceDocu__DescriptionAssignment_3_2");
					put(grammarAccess.getComponentServiceDocuAccess().getStatesAssignment_4(), "rule__ComponentServiceDocu__StatesAssignment_4");
					put(grammarAccess.getComponentModeDocuAccess().getModeAssignment_1(), "rule__ComponentModeDocu__ModeAssignment_1");
					put(grammarAccess.getComponentModeDocuAccess().getDescriptionAssignment_3(), "rule__ComponentModeDocu__DescriptionAssignment_3");
					put(grammarAccess.getNeutralModeDocuAccess().getDescriptionAssignment_3(), "rule__NeutralModeDocu__DescriptionAssignment_3");
					put(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), "rule__ComponentDocumentation__UnorderedGroup_3");
					put(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), "rule__CoordinationSlavePortDocu__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ComponentDocumentationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentDocumentationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
