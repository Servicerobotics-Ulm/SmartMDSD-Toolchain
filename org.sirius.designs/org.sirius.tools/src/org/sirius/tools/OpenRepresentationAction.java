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
package org.sirius.tools;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;

public class OpenRepresentationAction extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		String representationName = getParameter(arg1, "representationName", String.class);
		if(arg0.size() > 0 && representationName != null) {
			for(EObject object: arg0) {
				if(object instanceof DRepresentationElement) {
					openRepresentation((DRepresentationElement)object, representationName);					
				} else {
					// check whether containerView parameter is defined
					DRepresentationElement containerView = getParameter(arg1, "containerView", DRepresentationElement.class);
					if(containerView != null) {
						openRepresentation(containerView, representationName);
					}
				}
			}
		}
	}
	
	private void openRepresentation(DRepresentationElement element, String representationName) {
		Session session = SessionManager.INSTANCE.getExistingSession(element.eResource().getURI());
		if(session.isOpen()) {
//			System.out.println("SessionID: "+session.getID());
			for(DView view: session.getOwnedViews()) {
				for(DRepresentationDescriptor representation: view.getOwnedRepresentationDescriptors()) {
					if(representation.getName().equals(representationName)) {
						System.out.println("Opening represenatation: "+representationName);
						DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), new NullProgressMonitor());
					}
				}
			}					
		}
	}

}
