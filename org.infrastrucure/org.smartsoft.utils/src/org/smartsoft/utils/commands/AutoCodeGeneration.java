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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

public class AutoCodeGeneration extends AbstractHandler {
	
	public static String COMMAND_ID = "org.smartsoft.utils.autocodegen";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = event.getCommand();
		// change state in registry
		boolean oldState = HandlerUtil.toggleCommandState(command);
		
		if(oldState == true) {
			System.out.println("Automated code-generation deactivated!");
		} else {
			System.out.println("Automated code-generation activated!");
		}
		
		return null;
	}

}
