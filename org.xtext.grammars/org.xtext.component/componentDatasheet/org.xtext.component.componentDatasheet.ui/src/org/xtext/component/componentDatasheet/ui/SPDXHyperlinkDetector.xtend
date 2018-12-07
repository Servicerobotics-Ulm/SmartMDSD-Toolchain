package org.xtext.component.componentDatasheet.ui

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