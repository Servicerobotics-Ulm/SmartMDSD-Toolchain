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
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;
import org.smartmdsd.utils.natures.AbstractSmartMDSDNature;
import org.smartmdsd.utils.natures.LanguageInterface;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

public class SmartMDSDModelTypeSelectionPage extends WizardPage {

	private CheckboxTableViewer selectedModelTypesViewer;
	
	private static final int MODELS_LIST_MULTIPLIER = 10;
	
	public SmartMDSDModelTypeSelectionPage(String pageName) {
		super(pageName);
		setPageComplete(false);
	}
	
	public void setModelTypeEntriesFrom(IProject project) {
		// this is a rather long running operation so it is executed asynchronously as a job
		// in order for the wizard GUI to remain responsive
		WorkspaceJob job = new WorkspaceJob("Calculate all supported model-types for project wizard") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				// collect supported language entries depending on the project nature
				for(SmartMDSDNatureEnum natureEnum: SmartMDSDNatureEnum.values()) {
					if(project.hasNature(natureEnum.getId()) == true) {
						AbstractSmartMDSDNature nature = natureEnum.getSmartMDSDNatureFrom(project);
						LanguageInterface[] allSupportedLanguages = nature.getAllSupportedLanguages();
						final List<LanguageInterface> filteredLanguageList = filterLanguageEntries(allSupportedLanguages, project);
						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
								// this updates the Wizard GUI and thus needs to be executed within the GUI thread
								setTableContent(filteredLanguageList);
							}
						});
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
	
	public void setAllModelTypeEntriesFor(SmartMDSDNatureEnum natureEnum) {
		// this is a rather long running operation so it is executed asynchronously as a job
		// in order for the wizard GUI to remain responsive
		Job job = new Job("Calculate all supported model-types for project wizard") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				AbstractSmartMDSDNature nature = natureEnum.createSmartMDSDNatureObject();
				LanguageInterface[] allSupportedLanguages = nature.getAllSupportedLanguages();
				if(allSupportedLanguages != null) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							// this updates the Wizard GUI and thus needs to be executed within the GUI thread
							setTableContent(Arrays.asList(allSupportedLanguages));
						}
					});
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	@Override
	public void createControl(Composite parent) {
        Font font = parent.getFont();

        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        composite.setFont(font);

        Label referenceLabel = new Label(composite, SWT.NONE);
        referenceLabel.setText("Selected SmartMDSD model-types");
        referenceLabel.setFont(font);

        selectedModelTypesViewer = CheckboxTableViewer.newCheckList(composite,
                SWT.BORDER);
        selectedModelTypesViewer.getTable().setFont(composite.getFont());
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);

        data.heightHint = getDefaultFontHeight(selectedModelTypesViewer
                .getTable(), MODELS_LIST_MULTIPLIER);
        selectedModelTypesViewer.getTable().setLayoutData(data);
        selectedModelTypesViewer.setLabelProvider(new LabelProvider());
        selectedModelTypesViewer.setContentProvider(ArrayContentProvider.getInstance());
        selectedModelTypesViewer.setComparator(new ViewerComparator());
        
        // we want to ensure that at least one item of the table-list has been checked before continuing
        ISelectionChangedListener selectionChangedListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object source = event.getSource();
				if(source instanceof CheckboxTableViewer) {
					CheckboxTableViewer tableViewer = (CheckboxTableViewer)source;
					Object[] checkedElements = tableViewer.getCheckedElements();
					if(checkedElements.length > 0) {
						setPageComplete(true);
					} else {
						setPageComplete(false);
					}
				}
			}
        };
        selectedModelTypesViewer.addSelectionChangedListener(selectionChangedListener);
        
        setControl(composite);
	}

	
    /**
     * Get the default widget height for the supplied control.
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
    
    public List<String> getSelectedModelTypes() {
    	Object[] selectedObjects = selectedModelTypesViewer.getCheckedElements();
    	List<String> result = new ArrayList<String>();
    	for(Object object: selectedObjects) {
    		if(object instanceof String) {
    			result.add((String)object);
    		}
    	}
    	return result;
    }
	
	private List<LanguageInterface> filterLanguageEntries(LanguageInterface[] allSupportedLanguages, IProject project) {
		String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODEL_FOLDER);
		IFolder modelFolder = project.getFolder(modelFolderName);
		if(modelFolder.exists()) {
			List<LanguageInterface> filteredLanguages = new ArrayList<LanguageInterface>();
			for(LanguageInterface entry: allSupportedLanguages) {
				IFile modelFile = modelFolder.getFile(project.getName()+"."+entry.getModelFileExtension());
				if(!modelFile.exists()) {
					filteredLanguages.add(entry);
				}
			}
			return filteredLanguages;
		}
		return Arrays.asList(allSupportedLanguages);
	}
	
	private void setTableContent(List<LanguageInterface> languageEntries) {
		// generate table input data
		List<String> newModelTypes = new ArrayList<String>();
		List<String> preselectedModelTypes = new ArrayList<String>();
		for(LanguageInterface entry: languageEntries) {
			newModelTypes.add(entry.getKey());
			if(entry.isDefaultLanguage()) {
				preselectedModelTypes.add(entry.getKey());
			}
		}
		// set current table contents
		selectedModelTypesViewer.setInput(newModelTypes);
		selectedModelTypesViewer.setCheckedElements(preselectedModelTypes.toArray());
		
		if(!preselectedModelTypes.isEmpty()) {
			setPageComplete(true);
		}
	}
}
