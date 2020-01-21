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
package org.eclipse.smartmdsd.navigator.imports;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;
import org.osgi.framework.Bundle;
import org.eclipse.smartmdsd.ui.preferences.SmartMDSDPreferencesPage;

public class ImportsLabelProvider extends LabelProvider implements ILabelProvider, IDescriptionProvider {

	private Image importsImage = null;
	private String importsName = null;
	
	@Override
    public Image getImage(Object element) {
		if(element instanceof ImportedProjectsElement) {
			if(importsImage == null) {
				Bundle bundle = Platform.getBundle(org.eclipse.smartmdsd.navigator.Activator.PLUGIN_ID);
				ImageDescriptor importsImageDescriptor = ImageDescriptor.createFromURL(bundle.getEntry("icons/imports.gif"));
				importsImage = importsImageDescriptor.createImage();
			}
			return importsImage;
		}
		return null;
	}

    @Override
    public String getText(Object element) {
    	if(element instanceof ImportedProjectsElement) {
    		if(importsName == null) {
    			importsName = org.eclipse.smartmdsd.ui.Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_IMPORTS_FOLDER);
    		}
    		return importsName;
    	}
    	return null;
    }
	
	@Override
	public String getDescription(Object anElement) {
    	if(anElement instanceof ImportedProjectsElement) {
    		ImportedProjectsElement project = (ImportedProjectsElement)anElement;
    		return "Imports for project: "+project.getParent().getName();
    	}
    	return null;
	}

}
