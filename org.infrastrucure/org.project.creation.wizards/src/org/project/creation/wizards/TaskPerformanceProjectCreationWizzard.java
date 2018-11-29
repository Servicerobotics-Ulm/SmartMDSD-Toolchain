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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class TaskPerformanceProjectCreationWizzard extends AbstractProjectCreationWizard {
	@Override
	protected IWizardPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("TaskPerformanceProjectWizard");
		page.setTitle("TaskChains Project");
		page.setDescription("This wizard creates a TaskChains project");
		page.setInitialProjectName("TaskChainsAnyName");
		return page;
	}
	
	
	@Override
	protected void customizeProject(IProject project, final IProject[] projectRefs, IFolder modelFolder, IProgressMonitor monitor) throws CoreException 
	{              
        // create Xtext model with an empty component
        IFile modelFile = modelFolder.getFile(project.getName()+".taskconfig");
		String modelContent = "TaskConfigModel "+project.getName()+" {\n\n}";
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
//		// open editor with the Xtext model
//		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
//		IDE.openEditor(page, modelFile);
		
		// create simple Xtext model file
		IFile taskPerformanceModelFile = modelFolder.getFile(project.getName()+".taskperform");
		String taskPerformanceModelContent = "TaskPerformModel "+project.getName()+" taskConfigRef "+project.getName()+" {\n\n}";
		InputStream taskPerformanceStream = new ByteArrayInputStream(taskPerformanceModelContent.getBytes());
		taskPerformanceModelFile.create(taskPerformanceStream, true, monitor);
		
//		// open editor with the Xtext model
//		IDE.openEditor(page, taskPerformanceModelFile);
		
		// convert the project into a modeling project (adding a ModelingProject nature and creating 
        ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		
		// now set the modeling project properties
		IProjectNature nature = project.getNature(ModelingProject.NATURE_ID);
		if (nature instanceof ModelingProject) {
			ModelingProject mproject = (ModelingProject)nature;
			Session session = mproject.getSession();
			
			// add models (with the file ending .comm) from the referenced projects
			ModelingProjectHelpers.addProjectModels(projectRefs, ".platform", session, monitor);
			
			// select a viewpoint
			final String modelFileExtension = "taskconfig";
			final String viewpointName = "task.configuration.viewpoint";
			ModelingProjectHelpers.selectViewpoint(session, modelFileExtension, viewpointName, monitor);
			
			// select a viewpoint
			final String modelFileExtension2 = "taskperform";
			final String viewpointName2 = "task.performance.viewpoint";
			ModelingProjectHelpers.selectViewpoint(session, modelFileExtension2, viewpointName2, monitor);

			// open diagram using a corresponding model-editor
			ModelingProjectHelpers.openAllDiagramEditorsForSession(session, monitor);
			
//			session.save(monitor);
			project.refreshLocal(2, monitor);
		}
	}
	
	@Override
	protected String getImportedModelFileExtension() {
		return "platform";
	}
}
