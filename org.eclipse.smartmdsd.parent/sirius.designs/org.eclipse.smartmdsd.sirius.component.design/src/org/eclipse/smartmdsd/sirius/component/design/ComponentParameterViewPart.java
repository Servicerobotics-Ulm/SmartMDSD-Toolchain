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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef;
import org.eclipse.smartmdsd.sirius.utils.xtext.AbstractXtextEditorViewPart;
import org.eclipse.smartmdsd.xtext.component.componentParameter.ui.internal.ComponentParameterActivator;

import com.google.inject.Injector;

public class ComponentParameterViewPart extends AbstractXtextEditorViewPart {
	@Override
	public Injector getInjector() {
		return ComponentParameterActivator.getInstance().getInjector(ComponentParameterActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTPARAMETER_COMPONENTPARAMETER);
	}
	
	@Override
	protected ISelectionListener createNewSelectionListener() {
		return new ISelectionListener() {
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if(part instanceof DDiagramEditor) {
					DDiagramEditor dEditor = (DDiagramEditor)part;					
					Session session = dEditor.getSession();
					
					// check if the Component flag hasParameters is set to true
					// only then show the embedded editor
					for(DView view: session.getOwnedViews()) {
						if(view.getViewpoint().getName().equals("ComponentDefinitionViewpoint")) {
							for(DRepresentationDescriptor repDescr: view.getOwnedRepresentationDescriptors()) {
								DRepresentation rep = repDescr.getRepresentation();
								if(rep instanceof DSemanticDiagram) {
									for(DRepresentationElement elem: rep.getOwnedRepresentationElements()) {
										if(elem.getTarget() instanceof ComponentDefinition) {
											ComponentDefinition comp = (ComponentDefinition)elem.getTarget();
											for(AbstractComponentElement compElem: comp.getElements()) {
												if(compElem instanceof ComponentParametersRef) {
													if(getResourceProvider().isCurrentSession(session)) {
														// show embedded editor only if component has parameters defined
														showEmbeddedEditor();													
													} else {
														URI componentModelUri = comp.eResource().getURI();
														String modelFileExtension = getModelFileExtension();
														URI xtextResourceUri = componentModelUri.trimFileExtension().appendFileExtension(modelFileExtension);
														setExternalEmfBase(elem, xtextResourceUri);
													}
													// do not continue any longer
													return;
												}
											}
										} // end if (target instanceof Component)
									} // end for(OwnedRepresentationElements)
								} // end if (rep instanceof DSemanticDiagram)
							} // end for (OwnedRepresentations)
						} // end if(viewpoint == "component.viewpoint")
					} // end for (OwnedViews)
				}
				// in all other cases the editor should remain hidden
				hideEmbeddedEditor();
			}	
		};
	}
}
