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
grammar InternalComponentArchitecture;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.system.componentArchitecture.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.system.componentArchitecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

}

@parser::members {

 	private ComponentArchitectureGrammarAccess grammarAccess;

    public InternalComponentArchitectureParser(TokenStream input, ComponentArchitectureGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SystemComponentArchitecture";
   	}

   	@Override
   	protected ComponentArchitectureGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystemComponentArchitecture
entryRuleSystemComponentArchitecture returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemComponentArchitectureRule()); }
	iv_ruleSystemComponentArchitecture=ruleSystemComponentArchitecture
	{ $current=$iv_ruleSystemComponentArchitecture.current; }
	EOF;

// Rule SystemComponentArchitecture
ruleSystemComponentArchitecture returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0(),
					$current);
			}
		)
		otherlv_1='SystemComponentArchitecture'
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemComponentArchitectureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='usingActivityArchitecture'
			{
				newLeafNode(otherlv_3, grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSystemComponentArchitectureRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0());
				}
				lv_components_6_0=ruleComponentInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
					}
					add(
						$current,
						"components",
						lv_components_6_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0());
				}
				lv_connections_7_0=ruleConnection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
					}
					add(
						$current,
						"connections",
						lv_connections_7_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.Connection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0());
				}
				lv_extensions_8_0=ruleSystemExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_8_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.SystemExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleSystemExtension
entryRuleSystemExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemExtensionRule()); }
	iv_ruleSystemExtension=ruleSystemExtension
	{ $current=$iv_ruleSystemExtension.current; }
	EOF;

// Rule SystemExtension
ruleSystemExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0());
		}
		this_CoordinationModuleMapping_0=ruleCoordinationModuleMapping
		{
			$current = $this_CoordinationModuleMapping_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1());
		}
		this_TaskRealizationModelRef_1=ruleTaskRealizationModelRef
		{
			$current = $this_TaskRealizationModelRef_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleConnection=ruleConnection
	{ $current=$iv_ruleConnection.current; }
	EOF;

// Rule Connection
ruleConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Connection'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='useMiddleware'
			{
				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0());
					}
					lv_middlewareSelection_5_0=ruleRoboticMiddleware
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConnectionRule());
						}
						set(
							$current,
							"middlewareSelection",
							lv_middlewareSelection_5_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getSemicolonKeyword_5());
			}
		)?
	)
;

// Entry rule entryRuleComponentInstance
entryRuleComponentInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentInstanceRule()); }
	iv_ruleComponentInstance=ruleComponentInstance
	{ $current=$iv_ruleComponentInstance.current; }
	EOF;

// Rule ComponentInstance
ruleComponentInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='instantiates'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0());
				}
				lv_ports_5_0=ruleServiceInstance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
					}
					add(
						$current,
						"ports",
						lv_ports_5_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.ServiceInstance");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0());
				}
				lv_extensions_6_0=ruleComponentInstanceExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_6_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstanceExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleComponentInstanceExtension
entryRuleComponentInstanceExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentInstanceExtensionRule()); }
	iv_ruleComponentInstanceExtension=ruleComponentInstanceExtension
	{ $current=$iv_ruleComponentInstanceExtension.current; }
	EOF;

// Rule ComponentInstanceExtension
ruleComponentInstanceExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0());
		}
		this_ParameterStructInstance_0=ruleParameterStructInstance
		{
			$current = $this_ParameterStructInstance_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1());
		}
		this_ActivityConfigurationMapping_1=ruleActivityConfigurationMapping
		{
			$current = $this_ActivityConfigurationMapping_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2());
		}
		this_InputHandlerConfigurationMapping_2=ruleInputHandlerConfigurationMapping
		{
			$current = $this_InputHandlerConfigurationMapping_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3());
		}
		this_OpcUaDeviceClientInstance_3=ruleOpcUaDeviceClientInstance
		{
			$current = $this_OpcUaDeviceClientInstance_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4());
		}
		this_OpcUaReadServerInstance_4=ruleOpcUaReadServerInstance
		{
			$current = $this_OpcUaReadServerInstance_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParameterStructInstance
entryRuleParameterStructInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterStructInstanceRule()); }
	iv_ruleParameterStructInstance=ruleParameterStructInstance
	{ $current=$iv_ruleParameterStructInstance.current; }
	EOF;

