//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================
package org.xtend.smartsoft.generator.component;

import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ComponentGenerator2Module extends AbstractModule {

	@Override
	protected void configure() {
		// bind the component code generator to the Xtend implementation root class
		binder().bind(AbstractGenerator.class).to(ComponentGenerator2Impl.class);
		
		// bind a default encoding provider and a custom output configuration provider
		binder().bind(IEncodingProvider.class).to(IEncodingProvider.Runtime.class);
		binder().bind(IOutputConfigurationProvider.class).to(ExtendedOutputConfigurationProvider.class).in(Singleton.class);
	}

}
