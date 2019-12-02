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
package org.xtext.system.deployment.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DeploymentGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DeploymentModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.DeploymentModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploymentModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cUsingKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cComponentArchitectureKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cComponentArchAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cComponentArchSystemComponentArchitectureCrossReference_2_2_0 = (CrossReference)cComponentArchAssignment_2_2.eContents().get(0);
		private final RuleCall cComponentArchSystemComponentArchitectureFQNParserRuleCall_2_2_0_1 = (RuleCall)cComponentArchSystemComponentArchitectureCrossReference_2_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsAbstractDeploymentElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DeploymentModel:
		//	'DeploymentModel' name=ID ('using' 'ComponentArchitecture'
		//	componentArch=[componentArchitecture::SystemComponentArchitecture|FQN])?
		//	'{'
		//	elements+=AbstractDeploymentElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DeploymentModel' name=ID ('using' 'ComponentArchitecture'
		//componentArch=[componentArchitecture::SystemComponentArchitecture|FQN])? '{' elements+=AbstractDeploymentElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'DeploymentModel'
		public Keyword getDeploymentModelKeyword_0() { return cDeploymentModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('using' 'ComponentArchitecture' componentArch=[componentArchitecture::SystemComponentArchitecture|FQN])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'using'
		public Keyword getUsingKeyword_2_0() { return cUsingKeyword_2_0; }
		
		//'ComponentArchitecture'
		public Keyword getComponentArchitectureKeyword_2_1() { return cComponentArchitectureKeyword_2_1; }
		
		//componentArch=[componentArchitecture::SystemComponentArchitecture|FQN]
		public Assignment getComponentArchAssignment_2_2() { return cComponentArchAssignment_2_2; }
		
		//[componentArchitecture::SystemComponentArchitecture|FQN]
		public CrossReference getComponentArchSystemComponentArchitectureCrossReference_2_2_0() { return cComponentArchSystemComponentArchitectureCrossReference_2_2_0; }
		
		//FQN
		public RuleCall getComponentArchSystemComponentArchitectureFQNParserRuleCall_2_2_0_1() { return cComponentArchSystemComponentArchitectureFQNParserRuleCall_2_2_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//elements+=AbstractDeploymentElement*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//AbstractDeploymentElement
		public RuleCall getElementsAbstractDeploymentElementParserRuleCall_4_0() { return cElementsAbstractDeploymentElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AbstractDeploymentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.AbstractDeploymentElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNamingServiceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTargetPlatformReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComponentArtefactParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTargetModelIncludeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractDeploymentElement:
		//	NamingService | TargetPlatformReference | ComponentArtefact | TargetModelInclude;
		@Override public ParserRule getRule() { return rule; }
		
		//NamingService | TargetPlatformReference | ComponentArtefact | TargetModelInclude
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NamingService
		public RuleCall getNamingServiceParserRuleCall_0() { return cNamingServiceParserRuleCall_0; }
		
		//TargetPlatformReference
		public RuleCall getTargetPlatformReferenceParserRuleCall_1() { return cTargetPlatformReferenceParserRuleCall_1; }
		
		//ComponentArtefact
		public RuleCall getComponentArtefactParserRuleCall_2() { return cComponentArtefactParserRuleCall_2; }
		
		//TargetModelInclude
		public RuleCall getTargetModelIncludeParserRuleCall_3() { return cTargetModelIncludeParserRuleCall_3; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class TargetModelIncludeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.TargetModelInclude");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceEStringParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TargetModelInclude:
		//	'#import' importedNamespace=EString ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'#import' importedNamespace=EString ';'?
		public Group getGroup() { return cGroup; }
		
		//'#import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=EString
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//EString
		public RuleCall getImportedNamespaceEStringParserRuleCall_1_0() { return cImportedNamespaceEStringParserRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class TargetPlatformReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.TargetPlatformReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetPlatformReferenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cUsingKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPlatformAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPlatformTargetPlatformDefinitionCrossReference_3_0 = (CrossReference)cPlatformAssignment_3.eContents().get(0);
		private final RuleCall cPlatformTargetPlatformDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cPlatformTargetPlatformDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Assignment cDirectoryAssignment_5_0 = (Assignment)cUnorderedGroup_5.eContents().get(0);
		private final RuleCall cDirectoryUploadDirectoryParserRuleCall_5_0_0 = (RuleCall)cDirectoryAssignment_5_0.eContents().get(0);
		private final Assignment cLoginAssignment_5_1 = (Assignment)cUnorderedGroup_5.eContents().get(1);
		private final RuleCall cLoginLoginAccountSelectionParserRuleCall_5_1_0 = (RuleCall)cLoginAssignment_5_1.eContents().get(0);
		private final Assignment cHostAssignment_5_2 = (Assignment)cUnorderedGroup_5.eContents().get(2);
		private final RuleCall cHostNetworkInterfaceSelectionParserRuleCall_5_2_0 = (RuleCall)cHostAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TargetPlatformReference:
		//	'TargetPlatformReference' name=ID 'using' platform=[targetPlatform::TargetPlatformDefinition|FQN] '{'
		//	(directory=UploadDirectory? & login=LoginAccountSelection? & host=NetworkInterfaceSelection?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TargetPlatformReference' name=ID 'using' platform=[targetPlatform::TargetPlatformDefinition|FQN] '{'
		//(directory=UploadDirectory? & login=LoginAccountSelection? & host=NetworkInterfaceSelection?) '}'
		public Group getGroup() { return cGroup; }
		
		//'TargetPlatformReference'
		public Keyword getTargetPlatformReferenceKeyword_0() { return cTargetPlatformReferenceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'using'
		public Keyword getUsingKeyword_2() { return cUsingKeyword_2; }
		
		//platform=[targetPlatform::TargetPlatformDefinition|FQN]
		public Assignment getPlatformAssignment_3() { return cPlatformAssignment_3; }
		
		//[targetPlatform::TargetPlatformDefinition|FQN]
		public CrossReference getPlatformTargetPlatformDefinitionCrossReference_3_0() { return cPlatformTargetPlatformDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getPlatformTargetPlatformDefinitionFQNParserRuleCall_3_0_1() { return cPlatformTargetPlatformDefinitionFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//directory=UploadDirectory? & login=LoginAccountSelection? & host=NetworkInterfaceSelection?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }
		
		//directory=UploadDirectory?
		public Assignment getDirectoryAssignment_5_0() { return cDirectoryAssignment_5_0; }
		
		//UploadDirectory
		public RuleCall getDirectoryUploadDirectoryParserRuleCall_5_0_0() { return cDirectoryUploadDirectoryParserRuleCall_5_0_0; }
		
		//login=LoginAccountSelection?
		public Assignment getLoginAssignment_5_1() { return cLoginAssignment_5_1; }
		
		//LoginAccountSelection
		public RuleCall getLoginLoginAccountSelectionParserRuleCall_5_1_0() { return cLoginLoginAccountSelectionParserRuleCall_5_1_0; }
		
		//host=NetworkInterfaceSelection?
		public Assignment getHostAssignment_5_2() { return cHostAssignment_5_2; }
		
		//NetworkInterfaceSelection
		public RuleCall getHostNetworkInterfaceSelectionParserRuleCall_5_2_0() { return cHostNetworkInterfaceSelectionParserRuleCall_5_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class UploadDirectoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.UploadDirectory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUploadDirectoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_0 = (RuleCall)cPathAssignment_1.eContents().get(0);
		
		//UploadDirectory:
		//	'UploadDirectory' path=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'UploadDirectory' path=STRING
		public Group getGroup() { return cGroup; }
		
		//'UploadDirectory'
		public Keyword getUploadDirectoryKeyword_0() { return cUploadDirectoryKeyword_0; }
		
		//path=STRING
		public Assignment getPathAssignment_1() { return cPathAssignment_1; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_0() { return cPathSTRINGTerminalRuleCall_1_0; }
	}
	public class LoginAccountSelectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.LoginAccountSelection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoginAccountKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLoginAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cLoginLoginAccountCrossReference_1_0 = (CrossReference)cLoginAssignment_1.eContents().get(0);
		private final RuleCall cLoginLoginAccountFQNParserRuleCall_1_0_1 = (RuleCall)cLoginLoginAccountCrossReference_1_0.eContents().get(1);
		
		//LoginAccountSelection:
		//	'LoginAccount' login=[targetPlatform::LoginAccount|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'LoginAccount' login=[targetPlatform::LoginAccount|FQN]
		public Group getGroup() { return cGroup; }
		
		//'LoginAccount'
		public Keyword getLoginAccountKeyword_0() { return cLoginAccountKeyword_0; }
		
		//login=[targetPlatform::LoginAccount|FQN]
		public Assignment getLoginAssignment_1() { return cLoginAssignment_1; }
		
		//[targetPlatform::LoginAccount|FQN]
		public CrossReference getLoginLoginAccountCrossReference_1_0() { return cLoginLoginAccountCrossReference_1_0; }
		
		//FQN
		public RuleCall getLoginLoginAccountFQNParserRuleCall_1_0_1() { return cLoginLoginAccountFQNParserRuleCall_1_0_1; }
	}
	public class NetworkInterfaceSelectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.NetworkInterfaceSelection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNetworkInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNetworkAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNetworkNetworkInterfaceCrossReference_1_0 = (CrossReference)cNetworkAssignment_1.eContents().get(0);
		private final RuleCall cNetworkNetworkInterfaceFQNParserRuleCall_1_0_1 = (RuleCall)cNetworkNetworkInterfaceCrossReference_1_0.eContents().get(1);
		
		//NetworkInterfaceSelection:
		//	'NetworkInterface' network=[targetPlatform::NetworkInterface|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'NetworkInterface' network=[targetPlatform::NetworkInterface|FQN]
		public Group getGroup() { return cGroup; }
		
		//'NetworkInterface'
		public Keyword getNetworkInterfaceKeyword_0() { return cNetworkInterfaceKeyword_0; }
		
		//network=[targetPlatform::NetworkInterface|FQN]
		public Assignment getNetworkAssignment_1() { return cNetworkAssignment_1; }
		
		//[targetPlatform::NetworkInterface|FQN]
		public CrossReference getNetworkNetworkInterfaceCrossReference_1_0() { return cNetworkNetworkInterfaceCrossReference_1_0; }
		
		//FQN
		public RuleCall getNetworkNetworkInterfaceFQNParserRuleCall_1_0_1() { return cNetworkNetworkInterfaceFQNParserRuleCall_1_0_1; }
	}
	public class ComponentArtefactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.ComponentArtefact");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentArtefactKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentComponentInstanceCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentComponentInstanceFQNParserRuleCall_1_0_1 = (RuleCall)cComponentComponentInstanceCrossReference_1_0.eContents().get(1);
		private final Assignment cDeployAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeployDeploymentParserRuleCall_2_0 = (RuleCall)cDeployAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ComponentArtefact:
		//	'ComponentArtefact' component=[componentArchitecture::ComponentInstance|FQN] deploy=Deployment? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentArtefact' component=[componentArchitecture::ComponentInstance|FQN] deploy=Deployment? ';'?
		public Group getGroup() { return cGroup; }
		
		//'ComponentArtefact'
		public Keyword getComponentArtefactKeyword_0() { return cComponentArtefactKeyword_0; }
		
		//component=[componentArchitecture::ComponentInstance|FQN]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }
		
		//[componentArchitecture::ComponentInstance|FQN]
		public CrossReference getComponentComponentInstanceCrossReference_1_0() { return cComponentComponentInstanceCrossReference_1_0; }
		
		//FQN
		public RuleCall getComponentComponentInstanceFQNParserRuleCall_1_0_1() { return cComponentComponentInstanceFQNParserRuleCall_1_0_1; }
		
		//deploy=Deployment?
		public Assignment getDeployAssignment_2() { return cDeployAssignment_2; }
		
		//Deployment
		public RuleCall getDeployDeploymentParserRuleCall_2_0() { return cDeployDeploymentParserRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class NamingServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.NamingService");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNamingServiceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNamingServiceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cPortNrKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cPortNrAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cPortNrEIntParserRuleCall_3_0_1_0 = (RuleCall)cPortNrAssignment_3_0_1.eContents().get(0);
		private final Assignment cDeployAssignment_3_1 = (Assignment)cUnorderedGroup_3.eContents().get(1);
		private final RuleCall cDeployDeploymentParserRuleCall_3_1_0 = (RuleCall)cDeployAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//NamingService:
		//	{NamingService}
		//	'NamingService'
		//	'{' (('portNr' portNr=EInt)? & deploy=Deployment?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{NamingService} 'NamingService' '{' (('portNr' portNr=EInt)? & deploy=Deployment?) '}'
		public Group getGroup() { return cGroup; }
		
		//{NamingService}
		public Action getNamingServiceAction_0() { return cNamingServiceAction_0; }
		
		//'NamingService'
		public Keyword getNamingServiceKeyword_1() { return cNamingServiceKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('portNr' portNr=EInt)? & deploy=Deployment?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('portNr' portNr=EInt)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'portNr'
		public Keyword getPortNrKeyword_3_0_0() { return cPortNrKeyword_3_0_0; }
		
		//portNr=EInt
		public Assignment getPortNrAssignment_3_0_1() { return cPortNrAssignment_3_0_1; }
		
		//EInt
		public RuleCall getPortNrEIntParserRuleCall_3_0_1_0() { return cPortNrEIntParserRuleCall_3_0_1_0; }
		
		//deploy=Deployment?
		public Assignment getDeployAssignment_3_1() { return cDeployAssignment_3_1; }
		
		//Deployment
		public RuleCall getDeployDeploymentParserRuleCall_3_1_0() { return cDeployDeploymentParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.deployment.Deployment.Deployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeployToKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cToAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cToTargetPlatformReferenceCrossReference_1_0 = (CrossReference)cToAssignment_1.eContents().get(0);
		private final RuleCall cToTargetPlatformReferenceFQNParserRuleCall_1_0_1 = (RuleCall)cToTargetPlatformReferenceCrossReference_1_0.eContents().get(1);
		
		//Deployment:
		//	'deploy-to' to=[TargetPlatformReference|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'deploy-to' to=[TargetPlatformReference|FQN]
		public Group getGroup() { return cGroup; }
		
		//'deploy-to'
		public Keyword getDeployToKeyword_0() { return cDeployToKeyword_0; }
		
		//to=[TargetPlatformReference|FQN]
		public Assignment getToAssignment_1() { return cToAssignment_1; }
		
		//[TargetPlatformReference|FQN]
		public CrossReference getToTargetPlatformReferenceCrossReference_1_0() { return cToTargetPlatformReferenceCrossReference_1_0; }
		
		//FQN
		public RuleCall getToTargetPlatformReferenceFQNParserRuleCall_1_0_1() { return cToTargetPlatformReferenceFQNParserRuleCall_1_0_1; }
	}
	
	
	private final DeploymentModelElements pDeploymentModel;
	private final AbstractDeploymentElementElements pAbstractDeploymentElement;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	private final FQNElements pFQN;
	private final TargetModelIncludeElements pTargetModelInclude;
	private final TargetPlatformReferenceElements pTargetPlatformReference;
	private final UploadDirectoryElements pUploadDirectory;
	private final LoginAccountSelectionElements pLoginAccountSelection;
	private final NetworkInterfaceSelectionElements pNetworkInterfaceSelection;
	private final ComponentArtefactElements pComponentArtefact;
	private final NamingServiceElements pNamingService;
	private final DeploymentElements pDeployment;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DeploymentGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDeploymentModel = new DeploymentModelElements();
		this.pAbstractDeploymentElement = new AbstractDeploymentElementElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
		this.pFQN = new FQNElements();
		this.pTargetModelInclude = new TargetModelIncludeElements();
		this.pTargetPlatformReference = new TargetPlatformReferenceElements();
		this.pUploadDirectory = new UploadDirectoryElements();
		this.pLoginAccountSelection = new LoginAccountSelectionElements();
		this.pNetworkInterfaceSelection = new NetworkInterfaceSelectionElements();
		this.pComponentArtefact = new ComponentArtefactElements();
		this.pNamingService = new NamingServiceElements();
		this.pDeployment = new DeploymentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.deployment.Deployment".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DeploymentModel:
	//	'DeploymentModel' name=ID ('using' 'ComponentArchitecture'
	//	componentArch=[componentArchitecture::SystemComponentArchitecture|FQN])?
	//	'{'
	//	elements+=AbstractDeploymentElement*
	//	'}';
	public DeploymentModelElements getDeploymentModelAccess() {
		return pDeploymentModel;
	}
	
	public ParserRule getDeploymentModelRule() {
		return getDeploymentModelAccess().getRule();
	}
	
	//AbstractDeploymentElement:
	//	NamingService | TargetPlatformReference | ComponentArtefact | TargetModelInclude;
	public AbstractDeploymentElementElements getAbstractDeploymentElementAccess() {
		return pAbstractDeploymentElement;
	}
	
	public ParserRule getAbstractDeploymentElementRule() {
		return getAbstractDeploymentElementAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//TargetModelInclude:
	//	'#import' importedNamespace=EString ';'?;
	public TargetModelIncludeElements getTargetModelIncludeAccess() {
		return pTargetModelInclude;
	}
	
	public ParserRule getTargetModelIncludeRule() {
		return getTargetModelIncludeAccess().getRule();
	}
	
	//TargetPlatformReference:
	//	'TargetPlatformReference' name=ID 'using' platform=[targetPlatform::TargetPlatformDefinition|FQN] '{'
	//	(directory=UploadDirectory? & login=LoginAccountSelection? & host=NetworkInterfaceSelection?)
	//	'}';
	public TargetPlatformReferenceElements getTargetPlatformReferenceAccess() {
		return pTargetPlatformReference;
	}
	
	public ParserRule getTargetPlatformReferenceRule() {
		return getTargetPlatformReferenceAccess().getRule();
	}
	
	//UploadDirectory:
	//	'UploadDirectory' path=STRING;
	public UploadDirectoryElements getUploadDirectoryAccess() {
		return pUploadDirectory;
	}
	
	public ParserRule getUploadDirectoryRule() {
		return getUploadDirectoryAccess().getRule();
	}
	
	//LoginAccountSelection:
	//	'LoginAccount' login=[targetPlatform::LoginAccount|FQN];
	public LoginAccountSelectionElements getLoginAccountSelectionAccess() {
		return pLoginAccountSelection;
	}
	
	public ParserRule getLoginAccountSelectionRule() {
		return getLoginAccountSelectionAccess().getRule();
	}
	
	//NetworkInterfaceSelection:
	//	'NetworkInterface' network=[targetPlatform::NetworkInterface|FQN];
	public NetworkInterfaceSelectionElements getNetworkInterfaceSelectionAccess() {
		return pNetworkInterfaceSelection;
	}
	
	public ParserRule getNetworkInterfaceSelectionRule() {
		return getNetworkInterfaceSelectionAccess().getRule();
	}
	
	//ComponentArtefact:
	//	'ComponentArtefact' component=[componentArchitecture::ComponentInstance|FQN] deploy=Deployment? ';'?;
	public ComponentArtefactElements getComponentArtefactAccess() {
		return pComponentArtefact;
	}
	
	public ParserRule getComponentArtefactRule() {
		return getComponentArtefactAccess().getRule();
	}
	
	//NamingService:
	//	{NamingService}
	//	'NamingService'
	//	'{' (('portNr' portNr=EInt)? & deploy=Deployment?)
	//	'}';
	public NamingServiceElements getNamingServiceAccess() {
		return pNamingService;
	}
	
	public ParserRule getNamingServiceRule() {
		return getNamingServiceAccess().getRule();
	}
	
	//Deployment:
	//	'deploy-to' to=[TargetPlatformReference|FQN];
	public DeploymentElements getDeploymentAccess() {
		return pDeployment;
	}
	
	public ParserRule getDeploymentRule() {
		return getDeploymentAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
