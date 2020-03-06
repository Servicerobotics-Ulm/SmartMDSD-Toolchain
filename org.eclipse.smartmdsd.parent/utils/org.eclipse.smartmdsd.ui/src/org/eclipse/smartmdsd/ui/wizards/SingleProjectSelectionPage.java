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
package org.eclipse.smartmdsd.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.smartmdsd.ui.perspectives.SmartMDSDPerspectiveEnum;

public class SingleProjectSelectionPage extends WizardPage {
    // widgets
    private TableViewer referenceProjectsViewer;

    private ISelection initialSelection;
    private SmartMDSDPerspectiveEnum currentPerspectiveEnum;
    
    private static final int PROJECT_LIST_MULTIPLIER = 15;

    /**
     * Creates a new project reference wizard page.
     *
     * @param pageName the name of this page
     */
    public SingleProjectSelectionPage(String pageName, IWorkbench workbench, ISelection selection) {
        super(pageName);
        initialSelection = selection;
        IPerspectiveDescriptor currentPerspective = workbench.getActiveWorkbenchWindow().getActivePage().getPerspective();
        currentPerspectiveEnum = SmartMDSDPerspectiveEnum.getFromID(currentPerspective.getId());
    }
    
    public IProject getSelectedProject() {
		ISelection currentSelection = referenceProjectsViewer.getSelection();
		if(currentSelection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection)currentSelection;
			Object firstElement = structuredSelection.getFirstElement();
			if(firstElement instanceof IProject) {
				return (IProject)firstElement;
			}
		}
		return null;
    }
    
    public void setSelection(ISelection selection) {
    	if(referenceProjectsViewer != null) {
    		referenceProjectsViewer.setSelection(selection);
    	}
    }

    @Override
	public void createControl(Composite parent) {
        Font font = parent.getFont();

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        composite.setFont(font);

        Label referenceLabel = new Label(composite, SWT.NONE);
        referenceLabel.setText("Selected Project");
        referenceLabel.setFont(font);
        
        referenceProjectsViewer = new TableViewer(composite);
        referenceProjectsViewer.getTable().setFont(composite.getFont());
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);

        data.heightHint = getDefaultFontHeight(referenceProjectsViewer
                .getTable(), PROJECT_LIST_MULTIPLIER);
        referenceProjectsViewer.getTable().setLayoutData(data);
        referenceProjectsViewer.setLabelProvider(WorkbenchLabelProvider
                .getDecoratingWorkbenchLabelProvider());
        referenceProjectsViewer.setContentProvider(getContentProvider());
        referenceProjectsViewer.setComparator(new ViewerComparator());
        referenceProjectsViewer.setInput(ResourcesPlugin.getWorkspace());

        // we wait until a project is selected and only then activate the "Next" button
        setPageComplete(false);
        ISelectionChangedListener selectTableElementListener = new  ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if(selection instanceof StructuredSelection) {
					StructuredSelection structuredSelection = (StructuredSelection)selection;
					Object firstElement = structuredSelection.getFirstElement();
					if(firstElement instanceof IProject) {
						setPageComplete(true);
					}
				}
			}
        };
        referenceProjectsViewer.addSelectionChangedListener(selectTableElementListener);
        
        // setup initial selection (this will preselect a project entry in case a project was already selected in the project explorer)
        referenceProjectsViewer.setSelection(initialSelection);
        
        setControl(composite);
    }

    /**
     * Returns a content provider for the reference project
     * viewer. It will return all projects in the workspace.
     *
     * @return the content provider
     */
    protected IStructuredContentProvider getContentProvider() {
        return new WorkbenchContentProvider() {
            @Override
			public Object[] getChildren(Object element) {
                if (!(element instanceof IWorkspace)) {
					return new Object[0];
				}

                IProject[] allProjects = ((IWorkspace) element).getRoot().getProjects();
                List<IProject> filteredProjects = new ArrayList<IProject>();
                for(IProject project: allProjects) {
                	if(project.isOpen()) {
                		if(currentPerspectiveEnum != null) {
                			try {
								if(project.hasNature(currentPerspectiveEnum.getRelatedSmartMDSDNature().getId())) {
									filteredProjects.add(project);
								}
							} catch (CoreException e) {
								e.printStackTrace();
							}
                		} else {
                			filteredProjects.add(project);
                		}
                	}
                }
                return filteredProjects.isEmpty() ? new Object[0] : filteredProjects.toArray();
            }
        };
    }

    /**
     * Get the defualt widget height for the supplied control.
     * @return int
     * @param control - the control being queried about fonts
     * @param lines - the number of lines to be shown on the table.
     */
    private static int getDefaultFontHeight(Control control, int lines) {
        FontData[] viewerFontData = control.getFont().getFontData();
        int fontHeight = 10;

        //If we have no font data use our guess
        if (viewerFontData.length > 0) {
			fontHeight = viewerFontData[0].getHeight();
		}
        return lines * fontHeight;

    }
    
    
}