// Rule ParameterStructInstance
ruleParameterStructInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ParameterStructInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterStructInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleActivityConfigurationMapping
entryRuleActivityConfigurationMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityConfigurationMappingRule()); }
	iv_ruleActivityConfigurationMapping=ruleActivityConfigurationMapping
	{ $current=$iv_ruleActivityConfigurationMapping.current; }
	EOF;

// Rule ActivityConfigurationMapping
ruleActivityConfigurationMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Activity'
		{
			newLeafNode(otherlv_0, grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='configuration'
		{
			newLeafNode(otherlv_2, grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleInputHandlerConfigurationMapping
entryRuleInputHandlerConfigurationMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingRule()); }
	iv_ruleInputHandlerConfigurationMapping=ruleInputHandlerConfigurationMapping
	{ $current=$iv_ruleInputHandlerConfigurationMapping.current; }
	EOF;

// Rule InputHandlerConfigurationMapping
ruleInputHandlerConfigurationMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InputHandler'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='configuration'
		{
			newLeafNode(otherlv_2, grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleOpcUaDeviceClientInstance
entryRuleOpcUaDeviceClientInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceRule()); }
	iv_ruleOpcUaDeviceClientInstance=ruleOpcUaDeviceClientInstance
	{ $current=$iv_ruleOpcUaDeviceClientInstance.current; }
	EOF;

// Rule OpcUaDeviceClientInstance
ruleOpcUaDeviceClientInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OpcUaDeviceClientInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaDeviceClientInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='deviceURI'
		{
			newLeafNode(otherlv_2, grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0());
				}
				lv_deviceURI_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientInstanceRule());
					}
					set(
						$current,
						"deviceURI",
						lv_deviceURI_3_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleOpcUaReadServerInstance
entryRuleOpcUaReadServerInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUaReadServerInstanceRule()); }
	iv_ruleOpcUaReadServerInstance=ruleOpcUaReadServerInstance
	{ $current=$iv_ruleOpcUaReadServerInstance.current; }
	EOF;

// Rule OpcUaReadServerInstance
ruleOpcUaReadServerInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OpcUaReadServerInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaReadServerInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='portNumber'
			{
				newLeafNode(otherlv_2, grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0());
					}
					lv_portNumber_3_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOpcUaReadServerInstanceRule());
						}
						set(
							$current,
							"portNumber",
							lv_portNumber_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleServiceInstance
entryRuleServiceInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceInstanceRule()); }
	iv_ruleServiceInstance=ruleServiceInstance
	{ $current=$iv_ruleServiceInstance.current; }
	EOF;

// Rule ServiceInstance
ruleServiceInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0());
		}
		this_RequiredService_0=ruleRequiredService
		{
			$current = $this_RequiredService_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1());
		}
		this_ProvidedService_1=ruleProvidedService
		{
			$current = $this_ProvidedService_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRequiredService
entryRuleRequiredService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredServiceRule()); }
	iv_ruleRequiredService=ruleRequiredService
	{ $current=$iv_ruleRequiredService.current; }
	EOF;

// Rule RequiredService
ruleRequiredService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RequiredService'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredServiceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleProvidedService
entryRuleProvidedService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedServiceRule()); }
	iv_ruleProvidedService=ruleProvidedService
	{ $current=$iv_ruleProvidedService.current; }
	EOF;

// Rule ProvidedService
ruleProvidedService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ProvidedService'
		{
			newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProvidedServiceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleCoordinationModuleMapping
entryRuleCoordinationModuleMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationModuleMappingRule()); }
	iv_ruleCoordinationModuleMapping=ruleCoordinationModuleMapping
	{ $current=$iv_ruleCoordinationModuleMapping.current; }
	EOF;

