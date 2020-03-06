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
package org.eclipse.smartmdsd.sirius.system.targetPlatform.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.smartmdsd.sirius.utils.DiagramHelperServices;

/**
 * The services class used by VSM.
 */
public class Services {
    public String getProjectName(EObject obj) {
    	return DiagramHelperServices.getProjectName(obj);
    }
}
