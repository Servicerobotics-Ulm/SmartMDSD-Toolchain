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
