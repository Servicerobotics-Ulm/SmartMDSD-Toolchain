//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.base.genericDatasheet.ui

import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector
import org.eclipse.jface.text.ITextViewer
import org.eclipse.jface.text.IRegion
import org.eclipse.jface.text.Region
import org.eclipse.jface.text.hyperlink.IHyperlink
import java.util.ArrayList

class SPDXHyperlinkDetector extends DefaultHyperlinkDetector {
	private static final String SPDX = "spdx";
	
	override detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
		val doc = textViewer.document
		val lineInfo = doc.getLineInformationOfOffset(region.offset)
		val lineText = doc.get(lineInfo.offset, lineInfo.length)
		
		val indexOfSpdx = lineText.indexOf(SPDX)
		if(indexOfSpdx > 0) {
			val indexOfIDStart = lineText.indexOf('"') + 1
			if(indexOfIDStart > 0) {
				val indexOfIDEnd = lineText.lastIndexOf('"')
				val spdxIdRegion = new Region(lineInfo.offset+indexOfIDStart, indexOfIDEnd-indexOfIDStart)
				val spdxId = lineText.substring(indexOfIDStart, indexOfIDEnd)
				val result = new ArrayList<IHyperlink>();
				result.add(new SPDXHyperlink(spdxIdRegion, spdxId))
				return result
			}
		}
		return super.detectHyperlinks(textViewer, region, canShowMultipleHyperlinks)
	}
}