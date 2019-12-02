//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
package org.smartmdsd.navigator.content;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.ui.IEditorPart;
import org.smartmdsd.utils.factories.ModelingProjectFactory;

public class SiriusDiagramRepresentationItem {
	private IResource container;
	private Session session;
	private DRepresentationDescriptor representation;
	
	public SiriusDiagramRepresentationItem(IResource container, Session session, DRepresentationDescriptor representation) {
		this.container = container;
		this.session = session;
		this.representation = representation;
	}
	
	public boolean isLoadedRepresentation() {
		return (session.isOpen() && representation.isLoadedRepresentation());
	}
	
	public IEditorPart openDiagramEditor(IProgressMonitor monitor) {
		return DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), monitor);
	}
	
	public IResource getContainer() {
		return container;
	}
	
	public String getName() {
		return representation.getName();
	}
	
	public void reloadDiagram(IProgressMonitor monitor) throws CoreException {
		IProject project = container.getProject();
		// get session (which will be loaded on demand, which might take some time)
		session = ModelingProjectFactory.getProjectSession(project, monitor);
		EList<DRepresentationDescriptor> representations = ModelingProjectFactory.getRepresentationsFor(container, session);
		for(DRepresentationDescriptor representation: representations) {
			if(representation.getName().contentEquals(this.representation.getName())) {
				this.representation = representation;
			}
		}
	}
}
