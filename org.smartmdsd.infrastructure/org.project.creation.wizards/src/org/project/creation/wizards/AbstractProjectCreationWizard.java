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

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.CCProjectNature;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.managedbuilder.buildproperties.IBuildPropertyValue;
import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.IManagedProject;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;

public abstract class AbstractProjectCreationWizard extends Wizard implements INewWizard {

	protected IWizardPage pageOne;
	protected WizardNewProjectReferencePage pageTwo;
	
	protected IWorkbench workbench;
	protected ISelection selection;

	
	public AbstractProjectCreationWizard() {
		super();
		pageOne = createFirstPage();
		setNeedsProgressMonitor(true);
	}
	
	// implement this method in derived classes
	protected abstract IWizardPage createFirstPage();
	
	@Override
	public void addPages() {
		//super.addPages();
		
		addPage(pageOne);
		
//		pageTwo = new WizardNewProjectReferencePage("ProjectReferencesPage");
		pageTwo = new FilteredProjectPreferencePage("ProjectReferencesPage", getImportedModelFileExtension());
		pageTwo.setTitle("Select referenced projects");
		pageTwo.setDescription("This page allows to select referenced projects");
		addPage(pageTwo);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;	
	}

	@Override
	public boolean performFinish() {
		// create a proper project description
		final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(pageOne.getName());
		if(pageOne instanceof WizardNewProjectCreationPage) {
			URI location = ((WizardNewProjectCreationPage)pageOne).getLocationURI();
			description.setLocationURI(location);
		}
//		description.setReferencedProjects(pageTwo.getReferencedProjects());
		
		boolean result = true; // as long as no exception will be thrown this remains true
		
		boolean doFork = false;
		boolean cancelable = false;
		try {
			getContainer().run(doFork, cancelable, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					SubMonitor subMonitor = SubMonitor.convert(monitor, "Project Creation Wizard", 100);
					try {
						// create the project (given the new description)
						final IProject project = createProject(description, subMonitor.split(10));
						
						// add Xtext and Java project natures by default
						addProjectNatures(project, new String[] {"org.eclipse.xtext.ui.shared.xtextNature", JavaCore.NATURE_ID}, subMonitor.split(10));
						
						//Create a Java Project
						IJavaProject javaProject = JavaCore.create(project);
						
						// set the Java build-path entries (model as source folder and project dependencies)
						IProject[] projectRefs = pageTwo.getReferencedProjects();
						
						//set the model folder as a source entry
						int defaultEntriesNumber = 2;
						IClasspathEntry[] buildPath = new  IClasspathEntry[defaultEntriesNumber + projectRefs.length];
						buildPath[0] = JavaRuntime.getDefaultJREContainerEntry();
						buildPath[1] = JavaCore.newSourceEntry(project.getFullPath().append("model"));

//						// add default StateSet library to Java classpath
//						Bundle bundle = Platform.getBundle("org.xtext.base.stateMachine");
//						String sm_path_str = "ECLIPSE_HOME/plugins/"+bundle.getSymbolicName()+"_"+bundle.getVersion()+".jar";
//						System.out.println("sm_path_str: "+sm_path_str);
//						IPath sm_path = new Path(sm_path_str);
//						buildPath[2] = JavaCore.newVariableEntry(sm_path, null, null);
//						
//						// add default ParameterSet library to Java classpath
//						bundle = Platform.getBundle("org.xtext.service.parameterDefinition");
//						String pd_path_str = "ECLIPSE_HOME/plugins/"+bundle.getSymbolicName()+"_"+bundle.getVersion()+".jar";
//						System.out.println("pd_path_str: "+pd_path_str);
//						IPath pd_path = new Path(pd_path_str);
//						buildPath[3] = JavaCore.newVariableEntry(pd_path, null, null);
						
						for(Integer i=0; i<projectRefs.length; i++) {
							buildPath[i+defaultEntriesNumber] = JavaCore.newProjectEntry(projectRefs[i].getFullPath());
						}
						javaProject.setRawClasspath(buildPath, project.getFullPath().append(
										"bin"), subMonitor.split(10));
						
				        // create model folder
				        IFolder modelFolder = project.getFolder("model");
				        modelFolder.create(true, true, subMonitor.split(10));
				        
						if(project.isOpen()) {		
							// call project customization method (implemented in derived classes)
							customizeProject(project, projectRefs, modelFolder, subMonitor.split(10)); // method can throw a core exception
						}
					} catch (CoreException e) {
						// re-throw exception to indicate false result
						throw new InvocationTargetException(e);
					}			
				}
			});
		} catch (InvocationTargetException | InterruptedException e1) {
			e1.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	// the following three methods can me overloaded in derived classes for customizing project creation behavior
	protected IProject getProjectHandle() {
		if(pageOne instanceof WizardNewProjectCreationPage) {
			return ((WizardNewProjectCreationPage)pageOne).getProjectHandle();
		} else {
			return ResourcesPlugin.getWorkspace().getRoot().getProject(pageOne.getName());
		}
	}
	
	protected void addProjectNatures(IProject project, String[] natures, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = project.getDescription();
        String[] currNatures = description.getNatureIds();
        String[] newNatures = new String[currNatures.length+natures.length];
        System.arraycopy(currNatures, 0, newNatures, 0, currNatures.length);
        System.arraycopy(natures, 0, newNatures, currNatures.length, natures.length);
        description.setNatureIds(newNatures);
        project.setDescription(description, monitor);
	}
	
	protected IProject createProject(IProjectDescription description, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Create Project", 20);
		IProject project = getProjectHandle();
		// create the project with a given description
		project.create(description, subMonitor.split(10));
		// open project
		project.open(IResource.BACKGROUND_REFRESH, subMonitor.split(10));
		return project;
	}
	
	// implement custom project creation wizards by deriving from this class and implementing this abstract method
	protected abstract void customizeProject(final IProject project, final IProject[] projectRefs, IFolder modelFolder, IProgressMonitor monitor) throws CoreException;
	
	// based on this given model-file-extension the list of projects to be referenced is filtered 
	// (only Projects containing a model-file with the given extension will be shown in the wizard) 
	protected abstract String getImportedModelFileExtension();
	
	// code inspired from http://cdt-devel-faq.wikidot.com/
	protected List<IConfiguration> getCppConfigurations() {
		List<IConfiguration> cfgs = new ArrayList<IConfiguration>();
		for (IConfiguration cfg : ManagedBuildManager.getExtensionConfigurations()) {
		    IToolChain tc = cfg.getToolChain();
		    if (tc != null && ManagedBuildManager.isPlatformOk(tc) && tc.isSupported()) {
		        IBuildPropertyValue value = cfg.getBuildArtefactType();
		        if (value != null) {
		            if (ManagedBuildManager.BUILD_ARTEFACT_TYPE_PROPERTY_EXE.equals(value.getId())) {
		                cfgs.add(cfg);
		            }
		        }
		    }
		}
		return cfgs;
	}
	
	// code inspired from http://cdt-devel-faq.wikidot.com/
	protected void addCppSettings(IProject project, IProgressMonitor monitor) throws CoreException, BuildException  
	{
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Add C++ settings", 30);
		CProjectNature.addCNature(project, subMonitor.split(10));
		CCProjectNature.addCCNature(project, subMonitor.split(10));
		ICProjectDescription des = CoreModel.getDefault().createProjectDescription(project, false);

		// create build info and managed project
		List<IConfiguration> cfgs = getCppConfigurations();
		IConfiguration cfg = cfgs.get(0);
		ManagedBuildManager.createBuildInfo(project);
		IManagedProject mProj = ManagedBuildManager.createManagedProject(project, cfg.getProjectType());
		
		for (IConfiguration icf : cfgs) {
		    String id = ManagedBuildManager.calculateChildId(icf.getId(), null);

		    // clone the configuration and set the artifact name
		    IConfiguration config = mProj.createConfiguration(icf, id);
		    config.setArtifactName("${ProjName}");
		    
//		    // change the builder to the smartmdsd.builder if it is configured
//		    for(IBuilder builder: ManagedBuildManager.getRealBuilders()) {
//		    	if(builder.getId().equals(SmartMDSDManagedBuildConfigurator.BUILDER_ID)) {
//		    		config.changeBuilder(builder, id, builder.getName());
//		    	}
//		    }

		    // creates/add the configuration to the project description
		    des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, config.getConfigurationData());
		}

		CoreModel.getDefault().setProjectDescription(project, des);
	}
}
