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
package org.xtext.system.deployment.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.deployment.ide.contentassist.antlr.internal.InternalDeploymentParser;
import org.xtext.system.deployment.services.DeploymentGrammarAccess;

public class DeploymentParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DeploymentGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeploymentGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractDeploymentElementAccess().getAlternatives(), "rule__AbstractDeploymentElement__Alternatives");
			builder.put(grammarAccess.getDeploymentModelAccess().getGroup(), "rule__DeploymentModel__Group__0");
			builder.put(grammarAccess.getDeploymentModelAccess().getGroup_2(), "rule__DeploymentModel__Group_2__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getTargetModelIncludeAccess().getGroup(), "rule__TargetModelInclude__Group__0");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getGroup(), "rule__TargetPlatformReference__Group__0");
			builder.put(grammarAccess.getUploadDirectoryAccess().getGroup(), "rule__UploadDirectory__Group__0");
			builder.put(grammarAccess.getLoginAccountSelectionAccess().getGroup(), "rule__LoginAccountSelection__Group__0");
			builder.put(grammarAccess.getNetworkInterfaceSelectionAccess().getGroup(), "rule__NetworkInterfaceSelection__Group__0");
			builder.put(grammarAccess.getComponentArtefactAccess().getGroup(), "rule__ComponentArtefact__Group__0");
			builder.put(grammarAccess.getNamingServiceAccess().getGroup(), "rule__NamingService__Group__0");
			builder.put(grammarAccess.getNamingServiceAccess().getGroup_3_0(), "rule__NamingService__Group_3_0__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
			builder.put(grammarAccess.getDeploymentModelAccess().getNameAssignment_1(), "rule__DeploymentModel__NameAssignment_1");
			builder.put(grammarAccess.getDeploymentModelAccess().getComponentArchAssignment_2_2(), "rule__DeploymentModel__ComponentArchAssignment_2_2");
			builder.put(grammarAccess.getDeploymentModelAccess().getElementsAssignment_4(), "rule__DeploymentModel__ElementsAssignment_4");
			builder.put(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceAssignment_1(), "rule__TargetModelInclude__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getNameAssignment_1(), "rule__TargetPlatformReference__NameAssignment_1");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getPlatformAssignment_3(), "rule__TargetPlatformReference__PlatformAssignment_3");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryAssignment_5_0(), "rule__TargetPlatformReference__DirectoryAssignment_5_0");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getLoginAssignment_5_1(), "rule__TargetPlatformReference__LoginAssignment_5_1");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getHostAssignment_5_2(), "rule__TargetPlatformReference__HostAssignment_5_2");
			builder.put(grammarAccess.getUploadDirectoryAccess().getPathAssignment_1(), "rule__UploadDirectory__PathAssignment_1");
			builder.put(grammarAccess.getLoginAccountSelectionAccess().getLoginAssignment_1(), "rule__LoginAccountSelection__LoginAssignment_1");
			builder.put(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkAssignment_1(), "rule__NetworkInterfaceSelection__NetworkAssignment_1");
			builder.put(grammarAccess.getComponentArtefactAccess().getComponentAssignment_1(), "rule__ComponentArtefact__ComponentAssignment_1");
			builder.put(grammarAccess.getComponentArtefactAccess().getDeployAssignment_2(), "rule__ComponentArtefact__DeployAssignment_2");
			builder.put(grammarAccess.getNamingServiceAccess().getPortNrAssignment_3_0_1(), "rule__NamingService__PortNrAssignment_3_0_1");
			builder.put(grammarAccess.getNamingServiceAccess().getDeployAssignment_3_1(), "rule__NamingService__DeployAssignment_3_1");
			builder.put(grammarAccess.getDeploymentAccess().getToAssignment_1(), "rule__Deployment__ToAssignment_1");
			builder.put(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), "rule__TargetPlatformReference__UnorderedGroup_5");
			builder.put(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), "rule__NamingService__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DeploymentGrammarAccess grammarAccess;

	@Override
	protected InternalDeploymentParser createParser() {
		InternalDeploymentParser result = new InternalDeploymentParser(null);
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

	public DeploymentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeploymentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
