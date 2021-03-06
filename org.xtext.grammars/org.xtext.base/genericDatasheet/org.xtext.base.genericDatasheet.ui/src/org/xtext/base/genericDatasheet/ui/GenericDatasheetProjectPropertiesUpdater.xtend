//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.base.genericDatasheet.ui

import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.jface.text.IDocument
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.ui.editor.model.IXtextDocument
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.Status
import org.eclipse.ui.part.FileEditorInput
import org.smartmdsd.datasheet.indexer.WorkspaceDatasheetIndexer
import java.util.Collection
import org.ecore.base.genericDatasheet.DatasheetProperty
import org.ecore.base.genericDatasheet.AbstractDatasheetElement
import org.ecore.base.genericDatasheet.GenericDatasheetModel
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement

class GenericDatasheetProjectPropertiesUpdater extends XtextDocumentProvider {
	override protected doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
		super.doSaveDocument(monitor, element, document, overwrite)
		if(element instanceof FileEditorInput) {
			val project = element.file.project 
			if(document instanceof IXtextDocument) {
				document.readOnly(new IUnitOfWork<Object, XtextResource>() {
					override exec(XtextResource resource) throws Exception {
						updateProjectProperties(resource, project);
						return resource;
					}
				});
			}
		}
	}
	
	def void updateProjectProperties(XtextResource resource, IProject project) {
		// Next, the datasheet elements are written into a project-settings file, 
		// thus modifying project's resources which can be time consuming and 
		// thus should be executed as an asynchronous Job
		val job = new Job("Update Datasheet project-settings for "+project.name) {
			override protected run(IProgressMonitor monitor) {
				val indexer = WorkspaceDatasheetIndexer.instance
				val settings = indexer.getDatasheetProjectSettings(project.name);
				settings.clearAllMainProperties
				var index = 0;
				for(element: resource.datasheetElements) {
					if(element instanceof MandatoryDatasheetElement) {
						val property_node = settings.getMainPropertyNode(element.name.literal);
						settings.updatePropertyValue(property_node, index, element.value)
						index++;
					} else if(element instanceof DatasheetProperty) {
						val property_node = settings.getMainPropertyNode(element.name);
						settings.updatePropertyValue(property_node, index, element.value, element.unit)
						if(element.semanticID !== null) {
							settings.updatePropertySeminticURI(property_node, index, element.semanticID)
						}
						index++;
					} else {
						val element_name = element.datasheetElementName
						if(!element_name.equals("")) {
							val custom_node = settings.getCustomSubNode(element_name)
							custom_node.clear
							for(property: element.datasheetProperties) {
								// create a new sub-node for each sub-property
								val property_node = custom_node.node(property.name)
								settings.updatePropertyValue(property_node, index, property.value, property.unit)
								if(property.semanticID !== null) {
									settings.updatePropertySeminticURI(property_node, index, property.semanticID)
								}
								index++;
							}
						}
					}
				}
				settings.saveProperties
				return Status.OK_STATUS;
			}
		}
		job.setRule(project);
		job.schedule();
	}
	
	def Collection<AbstractDatasheetElement> getDatasheetElements(XtextResource resource) {
		val result = newArrayList
		for(model: resource.contents) {
			if(model instanceof GenericDatasheetModel) {
				result.addAll(model.elements)
			}
		}
		return result
	}
	
	def String getDatasheetElementName(AbstractDatasheetElement element) {
		// overload this method if you have specified additional DatasheetElement types
		return ""
	}
	def Collection<DatasheetProperty> getDatasheetProperties(AbstractDatasheetElement element) {
		// overload this method if you have specified additional DatasheetElement types
		return newArrayList
	}
}