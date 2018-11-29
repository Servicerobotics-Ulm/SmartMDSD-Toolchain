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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class XtextVirtualResourceProvider implements IEditedResourceProvider {
	@Inject private IResourceSetProvider resourceSetProvider;
	@Inject private FileExtensionProvider fileExt;
	
	private Resource originalResource = null;
	private URI currentDiagramUri = null;
	private XtextResource virtualXtextResource = null;
	private int offset = 0;
	private int endOffset = 0;

	public String getModelFileExtension() {
		return fileExt.getPrimaryFileExtension();
	}
	
	@Override
	public XtextResource createResource() {
		ResourceSet resourceSet = resourceSetProvider.get(null);
		URI uri = URI.createURI("platform:/resource/VirtualProject/virtualModel."+this.getModelFileExtension());
		virtualXtextResource = (XtextResource)resourceSet.createResource(uri);
		resourceSet.getResources().add(virtualXtextResource);
		return virtualXtextResource;
	}
	
	public void setCurrentResourceObject(DRepresentationElement diagramElementObject) {
		// store the resource from the semantic object 
		EObject semanticObject = diagramElementObject.getTarget(); 
		originalResource = semanticObject.eResource();
		// set editable text region for the current semantic element
		ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(semanticObject);
		if(actualNode != null) {
			this.setEditableTextRegion(actualNode.getOffset(), actualNode.getEndOffset());
		} else {
			// reset editableTextRegion
			this.setEditableTextRegion(0, 0);
		}
		// change URI of the virtual resource
		virtualXtextResource.setURI(originalResource.getURI());
		// save the current session resource URI
		currentDiagramUri = diagramElementObject.eResource().getURI();
	}
	
	public void setExternalResource(DRepresentationElement diagramElementObject, URI xtextResourceUri) {
		// save the current diagram-session-resource-URI
		currentDiagramUri = diagramElementObject.eResource().getURI();	
		
		reloadExternalResource(xtextResourceUri);
	}
	
	public void reloadExternalResource(URI xtextResourceUri) {
		// load the external resource
		String projectName = xtextResourceUri.segment(1);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if(project.exists()) {
			ResourceSet resourceSet = resourceSetProvider.get(project);
			// load resource using the xtext-resource-URI
			originalResource = resourceSet.getResource(xtextResourceUri, true);
			// reset editableTextRegion
			this.setEditableTextRegion(0, 0);
			// change URI of the virtual resource
			virtualXtextResource.setURI(originalResource.getURI());
		}
	}
	
	public URI getAccordingXtextResourceUri(DRepresentationElement diagramElementObject) {
		return diagramElementObject.getTarget().eResource().getURI().trimFileExtension().appendFileExtension(getModelFileExtension());
	}
	
	public void removeExternalResource(URI resourceUri) {
		if(originalResource != null && originalResource.getURI().equals(resourceUri)) {
			try {
				// reset editableTextRegion
				this.setEditableTextRegion(0, 0);
				// delete original resource
				originalResource.delete(null);
				originalResource = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isCurrentSession(Session session) {
		if(currentDiagramUri != null) {
			URI sessionUri = URI.createURI(session.getID());
			if(sessionUri.equals(currentDiagramUri)) {
				return true;
			}
		}
		return false;
	}
	
	
	public ICompositeNode getCurrentRootNode() {
		if(originalResource != null && originalResource instanceof XtextResource) {
			XtextResource xResource = (XtextResource)originalResource;
			return xResource.getParseResult().getRootNode();
		}
		return null;
	}
	
	public void setEditableTextRegion(int offset, int endOffset) {
		this.offset = offset;
		this.endOffset = endOffset;
	}
	
	public List<String> getModelText() {
		List<String> modelText = new ArrayList<String>();
		if(originalResource instanceof XtextResource) {
			XtextResource xtextResource = (XtextResource)originalResource;
			ICompositeNode rootNode = xtextResource.getParseResult().getRootNode();
			String fullModelText = rootNode.getText();
			int fullModelLength = fullModelText.length();
			if(offset > 0) {
				String prefix = "";
				String editablePart = "";
				String suffix = "";
				
				// get prefix string
				if(offset < fullModelLength) {
					prefix = fullModelText.substring(0, offset-1);
				}

				// get editable part and optionally the suffix
				if(offset < endOffset && endOffset <= fullModelLength ) {
					editablePart = fullModelText.substring(offset, endOffset);
					if( endOffset < fullModelLength ) {
						suffix = fullModelText.substring(endOffset);
					}
				}
				
				// save the individual parts in the list
				modelText.add(prefix);
				modelText.add(editablePart);
				modelText.add(suffix);
			} else {
				modelText.add("");
				modelText.add(fullModelText);
				modelText.add("");
			}
			
		}
		return modelText;
	}
	
	public void saveOriginalResource(final IProgressMonitor monitor) {	
		if(virtualXtextResource != null) {
			EcoreUtil.resolveAll(virtualXtextResource);
			final IParseResult parseResult = virtualXtextResource.getParseResult();
			if(!parseResult.hasSyntaxErrors() 
					&& EcoreUtil.UnresolvedProxyCrossReferencer.find(virtualXtextResource).size() <= 0) {
				// merge the virtualXtextResource back to the original resource
				mergeVirtualResourceWithOriginal(monitor);
				// this should also modify the Sirius session, which therefore needs to be saved
				Session session = SessionManager.INSTANCE.getSession(currentDiagramUri, monitor);
				if(session != null) {
					session.save(monitor);
				}
			} else {
				System.out.println("Edited model has errors -> skip saving!");
			}
		}
	}
	
	private void mergeVirtualResourceWithOriginal(final IProgressMonitor monitor) {
		if(originalResource != null && virtualXtextResource != null) {
			// get transactional editing domain from the original resource
			final TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(originalResource);

			if(editingDomain != null) {
				// use EMFCompare to diff the two resources
				IComparisonScope scope = new DefaultComparisonScope(originalResource, virtualXtextResource, null);
				final Comparison comparison = EMFCompare.builder().build().compare(scope);
				
				// create emf-resource-merger
				IMerger.Registry mergeRegistry = IMerger.RegistryImpl.createStandaloneInstance();
				final IBatchMerger merger = new BatchMerger(mergeRegistry);
				
				// execute the model-merging
				editingDomain.getCommandStack().execute(
						new RecordingCommand(editingDomain,
								"update resource after direct text edit") {
							
							@Override
							protected void doExecute() {
								merger.copyAllRightToLeft(
										comparison.getDifferences(),
										new BasicMonitor());
							}
						});				
			} else {
				// we assume that no editing domain is required
				if(originalResource instanceof XtextResource) {
					try {
						XtextResource origXtextResource = (XtextResource)originalResource;
						ICompositeNode rootNode = virtualXtextResource.getParseResult().getRootNode();
						// reparse original resource (use the offset here)
						origXtextResource.reparse(rootNode.getText().substring(rootNode.getOffset()));
						IParseResult parseResult = origXtextResource.getParseResult();
						if(!parseResult.hasSyntaxErrors()) {
							// if parse result was fine => save resource
							origXtextResource.save(SaveOptions.defaultOptions().toOptionsMap());							
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
