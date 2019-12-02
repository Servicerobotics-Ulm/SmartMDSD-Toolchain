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
package org.xtend.plainOPCUA.generator.ext;

import org.ecore.component.componentDefinition.Activity;
import org.xtend.smartsoft.generator.component.ActivityGeneratorExtension;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class PlainOpcUaActivityGeneratorExtension implements ActivityGeneratorExtension {
	public static ActivityGeneratorExtension getInjectedExtensionImpl() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				binder().bind(ActivityGeneratorExtension.class).to(PlainOpcUaActivityGeneratorExtensionImpl.class);
			}
		});
		return injector.getInstance(ActivityGeneratorExtension.class);
	}
	
	private static ActivityGeneratorExtension impl = getInjectedExtensionImpl();
	
	@Override
	public String getExtensionName() {
		return impl.getExtensionName();
	}
	
	@Override
	public CharSequence getHeaderIncludes(Activity activity) {
		return impl.getHeaderIncludes(activity);
	}

	@Override
	public CharSequence getClassMemberProtectedDefinition(Activity activity) {
		return impl.getClassMemberProtectedDefinition(activity);
	}
	
	@Override
	public CharSequence getClassMemberConstruction(Activity activity) {
		return impl.getClassMemberConstruction(activity);
	}
}
