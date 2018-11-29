//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
//
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------
package org.sirius.system.componentArchitecture.design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.ecore.system.componentArchitecture.ComponentInstance;
import org.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.ecore.system.systemParameter.ParameterStructInstance;
import org.sirius.tools.AbstractOpenXtextEditorViewPartAction;
import org.sirius.tools.AbstractXtextEditorViewPart;

public class OpenSystemParameterEditorAction extends AbstractOpenXtextEditorViewPartAction {
	@Override
	public String getViewPartID() {
		return "org.sirius.system.componentArchitecture.design.SystemParamView";
	}

	@Override
	public String getDefaultModelConent(URI xtextResourceUri) {
		return "SystemParameterModel "+xtextResourceUri.segment(1)+" extendsSystem "+xtextResourceUri.segment(1)+" {\n\n}";
	}

	@Override
	public boolean checkModelConstraints(DDiagramElement diagramElement) {
		return true;
	}
	
	@Override
	protected void updateSemanticModel(DRepresentationElement representationElem,
			AbstractXtextEditorViewPart xtextViewPart) {
		if(xtextViewPart instanceof SystemParameterViewPart) {
			SystemParameterViewPart paramView = (SystemParameterViewPart)xtextViewPart;
			if(representationElem.getTarget() instanceof ComponentInstance) {
				ComponentInstance componentInstance = (ComponentInstance)representationElem.getTarget();
				boolean hasParameterStruct = false;
				for(ComponentInstanceExtension ext: componentInstance.getExtensions()) {
					if(ext instanceof ParameterStructInstance) {
						hasParameterStruct = true;
						break;
					}
				}
				if(hasParameterStruct) {
					paramView.setSemanticElement(componentInstance);
				}
			}
		}
	}
}
