//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz
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

package org.smartsoft.utils.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.IWorkbenchWindow;

public class DeploymentCommand extends AbstractBuildCommand {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final String genFolder = "smartsoft";
		final String commandSuffix = "DeployAndRun";
		final String commandName = "${system_path:bash}";
		final String commandParams = "src-gen/deployment/deploy-all.sh";
		
//		System.out.println("execute "+commandName);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IProject currentProject = getCurrentProject(window);
		if(currentProject == null) {
			currentProject = getProjectFromDialog(window, commandSuffix);
		}
		if(currentProject != null) {
			final boolean useBuild = false;
			generateAndExecuteLauncherFor(currentProject, commandSuffix, genFolder, commandName, commandParams, useBuild);
		}
		return null;
	}
}
