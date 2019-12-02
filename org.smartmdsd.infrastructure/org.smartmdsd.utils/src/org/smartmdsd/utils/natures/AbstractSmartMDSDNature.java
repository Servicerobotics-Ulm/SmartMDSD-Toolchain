//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.smartmdsd.utils.natures;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.smartmdsd.utils.builder.CDTProjectHelpers;

/**
 * This is a base class for all project-natures implemented in the SmartMDSD Toolchain.
 * Each nature implementation serves two purposes:
 * 1) To provide a specific project-type related to a specific role-view (e.g. DomainModels at Tier2, or Components at Tier3)
 * 2) To specify the related model-types (with their model injectors) and to specify the dependency of this nature to other nature types
 *    (e.g. the Component nature depends on models from DomainModels). This dependency needs to be implement by the getDependentNatureFor() method;
 * 
 * @author alex-lotz
 *
 */
public abstract class AbstractSmartMDSDNature implements IProjectNature {
	protected IProject project;
	
	@Override
	public void configure() throws CoreException {
		if(project != null) {
			CDTProjectHelpers.setSmartMDSDCdtBuilderFor(project);
		}
	}

	@Override
	public void deconfigure() throws CoreException {
		if(project != null) {
			CDTProjectHelpers.resetDefaultCdtBuilderFor(project);
		}
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}
	
	// implement these methods in derived classes
	public abstract LanguageInterface getLanguageInterfaceOf(String languageName);
	public abstract LanguageInterface getLanguageInterfaceFrom(IResource modelResource);
	public abstract LanguageInterface[] getAllSupportedLanguages();
	public abstract List<String> getImportedProjectNatureIds();
}
