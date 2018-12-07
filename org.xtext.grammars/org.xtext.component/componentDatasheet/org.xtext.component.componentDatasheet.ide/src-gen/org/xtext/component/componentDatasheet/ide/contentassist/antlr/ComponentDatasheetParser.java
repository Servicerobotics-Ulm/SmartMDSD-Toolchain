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
package org.xtext.component.componentDatasheet.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.component.componentDatasheet.ide.contentassist.antlr.internal.InternalComponentDatasheetParser;
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;

public class ComponentDatasheetParser extends AbstractContentAssistParser {

	@Inject
	private ComponentDatasheetGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalComponentDatasheetParser createParser() {
		InternalComponentDatasheetParser result = new InternalComponentDatasheetParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractLicenseAccess().getAlternatives(), "rule__AbstractLicense__Alternatives");
					put(grammarAccess.getTRLAccess().getAlternatives(), "rule__TRL__Alternatives");
					put(grammarAccess.getComponentDatasheetAccess().getGroup(), "rule__ComponentDatasheet__Group__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_0(), "rule__ComponentDatasheet__Group_3_0__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_1(), "rule__ComponentDatasheet__Group_3_1__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_2(), "rule__ComponentDatasheet__Group_3_2__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_3(), "rule__ComponentDatasheet__Group_3_3__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_4(), "rule__ComponentDatasheet__Group_3_4__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_5(), "rule__ComponentDatasheet__Group_3_5__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_6(), "rule__ComponentDatasheet__Group_3_6__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_7(), "rule__ComponentDatasheet__Group_3_7__0");
					put(grammarAccess.getComponentDatasheetAccess().getGroup_3_8(), "rule__ComponentDatasheet__Group_3_8__0");
					put(grammarAccess.getSpdxLicenseAccess().getGroup(), "rule__SpdxLicense__Group__0");
					put(grammarAccess.getProprietaryLicenseAccess().getGroup(), "rule__ProprietaryLicense__Group__0");
					put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0(), "rule__ProprietaryLicense__Group_3_0__0");
					put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1(), "rule__ProprietaryLicense__Group_3_1__0");
					put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2(), "rule__ProprietaryLicense__Group_3_2__0");
					put(grammarAccess.getComponentDatasheetAccess().getComponentAssignment_1(), "rule__ComponentDatasheet__ComponentAssignment_1");
					put(grammarAccess.getComponentDatasheetAccess().getShortDescritionAssignment_3_0_2(), "rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2");
					put(grammarAccess.getComponentDatasheetAccess().getBaseURIAssignment_3_1_2(), "rule__ComponentDatasheet__BaseURIAssignment_3_1_2");
					put(grammarAccess.getComponentDatasheetAccess().getLongDescriptionAssignment_3_2_2(), "rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2");
					put(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionAssignment_3_3_2(), "rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2");
					put(grammarAccess.getComponentDatasheetAccess().getHomepageAssignment_3_4_2(), "rule__ComponentDatasheet__HomepageAssignment_3_4_2");
					put(grammarAccess.getComponentDatasheetAccess().getTrlAssignment_3_5_2(), "rule__ComponentDatasheet__TrlAssignment_3_5_2");
					put(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionAssignment_3_6_2(), "rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2");
					put(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionAssignment_3_7_2(), "rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2");
					put(grammarAccess.getComponentDatasheetAccess().getLicenseAssignment_3_8_2(), "rule__ComponentDatasheet__LicenseAssignment_3_8_2");
					put(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2(), "rule__SpdxLicense__LicenseIDAssignment_2");
					put(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2(), "rule__ProprietaryLicense__NameAssignment_3_0_2");
					put(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2(), "rule__ProprietaryLicense__FullTextAssignment_3_1_2");
					put(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2(), "rule__ProprietaryLicense__UrlAssignment_3_2_2");
					put(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), "rule__ComponentDatasheet__UnorderedGroup_3");
					put(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), "rule__ProprietaryLicense__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ComponentDatasheetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentDatasheetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
