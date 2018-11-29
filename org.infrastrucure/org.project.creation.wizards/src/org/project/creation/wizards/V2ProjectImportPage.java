package org.project.creation.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.model.WorkbenchContentProvider;

public class V2ProjectImportPage extends WizardResourceImportPage {

	protected V2ProjectImportPage(String name, IStructuredSelection selection) {
		super(name, selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createSourceGroup(Composite parent) {
	     //create the input element, which has the root resource
	     //as its only child
	     List<IProject> input = new ArrayList<IProject>();
	     IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
	             .getProjects();
	     for (int i = 0; i < projects.length; i++) {
	         if (projects[i].isOpen()) {
					input.add(projects[i]);
			}
	     }

//	     ResourceTreeAndListGroup resourceGroup = new ResourceTreeAndListGroup(parent, input,
//	             getResourceProvider(IResource.FOLDER | IResource.PROJECT),
//	             WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider(),
//	             getResourceProvider(IResource.FILE), WorkbenchLabelProvider
//	                     .getDecoratingWorkbenchLabelProvider(), SWT.NONE,
//	             DialogUtil.inRegularFontMode(parent));
//	     
//	     ICheckStateListener listener = new ICheckStateListener() {
//	         public void checkStateChanged(CheckStateChangedEvent event) {
//	             updateWidgetEnablements();
//	         }
//	     };
//	     
//	     resourceGroup.addCheckStateListener(listener);
//		
	}

	@Override
	protected ITreeContentProvider getFileProvider() {
		return new WorkbenchContentProvider() {

			public Object[] getChildren(Object element) {
				if (element instanceof FileSystemElement) {
					return ((FileSystemElement) element).getFiles()
						.getChildren(element);
				}
				return new Object[0];
			}
		};
	}

	@Override
	protected ITreeContentProvider getFolderProvider() {
		return new WorkbenchContentProvider() {

			public Object[] getChildren(Object element) {
				if (element instanceof FileSystemElement) {
					return ((FileSystemElement) element).getFolders()
						.getChildren(element);
				}
				return new Object[0];
			}
		};
	}

}
