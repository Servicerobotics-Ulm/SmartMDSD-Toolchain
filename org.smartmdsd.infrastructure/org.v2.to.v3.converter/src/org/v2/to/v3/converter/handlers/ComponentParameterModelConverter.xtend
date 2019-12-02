//===================================================================================
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
//===================================================================================
package org.v2.to.v3.converter.handlers

import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil

class ComponentParameterModelConverter extends AbstractModelConverter {
	override execute(ExecutionEvent event) throws ExecutionException {
		val window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		val modelFileResource = window.getModelFileResource("parcomp");
		if(modelFileResource !== null) {
			modelFileResource.convertCommObjectModelFile(".componentParameters")
		} else {
			val models = getModelFilesFromSelectionDialog("parcomp")
			models.forEach[
				model |
				model.convertCommObjectModelFile(".componentParameters")
			]
		}
		return null;
	}
	
	override getStartsWithKeywordReplaceMap() {
		return #{
			"Component " -> "ComponentParameter ",
			"InternalParam " -> "InternalParameter ",
			"ExtendedParam " -> "ExtendedParameter ",
			"ParamSetInstance " -> "ParameterSetInstance ",
			"InstantiateTrigger " -> "TriggerInstance ",
			"InstantiateParam " -> "ParameterInstance "
		}
	}
	
	override getKeywordAnywhereReplaceMap() {
		return #{
			"this." -> "",
			"enum." -> ""
		}
	}
}