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
package org.xtext.system.systemDatasheet.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.ecore.base.genericDatasheet.DatasheetProperty;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.ecore.system.systemDatasheet.SystemDatasheet;
import org.ecore.system.systemDatasheet.SystemDatasheetPackage;
import org.xtext.base.genericDatasheet.serializer.GenericDatasheetSemanticSequencer;
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess;

@SuppressWarnings("all")
public class SystemDatasheetSemanticSequencer extends GenericDatasheetSemanticSequencer {

	@Inject
	private SystemDatasheetGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GenericDatasheetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GenericDatasheetPackage.DATASHEET_PROPERTY:
				sequence_DatasheetProperty(context, (DatasheetProperty) semanticObject); 
				return; 
			case GenericDatasheetPackage.MANDATORY_DATASHEET_ELEMENT:
				sequence_MandatoryDatasheetElement(context, (MandatoryDatasheetElement) semanticObject); 
				return; 
			}
		else if (epackage == SystemDatasheetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SystemDatasheetPackage.SYSTEM_DATASHEET:
				sequence_GenericDatasheetModel_SystemDatasheet(context, (SystemDatasheet) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SystemDatasheet returns SystemDatasheet
	 *
	 * Constraint:
	 *     (name=ID elements+=AbstractDatasheetElement*)
	 */
	protected void sequence_GenericDatasheetModel_SystemDatasheet(ISerializationContext context, SystemDatasheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
