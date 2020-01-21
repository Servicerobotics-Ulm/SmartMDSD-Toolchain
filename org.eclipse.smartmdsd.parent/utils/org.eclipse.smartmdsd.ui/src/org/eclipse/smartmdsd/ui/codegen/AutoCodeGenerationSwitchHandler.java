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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.eclipse.smartmdsd.ui.natures.ComponentNature;
import org.eclipse.smartmdsd.ui.natures.DomainModelsNature;
import org.eclipse.smartmdsd.ui.natures.SystemNature;

public class AutoCodeGenerationSwitchHandler extends AbstractHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Command command = event.getCommand();
		// change state in registry
		boolean oldState = HandlerUtil.toggleCommandState(command);
		boolean newState = !oldState;
		
		if(newState == true) {
			System.out.println("Automated code-generation activated!");
		} else {
			System.out.println("Automated code-generation deactivated!");
		}
		
		for(DomainModelsNature.DSL language: DomainModelsNature.DSL.values()) {
			setAutobuildValue(language.getLanguageID(), newState);
		}
		for(ComponentNature.DSL language: ComponentNature.DSL.values()) {
			setAutobuildValue(language.getLanguageID(), newState);
		}
		for(SystemNature.DSL language: SystemNature.DSL.values()) {
			setAutobuildValue(language.getLanguageID(), newState);
		}
		
		if(newState == true) {
			if(askToCleanWorkspace(event) == true) {
				fullBuildWorkspace();
			}
		}
		return null;
	}
	
	private void setAutobuildValue(String nodeId, boolean value) 
	{
		String autoBuildFullStr = ResourcesPlugin.PREF_AUTO_BUILDING;
		// TODO: the full PREF_AUTO_BUILDING string is "description.autobuilding"
		// for some reason, Xtext skips the "description" part (will be maybe changed in the future)
		// for now we just cut out the "description." part:
		String autoBuildStr = autoBuildFullStr.substring(autoBuildFullStr.indexOf('.')+1);
		Preferences preferences = InstanceScope.INSTANCE.getNode(nodeId);
		preferences.putBoolean(autoBuildStr, value);
		try {
			// save the new preference change
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
	
	private boolean askToCleanWorkspace(ExecutionEvent event) {
		try {
			final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			return MessageDialog.openQuestion(window.getShell(), "Clean and Build Workspace?", "You have activated automatic code generation. Do you like to rebuild the Workspace?");
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void fullBuildWorkspace() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		Job buildJob = new Job("Rebuild workspace") {
			public IStatus run(IProgressMonitor monitor) {
				try {
					workspace.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
					return Status.OK_STATUS;
				} catch(CoreException ex) {
					return ex.getStatus();
				}
			}
		};
		buildJob.schedule();
	}
}
