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
package org.sirius.tools;

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
