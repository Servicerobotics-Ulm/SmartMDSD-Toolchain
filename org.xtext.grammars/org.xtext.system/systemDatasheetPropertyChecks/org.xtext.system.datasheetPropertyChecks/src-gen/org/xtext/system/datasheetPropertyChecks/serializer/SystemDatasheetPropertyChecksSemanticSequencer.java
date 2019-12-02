//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.datasheetPropertyChecks.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck;
import org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage;
import org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel;
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;

@SuppressWarnings("all")
public class SystemDatasheetPropertyChecksSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SystemDatasheetPropertyChecksGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DatasheetPropertyChecksPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK:
				sequence_DatasheetPropertyCheck(context, (DatasheetPropertyCheck) semanticObject); 
				return; 
			case DatasheetPropertyChecksPackage.SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL:
				sequence_SystemDatasheetPropertyChecksModel(context, (SystemDatasheetPropertyChecksModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DatasheetPropertyCheck returns DatasheetPropertyCheck
	 *
	 * Constraint:
	 *     (function=EvaluationFunction propertyName=ID operator=EvaluationOperator propertyValue=STRING propertyUnit=STRING?)
	 */
	protected void sequence_DatasheetPropertyCheck(ISerializationContext context, DatasheetPropertyCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemDatasheetPropertyChecksModel returns SystemDatasheetPropertyChecksModel
	 *
	 * Constraint:
	 *     (system=[SystemComponentArchitecture|ID] checks+=DatasheetPropertyCheck*)
	 */
	protected void sequence_SystemDatasheetPropertyChecksModel(ISerializationContext context, SystemDatasheetPropertyChecksModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
