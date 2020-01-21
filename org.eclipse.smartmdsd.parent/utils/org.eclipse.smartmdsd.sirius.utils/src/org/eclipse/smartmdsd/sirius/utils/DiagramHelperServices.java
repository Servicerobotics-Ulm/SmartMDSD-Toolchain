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
package org.eclipse.smartmdsd.sirius.utils;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.TwoPaneElementSelector;
import org.eclipse.ui.handlers.IHandlerService;
import org.osgi.framework.Bundle;

public class DiagramHelperServices {
	public static String getProjectName(EObject obj) {
		return obj.eResource().getURI().segment(1);
	}
	
	public static EObject printObject(EObject object) {
		System.out.println("Object: "+object);
		System.out.println("Object.eClass(): "+object.eClass());
		return object;
	}
	
	public static EObject openRepresentation(EObject obj, String representationName) {
		for(Session session: SessionManager.INSTANCE.getSessions()) {
			for(DView view: session.getOwnedViews()) {
				for(DRepresentationDescriptor representation: view.getOwnedRepresentationDescriptors()) {
					if(representation.getName().equals(representationName)) {
						System.out.println("Opening represenatation: "+representationName);
						DialectUIManager.INSTANCE.openEditor(session, representation.getRepresentation(), new NullProgressMonitor());
					}
				}
			}
		}
		return obj;
	}
	
	public static List<EObject> getModelSelections(EObject containerView, String modelFolder, String modelFileExtension, Boolean multipleSelection, String dialogMessage) {
		List<EObject> selection = new ArrayList<EObject>();
		if(containerView instanceof DDiagram) {
			DDiagram diagram = (DDiagram)containerView;
			List<ResourceDescriptor> currentSematicResources = getSemanticResources(diagram, modelFileExtension);
			ILabelProvider labelProvider = new LabelProvider() {
				@Override
				public String getText(Object element) {
					if(element instanceof ResourceDescriptor) {
						ResourceDescriptor descr = (ResourceDescriptor)element;
						return descr.getResourceURI().segment(1);
					}
					return "";
				}
			};
			
			// open project selection dialog ang get the selection results
			Object[] results = openModelSelectionDialog(labelProvider, currentSematicResources.toArray(), multipleSelection, dialogMessage);
			if(results != null) {
				for(Object obj: results) {
					if(obj instanceof ResourceDescriptor) {
						ResourceDescriptor descr = (ResourceDescriptor)obj;
						boolean loadOnDemand = false;
						Resource resource = diagram.eResource().getResourceSet().getResource(descr.getResourceURI(), loadOnDemand);
						if(resource != null) {
							selection.addAll(resource.getContents());
						}
					}
				}
			}
		}
		
		return selection;
	}
	
	public static EObject importSingleModel(DDiagram diagram, String modelFolder, String modelFileExtension, String dialogMessage) {
		// by default, deselect projects
		boolean deselectProjects = true;
		return importSingleModel(diagram, modelFolder, modelFileExtension, dialogMessage, deselectProjects);
	}
	
	public static EObject importSingleModel(DDiagram diagram, String modelFolder, String modelFileExtension, String dialogMessage, Boolean deselectProjects) {
		// get Workspace root
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProgressMonitor monitor = new NullProgressMonitor();
		
		// get selection list according to the model-folder and model-file-extension
		List<IProject> elements = new ArrayList<IProject>();
		for(IProject project: root.getProjects()) {
			IFolder modelDir = project.getFolder(modelFolder);
			if(modelDir.exists()) {
				String modelFileName = project.getName() + "."+modelFileExtension;
				IFile modelFile = modelDir.getFile(modelFileName);
				if(modelFile.exists()) {
					elements.add(project);
				}
			}
		}
		
		// open model-selection dialog and update SemanticResource as well as Java classpath according to the result
		boolean multipleSelection = false;
		Object[] results = openModelSelectionDialog(createProjectLabelProvider(), elements.toArray(), multipleSelection, dialogMessage);
		if(results != null) {			
			List<ResourceDescriptor> currentSematicResources = getSemanticResources(diagram, modelFileExtension);
			adjustSemanticResources(diagram, results, currentSematicResources, modelFolder, modelFileExtension, root, monitor);
			adjustJavaBuildPath(diagram, results, deselectProjects, root, monitor);	
		}

		return diagram;
	}
	
