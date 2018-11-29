//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
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

package org.xtend.smartsoft.generator.commObj;

import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class CommObjGenerator2Module extends AbstractModule {

	@Override
	protected void configure() {
		// bind the CommObject code generator to the Xtend implementation root class
		binder().bind(AbstractGenerator.class).to(CommObjGenerator2Impl.class);
		
		// bind a default encoding provider and a custom output configuration provider
		binder().bind(IEncodingProvider.class).to(IEncodingProvider.Runtime.class);
		binder().bind(IOutputConfigurationProvider.class).to(ExtendedOutputConfigurationProvider.class).in(Singleton.class);
		
	}

}
