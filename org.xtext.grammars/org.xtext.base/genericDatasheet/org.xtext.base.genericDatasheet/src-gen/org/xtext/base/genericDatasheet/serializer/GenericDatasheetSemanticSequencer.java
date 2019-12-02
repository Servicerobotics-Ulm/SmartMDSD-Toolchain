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
package org.xtext.base.genericDatasheet.serializer;

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
import org.ecore.base.genericDatasheet.DatasheetProperty;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;

@SuppressWarnings("all")
public class GenericDatasheetSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GenericDatasheetGrammarAccess grammarAccess;
	
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
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractDatasheetElement returns DatasheetProperty
	 *     DatasheetProperty returns DatasheetProperty
	 *
	 * Constraint:
	 *     (name=ID ((shortDescription=STRING | semanticID=STRING)? (value=STRING unit=STRING?)?)+)
	 */
	protected void sequence_DatasheetProperty(ISerializationContext context, DatasheetProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDatasheetElement returns MandatoryDatasheetElement
	 *     MandatoryDatasheetElement returns MandatoryDatasheetElement
	 *
	 * Constraint:
	 *     (name=MandatoryDatasheetElementNames value=STRING)
	 */
	protected void sequence_MandatoryDatasheetElement(ISerializationContext context, MandatoryDatasheetElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GenericDatasheetPackage.Literals.MANDATORY_DATASHEET_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenericDatasheetPackage.Literals.MANDATORY_DATASHEET_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GenericDatasheetPackage.Literals.MANDATORY_DATASHEET_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GenericDatasheetPackage.Literals.MANDATORY_DATASHEET_ELEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
