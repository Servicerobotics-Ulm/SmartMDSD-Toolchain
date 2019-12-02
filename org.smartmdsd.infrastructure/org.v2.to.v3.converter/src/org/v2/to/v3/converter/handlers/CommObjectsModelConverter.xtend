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

class CommObjectsModelConverter extends AbstractModelConverter {
	
	override getStartsWithKeywordReplaceMap() {
		return #{
			"CommObjectRepository " -> "CommObjectsRepository ",
			"Enum " -> "Enumeration ",
			"Struct " -> "CommObject "
		}
	}

	override getKeywordAnywhereReplaceMap() {
		return #{
			" Version " -> " version ",
			"CommObjectRef(" -> "",
			")" -> "",
			"EnumRef(" -> "",
			"StructRef(" -> ""
		}
	}	
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		val modelFileResource = window.getModelFileResource("comm");
		if(modelFileResource !== null) {
			modelFileResource.convertCommObjectModelFile(".types")
		} else {
			val models = getModelFilesFromSelectionDialog("comm")
			models.forEach[
				model |
				model.convertCommObjectModelFile(".types")
			]
		}
		return null;
	}
}