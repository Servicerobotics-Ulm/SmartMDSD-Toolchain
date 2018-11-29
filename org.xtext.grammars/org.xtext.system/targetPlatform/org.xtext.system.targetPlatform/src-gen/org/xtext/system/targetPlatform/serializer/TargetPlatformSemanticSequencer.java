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
package org.xtext.system.targetPlatform.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.ecore.service.roboticMiddleware.CORBA_SmartSoft;
import org.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;
import org.ecore.system.targetPlatform.CPU;
import org.ecore.system.targetPlatform.Linux;
import org.ecore.system.targetPlatform.LoginAccount;
import org.ecore.system.targetPlatform.MacOS;
import org.ecore.system.targetPlatform.NetworkConnection;
import org.ecore.system.targetPlatform.NetworkInterface;
import org.ecore.system.targetPlatform.TargetMiddleware;
import org.ecore.system.targetPlatform.TargetPlatformDefinition;
import org.ecore.system.targetPlatform.TargetPlatformModel;
import org.ecore.system.targetPlatform.TargetPlatformPackage;
import org.ecore.system.targetPlatform.Windows;
import org.xtext.service.roboticMiddleware.serializer.RoboticMiddlewareSemanticSequencer;
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;

@SuppressWarnings("all")
public class TargetPlatformSemanticSequencer extends RoboticMiddlewareSemanticSequencer {

	@Inject
	private TargetPlatformGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RoboticMiddlewarePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RoboticMiddlewarePackage.ACE_SMART_SOFT:
				sequence_ACE_SmartSoft(context, (ACE_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.CORBA_SMART_SOFT:
				sequence_CORBA_SmartSoft(context, (CORBA_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.DDS_SMART_SOFT:
				sequence_DDS_SmartSoft(context, (DDS_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.OPC_UA_SE_RO_NET:
				sequence_OpcUa_SeRoNet(context, (OpcUa_SeRoNet) semanticObject); 
				return; 
			}
		else if (epackage == TargetPlatformPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TargetPlatformPackage.CPU:
				sequence_CPU(context, (CPU) semanticObject); 
				return; 
			case TargetPlatformPackage.LINUX:
				sequence_Linux(context, (Linux) semanticObject); 
				return; 
			case TargetPlatformPackage.LOGIN_ACCOUNT:
				sequence_LoginAccount(context, (LoginAccount) semanticObject); 
				return; 
			case TargetPlatformPackage.MAC_OS:
				sequence_MacOS(context, (MacOS) semanticObject); 
				return; 
			case TargetPlatformPackage.NETWORK_CONNECTION:
				sequence_NetworkConnection(context, (NetworkConnection) semanticObject); 
				return; 
			case TargetPlatformPackage.NETWORK_INTERFACE:
				sequence_NetworkInterface(context, (NetworkInterface) semanticObject); 
				return; 
			case TargetPlatformPackage.TARGET_MIDDLEWARE:
				sequence_TargetMiddleware(context, (TargetMiddleware) semanticObject); 
				return; 
			case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION:
				sequence_TargetPlatformDefinition(context, (TargetPlatformDefinition) semanticObject); 
				return; 
			case TargetPlatformPackage.TARGET_PLATFORM_MODEL:
				sequence_TargetPlatformModel(context, (TargetPlatformModel) semanticObject); 
				return; 
			case TargetPlatformPackage.WINDOWS:
				sequence_Windows(context, (Windows) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractTPSubNode returns CPU
	 *     CPU returns CPU
	 *
	 * Constraint:
	 *     (name=ID (kind=EString | coresTally=EInt)*)
	 */
	protected void sequence_CPU(ISerializationContext context, CPU semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperatingSystem returns Linux
	 *     Linux returns Linux
	 *
	 * Constraint:
	 *     kind=STRING?
	 */
	protected void sequence_Linux(ISerializationContext context, Linux semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTPSubNode returns LoginAccount
	 *     LoginAccount returns LoginAccount
	 *
	 * Constraint:
	 *     (name=ID (fullname=STRING | email=STRING)*)
	 */
	protected void sequence_LoginAccount(ISerializationContext context, LoginAccount semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperatingSystem returns MacOS
	 *     MacOS returns MacOS
	 *
	 * Constraint:
	 *     kind=STRING?
	 */
	protected void sequence_MacOS(ISerializationContext context, MacOS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTPElement returns NetworkConnection
	 *     NetworkConnection returns NetworkConnection
	 *
	 * Constraint:
	 *     (endpoint1=[NetworkInterface|FQN] endpoint2=[NetworkInterface|FQN] kind=EString?)
	 */
	protected void sequence_NetworkConnection(ISerializationContext context, NetworkConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTPSubNode returns NetworkInterface
	 *     NetworkInterface returns NetworkInterface
	 *
	 * Constraint:
	 *     (name=ID (kind=EString? (hostAddress=STRING portNr=EInt?)?)+)
	 */
	protected void sequence_NetworkInterface(ISerializationContext context, NetworkInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTPSubNode returns TargetMiddleware
	 *     TargetMiddleware returns TargetMiddleware
	 *
	 * Constraint:
	 *     middleware=RoboticMiddleware
	 */
	protected void sequence_TargetMiddleware(ISerializationContext context, TargetMiddleware semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TargetPlatformPackage.Literals.TARGET_MIDDLEWARE__MIDDLEWARE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TargetPlatformPackage.Literals.TARGET_MIDDLEWARE__MIDDLEWARE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0(), semanticObject.getMiddleware());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTPElement returns TargetPlatformDefinition
	 *     TargetPlatformDefinition returns TargetPlatformDefinition
	 *
	 * Constraint:
	 *     (name=ID os=OperatingSystem? elements+=AbstractTPSubNode*)
	 */
	protected void sequence_TargetPlatformDefinition(ISerializationContext context, TargetPlatformDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TargetPlatformModel returns TargetPlatformModel
	 *
	 * Constraint:
	 *     (name=ID elements+=AbstractTPElement*)
	 */
	protected void sequence_TargetPlatformModel(ISerializationContext context, TargetPlatformModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperatingSystem returns Windows
	 *     Windows returns Windows
	 *
	 * Constraint:
	 *     kind=STRING?
	 */
	protected void sequence_Windows(ISerializationContext context, Windows semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
