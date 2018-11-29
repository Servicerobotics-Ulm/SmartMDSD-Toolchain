//--------------------------------------------------------------------------
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        ZAFH Servicerobotic Ulm
//        Christian Schlegel
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

package org.xtend.smartsoft.generator.component

import com.google.inject.Inject
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.ecore.component.componentDefinition.ComponentDefinition

class SmartHandlerState {
	@Inject extension CopyrightHelpers
	@Inject SmartComponent compGenerator
	
	def StateChangeHandlerCoreHeaderFileName() { "SmartStateChangeHandlerCore.hh" }
	def StateChangeHandlerUserHeaderFileName() { "SmartStateChangeHandler.hh" }
	def StateChangeHandlerUserSourceFileName() { "SmartStateChangeHandler.cc" }
	
	def void CreateStateChangeHandler(ComponentDefinition comp, IFileSystemAccess fsa) {
		fsa.generateFile(StateChangeHandlerCoreHeaderFileName, HandlerHeaderFileContent)
		fsa.generateFile(StateChangeHandlerUserHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, HandlerUserHeaderFileContent)
		fsa.generateFile(StateChangeHandlerUserSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, comp.HandlerUserSourceFileContent)
	}
	
	
	///////////////////////////////
	// Handler Header Files
	/////////////////////////////
	def HandlerHeaderFileContent() '''
	«getCopyright()»
	#ifndef _«"SmartStateChangeHandlerCore".toUpperCase()»_HH
	#define _«"SmartStateChangeHandlerCore".toUpperCase()»_HH
			
	#include "aceSmartSoft.hh"
	
	class SmartStateChangeHandlerCore : public SmartACE::StateChangeHandler
	{
	public:
		void handleEnterState(const std::string & substate) throw() { };
		void handleQuitState(const std::string & substate) throw() { };
	};
	#endif
	'''

	///////////////////////////////
	// Handler USER Header Files
	/////////////////////////////
	def HandlerUserHeaderFileContent() 
	'''
	«getCopyrightWriteOnce()»
	#ifndef _«"SmartStateChangeHandler".toUpperCase()»_USER_HH
	#define _«"SmartStateChangeHandler".toUpperCase()»_USER_HH
		
	#include "aceSmartSoft.hh"
		
	#include "«StateChangeHandlerCoreHeaderFileName»"
		
	class SmartStateChangeHandler : public SmartStateChangeHandlerCore
	{
		void handleEnterState(const std::string & substate) throw();
		void handleQuitState(const std::string & substate) throw();
	};
		
	#endif
	'''

	//////////////////////////////
	// Handler USER Source Files
	/////////////////////////////
	def HandlerUserSourceFileContent(ComponentDefinition comp) 
	'''
	«getCopyrightWriteOnce()»
	#include "«StateChangeHandlerUserHeaderFileName»"
	#include "«compGenerator.getCompHeaderFilename(comp)»"
	
	#include <iostream>
	
	// Called when a substate is entered
	void SmartStateChangeHandler::handleEnterState(const std::string & substate) throw()
	{
		// change this code to your needs !!!
	
	}
	
	// Called when a substate is left
	void SmartStateChangeHandler::handleQuitState(const std::string & substate) throw()
	{
		// change this code to your needs !!!
	
	}
	'''
}