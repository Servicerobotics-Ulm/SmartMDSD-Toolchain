//--------------------------------------------------------------------------
//
//  Copyright (C) 2016, 2018 Alex Lotz
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
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;

public class ComponentProjectCreationWizard extends AbstractProjectCreationWizard {

	@Override
	protected IWizardPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("ComponentProjectWizard");
		page.setTitle("Component Project");
		page.setDescription("This wizard creates a Component project with the focus on component-internal details");
		page.setInitialProjectName("ComponentAnyName");
		return page;
	}
	
	@Override
	protected void customizeProject(IProject project, final IProject[] projectRefs, IFolder modelFolder, IProgressMonitor monitor) throws CoreException 
	{
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Customize Component Project", 100);
        // create Xtext model with an empty component
        IFile modelFile = modelFolder.getFile(project.getName()+".component");
		String modelContent = "ComponentDefinition "+project.getName()+" logo \"/"+project.getName()+"/model/logo.png\"\n{\n\n}";
		InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
		modelFile.create(stream, true, subMonitor.split(10));
		
		// create Xtext model with an empty ComponentParameters block
        IFile paramModelFile = modelFolder.getFile(project.getName()+".componentParameters");
		String paramModelContent = "ComponentParameter "+project.getName()+"Params component "+project.getName()+" {\n\n}";
		InputStream paramStream = new ByteArrayInputStream(paramModelContent.getBytes());
		paramModelFile.create(paramStream, true, subMonitor.split(10));
		
		// create Xtext model with an empty ComponentParameters block
        IFile compDocuModelFile = modelFolder.getFile(project.getName()+".componentDocumentation");
		String compDocuModelContent = "ComponentDocumentation "+project.getName()+" {\n\n}";
		InputStream compDocuStream = new ByteArrayInputStream(compDocuModelContent.getBytes());
		compDocuModelFile.create(compDocuStream, true, subMonitor.split(10));
		
		//convertToCdtProject(project, monitor);
		try {
			addCppSettings(project, subMonitor.split(10));
			setComponentCppIncludes(project);
		} catch (BuildException e) {
			e.printStackTrace();
		}
		
		// convert the project into a modeling project (adding a ModelingProject nature and creating 
        ModelingProjectManager.INSTANCE.convertToModelingProject(project, subMonitor.split(10));
		
		// now set the modeling project properties
		IProjectNature nature = project.getNature(ModelingProject.NATURE_ID);
		if (nature instanceof ModelingProject) {
			ModelingProject mproject = (ModelingProject)nature;
			Session session = mproject.getSession();
			
			// add models (with the file ending .comm) from the referenced projects
			ModelingProjectHelpers.addProjectModels(projectRefs, getImportedModelFileExtension(), session, subMonitor.split(10));
			
			// select a viewpoint
			final String modelFileExtension = "component";
			final String viewpointName = "ComponentDefinitionViewpoint";
			ModelingProjectHelpers.selectViewpoint(session, modelFileExtension, viewpointName, subMonitor.split(10));

			// open diagram using a corresponding model-editor
			ModelingProjectHelpers.openSingleDiagramEditorForSession(session, project.getName(), subMonitor.split(10));
			
//			session.save(monitor);
			project.refreshLocal(2, subMonitor.split(10));
		}
	}
	
	@Override
	protected String getImportedModelFileExtension() {
		return "services";
	}
	
	
	protected void setComponentCppIncludes(IProject project) throws CoreException 
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
					String apiInclude = "${SMART_ROOT_ACE}/include/SmartSoft_CD_API";
					includePathSettings.add(new CIncludePathEntry(apiInclude, ICSettingEntry.LOCAL));
					String kernelInclude = "${SMART_ROOT_ACE}/include/AceSmartSoftKernel";
					includePathSettings.add(new CIncludePathEntry(kernelInclude, ICSettingEntry.LOCAL));
					
					includePathSettings.add(new CIncludePathEntry("smartsoft/src", ICSettingEntry.VALUE_WORKSPACE_PATH));
					includePathSettings.add(new CIncludePathEntry("smartsoft/src-gen", ICSettingEntry.VALUE_WORKSPACE_PATH));
					
					setting.setSettingEntries(ICSettingEntry.INCLUDE_PATH, includePathSettings);
				}
			}
		}
		
		CoreModel.getDefault().setProjectDescription(project, projectDescription);
	}
	
//	protected IProject convertToCdtProject(IProject project, IProgressMonitor monitor) throws CoreException 
//	{
//		try {
//			final String projectName = project.getName();
//	        IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
//			IProject cdtProject = CCorePlugin.getDefault().createCDTProject(description, project, getBuildSystemId(), monitor);
//			
////			// add C and C++ Project Natures
////			CProjectNature.addCNature(cdtProject, monitor);
////			CCProjectNature.addCCNature(cdtProject, monitor);
////			
////			CCorePlugin.getDefault().convertProjectToNewC(cdtProject, getBuildSystemId(), monitor);
////			CCorePlugin.getDefault().convertProjectToNewCC(cdtProject, getBuildSystemId(), monitor);
//			
//			IManagedBuildInfo buildInfo = ManagedBuildManager.getBuildInfo(project);
//			buildInfo.setSelectedConfiguration(getConfigurations().get(0));
//			ManagedBuildManager.saveBuildInfo(project, true);
//			
//			setCppIncludes(cdtProject);
//			
//			return cdtProject;
//        } catch (OperationCanceledException | CoreException e) {
//        	e.printStackTrace();
//        }
//		return project;
//	}
//	
//	public String getProjectID() {
//		return MakeCorePlugin.MAKE_PROJECT_ID;
//	}
//	
//	public String getBuildSystemId() {
//		return ManagedBuildManager.CFG_DATA_PROVIDER_ID;
//	}
//	
//	private void setProjectDescription(IProject project, boolean defaults, boolean onFinish, IProgressMonitor monitor) throws CoreException {
//		final String propertyId = ManagedBuildManager.BUILD_ARTEFACT_TYPE_PROPERTY_EXE;
//		final String artefactType = ManagedBuildManager.BUILD_ARTEFACT_TYPE_PROPERTY_ID;
//		
//		ManagedBuildInfo info = ManagedBuildManager.createBuildInfo(project);
//		ICProjectDescriptionManager mngr = CoreModel.getDefault().getProjectDescriptionManager();
//		try {
//			ICProjectDescription des = mngr.createProjectDescription(project, true, true);
//			for (IToolChain tc : handler.getSelectedToolChains()){
//				CfgHolder[] cfgs = CfgHolder.cfgs2items(ManagedBuildManager.getExtensionConfigurations(tc, artefactType, propertyId));
//				
//				Configuration cf = (Configuration)cfgs[0].getConfiguration();
//				ManagedProject mProj = new ManagedProject(project, cf.getProjectType());
//				System.out.println("project-type: "+cf.getProjectType());
//				info.setManagedProject(mProj);
//				
//				CfgHolder cfg = cfgs[0];
//				String id = ManagedBuildManager.calculateChildId(cf.getId(), null);
//				Configuration config = new Configuration(mProj, cf, id, false, true);
//				CConfigurationData data = config.getConfigurationData();
//				ICConfigurationDescription cfgDes = des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
//				config.setConfigurationDescription(cfgDes);
//				config.exportArtifactInfo();
//				
//				IBuilder bld = config.getEditableBuilder();
//				if (bld != null) { 	bld.setManagedBuildOn(true); }
//
//				config.setName(cfg.getName());
//				config.setArtifactName(mProj.getDefaultArtifactName());
//				mngr.setProjectDescription(project, des);
//			}
//			
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
	
}
