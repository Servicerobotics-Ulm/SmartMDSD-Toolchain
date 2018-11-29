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
import java.util.List;

import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.CIncludePathEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICFolderDescription;
import org.eclipse.cdt.core.settings.model.ICLanguageSetting;
import org.eclipse.cdt.core.settings.model.ICLanguageSettingEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;

public class CommObjProjectCreationWizard extends AbstractProjectCreationWizard {
	
	@Override
	protected IWizardPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("ServiceRepositoryWizard");
		page.setTitle("Domain-Models Project (Tier 2)");
		page.setDescription("This wizard creates a repository-project for ServiceDefinitions, CommunicationObjects and other domain-specific model-definitions (see http://robmosys.eu/wiki/general_principles:ecosystem:start for more details)");
		page.setInitialProjectName("DomainAnyName");
		return page;
	}

	@Override
	protected void customizeProject(final IProject project, final IProject[] projectRefs, IFolder modelFolder, IProgressMonitor monitor) throws CoreException {	 
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();

		try {
			addCppSettings(project, monitor);
			setCommObjectCppIncludes(project);
		} catch (BuildException e) {
			e.printStackTrace();
		}
		
		createComponentModesModel(project, modelFolder, monitor, page);
		createParametersModel(project, modelFolder, monitor, page);
		createServiceDefinitionModel(project, modelFolder, monitor, page);
		createCommObjectsModel(project, modelFolder, monitor, page);
	}
	
	protected void setCommObjectCppIncludes(IProject project) throws CoreException 
	{
		ICProjectDescriptionManager mngr = CoreModel.getDefault().getProjectDescriptionManager();
		ICProjectDescription projectDescription = mngr.getProjectDescription(project);

		for(ICConfigurationDescription configDescription : projectDescription.getConfigurations()) {
			ICFolderDescription projectRoot = configDescription.getRootFolderDescription();
			for (ICLanguageSetting setting : projectRoot.getLanguageSettings()) {
				String languageId = setting.getLanguageId();
				if(languageId != null && languageId.equals("org.eclipse.cdt.core.g++")) {
					List<ICLanguageSettingEntry> includePathSettings = setting.getSettingEntriesList(ICSettingEntry.INCLUDE_PATH);
					
//					IPathEntry newEntry = CoreModel.newIncludeEntry(resourcePath, Path.EMPTY, new Path(""), true);
//					includePathSettings.add(new CIncludePathEntry("/usr/local/include", ICSettingEntry.LOCAL));
					
					String aceInclude = "${ACE_ROOT}";
					includePathSettings.add(new CIncludePathEntry(aceInclude, ICSettingEntry.LOCAL));
					String smartInclude = "${SMART_ROOT_ACE}/include";
					includePathSettings.add(new CIncludePathEntry(smartInclude, ICSettingEntry.LOCAL));
					
					includePathSettings.add(new CIncludePathEntry("smartsoft/src", ICSettingEntry.VALUE_WORKSPACE_PATH));
					includePathSettings.add(new CIncludePathEntry("smartsoft/src-gen", ICSettingEntry.VALUE_WORKSPACE_PATH));
					
					setting.setSettingEntries(ICSettingEntry.INCLUDE_PATH, includePathSettings);
				}
			}
		}
		
		CoreModel.getDefault().setProjectDescription(project, projectDescription);
	}
	
	protected void createCommObjectsModel(final IProject project, IFolder modelFolder, IProgressMonitor monitor, IWorkbenchPage page) throws CoreException {
		// create simple Xtext model file
		IFile modelFile = modelFolder.getFile(project.getName()+".types");
		
		String modelContent = "CommObjectsRepository "+project.getName()+" version 1.0 {\n\n}";
		
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
		IDE.openEditor(page, modelFile);
	}
	
	protected void createServiceDefinitionModel(final IProject project, IFolder modelFolder, IProgressMonitor monitor, IWorkbenchPage page) throws CoreException {
		// create simple Xtext model file
		IFile modelFile = modelFolder.getFile(project.getName()+".services");
		
		String modelContent = "ServiceDefRepository "+project.getName()+" version 1.0 {\n\n}";
		
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
		IDE.openEditor(page, modelFile);
	}
	
	protected void createComponentModesModel(final IProject project, IFolder modelFolder, IProgressMonitor monitor, IWorkbenchPage page) throws CoreException {
		// create simple Xtext model file
		IFile modelFile = modelFolder.getFile(project.getName()+".modes");
		
		String modelContent = "ComponentModeRepository "+project.getName()+" {\n" + 
				"\tComponentModeCollection DefaultModes {\n"
				+ "\t\tComponentModeDefinition Active;\n"
				+ "\t}\n}"; 
		
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
		IDE.openEditor(page, modelFile);
	}
	
	protected void createParametersModel(final IProject project, IFolder modelFolder, IProgressMonitor monitor, IWorkbenchPage page) throws CoreException {
		// create simple Xtext model file
		IFile modelFile = modelFolder.getFile(project.getName()+".parameters");
		
		String modelContent = "ParameterSetRepository "+project.getName()+" {\n" +
				"\tParameterSet MyParameterSet extends EmptyDefaultParameterSet { }\n}";
		
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, monitor);
		
//		IDE.openEditor(page, modelFile);
	}

	@Override
	protected String getImportedModelFileExtension() {
		return "types";
	}

}
