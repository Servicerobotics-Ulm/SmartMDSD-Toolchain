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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;

public class SystemProjectCreationWizard extends AbstractProjectCreationWizard {
	@Override
	protected IWizardPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("SystemProjectWizard");
		page.setTitle("System Project");
		page.setDescription("This wizard creates a System project for the definition of a ComponentArchitecture, TargetDefinition, Deployment and other system-related models");
		page.setInitialProjectName("SystemAnyName");
		return page;
	}

	@Override
	protected void customizeProject(IProject project, final IProject[] projectRefs, IFolder modelFolder, IProgressMonitor monitor) throws CoreException {	
		// create simple Xtext model file
		IFile modelFile = modelFolder.getFile(project.getName()+".componentArch");
		String modelContent = "SystemComponentArchitecture "+project.getName()+" {\n\n}";
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
		// create simple Xtext model file
		IFile parameterModelFile = modelFolder.getFile(project.getName()+".systemParam");
		String parameterModelContent = "SystemParameterModel "+project.getName()+"Params extendsSystem "+project.getName()+" {\n\n}";
		InputStream parameterStream = new ByteArrayInputStream(parameterModelContent.getBytes());
		parameterModelFile.create(parameterStream, true, monitor);
		
		// open editor with the Xtext model
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		IDE.openEditor(page, modelFile);
		
		
		// create simple Xtext model file
		IFile platformModelFile = modelFolder.getFile(project.getName()+".target");
		String platformModelContent = "TargetPlatformModel "+project.getName()+" {\n\n}";
		InputStream platformStream = new ByteArrayInputStream(platformModelContent.getBytes());
		platformModelFile.create(platformStream, true, monitor);
		
		// open editor with the Xtext model
		IDE.openEditor(page, platformModelFile);
		
		// create simple Xtext model file
		IFile deploymentModelFile = modelFolder.getFile(project.getName()+".deployment");
		String deploymentModelContent = "DeploymentModel "+project.getName()+" {\n\n}";
		InputStream deploymentStream = new ByteArrayInputStream(deploymentModelContent.getBytes());
		deploymentModelFile.create(deploymentStream, true, monitor);
		
		// open editor with the Xtext model
		IDE.openEditor(page, deploymentModelFile);
		
		
		// convert the project into a modeling project (adding a ModelingProject nature and creating 
        ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
        
		// now set the modeling project properties
		IProjectNature nature = project.getNature(ModelingProject.NATURE_ID);
		if (nature instanceof ModelingProject) {
			ModelingProject mproject = (ModelingProject)nature;
			Session session = mproject.getSession();
			
			// add models (with the file ending .comm) from the referenced projects
			ModelingProjectHelpers.addProjectModels(projectRefs, getImportedModelFileExtension(), session, monitor);
			
			// select the system viewpoint
			final String modelFileExtension = "componentArch";
			final String viewpointName = "SystemArchitectureViewpoint";
			ModelingProjectHelpers.selectViewpoint(session, modelFileExtension, viewpointName, monitor);
			
			// select the platform viewpoint
			final String platformModelFileExtension = "target";
			final String platformViewpointName = "TargetPlatformViewpoint";
			ModelingProjectHelpers.selectViewpoint(session, platformModelFileExtension, platformViewpointName, monitor);
			
			// select the platform viewpoint
			final String deploymentModelFileExtension = "deployment";
			final String deploymentViewpointName = "DeploymentViewpoint";
			ModelingProjectHelpers.selectViewpoint(session, deploymentModelFileExtension, deploymentViewpointName, monitor);
			
			session.save(monitor);
			
			// open diagram using a corresponding model-editor
			ModelingProjectHelpers.openAllDiagramEditorsForSession(session, monitor);
			
			project.refreshLocal(2, monitor);
		}
	}
	
	@Override
	protected String getImportedModelFileExtension() {
		return "component";
	}
	
//	private void setSysModelRefInPlatformModel(Session session, IProgressMonitor monitor) {
//		Resource resource = session.getSessionResource();
//		for(EObject obj: resource.getContents()) {
//			if(obj instanceof DAnalysis) {
//				DAnalysis root = (DAnalysis)obj;
//				SystemModel sysModel = null;
//				PlatformModel platformModel = null;
//				for(EObject model: root.getModels()) {
//					if(model instanceof SystemModel) {
//						sysModel = (SystemModel)model;
//					} else if(model instanceof PlatformModel) {
//						platformModel = (PlatformModel)model;
//					}
//				}
//				
//				if(sysModel != null && platformModel != null) {
//					final SystemModel systemModel = sysModel;
//					final PlatformModel platfModel = platformModel;
//					try {
//					    TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
//						CommandStack stack = ted.getCommandStack();
//						RecordingCommand cmd = new RecordingCommand(ted) {
//	
//							@Override
//							protected void doExecute() {
//	//							System.out.println("Add ci "+ci.getName() + " to system model " + sysModel.getName());
//								platfModel.setSystemModel(systemModel);
//								
//							}
//						};
//						stack.execute(cmd);
//					}
//					catch (ServiceException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}
//	}
}
