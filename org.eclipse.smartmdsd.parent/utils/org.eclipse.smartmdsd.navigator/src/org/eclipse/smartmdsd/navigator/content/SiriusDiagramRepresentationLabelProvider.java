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
package org.eclipse.smartmdsd.navigator.content;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;
import org.osgi.framework.Bundle;

public class SiriusDiagramRepresentationLabelProvider extends LabelProvider implements ILabelProvider, IDescriptionProvider {
	private Image diagramIcon;
	
	public SiriusDiagramRepresentationLabelProvider() {
		Bundle bundle = Platform.getBundle(org.eclipse.smartmdsd.navigator.Activator.PLUGIN_ID);
		ImageDescriptor diagramImageDescriptor = ImageDescriptor.createFromURL(bundle.getEntry("icons/DDiagram.gif"));
		diagramIcon = diagramImageDescriptor.createImage();
	}
	
	@Override
    public Image getImage(Object element) {
		if(element instanceof SiriusDiagramRepresentationItem) {
			return diagramIcon;
		}
		return null;
	}

    @Override
    public String getText(Object element) {
    	if(element instanceof SiriusDiagramRepresentationItem) {
    		SiriusDiagramRepresentationItem diagram = (SiriusDiagramRepresentationItem)element;
    		return diagram.getName();
    	}
    	return null;
    }
	
	@Override
	public String getDescription(Object anElement) {
    	if(anElement instanceof SiriusDiagramRepresentationItem) {
    		SiriusDiagramRepresentationItem diagram = (SiriusDiagramRepresentationItem)anElement;
    		return "Sirius Diagram: "+diagram.getName();
    	}
    	return null;
	}
}
