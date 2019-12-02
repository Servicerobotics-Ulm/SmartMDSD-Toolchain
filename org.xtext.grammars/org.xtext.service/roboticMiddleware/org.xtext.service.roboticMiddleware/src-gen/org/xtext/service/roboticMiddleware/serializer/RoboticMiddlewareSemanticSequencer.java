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
package org.xtext.service.roboticMiddleware.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.ecore.service.roboticMiddleware.CORBA_SmartSoft;
import org.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;
import org.xtext.base.docuterminals.serializer.DocuTerminalsSemanticSequencer;
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

@SuppressWarnings("all")
public class RoboticMiddlewareSemanticSequencer extends DocuTerminalsSemanticSequencer {

	@Inject
	private RoboticMiddlewareGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT:
				sequence_AbstractDocumentedElement(context, (AbstractDocumentedElement) semanticObject); 
				return; 
			}
		else if (epackage == RoboticMiddlewarePackage.eINSTANCE)
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
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     RoboticMiddleware returns ACE_SmartSoft
	 *     ACE_SmartSoft returns ACE_SmartSoft
	 *
	 * Constraint:
	 *     description=EString?
	 */
	protected void sequence_ACE_SmartSoft(ISerializationContext context, ACE_SmartSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoboticMiddleware returns CORBA_SmartSoft
	 *     CORBA_SmartSoft returns CORBA_SmartSoft
	 *
	 * Constraint:
	 *     description=EString?
	 */
	protected void sequence_CORBA_SmartSoft(ISerializationContext context, CORBA_SmartSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoboticMiddleware returns DDS_SmartSoft
	 *     DDS_SmartSoft returns DDS_SmartSoft
	 *
	 * Constraint:
	 *     description=EString?
	 */
	protected void sequence_DDS_SmartSoft(ISerializationContext context, DDS_SmartSoft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoboticMiddleware returns OpcUa_SeRoNet
	 *     OpcUa_SeRoNet returns OpcUa_SeRoNet
	 *
	 * Constraint:
	 *     description=EString?
	 */
	protected void sequence_OpcUa_SeRoNet(ISerializationContext context, OpcUa_SeRoNet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
