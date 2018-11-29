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
package org.xtext.component.componentDocumentation.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ecore.component.componentDocumentation.ComponentDocumentation;
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.ComponentModeDocu;
import org.ecore.component.componentDocumentation.ComponentServiceDocu;
import org.ecore.component.componentDocumentation.CoordinationSlavePortDocu;
import org.ecore.component.componentDocumentation.NeutralModeDocu;
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;

@SuppressWarnings("all")
public class ComponentDocumentationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentDocumentationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentDocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION:
				sequence_ComponentDocumentation(context, (ComponentDocumentation) semanticObject); 
				return; 
			case ComponentDocumentationPackage.COMPONENT_MODE_DOCU:
				sequence_ComponentModeDocu(context, (ComponentModeDocu) semanticObject); 
				return; 
			case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU:
				sequence_ComponentServiceDocu(context, (ComponentServiceDocu) semanticObject); 
				return; 
			case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU:
				sequence_CoordinationSlavePortDocu(context, (CoordinationSlavePortDocu) semanticObject); 
				return; 
			case ComponentDocumentationPackage.NEUTRAL_MODE_DOCU:
				sequence_NeutralModeDocu(context, (NeutralModeDocu) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentDocumentation returns ComponentDocumentation
	 *
	 * Constraint:
	 *     (
	 *         component=[ComponentDefinition|FQN] 
	 *         (description=EString | purpose=EString | license=EString | hardware=EString)* 
	 *         elements+=AbstractComponentDocuElement*
	 *     )
	 */
	protected void sequence_ComponentDocumentation(ISerializationContext context, ComponentDocumentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentDocuElement returns ComponentModeDocu
	 *     AbstractModeDocu returns ComponentModeDocu
	 *     ComponentModeDocu returns ComponentModeDocu
	 *
	 * Constraint:
	 *     (mode=[PublicOperationMode|FQN] description=EString)
	 */
	protected void sequence_ComponentModeDocu(ISerializationContext context, ComponentModeDocu semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDocumentationPackage.Literals.COMPONENT_MODE_DOCU__MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDocumentationPackage.Literals.COMPONENT_MODE_DOCU__MODE));
			if (transientValues.isValueTransient(semanticObject, ComponentDocumentationPackage.Literals.ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDocumentationPackage.Literals.ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeFQNParserRuleCall_1_0_1(), semanticObject.eGet(ComponentDocumentationPackage.Literals.COMPONENT_MODE_DOCU__MODE, false));
		feeder.accept(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentDocuElement returns ComponentServiceDocu
	 *     ComponentServiceDocu returns ComponentServiceDocu
	 *
	 * Constraint:
	 *     (port=[ComponentPort|FQN] description=EString? states+=AbstractModeDocu*)
	 */
	protected void sequence_ComponentServiceDocu(ISerializationContext context, ComponentServiceDocu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentDocuElement returns CoordinationSlavePortDocu
	 *     CoordinationSlavePortDocu returns CoordinationSlavePortDocu
	 *
	 * Constraint:
	 *     (port=[CoordinationSlavePort|FQN] (description=EString | dynamicWiring=EString | state=EString | parameter=EString)*)
	 */
	protected void sequence_CoordinationSlavePortDocu(ISerializationContext context, CoordinationSlavePortDocu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentDocuElement returns NeutralModeDocu
	 *     AbstractModeDocu returns NeutralModeDocu
	 *     NeutralModeDocu returns NeutralModeDocu
	 *
	 * Constraint:
	 *     description=EString
	 */
	protected void sequence_NeutralModeDocu(ISerializationContext context, NeutralModeDocu semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDocumentationPackage.Literals.ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDocumentationPackage.Literals.ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
}
