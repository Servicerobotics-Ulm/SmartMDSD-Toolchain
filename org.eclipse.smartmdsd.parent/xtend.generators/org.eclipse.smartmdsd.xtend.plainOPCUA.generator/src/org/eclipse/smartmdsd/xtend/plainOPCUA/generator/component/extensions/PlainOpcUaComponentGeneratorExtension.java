//===============================================================================
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
//===============================================================================
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component.extensions;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ComponentGeneratorExtension;

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
	public CharSequence getIniStructDefinition(ComponentDefinition component) {
		return impl.getIniStructDefinition(component);
	}
	
	@Override
	public CharSequence getLoadParameters(ComponentDefinition component) {
		return impl.getLoadParameters(component);
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
