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
package org.xtext.system.targetPlatform.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.targetPlatform.ide.contentassist.antlr.internal.InternalTargetPlatformParser;
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;

public class TargetPlatformParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TargetPlatformGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TargetPlatformGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractTPElementAccess().getAlternatives(), "rule__AbstractTPElement__Alternatives");
			builder.put(grammarAccess.getOperatingSystemAccess().getAlternatives(), "rule__OperatingSystem__Alternatives");
			builder.put(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives(), "rule__AbstractTPSubNode__Alternatives");
			builder.put(grammarAccess.getRoboticMiddlewareAccess().getAlternatives(), "rule__RoboticMiddleware__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getTargetPlatformModelAccess().getGroup(), "rule__TargetPlatformModel__Group__0");
			builder.put(grammarAccess.getNetworkConnectionAccess().getGroup(), "rule__NetworkConnection__Group__0");
			builder.put(grammarAccess.getNetworkConnectionAccess().getGroup_5(), "rule__NetworkConnection__Group_5__0");
			builder.put(grammarAccess.getTargetPlatformDefinitionAccess().getGroup(), "rule__TargetPlatformDefinition__Group__0");
			builder.put(grammarAccess.getWindowsAccess().getGroup(), "rule__Windows__Group__0");
			builder.put(grammarAccess.getLinuxAccess().getGroup(), "rule__Linux__Group__0");
			builder.put(grammarAccess.getMacOSAccess().getGroup(), "rule__MacOS__Group__0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getGroup(), "rule__NetworkInterface__Group__0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0(), "rule__NetworkInterface__Group_3_0__0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2(), "rule__NetworkInterface__Group_3_0_2__0");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1(), "rule__NetworkInterface__Group_3_1__0");
			builder.put(grammarAccess.getCPUAccess().getGroup(), "rule__CPU__Group__0");
			builder.put(grammarAccess.getCPUAccess().getGroup_3_0(), "rule__CPU__Group_3_0__0");
			builder.put(grammarAccess.getCPUAccess().getGroup_3_1(), "rule__CPU__Group_3_1__0");
			builder.put(grammarAccess.getLoginAccountAccess().getGroup(), "rule__LoginAccount__Group__0");
			builder.put(grammarAccess.getLoginAccountAccess().getGroup_3_0(), "rule__LoginAccount__Group_3_0__0");
			builder.put(grammarAccess.getLoginAccountAccess().getGroup_3_1(), "rule__LoginAccount__Group_3_1__0");
			builder.put(grammarAccess.getTargetMiddlewareAccess().getGroup(), "rule__TargetMiddleware__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getGroup(), "rule__ACE_SmartSoft__Group__0");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getGroup_2(), "rule__ACE_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup(), "rule__OpcUa_SeRoNet__Group__0");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2(), "rule__OpcUa_SeRoNet__Group_2__0");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getGroup(), "rule__CORBA_SmartSoft__Group__0");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2(), "rule__CORBA_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getGroup(), "rule__DDS_SmartSoft__Group__0");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getGroup_2(), "rule__DDS_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1(), "rule__TargetPlatformModel__NameAssignment_1");
			builder.put(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3(), "rule__TargetPlatformModel__ElementsAssignment_3");
			builder.put(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2(), "rule__NetworkConnection__Endpoint1Assignment_2");
			builder.put(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4(), "rule__NetworkConnection__Endpoint2Assignment_4");
			builder.put(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1(), "rule__NetworkConnection__KindAssignment_5_1");
			builder.put(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1(), "rule__TargetPlatformDefinition__NameAssignment_1");
			builder.put(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3(), "rule__TargetPlatformDefinition__OsAssignment_3");
			builder.put(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4(), "rule__TargetPlatformDefinition__ElementsAssignment_4");
			builder.put(grammarAccess.getWindowsAccess().getKindAssignment_2(), "rule__Windows__KindAssignment_2");
			builder.put(grammarAccess.getLinuxAccess().getKindAssignment_2(), "rule__Linux__KindAssignment_2");
			builder.put(grammarAccess.getMacOSAccess().getKindAssignment_2(), "rule__MacOS__KindAssignment_2");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1(), "rule__NetworkInterface__NameAssignment_1");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1(), "rule__NetworkInterface__HostAddressAssignment_3_0_1");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1(), "rule__NetworkInterface__PortNrAssignment_3_0_2_1");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1(), "rule__NetworkInterface__KindAssignment_3_1_1");
			builder.put(grammarAccess.getCPUAccess().getNameAssignment_1(), "rule__CPU__NameAssignment_1");
			builder.put(grammarAccess.getCPUAccess().getKindAssignment_3_0_1(), "rule__CPU__KindAssignment_3_0_1");
			builder.put(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1(), "rule__CPU__CoresTallyAssignment_3_1_1");
			builder.put(grammarAccess.getLoginAccountAccess().getNameAssignment_1(), "rule__LoginAccount__NameAssignment_1");
			builder.put(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1(), "rule__LoginAccount__FullnameAssignment_3_0_1");
			builder.put(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1(), "rule__LoginAccount__EmailAssignment_3_1_1");
			builder.put(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1(), "rule__TargetMiddleware__MiddlewareAssignment_1");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__ACE_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1(), "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__CORBA_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__DDS_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), "rule__NetworkInterface__UnorderedGroup_3");
			builder.put(grammarAccess.getCPUAccess().getUnorderedGroup_3(), "rule__CPU__UnorderedGroup_3");
			builder.put(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), "rule__LoginAccount__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TargetPlatformGrammarAccess grammarAccess;

	@Override
	protected InternalTargetPlatformParser createParser() {
		InternalTargetPlatformParser result = new InternalTargetPlatformParser(null);
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

	public TargetPlatformGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TargetPlatformGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
