//================================================================
//
//  Copyright (C) 2016 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.sirius.tools;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractOpenXtextEditorViewPartAction extends AbstractExternalJavaAction {
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
		
//		System.out.println("self: "+selfObject);
		
		try {
			// open parameter ViewPart
			IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(this.getViewPartID());
			if(selfObject instanceof DDiagramElement) {
				DDiagramElement diagramElement = (DDiagramElement)selfObject;
				if(this.checkModelConstraints(diagramElement)) {
					if(view instanceof AbstractXtextEditorViewPart) {
						AbstractXtextEditorViewPart xtextViewPart = (AbstractXtextEditorViewPart)view;
						// define Xtext URI for the parameter model
						URI xtextResourceUri = xtextViewPart.getAccordingXtextResourceUri(diagramElement);
						// create the model file
						this.createModelFile(xtextResourceUri);
						// set-up xtext resource
						xtextViewPart.setExternalEmfBase(diagramElement, xtextResourceUri);
						// update semantic model
						this.updateSemanticModel(diagramElement, xtextViewPart);
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	protected void createModelFile(URI xtextResourceUri) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath modelFilePath = new Path(xtextResourceUri.toPlatformString(true));
		IFile modelFile = workspaceRoot.getFile(modelFilePath);
		if(!modelFile.exists()) {
			String modelContent = this.getDefaultModelConent(xtextResourceUri);
			InputStream stream = new ByteArrayInputStream(modelContent.getBytes());
			try {
				// create model file
				modelFile.create(stream, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * This method needs to be implemented in derived classes to return the according ViewPart ID.
	 * @return ViewPart ID
	 */
	public abstract String getViewPartID();
	/**
	 * This method should create the default model content using the current model file URI.
	 * @param xtextResourceUri is the current model-file-URI
	 * @return model-file content
	 */
	public abstract String getDefaultModelConent(URI xtextResourceUri);
	/**
	 * This method should be used to check any diagram-model constraints prior to actually creating the Xtext model.
	 * @param diagramElement
	 * @return true if constraints are met
	 */
	public abstract boolean checkModelConstraints(DDiagramElement diagramElement);
	
	protected void updateSemanticModel(DRepresentationElement representationElem, AbstractXtextEditorViewPart xtextViewPart) {
		// overload in derived classes (if needed)
	}
}
