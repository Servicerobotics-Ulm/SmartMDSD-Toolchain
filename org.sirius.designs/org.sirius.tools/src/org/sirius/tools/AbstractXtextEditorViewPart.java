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

package org.sirius.tools;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public abstract class AbstractXtextEditorViewPart extends ViewPart implements ISaveablePart {
	// this is the ID of the ViewPart
	public static final String ID = "org.sirius.tools.XtextEditorViewPart";
	
	/**
	 * This method needs to be implemented in derived classes.
	 * The method may internally use the Activator class of the according Xtext DSL.
	 * Example: MyDslActivator.getInstance().getInjector(MyDslActivator.ORG_XTEXT_MYMODEL_MYDSL_MYDSL);
	 * @return The Injector of the Xtext DSL
	 */
	public abstract Injector getInjector();
	
	public String getModelFileExtension() {
		if(resourceProvider != null) {
			return resourceProvider.getModelFileExtension();			
		}
		return "";
	}
	
	/**
	 * This is the main user method to be called from outside for exchanging the 
	 * EMF (Xtext) resource for editing.
	 * @param model
	 */
	public void setEmfModelBase(DRepresentationElement diagramElementObject) {
		resourceProvider.setCurrentResourceObject(diagramElementObject);
		this.reloadCurrentModelText();
		this.showEmbeddedEditor();
		this.setEditorFocus();
	}
	/**
	 * Alternative method for the case when the EMF model to be edited is NOT part of the Sirius model but is an external Xtext grammar
	 * @param modelElementObject
	 * @param resourceUri
	 */
	public void setExternalEmfBase(DRepresentationElement diagramElementObject, URI xtextResourceUri) {
		resourceProvider.setExternalResource(diagramElementObject, xtextResourceUri);
		this.reloadCurrentModelText();
		this.showEmbeddedEditor();
		this.setEditorFocus();
	}
	public URI getAccordingXtextResourceUri(DRepresentationElement diagramElementObject) {
		return resourceProvider.getAccordingXtextResourceUri(diagramElementObject);
	}
	public void removeResourceBase(URI resourceUri) {
		resourceProvider.removeExternalResource(resourceUri);
		this.hideEmbeddedEditor();
	}
	/**
	 * This method is triggered by saving the edited model in the embedded Xtext editor
	 * and is responsible to propagate the model update to the underlying resource provider.
	 * @param monitor
	 */
	protected void saveModel(IProgressMonitor monitor) {
		if(editor != null) {
			resourceProvider.saveOriginalResource(monitor);
		}
	}
	/**
	 * This method should be called from outside for deactivating the contents of the embedded Xtext editor 
	 */
	public void hideEmbeddedEditor() {
		if(editor != null) {
			editor.getViewer().getControl().setVisible(false);
		}
	}

	/**
	 * Implementing saveable editor behavior
	 */
	private boolean dirtyFlag;
	
	protected void setDirty(boolean dirty) {
		if(dirtyFlag != dirty) {
			dirtyFlag = dirty;
			// fire dirty-changed property
			firePropertyChange(PROP_DIRTY);
		}
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// save the model (see implementation below)
		this.saveModel(monitor);
		// reset the dirty flag
		this.setDirty(false);
	}
	@Override
	public void doSaveAs() {
		// do nothing by default (does not make sense for a ViewPart)
	}
	@Override
	public boolean isDirty() {
		return dirtyFlag;
	}
	@Override
	public boolean isSaveAsAllowed() {
		// does not make sense for a ViewPart
		return false;
	}
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}

	
	/**
	 * implementing the ViewPart behavior
	 */
	// composite container for storing the EmbeddedEditor
	private Composite container = null;
	
	// XtextResourceProvider (for handling EMF and Sirius resources)
	private XtextVirtualResourceProvider resourceProvider = null;
	
	protected XtextVirtualResourceProvider getResourceProvider() {
		return resourceProvider;
	}
	
	// Embedded editor and editor-model classes
	private EmbeddedEditorFactory factory = null;
	private EmbeddedEditor editor = null;
	private EmbeddedEditorModelAccess modelAccess = null;
	private IDocumentListener documentListener = null;
	
	@Override
	public void createPartControl(Composite parent) {
		// create the composite frame with a grid layout
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		// get the implemented injector
		Injector injector = getInjector();
		
		resourceProvider = injector.getInstance(XtextVirtualResourceProvider.class);
		factory = injector.getInstance(EmbeddedEditorFactory.class);
		
		editor = factory.newEditor(resourceProvider).showErrorAndWarningAnnotations().withParent(container);
		modelAccess = editor.createPartialEditor(true);
//		editor.getViewer().addVerticalRulerColumn(new LineNumberRulerColumn());
		addDocumentListener();
		setDirty(false);
		hideEmbeddedEditor();
		addSelectionListener();
	}
	
	protected void showEmbeddedEditor() {
		if(editor != null) {
			editor.getViewer().getControl().setVisible(true);
		}
	}
	
	protected void reloadCurrentModelText() {
		List<String> modelText = resourceProvider.getModelText();
		if(modelText.size() == 3) {
//			System.out.println("prefix: "+modelText.get(0));
//			System.out.println("body: "+modelText.get(1));
//			System.out.println("suffix: "+modelText.get(2));
			modelAccess.updateModel(modelText.get(0), modelText.get(1), modelText.get(2));
			setDirty(false);				
		}
	}
	
	protected void addDocumentListener() {
		documentListener = new IDocumentListener() {
			@Override
			public void documentAboutToBeChanged(DocumentEvent event) {
				// do nothing
			}
			@Override
			public void documentChanged(DocumentEvent event) {
				setDirty(true);
			}
		};
		editor.getDocument().addDocumentListener(documentListener);
	}
	protected void removeDocumentListener() {
		if(documentListener != null && editor != null) {
			editor.getDocument().removeDocumentListener(documentListener);
			documentListener = null;
		}
	}

	@Override
	public void setFocus() {
		// do not set the focus to the ViewPart by default (will be set on demand)
	}
	protected void setEditorFocus() {
		if(editor != null) {
			editor.getViewer().getControl().setFocus();			
		}
	}
	
	@Override
	public void dispose() {
		removeDocumentListener();
		removeSelectionListener();
		super.dispose();
	}
	
	
	/**
	 * Implementing selection listener to hide/show the embedded editor according to the currently selected editor.
	 * The embedded editor is only shown if the currently selected diagram editor has the same Sirius session
	 * as the currently configured resource in the embedded editor.
	 */
	private ISelectionListener selectionListener = null;
	
	protected ISelectionListener createNewSelectionListener() {
		return new ISelectionListener() {
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if(part instanceof DDiagramEditor) {
					DDiagramEditor dEditor = (DDiagramEditor)part;
					if(resourceProvider.isCurrentSession(dEditor.getSession())) {
						// if the current selection of an editor uses the same session
						// => show the editor
						showEmbeddedEditor();
						return;
					}
				}
				// in all other cases the editor should remain hidden
				hideEmbeddedEditor();
			}	
		};
	}
	protected void addSelectionListener() {
		selectionListener = createNewSelectionListener();
		getSite().getPage().addSelectionListener(selectionListener);			
	}
	protected void removeSelectionListener() {
		if(selectionListener != null) {
			getSite().getPage().removeSelectionListener(selectionListener);
			selectionListener = null;
		}
	}
}
