//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.eclipse.smartmdsd.ui.codegen;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.osgi.framework.Bundle;
import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.smartmdsd.ui.factories.JavaProjectFactory;
import org.eclipse.smartmdsd.ui.natures.AbstractSmartMDSDNature;
import org.eclipse.smartmdsd.ui.natures.LanguageInterface;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureHelpers;

import com.google.inject.Injector;

public class ManualCodeGeneratorWorkspaceJob extends WorkspaceJob {
	private IResource resource;
	private IWorkbenchWindow window;
	private MessageConsole messageConsole;
	
	public static final String CONSOLE_ID = "SmarMDSD Code-Generator";
	
	public ManualCodeGeneratorWorkspaceJob(IResource resource, final IWorkbenchWindow window) {
		super("Generate code for "+resource.getName());
		this.resource = resource;
		this.window = window;
		this.messageConsole = findCodeGeneratorConsole();
		// automatically set the scheduling rule to the provided project
		this.setRule(resource.getProject());
	}
	
	private MessageConsole findCodeGeneratorConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		IConsole[] existing = consoleManager.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (existing[i].getName().equals(CONSOLE_ID))
				return (MessageConsole) existing[i];
		}
		
		// no console found, so create a new one
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		ImageDescriptor codeGeneratorIcon = ImageDescriptor.createFromURL(bundle.getEntry("icons/manual-gear.png"));
		MessageConsole codeGeneratorConsole = new MessageConsole(CONSOLE_ID, codeGeneratorIcon);
		consoleManager.addConsoles(new IConsole[]{codeGeneratorConsole});
		return codeGeneratorConsole;
	}
	
	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
		final AbstractSmartMDSDNature smartMDSDnature = SmartMDSDNatureHelpers.getFirstSmartMDSDNatureFrom(resource.getProject());
		if(smartMDSDnature == null) {
			// this project does not have a valid SmartMDSDNature (we skip building it)
			return Status.OK_STATUS;
		}
		
		// use a message console to print-out info messages
		messageConsole.clearConsole();
		
		// bring the console window tab to foreground
		showConsoleWindow(messageConsole);
		
		// create new console-message stream
		MessageConsoleStream out = messageConsole.newMessageStream();
		out.println("Run SmartMDSD code generator for: "+resource.getName());
		
		// get a list of all files (potentially model-files) located in the "model" subfolder of the current project
		final List<IResource> modelFiles = JavaProjectFactory.getContainingJavaSources(resource);
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

	private void showConsoleWindow(IConsole console) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					IConsoleView view = (IConsoleView)window.getActivePage().showView(IConsoleConstants.ID_CONSOLE_VIEW);
					view.display(console);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
