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
package org.xtext.system.deployment.serializer;

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
import org.ecore.system.deployment.ComponentArtefact;
import org.ecore.system.deployment.Deployment;
import org.ecore.system.deployment.DeploymentModel;
import org.ecore.system.deployment.DeploymentPackage;
import org.ecore.system.deployment.LoginAccountSelection;
import org.ecore.system.deployment.NamingService;
import org.ecore.system.deployment.NetworkInterfaceSelection;
import org.ecore.system.deployment.TargetModelInclude;
import org.ecore.system.deployment.TargetPlatformReference;
import org.ecore.system.deployment.UploadDirectory;
import org.xtext.system.deployment.services.DeploymentGrammarAccess;

@SuppressWarnings("all")
public class DeploymentSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeploymentGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DeploymentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DeploymentPackage.COMPONENT_ARTEFACT:
				sequence_ComponentArtefact(context, (ComponentArtefact) semanticObject); 
				return; 
			case DeploymentPackage.DEPLOYMENT:
				sequence_Deployment(context, (Deployment) semanticObject); 
				return; 
			case DeploymentPackage.DEPLOYMENT_MODEL:
				sequence_DeploymentModel(context, (DeploymentModel) semanticObject); 
				return; 
			case DeploymentPackage.LOGIN_ACCOUNT_SELECTION:
				sequence_LoginAccountSelection(context, (LoginAccountSelection) semanticObject); 
				return; 
			case DeploymentPackage.NAMING_SERVICE:
				sequence_NamingService(context, (NamingService) semanticObject); 
				return; 
			case DeploymentPackage.NETWORK_INTERFACE_SELECTION:
				sequence_NetworkInterfaceSelection(context, (NetworkInterfaceSelection) semanticObject); 
				return; 
			case DeploymentPackage.TARGET_MODEL_INCLUDE:
				sequence_TargetModelInclude(context, (TargetModelInclude) semanticObject); 
				return; 
			case DeploymentPackage.TARGET_PLATFORM_REFERENCE:
				sequence_TargetPlatformReference(context, (TargetPlatformReference) semanticObject); 
				return; 
			case DeploymentPackage.UPLOAD_DIRECTORY:
				sequence_UploadDirectory(context, (UploadDirectory) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractDeploymentElement returns ComponentArtefact
	 *     ComponentArtefact returns ComponentArtefact
	 *
	 * Constraint:
	 *     (component=[ComponentInstance|FQN] deploy=Deployment?)
	 */
	protected void sequence_ComponentArtefact(ISerializationContext context, ComponentArtefact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeploymentModel returns DeploymentModel
	 *
	 * Constraint:
	 *     (name=ID componentArch=[SystemComponentArchitecture|FQN]? elements+=AbstractDeploymentElement*)
	 */
	protected void sequence_DeploymentModel(ISerializationContext context, DeploymentModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Deployment returns Deployment
	 *
	 * Constraint:
	 *     to=[TargetPlatformReference|FQN]
	 */
	protected void sequence_Deployment(ISerializationContext context, Deployment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentPackage.Literals.DEPLOYMENT__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPackage.Literals.DEPLOYMENT__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceFQNParserRuleCall_1_0_1(), semanticObject.eGet(DeploymentPackage.Literals.DEPLOYMENT__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LoginAccountSelection returns LoginAccountSelection
	 *
	 * Constraint:
	 *     login=[LoginAccount|FQN]
	 */
	protected void sequence_LoginAccountSelection(ISerializationContext context, LoginAccountSelection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION__LOGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION__LOGIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountFQNParserRuleCall_1_0_1(), semanticObject.eGet(DeploymentPackage.Literals.LOGIN_ACCOUNT_SELECTION__LOGIN, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDeploymentElement returns NamingService
	 *     NamingService returns NamingService
	 *
	 * Constraint:
	 *     (portNr=EInt | deploy=Deployment)*
	 */
	protected void sequence_NamingService(ISerializationContext context, NamingService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NetworkInterfaceSelection returns NetworkInterfaceSelection
	 *
	 * Constraint:
	 *     network=[NetworkInterface|FQN]
	 */
	protected void sequence_NetworkInterfaceSelection(ISerializationContext context, NetworkInterfaceSelection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION__NETWORK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION__NETWORK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceFQNParserRuleCall_1_0_1(), semanticObject.eGet(DeploymentPackage.Literals.NETWORK_INTERFACE_SELECTION__NETWORK, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDeploymentElement returns TargetModelInclude
	 *     TargetModelInclude returns TargetModelInclude
	 *
	 * Constraint:
	 *     importedNamespace=EString
	 */
	protected void sequence_TargetModelInclude(ISerializationContext context, TargetModelInclude semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentPackage.Literals.TARGET_MODEL_INCLUDE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPackage.Literals.TARGET_MODEL_INCLUDE__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceEStringParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDeploymentElement returns TargetPlatformReference
	 *     TargetPlatformReference returns TargetPlatformReference
	 *
	 * Constraint:
	 *     (name=ID platform=[TargetPlatformDefinition|FQN] (directory=UploadDirectory | login=LoginAccountSelection | host=NetworkInterfaceSelection)*)
	 */
	protected void sequence_TargetPlatformReference(ISerializationContext context, TargetPlatformReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UploadDirectory returns UploadDirectory
	 *
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_UploadDirectory(ISerializationContext context, UploadDirectory semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentPackage.Literals.UPLOAD_DIRECTORY__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPackage.Literals.UPLOAD_DIRECTORY__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUploadDirectoryAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
}
