/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.sirius.component.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef;

public class DeleteComponentParameterModelFileAction extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		// this action expects a parameter called self which contains the current calling scope object
		EObject selfObject = getParameter(arg1, "self", EObject.class);
		if(selfObject == null) {
			for(EObject object: arg0) {
				selfObject = object;
			}
		}
		if(selfObject instanceof DDiagramElement) {
			DDiagramElement diagramElement = (DDiagramElement)selfObject;
			EObject target = diagramElement.getTarget();
			if(target instanceof ComponentParametersRef) {
				IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.smartmdsd.sirius.component.design.ComponentParamView");
				if(view instanceof ComponentParameterViewPart) {
					ComponentParameterViewPart compViewPart = (ComponentParameterViewPart)view;
					// get Xtext model file URI
					URI xtextResourceUri = compViewPart.getAccordingXtextResourceUri(diagramElement);			
					this.askToDeleteModelFile(xtextResourceUri, compViewPart);				
				}
			}
		}	
	}
	
	
	
	protected void askToDeleteModelFile(URI xtextResourceUri, ComponentParameterViewPart compViewPart) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath modelFilePath = new Path(xtextResourceUri.toPlatformString(true));
		IFile modelFile = workspaceRoot.getFile(modelFilePath);
		if(modelFile.exists()) {
			String messageTitle = "Delete ComponentParameter model file";
			String message = "Do you also want to delete the according model file "+modelFile.getName()+"?";
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			// create MessageBox
			MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION| SWT.YES|SWT.NO);
			dialog.setText(messageTitle);
			dialog.setMessage(message);
			// open message dialog
			int result = dialog.open();
			if(result == SWT.YES) {
				try {
					// delete model file
					modelFile.delete(true, new NullProgressMonitor());
					// remove the resource
					compViewPart.removeResourceBase(xtextResourceUri);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("No pressed");
			}
		}
	}
}
