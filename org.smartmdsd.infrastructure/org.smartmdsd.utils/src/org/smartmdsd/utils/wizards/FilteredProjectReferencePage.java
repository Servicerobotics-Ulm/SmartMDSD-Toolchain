//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.smartmdsd.utils.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

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
