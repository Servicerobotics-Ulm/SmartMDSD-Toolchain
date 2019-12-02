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
package org.xtext.component.componentDatasheet.serializer;

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
import org.ecore.component.componentDatasheet.ComponentDatasheet;
import org.ecore.component.componentDatasheet.ComponentDatasheetPackage;
import org.ecore.component.componentDatasheet.ComponentPortDatasheet;
import org.xtext.base.genericDatasheet.serializer.GenericDatasheetSemanticSequencer;
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;

@SuppressWarnings("all")
public class ComponentDatasheetSemanticSequencer extends GenericDatasheetSemanticSequencer {

	@Inject
	private ComponentDatasheetGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentDatasheetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentDatasheetPackage.COMPONENT_DATASHEET:
				sequence_ComponentDatasheet_GenericDatasheetModel(context, (ComponentDatasheet) semanticObject); 
				return; 
			case ComponentDatasheetPackage.COMPONENT_PORT_DATASHEET:
				sequence_ComponentPortDatasheet(context, (ComponentPortDatasheet) semanticObject); 
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
	 *     ComponentDatasheet returns ComponentDatasheet
	 *
	 * Constraint:
	 *     (component=[ComponentDefinition|ID] elements+=AbstractDatasheetElement*)
	 */
	protected void sequence_ComponentDatasheet_GenericDatasheetModel(ISerializationContext context, ComponentDatasheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDatasheetElement returns ComponentPortDatasheet
	 *     ComponentPortDatasheet returns ComponentPortDatasheet
	 *
	 * Constraint:
	 *     (port=[ComponentPort|ID] properties+=DatasheetProperty*)
	 */
	protected void sequence_ComponentPortDatasheet(ISerializationContext context, ComponentPortDatasheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
