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
