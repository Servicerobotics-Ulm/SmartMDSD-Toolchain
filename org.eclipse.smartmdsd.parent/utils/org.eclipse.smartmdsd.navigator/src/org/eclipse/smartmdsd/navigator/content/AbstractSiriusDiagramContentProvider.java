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
package org.eclipse.smartmdsd.navigator.content;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.smartmdsd.ui.factories.ModelingProjectFactory;

public abstract class AbstractSiriusDiagramContentProvider implements ITreeContentProvider {
	
	private StructuredViewer viewer;
	protected static final Object[] NO_CHILDREN = new Object[0];
	protected final Map<IFile, List<SiriusDiagramRepresentationItem>> cachedModelMap = new HashMap<IFile, List<SiriusDiagramRepresentationItem>>();

	// implement this method in derived classes
	protected abstract String getModelFileExtension();
	
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}
	
	@Override
	public Object getParent(Object element) {
		if(element instanceof SiriusDiagramRepresentationItem) {
			SiriusDiagramRepresentationItem diagram = (SiriusDiagramRepresentationItem)element;
			return diagram.getContainer();
		}
		return null;
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof IFile) {
			IFile file = (IFile)element;
			return file.getFileExtension().contentEquals(getModelFileExtension());
		}
		return false;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof IFile) {
			IFile modelFile = (IFile)parentElement;
			if(modelFile.getFileExtension().contentEquals(getModelFileExtension())) {
				List<SiriusDiagramRepresentationItem> diagrams = cachedModelMap.get(modelFile);
				if(diagrams == null) {
					loadDiagramRepresentationsFor(modelFile);
				} else {
					// reload diagrams if needed (this should keep the cache up-to-date)
					for(SiriusDiagramRepresentationItem diagram: diagrams) {
						if(!diagram.isLoadedRepresentation()) {
							reloadDiagram(diagram);
						}
					}
				}
				return diagrams != null ? diagrams.toArray() : NO_CHILDREN;
			}
		}
		return NO_CHILDREN;
	}
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		// we don't really need to check for changes here, 
		// but we need the viewer reference which allows us to refresh it at a later point (see updateModelDiagram() method)
		if(v instanceof StructuredViewer) {
			viewer = (StructuredViewer)v;
		}
	}
	
	protected void reloadDiagram(SiriusDiagramRepresentationItem diagram) {
		WorkspaceJob reloadDiagramJob = new WorkspaceJob("Reload diagram(s) for "+diagram.getName()) {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				// the actual reloading is done within the diagram item itself
				diagram.reloadDiagram(monitor);
				return Status.OK_STATUS;
			}
		};
		// this will provide a better feedback to the user
		reloadDiagramJob.setUser(true);
		reloadDiagramJob.setRule(diagram.getContainer());
		reloadDiagramJob.schedule();
	}
	
	protected void loadDiagramRepresentationsFor(IFile modelFile) {
		// we use a workspace modify operation instead of a Job because the WorkspaceModifyOperation
		// enforces a progress dialog which provides a better UI feedback for the user
		WorkspaceModifyOperation loadDiagramOperation = new WorkspaceModifyOperation(modelFile) {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				IProject project = modelFile.getProject();
				
				monitor.setTaskName("Load Sirius-diagram(s) for "+modelFile.getName());
				
				// get session (which will be loaded on demand, which might take some time)
				Session session = ModelingProjectFactory.getProjectSession(project, monitor);

				// create a list of SiriusDiagramRepresentationItems
				List<SiriusDiagramRepresentationItem> diagrams = new ArrayList<SiriusDiagramRepresentationItem>();
				EList<DRepresentationDescriptor> representations = ModelingProjectFactory.getRepresentationsFor(modelFile, session);
				for(DRepresentationDescriptor representation: representations) {
					diagrams.add(new SiriusDiagramRepresentationItem(modelFile, session, representation));
				}
				// store the diagram-list in our internal cache for faster future access
				cachedModelMap.put(modelFile, diagrams);
			}
		};
		
		try {
			// execute the diagram load operation with a progress dialog (to show a better user feedback)
			PlatformUI.getWorkbench().getProgressService().run(true, true, loadDiagramOperation);
			// execute the viewer-refresh from within a UI thread
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					if(viewer != null) {
						viewer.refresh(modelFile);
					}
				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
