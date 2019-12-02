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
package org.xtext.service.domainModelsDatasheet.serializer;

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
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet;
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage;
import org.xtext.base.genericDatasheet.serializer.GenericDatasheetSemanticSequencer;
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;

@SuppressWarnings("all")
public class DomainModelsDatasheetSemanticSequencer extends GenericDatasheetSemanticSequencer {

	@Inject
	private DomainModelsDatasheetGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainModelsDatasheetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainModelsDatasheetPackage.DOMAIN_MODELS_DATASHEET:
				sequence_DomainModelsDatasheet_GenericDatasheetModel(context, (DomainModelsDatasheet) semanticObject); 
				return; 
			}
		else if (epackage == GenericDatasheetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GenericDatasheetPackage.DATASHEET_PROPERTY:
				sequence_DatasheetProperty(context, (DatasheetProperty) semanticObject); 
				return; 
			case GenericDatasheetPackage.MANDATORY_DATASHEET_ELEMENT:
				sequence_MandatoryDatasheetElement(context, (MandatoryDatasheetElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DomainModelsDatasheet returns DomainModelsDatasheet
	 *
	 * Constraint:
	 *     (name=ID elements+=AbstractDatasheetElement*)
	 */
	protected void sequence_DomainModelsDatasheet_GenericDatasheetModel(ISerializationContext context, DomainModelsDatasheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
