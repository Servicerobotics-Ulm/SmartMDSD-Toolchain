/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
