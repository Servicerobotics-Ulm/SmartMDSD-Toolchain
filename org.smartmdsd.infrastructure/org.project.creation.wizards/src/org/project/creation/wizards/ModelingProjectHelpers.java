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

package org.project.creation.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;

public class ModelingProjectHelpers {
	
	public static void addProjectModels(final IProject[] projectRefs, final String modelFileExtension, Session session, IProgressMonitor monitor) throws CoreException {
		// for each referenced project add a corresponding semantic-resource (representing the referenced Xtext model in a corresponding project))
		for(IProject projRef: projectRefs) {
			IFile file = projRef.getFolder("model").getFile(projRef.getName()+"."+modelFileExtension);
			if(file.exists()) {
				String platformUriStr = "platform:/resource/" + projRef.getName() + "/model/" + projRef.getName()+"."+modelFileExtension;
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(platformUriStr);
				AddSemanticResourceCommand cmd = new AddSemanticResourceCommand(session, uri, monitor);
				session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
			}
		}
	}
	
	public static void openAllDiagramEditorsForSession(Session session, IProgressMonitor monitor) throws CoreException {
		// find the DRepresentation and open it in the Diagram-Editor
		Resource resource = session.getSessionResource();
		for(EObject obj: resource.getContents()) {
			if(obj instanceof DAnalysis) {
				DAnalysis root = (DAnalysis)obj;
				EList<DView> views = root.getOwnedViews();
				for(DView view : views){
					for(DRepresentationDescriptor representation: view.getOwnedRepresentationDescriptors()) {
						// open editor with the according representation
						DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), monitor);
					}
				}
			}
		}
	}
	
	public static void openSingleDiagramEditorForSession(Session session, String represName, IProgressMonitor monitor) throws CoreException {
		// find the DRepresentation and open it in the Diagram-Editor
		Resource resource = session.getSessionResource();
		for(EObject obj: resource.getContents()) {
			if(obj instanceof DAnalysis) {
				DAnalysis root = (DAnalysis)obj;
				EList<DView> views = root.getOwnedViews();
				for(DView view : views){
					for(DRepresentationDescriptor representation: view.getOwnedRepresentationDescriptors()) {
						if(representation.getName().equals(represName)) {
							// open editor with the according representation
							DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), monitor);
							return;
						}
					}
				}
			}
		}
	}
	
	public static void selectViewpoint(Session session, final String modelFileExtension, final String viewpointName, IProgressMonitor monitor) throws CoreException {
		SelectViewpointCommand vpSelectCmd = new SelectViewpointCommand(session, modelFileExtension, viewpointName, monitor);
		session.getTransactionalEditingDomain().getCommandStack().execute(vpSelectCmd);
		// alternatively a dialog can be used to ask for the right selection
//		ViewpointSelection.openViewpointsSelectionDialog(session);
	}
	
	// this is how it works within the ViewpointSelection class (problem: discouraged use of ChangeViewpointSelectionCommand)
//	public static void changeViewpointSelection(final String modelFileExtension, final String vpName, boolean createNewRepresentations, Session session,  IProgressMonitor monitor) throws CoreException {
//		Set<Viewpoint> vps = ViewpointSelection.getViewpoints(modelFileExtension);
//		for(Viewpoint vp : vps) {
//			if(vp.getName().equals(vpName)) {
//				final Set<Viewpoint> newSelectedViewpoints = Sets.newHashSet();
//				final Set<Viewpoint> newDeselectedViewpoints = Sets.newHashSet();
//				final ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
//				
//				// add the current vp to be selected
//				newSelectedViewpoints.add(vp);
//				
//				// execute Viewpoint selection-change command
//				RecordingCommand command = new ChangeViewpointSelectionCommand(session, callback, newSelectedViewpoints, newDeselectedViewpoints, createNewRepresentations, monitor);
//              session.getTransactionalEditingDomain().getCommandStack().execute(command);
//				
//				// thats it, stop the loop
//				break;
//			}
//		}
//	}
	
	
}
