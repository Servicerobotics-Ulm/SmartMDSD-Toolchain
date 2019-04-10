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
package org.smartmdsd.utils.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;
import org.smartmdsd.utils.natures.AbstractSmartMDSDNature;
import org.smartmdsd.utils.natures.LanguageInterface;
import org.smartmdsd.utils.natures.SmartMDSDNatureHelpers;

import com.google.inject.Injector;

public class ManualCodeGeneratorWorkspaceJob extends WorkspaceJob {
	private IResource resource;
	
	public static final String CONSOLE_ID = "SmarMDSD Code-Generator";
	
	public ManualCodeGeneratorWorkspaceJob(IResource resource) {
		super("Generate code for "+resource.getName());
		this.resource = resource;
		// automatically set the scheduling rule to the provided project
		this.setRule(resource.getProject());
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
		final AbstractSmartMDSDNature smartMDSDnature = SmartMDSDNatureHelpers.getFirstSmartMDSDNatureFrom(resource.getProject());
		if(smartMDSDnature == null) {
			// this project does not have a valid SmartMDSDNature (we skip building it)
			return Status.OK_STATUS;
		}
		
		// use a message console to print-out info messages
		final MessageConsole messageConsole = getCodeGeneratorConsole();
		messageConsole.clearConsole();
		
		MessageConsoleStream out = messageConsole.newMessageStream();
		out.println("Run SmartMDSD code generator for: "+resource.getName());
		
		// get a list of all files (potentially model-files) located in the "model" subfolder of the current project
		String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODEL_FOLDER);
		final List<IResource> modelFiles = getModelFiles(modelFolderName);
		final int numberModels = modelFiles.size();

		// convert to SubMonitor and set total number of work units
		SubMonitor subMonitor = SubMonitor.convert(monitor, numberModels*10);
		
		for(IResource modelResource: modelFiles) {
			if (monitor.isCanceled()) {
				// cancel requested -> stop generating code
				out.print("code genearion cancelled!");
				return Status.CANCEL_STATUS;
			}
			
			// advance the submonitor by 10 ticks
			subMonitor.split(10);
			
			// the default editor for a specific model file will give us the associated language-ID
			LanguageInterface language = smartMDSDnature.getLanguageInterfaceFrom(modelResource);
			// the editor can be null if the file extension is unknown
			if(language != null) {
				Injector injector = language.getInjector();
				// this XtextResourceSet can parse and load our model file
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				
				// load the main (i.e. currently used) model into an EMF resource using the related XtextResourceSet
				String modelUriString = "platform:/resource/" + resource.getProject().getName() + "/" + modelResource.getProjectRelativePath();
				out.println("Load model: "+modelResource.getName());
				Resource resource = resourceSet.getResource(URI.createURI(modelUriString), true);
				
				if(resource.isLoaded()) {
			    	// inject validator and validate the main resource 
			    	IResourceValidator validator = injector.getInstance(IResourceValidator.class);
			    	boolean hasErrors = false;
			    	List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		    		for(Issue issue: issues) {
		    			if(issue.getSeverity() == Severity.ERROR) {
		    				hasErrors = true;
		    				out.println("ERROR: "+issue.getMessage());
		    			} else if(issue.getSeverity() == Severity.WARNING) {
		    				out.println("WARNING: "+issue.getMessage());
		    			}
		    		}
		    		
		    		// check if meanwhile cancel has been requested
		    		if (monitor.isCanceled()) {
						// cancel requested -> stop generating code
		    			out.print("code genearion cancelled!");
						return Status.CANCEL_STATUS;
					}
			    	
		    		if(hasErrors == true) {
		    			out.println("code generation skipped due to errors.");
		    		} else {
		    			// Use the language-specific code-generator
		    			GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
		    			JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
		    			// finally call code generator for our current resource
		    			out.println("Run code generator...");
		    			generator.doGenerate(resource, fsa);
		    			out.println("done!");
		    		}
				} // end if(resource.isLoaded())
			} // end if(editor != null) {
		} // end for(modelResource: modelFiles)
		return Status.OK_STATUS;
	}

	// this method returns all files located under the project's model folder (also files that are not models)
	private List<IResource> getModelFiles(String modelFolderName) {
		try {
			if (resource instanceof IProject) {
				IProject project = (IProject) resource;
				IFolder modelsFolder = project.getFolder(modelFolderName);
				if (modelsFolder.exists()) {
					IResource[] models = modelsFolder.members();
					return new ArrayList<IResource>(Arrays.asList(models));
				}
			} else if (resource instanceof IFolder) {
				IFolder folder = (IFolder) resource;
				if (folder.getName().equals(modelFolderName)) {
					IResource[] models = folder.members();
					return new ArrayList<IResource>(Arrays.asList(models));
				}
			} else if (resource instanceof IFile) {
				return Arrays.asList(resource);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return new ArrayList<IResource>();
	}
	
	public static MessageConsole getCodeGeneratorConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		IConsole[] existing = consoleManager.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (existing[i].getName().equals(CONSOLE_ID))
				return (MessageConsole) existing[i];
		}
		// no console found, so create a new one
		ImageDescriptor codeGeneratorIcon = AbstractUIPlugin.imageDescriptorFromPlugin(org.smartmdsd.utils.Activator.PLUGIN_ID, "icons/manual-gear.png");
		MessageConsole codeGeneratorConsole = new MessageConsole(CONSOLE_ID, codeGeneratorIcon);
		consoleManager.addConsoles(new IConsole[]{codeGeneratorConsole});
		return codeGeneratorConsole;
	}
}
