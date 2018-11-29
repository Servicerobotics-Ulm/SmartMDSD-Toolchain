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

package org.sirius.component.design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.ecore.component.componentDefinition.AbstractComponentElement;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentParameter.ComponentParametersRef;
import org.sirius.tools.AbstractOpenXtextEditorViewPartAction;


public class OpenComponentParameterEditorAction extends AbstractOpenXtextEditorViewPartAction {

	@Override
	public String getViewPartID() {
		return "org.sirius.component.design.ComponentParamView";
	}

	@Override
	public String getDefaultModelConent(URI xtextResourceUri) {
		String componentName = xtextResourceUri.segment(1);
		return "ComponentParameter "+componentName+"Paremeters component "+componentName+" {\n\n}";
	}

	@Override
	public boolean checkModelConstraints(DDiagramElement diagramElement) {
		for(DDiagramElement currElem: diagramElement.getParentDiagram().getOwnedDiagramElements()) {
			if(currElem.getTarget() instanceof ComponentDefinition) {
				ComponentDefinition component = (ComponentDefinition)currElem.getTarget();
				for(AbstractComponentElement compElem: component.getElements()) {
					if(compElem instanceof ComponentParametersRef) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
