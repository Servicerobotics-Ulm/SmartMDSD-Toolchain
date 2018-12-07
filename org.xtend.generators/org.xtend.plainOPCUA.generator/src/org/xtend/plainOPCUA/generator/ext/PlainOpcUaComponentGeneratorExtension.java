//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        nagrath@hs-ulm.de
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
package org.xtend.plainOPCUA.generator.ext;

import org.ecore.component.componentDefinition.ComponentDefinition;
import org.xtend.smartsoft.generator.component.ComponentGeneratorExtension;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class PlainOpcUaComponentGeneratorExtension implements ComponentGeneratorExtension 
{
	public static ComponentGeneratorExtension getInjectedExtensionImpl() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				binder().bind(ComponentGeneratorExtension.class).to(PlainOpcUaComponentGeneratorExtensionImpl.class);
			}
		});
		return injector.getInstance(ComponentGeneratorExtension.class);
	}
	
	private static ComponentGeneratorExtension impl = getInjectedExtensionImpl();

	@Override
	public String getExtensionName(ComponentDefinition component) {
		return impl.getExtensionName(component);
	}

	@Override
	public CharSequence getHeaderIncludes(ComponentDefinition component) {
		return impl.getHeaderIncludes(component);
	}

	@Override
	public CharSequence getSourceIncludes(ComponentDefinition component) {
		return impl.getSourceIncludes(component);
	}

	@Override
	public CharSequence getClassMemberDefinition(ComponentDefinition component) {
		return impl.getClassMemberDefinition(component);
	}

	@Override
	public CharSequence getIniFileParameters(ComponentDefinition component) {
		return impl.getIniFileParameters(component);
	}

	@Override
	public CharSequence getCMakeIncludes(ComponentDefinition component) {
		return impl.getCMakeIncludes(component);
	}

	@Override
	public CharSequence getCMakeTargetConfiguration(ComponentDefinition component) {
		return impl.getCMakeTargetConfiguration(component);
	}

}