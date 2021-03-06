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
package org.sirius.system.targetPlatform.design;

import org.eclipse.emf.ecore.EObject;
import org.sirius.tools.DiagramHelperServices;

/**
 * The services class used by VSM.
 */
public class Services {
    public String getProjectName(EObject obj) {
    	return DiagramHelperServices.getProjectName(obj);
    }
}
