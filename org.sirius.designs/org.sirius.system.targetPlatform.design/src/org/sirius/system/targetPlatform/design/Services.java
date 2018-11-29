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
