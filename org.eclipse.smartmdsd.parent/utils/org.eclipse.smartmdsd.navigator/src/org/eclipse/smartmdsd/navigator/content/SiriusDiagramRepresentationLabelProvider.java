//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
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
