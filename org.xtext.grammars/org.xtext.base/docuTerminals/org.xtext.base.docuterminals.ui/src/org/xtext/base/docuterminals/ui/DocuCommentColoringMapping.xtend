//===================================================================================
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
//===================================================================================
package org.xtext.base.docuterminals.ui

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles

class DocuCommentColoringMapping extends DefaultAntlrTokenToAttributeIdMapper {
	override protected calculateId(String tokenName, int tokenType) {
		if(tokenName.equals("RULE_DOCU_COMMENT")) {
			return HighlightingStyles.COMMENT_ID;
		}
		return super.calculateId(tokenName, tokenType)
	}
}