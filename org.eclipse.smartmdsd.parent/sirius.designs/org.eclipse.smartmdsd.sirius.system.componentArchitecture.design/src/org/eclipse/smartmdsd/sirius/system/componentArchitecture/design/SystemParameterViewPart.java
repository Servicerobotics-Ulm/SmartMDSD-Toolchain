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
package org.eclipse.smartmdsd.sirius.system.componentArchitecture.design;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance;
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterStructInstance;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterFactory;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage;
import org.eclipse.smartmdsd.sirius.utils.xtext.AbstractXtextEditorViewPart;
import org.eclipse.smartmdsd.xtext.system.systemParameter.ui.internal.SystemParameterActivator;

import com.google.inject.Injector;

public class SystemParameterViewPart extends AbstractXtextEditorViewPart {
	@Override
	public Injector getInjector() {
		return SystemParameterActivator.getInstance().getInjector(SystemParameterActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_SYSTEMPARAMETER_SYSTEMPARAMETER);
	}

	@Override
	protected ISelectionListener createNewSelectionListener() {
		return new ISelectionListener() {
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if(part instanceof DDiagramEditor) {
					DDiagramEditor dEditor = (DDiagramEditor)part;
					Session session = dEditor.getSession();
					
					for(DView view: session.getOwnedViews()) {
						if(view.getViewpoint().getName().equals("SystemArchitectureViewpoint")) {
							if(selection instanceof IStructuredSelection) {
								IStructuredSelection structuredSelection = (IStructuredSelection)selection;
								Object object = structuredSelection.getFirstElement();
								if(object instanceof IDiagramElementEditPart) {
									IDiagramElementEditPart diagramElementEditPart = (IDiagramElementEditPart)object;
									EObject modelObject = diagramElementEditPart.resolveTargetSemanticElement();
									if(modelObject instanceof ParameterStructInstance) {
										modelObject = modelObject.eContainer();
									}
									if(modelObject instanceof ComponentInstance) {
										ComponentInstance componentInstance = (ComponentInstance)modelObject;
										boolean hasParameterStruct = false;
										for(ComponentInstanceExtension ext: componentInstance.getExtensions()) {
											if(ext instanceof ParameterStructInstance) {
												hasParameterStruct = true;
												break;
											}
										}
										if(hasParameterStruct==true) {
											if(!getResourceProvider().isCurrentSession(session)) {
												URI diagramUri = modelObject.eResource().getURI();
												String modelFileExtension = getModelFileExtension();
												URI xtextResourceUri = diagramUri.trimFileExtension().appendFileExtension(modelFileExtension);
//												System.out.println("SystemConfigurationDiagram: URI: "+xtextResourceUri);
												setExternalEmfBase(diagramElementEditPart.resolveDiagramElement(), xtextResourceUri);
											}
											setSemanticElement(componentInstance);
											return;
										}
									}
								} else {
									if(getResourceProvider().isCurrentSession(session)) {
										getResourceProvider().setEditableTextRegion(0, 0);
										reloadCurrentModelText();
										showEmbeddedEditor();
										return;
									}
								}
							} // end if(selection instanceof IStructuredSelection)
						} // end if(viewpoint == "system.configuration.viewpoint")
					} // end for(viewpoints)
				} // end if (part instanceof DDiagramEditor)
				// in all other cases the editor should remain hidden
				hideEmbeddedEditor();
			}	
		};
	}
	
	public void setSemanticElement(ComponentInstance componentInstance) {
		ICompositeNode rootNode = this.getResourceProvider().getCurrentRootNode();
		if(rootNode != null) {
//			boolean foundSysUsageNode = false;
			for(INode childNode: rootNode.getChildren()) {
				if(childNode instanceof CompositeNodeWithSemanticElement) {
					CompositeNodeWithSemanticElement semanticNode = (CompositeNodeWithSemanticElement)childNode;
					EObject semanticElement = semanticNode.getSemanticElement();
					if(semanticElement instanceof ComponentParameterInstance) {
						ComponentParameterInstance sysParamUsage = (ComponentParameterInstance)semanticElement;
						if(sysParamUsage.getComponentInstance().getName().equals(componentInstance.getName())) {
							this.getResourceProvider().setEditableTextRegion(childNode.getOffset(), childNode.getEndOffset());
							this.reloadCurrentModelText();
							this.showEmbeddedEditor();
							break;
						}
					}
				}
			}
//			boolean hasParameterStruct = false;
//			for(ComponentInstanceExtension ext: componentInstance.getExtensions()) {
//				if(ext instanceof ParameterStructInstance) {
//					hasParameterStruct = true;
//					break;
//				}
//			}
//			if(hasParameterStruct == true && foundSysUsageNode == false) {
//				createRefinedParamNode(componentInstance);
//			}
		}
	}
	
	public void createRefinedParamNode(ComponentInstance componentInstance) {
		boolean hasParameterStruct = false;
		String paramStructName = "";
		for(ComponentInstanceExtension ext: componentInstance.getExtensions()) {
			if(ext instanceof ParameterStructInstance) {
				hasParameterStruct = true;
				ParameterStructInstance par = (ParameterStructInstance)ext;
				paramStructName = par.getName();
				break;
			}
		}
		if(hasParameterStruct == false) return;

		URI diagramUri = componentInstance.eResource().getURI();
		String modelFileExtension = getModelFileExtension();
		URI xtextResourceUri = diagramUri.trimFileExtension().appendFileExtension(modelFileExtension);
		
		String projectName = xtextResourceUri.segment(1);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if(project.exists()) {
			Injector injector = this.getInjector();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.getResource(xtextResourceUri, true);
			EObject model = resource.getContents().get(0);
			if(model instanceof SystemParamModel) {
				SystemParamModel sysParamModel = (SystemParamModel)model;
				boolean foundParamEntry = false;
				for(ComponentParameterInstance compRef: sysParamModel.getComponents()) {
					if(compRef.getComponentInstance().getName().equals(componentInstance.getName())) {
						foundParamEntry = true;
						break;
					}
				}
				if(foundParamEntry == false) {
					ComponentParameterInstance newCompRef = SystemParameterFactory.eINSTANCE.createComponentParameterInstance();
					newCompRef.setComponentInstance(componentInstance);
					IScopeProvider scopeProvider = injector.getInstance(IScopeProvider.class);
					IScope scope = scopeProvider.getScope(componentInstance, SystemParameterPackage.Literals.COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM);
					String parameterName = paramStructName;
					if(scope != IScope.NULLSCOPE) {
						IEObjectDescription description = scope.getSingleElement(QualifiedName.create(parameterName));
						if(description != null) {
							EObject eObject = description.getEObjectOrProxy();
							if(eObject instanceof ComponentParameter) {
								ComponentParameter paramStruct = (ComponentParameter)eObject;
								newCompRef.setComponentParam(paramStruct);
								
								// assign the created element to the current param resource
								sysParamModel.getComponents().add(newCompRef);
								
								try {
									// save the modified resource
//									System.out.println("Save modified resource");
									resource.save(SaveOptions.defaultOptions().toOptionsMap());
									// reload modified resource base
									this.getResourceProvider().reloadExternalResource(xtextResourceUri);
									this.reloadCurrentModelText();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
	}
}
