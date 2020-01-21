//================================================================
//
//  Copyright (C) 2016 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.eclipse.smartmdsd.sirius.component.design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef;
import org.eclipse.smartmdsd.sirius.utils.xtext.AbstractOpenXtextEditorViewPartAction;


public class OpenComponentParameterEditorAction extends AbstractOpenXtextEditorViewPartAction {

	@Override
	public String getViewPartID() {
		return "org.eclipse.smartmdsd.sirius.component.design.ComponentParamView";
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
