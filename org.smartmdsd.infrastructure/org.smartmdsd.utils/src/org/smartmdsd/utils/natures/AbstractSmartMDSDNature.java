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
