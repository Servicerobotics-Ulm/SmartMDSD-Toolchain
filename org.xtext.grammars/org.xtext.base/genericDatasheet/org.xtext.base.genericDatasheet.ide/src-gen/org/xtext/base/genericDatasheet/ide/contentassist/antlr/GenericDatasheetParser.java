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
package org.xtext.base.genericDatasheet.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.base.genericDatasheet.ide.contentassist.antlr.internal.InternalGenericDatasheetParser;
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;

public class GenericDatasheetParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GenericDatasheetGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GenericDatasheetGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractLicenseAccess().getAlternatives(), "rule__AbstractLicense__Alternatives");
			builder.put(grammarAccess.getTRLAccess().getAlternatives(), "rule__TRL__Alternatives");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_0(), "rule__GenericDatasheet__Group_0__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_1(), "rule__GenericDatasheet__Group_1__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_2(), "rule__GenericDatasheet__Group_2__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_3(), "rule__GenericDatasheet__Group_3__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_4(), "rule__GenericDatasheet__Group_4__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_5(), "rule__GenericDatasheet__Group_5__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getGroup_6(), "rule__GenericDatasheet__Group_6__0");
			builder.put(grammarAccess.getSpdxLicenseAccess().getGroup(), "rule__SpdxLicense__Group__0");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getGroup(), "rule__ProprietaryLicense__Group__0");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0(), "rule__ProprietaryLicense__Group_3_0__0");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1(), "rule__ProprietaryLicense__Group_3_1__0");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2(), "rule__ProprietaryLicense__Group_3_2__0");
			builder.put(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2(), "rule__GenericDatasheet__BaseURIAssignment_0_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getShortDescriptionAssignment_1_2(), "rule__GenericDatasheet__ShortDescriptionAssignment_1_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2(), "rule__GenericDatasheet__LongDescriptionAssignment_2_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2(), "rule__GenericDatasheet__SupplierDescriptionAssignment_3_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2(), "rule__GenericDatasheet__HomepageAssignment_4_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2(), "rule__GenericDatasheet__TrlAssignment_5_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2(), "rule__GenericDatasheet__LicenseAssignment_6_2");
			builder.put(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2(), "rule__SpdxLicense__LicenseIDAssignment_2");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2(), "rule__ProprietaryLicense__NameAssignment_3_0_2");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2(), "rule__ProprietaryLicense__FullTextAssignment_3_1_2");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2(), "rule__ProprietaryLicense__UrlAssignment_3_2_2");
			builder.put(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), "rule__GenericDatasheet__UnorderedGroup");
			builder.put(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), "rule__ProprietaryLicense__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GenericDatasheetGrammarAccess grammarAccess;

	@Override
	protected InternalGenericDatasheetParser createParser() {
		InternalGenericDatasheetParser result = new InternalGenericDatasheetParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GenericDatasheetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GenericDatasheetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
