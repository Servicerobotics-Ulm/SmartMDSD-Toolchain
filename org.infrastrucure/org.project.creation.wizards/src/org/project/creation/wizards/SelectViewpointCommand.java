//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
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

package org.project.creation.wizards;

import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection.Callback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class SelectViewpointCommand extends RecordingCommand {

    private Session session;

    private final Callback callback;

	final String modelFileExtension;
	final String viewpointName;
    private boolean createNewRepresentations;

    private IProgressMonitor monitor;
	
	public SelectViewpointCommand(Session session, final String modelFileExtension, final String viewpointName, IProgressMonitor monitor) {
		super(session.getTransactionalEditingDomain(), "Select a given viewpoint");
		this.session = session;
		this.callback = new ViewpointSelectionCallback();
		this.modelFileExtension = modelFileExtension;
		this.viewpointName = viewpointName;
		this.createNewRepresentations = true;
		this.monitor = monitor;
	}
	
	public SelectViewpointCommand(Session session, final String modelFileExtension, final String viewpointName, boolean createNewRepresentations, IProgressMonitor monitor) {
		super(session.getTransactionalEditingDomain(), "Select a given viewpoint");
		this.session = session;
		this.callback = new ViewpointSelectionCallback();
		this.modelFileExtension = modelFileExtension;
		this.viewpointName = viewpointName;
		this.createNewRepresentations = createNewRepresentations;
		this.monitor = monitor;
	}

	@Override
	protected void doExecute() {
        if (callback == null || session == null) {
            return;
        }
        try {
            monitor.beginTask("Apply new viewpoints selection...", 1);

            // get all viewpoints according to given file extension
            Set<Viewpoint> viewpoints = ViewpointSelection.getViewpoints(modelFileExtension);

            for (final Viewpoint viewpoint : viewpoints) {
                if(viewpoint.getName().equals(viewpointName)) {
                    try {
                        callback.selectViewpoint(viewpoint, session, createNewRepresentations, monitor);
                    } catch (SecurityException e) {
                        // If permission were not sufficient to select the
                        // viewpoint on the main or one of the referenced
                        // DAnalysis

                        // Provide a meaningful error message to the end-user
                        String errorMessage = "Unable to activate viewpoint '" + viewpoint.getName() + "' because of insufficient rights.";

                        // And re-throw the security exception with the previous
                        // as cause
                        throw new SecurityException(errorMessage, e);
                    }	
                }
            }
        } finally {
            monitor.done();
        }
	}

}