	private static ILabelProvider createProjectLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(Object element) {
				if(element instanceof IProject) {
					IProject project = (IProject)element;
					return project.getName();
				}
				return "";
			}
		};
	}
	
	public static ILabelProvider createNameFeatureLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(Object element) {
				if(element instanceof EObject) {
					EObject obj = (EObject)element;
					for(EAttribute attr: obj.eClass().getEAllAttributes()) {
						// look for an EAttribute feature called "name" of type "EString"
						if(attr.getName().equals("name") && attr.getEType().getName().equals("EString")) {
							return (String)obj.eGet(attr);
						}
					}
				}
				return "";
			}
		};
	}
	
	public static Object[] openModelSelectionDialog(ILabelProvider labelProvider, Object[] elements, boolean multipleSelection, String dialogMessage) {
		// get currently active Shell
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// initialize dialog
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setTitle("Model selection");
		dialog.setMessage(dialogMessage);
		dialog.setElements(elements);
		dialog.setMultipleSelection(multipleSelection);
		
		// open dialog and get the selection results
		if(dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}
	
	public static Object[] openTreeSelectionDialog(
			ILabelProvider labelProvider, 
			ITreeContentProvider contenProvider, Object input, 
			ViewerComparator comparator,
			boolean multipleSelection, String dialogMessage) {
		// get currently active Shell
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		
		// initialize dialog
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, contenProvider);
		dialog.setTitle("Model selection");
		dialog.setEmptyListMessage("There are no models to be selected.");
		dialog.setMessage(dialogMessage);
		dialog.setAllowMultiple(multipleSelection);
		dialog.setComparator(comparator);
		dialog.setInput(input);
		
		// open dialog and get the selection results
		if(dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}
	
	public static Object[] openTwoPaneModelSelectionDialog(
		ILabelProvider upperLabelProvider, ILabelProvider lowerLabelProvider,
		Object[] candidates, boolean multipleSelection, 
		String upperLabel, String lowerLabel) {
		// get currently active Shell
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// initialize dialog
		TwoPaneElementSelector dialog = new TwoPaneElementSelector(shell, upperLabelProvider, lowerLabelProvider);
		dialog.setTitle("Model selection");
		dialog.setUpperListLabel(upperLabel);
		dialog.setLowerListLabel(lowerLabel);
		dialog.setElements(candidates);
		dialog.setMultipleSelection(multipleSelection);
		
		// open dialog and get the selection results
		if(dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}
	
	public static EObject importModels(DDiagram diagram, String modelFolder, String modelFileExtension) {
		// by default, deselect projects
		boolean deselectProjects = true;
		return importModels(diagram, modelFolder, modelFileExtension, deselectProjects);
	}
	
	public static EObject importModels(DDiagram diagram, String modelFolder, String modelFileExtension, Boolean deselectProjects) {
		// we delegate the import handling to the new Eclipse command "org.smartmdsd.navigator.imports"
		triggerModelImportCommand();
		return diagram;
	}
	
	public static void triggerModelImportCommand() {
		// we delegate the import handling to the new Eclipse command "org.smartmdsd.navigator.imports"
		IHandlerService handlerService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
		try {
			handlerService.executeCommand("org.smartmdsd.navigator.imports", null);
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	public static List<ResourceDescriptor> getSemanticResources(DDiagram diagram, String modelFileExtension) {
		// get the already imported projects by iterating through semantic-resources in the diagram (filtering them based on the modelFileExtension)
		List<ResourceDescriptor> currentSematicResources = new ArrayList<ResourceDescriptor>();
		for(EObject obj: diagram.eResource().getContents()) {
			if(obj instanceof DAnalysis) {
				DAnalysis analysis = (DAnalysis)obj;
				for(ResourceDescriptor semanticResource: analysis.getSemanticResources()) {
					if(semanticResource.getResourceURI().fileExtension().equals(modelFileExtension)) {
						currentSematicResources.add(semanticResource);
					}
				}
			}
		}
		return currentSematicResources;
	}
	
	private static void adjustSemanticResources(DDiagram diagram, 
			Object[] results, List<ResourceDescriptor> currentSematicResources, 
			String modelFolder, String modelFileExtension, 
			IWorkspaceRoot root, IProgressMonitor monitor) {
		// get the current session
		Session session = SessionManager.INSTANCE.getSession(diagram.eResource().getURI(),monitor);
		
		// iterate the current ResourceDescriptor-list and remove those values
		// which are not part of the current selection (in the results array)
		for(ResourceDescriptor resourceDescriptor: currentSematicResources) {
			String projName = resourceDescriptor.getResourceURI().segment(1);
			boolean selected = false;
			for(Object obj: results) {
				if(obj instanceof IProject) {
					IProject project = (IProject)obj;
					if(project.getName().equals(projName)) {
						selected = true;
						break;
					}	
				}
			}
			if(!selected) {
				// remove this resourceDesc
				for(EObject eobj: diagram.eResource().getContents()) {
					if(eobj instanceof DAnalysis) {
						DAnalysis analysis = (DAnalysis)eobj;
						// remove the 
						analysis.getSemanticResources().remove(resourceDescriptor);
					}
				}
			}
		}
		
		// for each selected project (in the results list)
		// => create a platform resource URI and add it as additional SemanticResource
		// note: adding already existing resource descriptions is NOT harmful!
		for(Object object: results) {
			if(object instanceof IProject) {				
				IProject project = (IProject)object;
				IFile file = project.getFolder(modelFolder).getFile(project.getName()+"."+modelFileExtension);
				if(file.exists()) {
					String platformUriStr = "platform:/resource/" + project.getName() + "/"+modelFolder+"/" + project.getName() +"."+modelFileExtension;
					org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(platformUriStr);
					AddSemanticResourceCommand cmd = new AddSemanticResourceCommand(session, uri, monitor);
					session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
				}
			}
		}
		// save the changed session
		session.save(monitor);
	}
	
	private static void adjustJavaBuildPath(DDiagram diagram, Object[] results, boolean deselectProjects, IWorkspaceRoot root, IProgressMonitor monitor) {
		IProject project = root.getProject(diagram.eResource().getURI().segment(1));
		if(project.exists()) {
			try {
				IProjectNature nature = project.getNature(JavaCore.NATURE_ID);
				if(nature instanceof IJavaProject) {
					IJavaProject jproject = (IJavaProject)nature;
					List<IClasspathEntry> newClasspath = new ArrayList<IClasspathEntry>();
					IClasspathEntry[] currClasspath = jproject.getRawClasspath();
					for(IClasspathEntry entry: currClasspath) {
						if(deselectProjects && entry.getEntryKind() != IClasspathEntry.CPE_PROJECT) {
							newClasspath.add(entry);
						}
					}
					for(Object obj: results) {
						if(obj instanceof IProject) {
							IProject selectedProject = (IProject)obj;
							if(selectedProject != project) {
								IClasspathEntry entry = JavaCore.newProjectEntry(selectedProject.getFullPath());
								newClasspath.add(entry);								
							}
						}
					}
					IClasspathEntry[] newRawClasspath = (IClasspathEntry[])newClasspath.toArray(new IClasspathEntry[0]);
					jproject.setRawClasspath(newRawClasspath, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected static class SimpleInputTextDialog extends Dialog {
		private String dialogTitle;
		private String labelText;
		private Text inputText;
		private String inputString;
		
		public SimpleInputTextDialog(Shell parentShell) {
			super(parentShell);
		}
		public SimpleInputTextDialog(Shell parentShell, final String dialogTitle, final String labelText, final String defaultText) {
			super(parentShell);
			this.dialogTitle = dialogTitle;
			this.labelText = labelText;
			this.inputString = defaultText;
		}
		@Override
		protected void configureShell(Shell newShell) {
		   super.configureShell(newShell);
		   newShell.setText(dialogTitle);
		}
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = (Composite) super.createDialogArea(parent);
		    Composite container = new Composite(area, SWT.NONE);
		    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		    GridLayout layout = new GridLayout(2, false);
		    container.setLayout(layout);
		    createInputLine(container);
			return area;
		}
		private void createInputLine(Composite container) {
		    Label lbtFirstName = new Label(container, SWT.NONE);
		    lbtFirstName.setText(labelText);
	
		    GridData dataFirstName = new GridData();
		    dataFirstName.grabExcessHorizontalSpace = true;
		    dataFirstName.horizontalAlignment = GridData.FILL;
	
		    inputText = new Text(container, SWT.BORDER);
		    inputText.setLayoutData(dataFirstName);
		    inputText.setText(inputString);
		}
		
		@Override
		protected boolean isResizable() {
		  return true;
		}
		// save content of the Text fields because they get disposed
		// as soon as the Dialog closes
		private void saveInput() {
		  inputString = inputText.getText();
		}
		@Override
		protected void okPressed() {
		  saveInput();
		  super.okPressed();
		}
		public String getInputString() {
			return inputString;
		}
	}
	
	public static String askForTextDialog(final String dialogTitle, final String labelText, final String defaultText) {
		String result = "";
		// get currently active Shell
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		
		SimpleInputTextDialog textDialog = new SimpleInputTextDialog(shell, dialogTitle, labelText, defaultText);
		textDialog.create();
		
		if(textDialog.open() == Window.OK) {
			result = textDialog.getInputString();
		}
		
		return result;
	}
	
	public static Image getBundelImage(String bundleName, String imageName) {
		Bundle bundle = Platform.getBundle(bundleName);
		URL fullPathString = bundle.getEntry(imageName);
		ImageDescriptor imgDescr = ImageDescriptor.createFromURL(fullPathString);
		return imgDescr.createImage();
	}
}
