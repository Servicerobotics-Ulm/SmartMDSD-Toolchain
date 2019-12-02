//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
package org.smartmdsd.navigator.imports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDDiagramEditPart;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.smartmdsd.navigator.imports.ImportedProjectsElement;
import org.smartmdsd.utils.factories.JavaProjectFactory;
import org.smartmdsd.utils.natures.AbstractSmartMDSDNature;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

public class ManageProjectImportsCommandHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		IProject selectedProject = getSelectedProject(window);
		if(selectedProject != null) {
			List<IProject> preselectedProjects = null;
			try {
				preselectedProjects = Arrays.asList(selectedProject.getReferencedProjects());
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			ILabelProvider workbencLbelProvider = new WorkbenchLabelProvider();
			String dialogMessage = "Select project-references";
			IStructuredContentProvider filteredContentProvider = createFilteredContentProvider(selectedProject);
			
			
			// create and open a ListSelectionDialog using an own ModelImportContentProvider
			ListSelectionDialog dialog = new ListSelectionDialog(window.getShell(), workspaceRoot,
					filteredContentProvider, workbencLbelProvider, dialogMessage);
			dialog.setTitle("Imported Projects Selection");
			if(preselectedProjects != null) {
				dialog.setInitialElementSelections(preselectedProjects);
			}
			
			if(dialog.open() == Window.OK) {
				updateProjectReferences(selectedProject, dialog.getResult());
			}
		}
		return null;
	}
	
	private IProject getSelectedProject(IWorkbenchWindow window) {
		ISelection selection = window.getSelectionService().getSelection();

		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
			if(firstElement instanceof IProject) {
				return (IProject)firstElement;
			} else if(firstElement instanceof ImportedProjectsElement) {
				ImportedProjectsElement imports = (ImportedProjectsElement)firstElement;
				return imports.getParent();
			} else if(firstElement instanceof IDDiagramEditPart) {
				// this case allows using this command from within the Sirius diagram context
				IDDiagramEditPart diagramEditPart = (IDDiagramEditPart)firstElement;
				Option<DDiagram> diagramOption = diagramEditPart.resolveDDiagram();
				if(diagramOption.some() == true) {
					DDiagram diagram = diagramOption.get();
					String diagramProjectName = diagram.eResource().getURI().segment(1);
					IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
					return workspaceRoot.getProject(diagramProjectName);
				}
			}
		}
		return null;
	}

	private void updateProjectReferences(IProject currentProject, Object[] selectedElements) {
		WorkspaceJob job = new WorkspaceJob("Update project settings of " + currentProject.getName()) {
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				// for consistency reasons we also update the plain project references
				IProjectDescription currentDescription = currentProject.getDescription();
				
				currentDescription.setReferencedProjects(Arrays.copyOf(selectedElements, selectedElements.length, IProject[].class));
				currentProject.setDescription(currentDescription, monitor);
				
				// update project references within the Java build-path ensures proper Xtext cross-references resolution
				JavaProjectFactory.updateJavaReferencedProjects(currentProject, selectedElements, monitor);
				
				currentProject.refreshLocal(2, monitor);
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
	
    /**
     * Returns a content provider for the filtered project-list potentially to be referenced. 
     * It will return all projects in the workspace that have a certain project nature.
     *
     * @return the content provider
     */
	protected IStructuredContentProvider createFilteredContentProvider(IProject selectedProject) {
		return new WorkbenchContentProvider() {
			@Override
			public Object[] getChildren(Object element) {
				if (!(element instanceof IWorkspaceRoot)) {
					return new Object[0];
				}
				IProject[] allWorkspaceProjects = ((IWorkspaceRoot) element).getProjects();
				if (allWorkspaceProjects != null) {
					List<IProject> filteredProjects = new ArrayList<IProject>();
					try {
						for(SmartMDSDNatureEnum currentNatureEnum: SmartMDSDNatureEnum.values()) {
							AbstractSmartMDSDNature currentNatureObject = currentNatureEnum.getSmartMDSDNatureFrom(selectedProject);
							if(currentNatureObject != null) {
								List<String> relatedProjectNatureIds = currentNatureObject.getImportedProjectNatureIds();
								for (IProject project : allWorkspaceProjects) {
									if (project.isOpen()) {
										for(String natureId: relatedProjectNatureIds) {
											if(project.hasNature(natureId) == true) {
												filteredProjects.add(project);
											}
										}
									}
								}
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
					return filteredProjects.toArray();
				}
				return new Object[0];
			}
		};
    }
}
