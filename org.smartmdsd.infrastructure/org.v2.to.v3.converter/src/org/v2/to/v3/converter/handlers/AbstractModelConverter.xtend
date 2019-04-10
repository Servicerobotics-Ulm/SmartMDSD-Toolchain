//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.v2.to.v3.converter.handlers

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.resources.IResource
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.jface.viewers.IStructuredSelection
import java.util.Map
import org.eclipse.core.runtime.URIUtil
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URI
import java.io.File
import java.io.PrintWriter
import java.net.MalformedURLException
import java.net.URISyntaxException
import java.io.IOException
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.jface.window.Window
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.core.resources.IProject
import java.util.List
import org.eclipse.core.resources.ResourcesPlugin
import java.util.ArrayList
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder

abstract class AbstractModelConverter extends AbstractHandler {
	
	def IResource getModelFileResource(IWorkbenchWindow window, String modelFileExtension) {
		val selection = window.selectionService.selection;
		if(selection instanceof IStructuredSelection) {
			val structuredSelection = (selection as IStructuredSelection);
			val firstElement = structuredSelection.getFirstElement();
			if(firstElement instanceof IResource) {
				val resource = (firstElement as IResource);
				if(resource.fileExtension == modelFileExtension) {
					return resource;
				}
			}
			
		}
		return null;
	}
	
	/**
	 * This method can be overridden in derived classes to define custom conversion operations
	 */
	def protected String convertLine(String inputLine) {
		return inputLine
	}
	
	/**
	 * The following three methods can be defined to provide the keywords to be replaced depending
	 * on their position in a line (front, or anywhere).
	 */
	def abstract Map<String,String> getStartsWithKeywordReplaceMap()
	def abstract Map<String,String> getKeywordAnywhereReplaceMap()
	
	def protected convertCommObjectModelFile(IResource commObjectsModelResource, String fileExtension) {
		val inputFileUri = commObjectsModelResource.locationURI
		val modelBaseUri = URIUtil.removeFileExtension(inputFileUri)
		
		var multilineComment = false;

		try {
        	val inputUrl = inputFileUri.toURL
        	val inputStream = inputUrl.openConnection().getInputStream();
    		val in = new BufferedReader(new InputStreamReader(inputStream));
    		
    		val outputFileUri = new URI(modelBaseUri.toString+fileExtension)
    		val outputFile = new File(outputFileUri)
			val writer = new PrintWriter(outputFile)
			// delete all previous contents in that file
			writer.write("")
   		
    		// iterate through each line and replace matching strings
    		var inputLine = "";
		    while ((inputLine = in.readLine()) !== null) {
		    	if(multilineComment == true) {
		    		if(inputLine.indexOf("*/") != -1) {
		    			multilineComment = false;
		    		}
		    		writer.println(inputLine)
			    } else if(inputLine.trim.startsWith("/*")) {
			    	// probably multiline comment
			    	if(inputLine.indexOf("*/") == -1) {
			    		multilineComment = true
			    	}
		    		writer.println(inputLine)
		    	} else if(inputLine.trim.startsWith("//")) {
		    		// copy comments directly without parsing
			        writer.println(inputLine)
		    	} else {
		    		// replace all matching key strings with values
					for(item: getStartsWithKeywordReplaceMap().entrySet) {
						if(inputLine.trim.startsWith(item.key)) {
							inputLine = inputLine.replaceFirst(item.key, item.value)
						}
					}
					for(item: getKeywordAnywhereReplaceMap().entrySet) {
						inputLine = inputLine.replace(item.key, item.value)
					}
					inputLine = inputLine.replaceDocString
					inputLine = inputLine.replaceArrayValue
					inputLine = inputLine.convertLine
					writer.println(inputLine)	    		
		    	}
		    }
		    
		    // close opened streams
		    in.close();
		    writer.close();
        } catch (MalformedURLException e) {
        	e.printStackTrace();
        } catch (URISyntaxException e) {
        	e.printStackTrace();
        } catch (IOException e) {
		    e.printStackTrace();
		}
		
		try {
			commObjectsModelResource.parent.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	def protected String replaceDocString(String inputLine) {
		val docIndex = inputLine.indexOf("@doc")
		if(docIndex != -1) {
			val startIndex = inputLine.indexOf('"', docIndex)+1
			val endIndex = inputLine.indexOf('"', startIndex)
			if(startIndex > 0 && endIndex > startIndex) {
				val docString = inputLine.substring(startIndex, endIndex)
				val replacedDocString = 
					inputLine.substring(0, docIndex) +
					"/** " + docString + " */" +
					inputLine.substring(endIndex+1)
				return replacedDocString
			}
		}
		return inputLine
	}
	
	def protected String replaceArrayValue(String inputLine) {
		if(inputLine.indexOf('[') != -1) {
			val assignmentIndex = inputLine.indexOf('=')+1
			if(assignmentIndex > 0) {
				val replacedArrayValue =
					inputLine.substring(0, assignmentIndex) +
					" [" + inputLine.substring(assignmentIndex).trim + "]"
//					println("replacedArrayValue: "+replacedArrayValue)
				return replacedArrayValue
			}
		}
		return inputLine
	}
	
	def protected List<IResource> getModelFilesFromSelectionDialog(String modelFileExtension) {
		val dialogMessage = "Select Project(s) with model-files *."+modelFileExtension;
		val multipleSelection = true;
		val labelProvider = createFileNameLabelProvider();
		
		val elements = this.getModelFiles(modelFileExtension);
		
		val results = this.openModelSelectionDialog(labelProvider, elements.toArray(), multipleSelection, dialogMessage);
		
		val resources = new ArrayList<IResource>;
		if(results !== null) {
			for(Object obj: results) {
				resources.add(obj as IResource)
			}
		}
		return resources;
	}
	
	def private Object[] openModelSelectionDialog(ILabelProvider labelProvider, Object[] elements, boolean multipleSelection, String dialogMessage) {
		// get currently active Shell
		val shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// initialize dialog
		val dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setTitle("ModelSelectionDialog");
		dialog.setMessage(dialogMessage);
		dialog.setElements(elements);
		dialog.setMultipleSelection(multipleSelection);
		
		// open dialog and get the selection results
		if(dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}
	
	def private ILabelProvider createFileNameLabelProvider() {
		return new LabelProvider() {
			override getText(Object element) {
				if(element instanceof IFile) {
					return (element as IFile).getName();
				}
				return "";
			}
		};
	}
	
	def private List<IFile> getModelFiles(String modelFileExtension) {
		val root = ResourcesPlugin.getWorkspace().getRoot();
		// get selection list according to the model-folder and model-file-extension
		val files = new ArrayList<IFile>
		for(IProject project: root.getProjects()) {
			if(project.open) {
				try {
					project.processContainer(files, modelFileExtension)
				} catch (CoreException e) {
					e.printStackTrace
				}
			}
		}
		return files;
	}
	
	def private void processContainer(IContainer container, List<IFile> results, String fileExtension) throws CoreException {
		for(member: container.members) {
			if(member instanceof IContainer) {
				if(member instanceof IFolder) {
					// skip processing bin folder
					if(member.name != "bin") {
						member.processContainer(results, fileExtension);
					}
				}
			} else if(member instanceof IFile) {
				if(member.fileExtension==fileExtension) {
					results.add(member);
//					println("file: "+member)
				}
			}
		}
	}
}