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
package org.eclipse.smartmdsd.ui.factories;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.ui.NoUICallback;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.smartmdsd.ui.natures.AbstractSmartMDSDNature;
import org.eclipse.smartmdsd.ui.natures.LanguageInterface;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureHelpers;

public class ModelingProjectFactory {
	public static void convertToModelingProject(IProject project, IProgressMonitor monitor) throws CoreException {
		ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
	}
	
	public static Session getProjectSession(IProject project, IProgressMonitor monitor) throws CoreException {
		IProjectNature nature = project.getNature(ModelingProject.NATURE_ID);
		if (nature instanceof ModelingProject) {
			ModelingProject mProject = (ModelingProject)nature;
			Session session = mProject.getSession();
			if(session == null) {
				// session has probably not yet been loaded, so we load it now, which might take some time so it is advisable to
				// call this overall method from within a job / workspace operation
				String airdFileString = "platform:/resource/" + project.getName() + "/representations.aird";
				session = SessionManager.INSTANCE.openSession(URI.createURI(airdFileString), monitor, new NoUICallback());
			}
			return session;
		}
		
		return null;
	}
	
	public static void createModelingProject(IProject project, List<String> selectedModelTypes, IProgressMonitor monitor) throws OperationCanceledException, CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Create Modeling Project", 200);
		// convert the project into a modeling project (adding a ModelingProject nature and creating
		ModelingProjectFactory.convertToModelingProject(project, subMonitor.split(100));

        if(subMonitor.isCanceled()) return;
        
        Session session = getProjectSession(project, monitor);
		// now set the modeling project properties
		if (session != null) {
			// select modeling viewpoints for all related system-model types
			selectViewpoints(project, session, selectedModelTypes, subMonitor.split(30));
			
			if(subMonitor.isCanceled()) return;

			// open selected model types in the related diagram editors
			openSelectedDiagramEditorsForSession(project, session, selectedModelTypes, subMonitor.split(50));
			
			// make changes visible in the workspace
			project.refreshLocal(2, subMonitor.split(10));
		}
	}
	
	
	public static void selectViewpoints(IProject project, Session session, List<String> selectedModelTypes, IProgressMonitor monitor) {
		boolean hasChanges = false;
		for(String modelTypeName: selectedModelTypes) {
			AbstractSmartMDSDNature nature = SmartMDSDNatureHelpers.getFirstSmartMDSDNatureFrom(project);
			if(nature != null) {
				LanguageInterface dsl = nature.getLanguageInterfaceOf(modelTypeName);
				if(dsl != null) {
					String viewpointName = dsl.getSiriusViewpointName();
					if(viewpointName != null) {
						SelectViewpointCommand vpSelectCmd = new SelectViewpointCommand(session, dsl.getModelFileExtension(), viewpointName, monitor);
						session.getTransactionalEditingDomain().getCommandStack().execute(vpSelectCmd);
						hasChanges = true;
					}
				}
			}
		}
		if(hasChanges) {
			session.save(monitor);
		}
	}
	
	public static void openSelectedDiagramEditorsForSession(IProject project, Session session, List<String> selectedModelTypes, IProgressMonitor monitor) throws CoreException {
		for(String modelTypeName: selectedModelTypes) {
			AbstractSmartMDSDNature nature = SmartMDSDNatureHelpers.getFirstSmartMDSDNatureFrom(project);
			if(nature != null) {
				LanguageInterface dsl = nature.getLanguageInterfaceOf(modelTypeName);
				if(dsl != null) {
					String viewpointName = dsl.getSiriusViewpointName();
					if(viewpointName != null) {
						for(DView view : session.getOwnedViews()) {
							if(view.getViewpoint().getName().equals(viewpointName)) {
								for(DRepresentationDescriptor representation: view.getOwnedRepresentationDescriptors()) {
									// open editor with the according representation
									DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), monitor);
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static EList<DRepresentationDescriptor> getRepresentationsFor(IResource modelFile, Session session) throws CoreException {
		IProject project = modelFile.getProject();
		AbstractSmartMDSDNature nature = SmartMDSDNatureHelpers.getFirstSmartMDSDNatureFrom(project);
		LanguageInterface dsl = nature.getLanguageInterfaceFrom(modelFile);
		if(dsl != null) {
			String viewpointName = dsl.getSiriusViewpointName();
			if(viewpointName != null) {
				for(DView view : session.getOwnedViews()) {
					if(view.getViewpoint().getName().equals(viewpointName)) {
						return view.getOwnedRepresentationDescriptors();
					}
				}
			}
		}
		return null;
	}
}
