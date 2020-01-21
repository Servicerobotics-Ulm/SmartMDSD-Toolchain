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
package org.eclipse.smartmdsd.sirius.system.componentArchitecture.design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterStructInstance;
import org.eclipse.smartmdsd.sirius.utils.xtext.AbstractOpenXtextEditorViewPartAction;
import org.eclipse.smartmdsd.sirius.utils.xtext.AbstractXtextEditorViewPart;

public class OpenSystemParameterEditorAction extends AbstractOpenXtextEditorViewPartAction {
	@Override
	public String getViewPartID() {
		return "org.eclipse.smartmdsd.sirius.system.componentArchitecture.design.SystemParamView";
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
