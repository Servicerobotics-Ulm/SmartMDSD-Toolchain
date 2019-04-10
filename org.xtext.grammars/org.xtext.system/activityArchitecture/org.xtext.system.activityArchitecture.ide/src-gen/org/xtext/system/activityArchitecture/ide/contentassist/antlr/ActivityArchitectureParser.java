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
package org.xtext.system.activityArchitecture.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.activityArchitecture.ide.contentassist.antlr.internal.InternalActivityArchitectureParser;
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

public class ActivityArchitectureParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ActivityArchitectureGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ActivityArchitectureGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getAbstractActivityArchitectureElementAccess().getAlternatives(), "rule__AbstractActivityArchitectureElement__Alternatives");
			builder.put(grammarAccess.getAbstractSourceNodeAccess().getAlternatives(), "rule__AbstractSourceNode__Alternatives");
			builder.put(grammarAccess.getAbstractInputNodeAccess().getAlternatives(), "rule__AbstractInputNode__Alternatives");
			builder.put(grammarAccess.getActivationSourceAccess().getAlternatives(), "rule__ActivationSource__Alternatives");
			builder.put(grammarAccess.getSchedulerTypeAccess().getAlternatives(), "rule__SchedulerType__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getActivityArchitectureModelAccess().getGroup(), "rule__ActivityArchitectureModel__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getDataFlowAccess().getGroup(), "rule__DataFlow__Group__0");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getGroup(), "rule__InputHandlerNode__Group__0");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getGroup_4(), "rule__InputHandlerNode__Group_4__0");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getGroup_5(), "rule__InputHandlerNode__Group_5__0");
			builder.put(grammarAccess.getHandlerTriggerInputNodeAccess().getGroup(), "rule__HandlerTriggerInputNode__Group__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup(), "rule__ActivityNode__Group__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_4(), "rule__ActivityNode__Group_4__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5_0(), "rule__ActivityNode__Group_5_0__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5_1(), "rule__ActivityNode__Group_5_1__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5_2(), "rule__ActivityNode__Group_5_2__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5_3(), "rule__ActivityNode__Group_5_3__0");
			builder.put(grammarAccess.getRegisterInputNodeAccess().getGroup(), "rule__RegisterInputNode__Group__0");
			builder.put(grammarAccess.getTriggerInputNodeAccess().getGroup(), "rule__TriggerInputNode__Group__0");
			builder.put(grammarAccess.getSporadicAccess().getGroup(), "rule__Sporadic__Group__0");
			builder.put(grammarAccess.getSporadicAccess().getGroup_3_0(), "rule__Sporadic__Group_3_0__0");
			builder.put(grammarAccess.getSporadicAccess().getGroup_3_1(), "rule__Sporadic__Group_3_1__0");
			builder.put(grammarAccess.getDataTriggeredAccess().getGroup(), "rule__DataTriggered__Group__0");
			builder.put(grammarAccess.getPeriodicTimerAccess().getGroup(), "rule__PeriodicTimer__Group__0");
			builder.put(grammarAccess.getSchedulerAccess().getGroup(), "rule__Scheduler__Group__0");
			builder.put(grammarAccess.getSchedulerAccess().getGroup_2_0(), "rule__Scheduler__Group_2_0__0");
			builder.put(grammarAccess.getSchedulerAccess().getGroup_2_1(), "rule__Scheduler__Group_2_1__0");
			builder.put(grammarAccess.getCPUCoreAccess().getGroup(), "rule__CPUCore__Group__0");
			builder.put(grammarAccess.getExecutionTimeAccess().getGroup(), "rule__ExecutionTime__Group__0");
			builder.put(grammarAccess.getExecutionTimeAccess().getGroup_1_0(), "rule__ExecutionTime__Group_1_0__0");
			builder.put(grammarAccess.getExecutionTimeAccess().getGroup_1_1(), "rule__ExecutionTime__Group_1_1__0");
			builder.put(grammarAccess.getTimeValueAccess().getGroup(), "rule__TimeValue__Group__0");
			builder.put(grammarAccess.getActivityArchitectureModelAccess().getNameAssignment_2(), "rule__ActivityArchitectureModel__NameAssignment_2");
			builder.put(grammarAccess.getActivityArchitectureModelAccess().getElementsAssignment_4(), "rule__ActivityArchitectureModel__ElementsAssignment_4");
			builder.put(grammarAccess.getDataFlowAccess().getSourceAssignment_3(), "rule__DataFlow__SourceAssignment_3");
			builder.put(grammarAccess.getDataFlowAccess().getDestinationAssignment_5(), "rule__DataFlow__DestinationAssignment_5");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getNameAssignment_2(), "rule__InputHandlerNode__NameAssignment_2");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getInputNodeAssignment_4_1(), "rule__InputHandlerNode__InputNodeAssignment_4_1");
			builder.put(grammarAccess.getInputHandlerNodeAccess().getPrescaleAssignment_5_1(), "rule__InputHandlerNode__PrescaleAssignment_5_1");
			builder.put(grammarAccess.getHandlerTriggerInputNodeAccess().getNameAssignment_2(), "rule__HandlerTriggerInputNode__NameAssignment_2");
			builder.put(grammarAccess.getActivityNodeAccess().getNameAssignment_2(), "rule__ActivityNode__NameAssignment_2");
			builder.put(grammarAccess.getActivityNodeAccess().getInputsAssignment_4_2(), "rule__ActivityNode__InputsAssignment_4_2");
			builder.put(grammarAccess.getActivityNodeAccess().getAffinityAssignment_5_0_1(), "rule__ActivityNode__AffinityAssignment_5_0_1");
			builder.put(grammarAccess.getActivityNodeAccess().getActivationSourceAssignment_5_1_1(), "rule__ActivityNode__ActivationSourceAssignment_5_1_1");
			builder.put(grammarAccess.getActivityNodeAccess().getExecutionTimeAssignment_5_2_1(), "rule__ActivityNode__ExecutionTimeAssignment_5_2_1");
			builder.put(grammarAccess.getActivityNodeAccess().getSchedulerAssignment_5_3_1(), "rule__ActivityNode__SchedulerAssignment_5_3_1");
			builder.put(grammarAccess.getRegisterInputNodeAccess().getNameAssignment_2(), "rule__RegisterInputNode__NameAssignment_2");
			builder.put(grammarAccess.getTriggerInputNodeAccess().getNameAssignment_2(), "rule__TriggerInputNode__NameAssignment_2");
			builder.put(grammarAccess.getSporadicAccess().getMinActFreqAssignment_3_0_1(), "rule__Sporadic__MinActFreqAssignment_3_0_1");
			builder.put(grammarAccess.getSporadicAccess().getMaxActFreqAssignment_3_1_1(), "rule__Sporadic__MaxActFreqAssignment_3_1_1");
			builder.put(grammarAccess.getDataTriggeredAccess().getTriggerRefAssignment_1(), "rule__DataTriggered__TriggerRefAssignment_1");
			builder.put(grammarAccess.getDataTriggeredAccess().getPrescaleAssignment_4(), "rule__DataTriggered__PrescaleAssignment_4");
			builder.put(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqAssignment_3(), "rule__PeriodicTimer__PeriodicActFreqAssignment_3");
			builder.put(grammarAccess.getSchedulerAccess().getTypeAssignment_2_0_1(), "rule__Scheduler__TypeAssignment_2_0_1");
			builder.put(grammarAccess.getSchedulerAccess().getPriorityAssignment_2_1_1(), "rule__Scheduler__PriorityAssignment_2_1_1");
			builder.put(grammarAccess.getCPUCoreAccess().getNameAssignment_1(), "rule__CPUCore__NameAssignment_1");
			builder.put(grammarAccess.getCPUCoreAccess().getCoreNumberAssignment_4(), "rule__CPUCore__CoreNumberAssignment_4");
			builder.put(grammarAccess.getExecutionTimeAccess().getMinTimeAssignment_1_0_1(), "rule__ExecutionTime__MinTimeAssignment_1_0_1");
			builder.put(grammarAccess.getExecutionTimeAccess().getMaxTimeAssignment_1_1_1(), "rule__ExecutionTime__MaxTimeAssignment_1_1_1");
			builder.put(grammarAccess.getTimeValueAccess().getValueAssignment_0(), "rule__TimeValue__ValueAssignment_0");
			builder.put(grammarAccess.getTimeValueAccess().getUnitAssignment_1(), "rule__TimeValue__UnitAssignment_1");
			builder.put(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), "rule__ActivityNode__UnorderedGroup_5");
			builder.put(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), "rule__Sporadic__UnorderedGroup_3");
			builder.put(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), "rule__Scheduler__UnorderedGroup_2");
			builder.put(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), "rule__ExecutionTime__UnorderedGroup_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ActivityArchitectureGrammarAccess grammarAccess;

	@Override
	protected InternalActivityArchitectureParser createParser() {
		InternalActivityArchitectureParser result = new InternalActivityArchitectureParser(null);
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

	public ActivityArchitectureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActivityArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
