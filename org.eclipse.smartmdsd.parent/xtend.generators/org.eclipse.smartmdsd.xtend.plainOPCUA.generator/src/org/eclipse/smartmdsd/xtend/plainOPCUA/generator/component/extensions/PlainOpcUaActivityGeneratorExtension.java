/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component.extensions;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity;
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ActivityGeneratorExtension;

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
