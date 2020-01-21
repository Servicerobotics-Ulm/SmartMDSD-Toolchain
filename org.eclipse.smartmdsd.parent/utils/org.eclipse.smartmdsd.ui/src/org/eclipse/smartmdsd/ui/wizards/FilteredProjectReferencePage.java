//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.eclipse.smartmdsd.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;

public class FilteredProjectReferencePage extends WizardNewProjectReferencePage {
	private SmartMDSDNatureEnum currentNatureEnum;
	
	public FilteredProjectReferencePage(String pageName, SmartMDSDNatureEnum currentNatureEnum) {
		super(pageName);
		this.currentNatureEnum = currentNatureEnum;
	}

    /**
     * Returns a content provider for the filtered project-list potentially to be referenced. 
     * It will return all projects in the workspace that have a certain project nature.
     *
     * @return the content provider
     */
	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new WorkbenchContentProvider() {
			@Override
			public Object[] getChildren(Object element) {
				if (!(element instanceof IWorkspace)) {
					return new Object[0];
				}
				IProject[] projects = ((IWorkspace) element).getRoot().getProjects();
				if (projects != null) {
					List<IProject> filteredProjects = new ArrayList<IProject>();
					try {
						List<String> relatedProjectNatureIds = currentNatureEnum.createSmartMDSDNatureObject().getImportedProjectNatureIds();
						for (IProject project : projects) {
							if (project.isOpen()) {
								for(String natureId: relatedProjectNatureIds) {
									if(project.hasNature(natureId) == true) {
										filteredProjects.add(project);
									}
								}
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
					return filteredProjects.toArray();
				}
				return projects == null ? new Object[0] : projects;
			}
		};
    }
}