// Rule CoordinationModuleMapping
ruleCoordinationModuleMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationModuleMapping'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='moduleInstance'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationModuleMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='realizedby'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationModuleMappingRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0());
				}
			)
		)
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0());
				}
				lv_coordInterCompInstMapping_7_0=ruleCoordinationInterfaceComponentInstanceMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationModuleMappingRule());
					}
					add(
						$current,
						"coordInterCompInstMapping",
						lv_coordInterCompInstMapping_7_0,
						"org.xtext.system.componentArchitecture.ComponentArchitecture.CoordinationInterfaceComponentInstanceMapping");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleCoordinationInterfaceComponentInstanceMapping
entryRuleCoordinationInterfaceComponentInstanceMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); }
	iv_ruleCoordinationInterfaceComponentInstanceMapping=ruleCoordinationInterfaceComponentInstanceMapping
	{ $current=$iv_ruleCoordinationInterfaceComponentInstanceMapping.current; }
	EOF;

// Rule CoordinationInterfaceComponentInstanceMapping
ruleCoordinationInterfaceComponentInstanceMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='interfaceInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0());
				}
			)
		)
		otherlv_2='realizedby'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTaskRealizationModelRef
entryRuleTaskRealizationModelRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRealizationModelRefRule()); }
	iv_ruleTaskRealizationModelRef=ruleTaskRealizationModelRef
	{ $current=$iv_ruleTaskRealizationModelRef.current; }
	EOF;

// Rule TaskRealizationModelRef
ruleTaskRealizationModelRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='BehaviorTaskRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRealizationModelRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRoboticMiddleware
entryRuleRoboticMiddleware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoboticMiddlewareRule()); }
	iv_ruleRoboticMiddleware=ruleRoboticMiddleware
	{ $current=$iv_ruleRoboticMiddleware.current; }
	EOF;

// Rule RoboticMiddleware
ruleRoboticMiddleware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0());
		}
		this_ACE_SmartSoft_0=ruleACE_SmartSoft
		{
			$current = $this_ACE_SmartSoft_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1());
		}
		this_OpcUa_SeRoNet_1=ruleOpcUa_SeRoNet
		{
			$current = $this_OpcUa_SeRoNet_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2());
		}
		this_CORBA_SmartSoft_2=ruleCORBA_SmartSoft
		{
			$current = $this_CORBA_SmartSoft_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3());
		}
		this_DDS_SmartSoft_3=ruleDDS_SmartSoft
		{
			$current = $this_DDS_SmartSoft_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleACE_SmartSoft
entryRuleACE_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getACE_SmartSoftRule()); }
	iv_ruleACE_SmartSoft=ruleACE_SmartSoft
	{ $current=$iv_ruleACE_SmartSoft.current; }
	EOF;

// Rule ACE_SmartSoft
ruleACE_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='ACE_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getACE_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOpcUa_SeRoNet
entryRuleOpcUa_SeRoNet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUa_SeRoNetRule()); }
	iv_ruleOpcUa_SeRoNet=ruleOpcUa_SeRoNet
	{ $current=$iv_ruleOpcUa_SeRoNet.current; }
	EOF;

// Rule OpcUa_SeRoNet
ruleOpcUa_SeRoNet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
					$current);
			}
		)
		otherlv_1='OpcUa_SeRoNet'
		{
			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOpcUa_SeRoNetRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCORBA_SmartSoft
entryRuleCORBA_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCORBA_SmartSoftRule()); }
	iv_ruleCORBA_SmartSoft=ruleCORBA_SmartSoft
	{ $current=$iv_ruleCORBA_SmartSoft.current; }
	EOF;

// Rule CORBA_SmartSoft
ruleCORBA_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='CORBA_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCORBA_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDDS_SmartSoft
entryRuleDDS_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDDS_SmartSoftRule()); }
	iv_ruleDDS_SmartSoft=ruleDDS_SmartSoft
	{ $current=$iv_ruleDDS_SmartSoft.current; }
	EOF;

// Rule DDS_SmartSoft
ruleDDS_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='DDS_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDDS_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

fragment RULE_ML_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~('/') ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_SL_DOCUMENTATION : '///' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_DOCU_COMMENT : (RULE_ML_DOCUMENTATION|RULE_SL_DOCUMENTATION);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
