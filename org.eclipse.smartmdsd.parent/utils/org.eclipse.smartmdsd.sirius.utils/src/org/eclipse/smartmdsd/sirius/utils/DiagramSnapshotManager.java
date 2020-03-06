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
package org.eclipse.smartmdsd.sirius.utils;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;

public class DiagramSnapshotManager implements SessionManagerListener {
	@Override
	public void notify(Session session, int arg1) {
		if(arg1 == SessionListener.SYNC) {
			String projectName = session.getSessionResource().getURI().segment(1);
			for(DView view: session.getOwnedViews()) {
				String viewpointName = view.getViewpoint().getName();
				for(DRepresentationDescriptor descr: view.getOwnedRepresentationDescriptors()) {
					if(descr.getName().contentEquals(projectName)) {
						String imageName = projectName + viewpointName.replaceAll("Viewpoint", "") + ".jpg";
//						System.out.println("ImageName: "+imageName);
						Display.getDefault().asyncExec(
							new Runnable() {
								@Override
								public void run() {
									IPath absoluteImagePath = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).getFolder("model").getLocation().append(imageName);
									ExportFormat exportFormat = new ExportFormat(ExportDocumentFormat.NONE, ImageFileFormat.JPG);
									try {
										DialectUIManager.INSTANCE.export(descr.getRepresentation(), session,
										absoluteImagePath, exportFormat, new NullProgressMonitor());
									} catch (CoreException e) {
										e.printStackTrace();
									}	
								}
							}
						);
					}
				}
			}
		}
	}

	@Override
	public void notifyAddSession(Session arg0) {
		
	}

	@Override
	public void notifyRemoveSession(Session arg0) {
		
	}

	@Override
	public void viewpointDeselected(Viewpoint arg0) {
		
	}

	@Override
	public void viewpointSelected(Viewpoint arg0) {
		
	}
}