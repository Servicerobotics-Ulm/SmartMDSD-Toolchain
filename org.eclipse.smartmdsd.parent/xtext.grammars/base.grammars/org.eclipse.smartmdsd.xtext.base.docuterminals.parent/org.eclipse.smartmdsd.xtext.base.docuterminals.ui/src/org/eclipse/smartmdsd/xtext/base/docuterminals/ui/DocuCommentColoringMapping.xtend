/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.base.docuterminals.ui

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
