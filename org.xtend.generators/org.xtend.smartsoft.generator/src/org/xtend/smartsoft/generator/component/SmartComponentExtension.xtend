//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz
//
//        lotz@hs-ulm.de
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

import org.ecore.component.componentDefinition.ComponentDefinition
import com.google.inject.Inject
import org.xtend.smartsoft.generator.CopyrightHelpers

class SmartComponentExtension {
	@Inject extension SmartComponent
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	
	def String getComponentExtensionHeaderFilename(ComponentDefinition component) '''«component.name»Extension.hh'''
	def String getComponentExtensionSourceFilename(ComponentDefinition component) '''«component.name»Extension.cc'''
	
	def compileComponentExtensionHeader(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#ifndef «component.name.toUpperCase»_EXTENSION_HH_
	#define «component.name.toUpperCase»_EXTENSION_HH_
	
	#include <string>
	#include <atomic>
	#include <future>
	#include <chrono>
	
	// include component's main class
	#include "«component.compHeaderFilename»"
	
	// forward declaration
	class «component.nameClass»;
	
	class «component.nameClass»Extension {
	private:
		std::string extension_name;
		std::future<int> extension_future;
	
	protected:
		/// use this variable within extensionExecution() to check if the thread is commanded to shutdown
		std::atomic<bool> cancelled;
		
		/// use this method to start internal extension thread
		virtual int startExtensionThread();
		
		/// implement this method in derived classes
		virtual int extensionExecution() = 0;
		
		/// use this method to start internal extension thread
		virtual int stopExtensionThread(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2));
	public:
		«component.nameClass»Extension(const std::string &name);
		virtual ~«component.nameClass»Extension();
	
		inline std::string getName() const {
			return extension_name;
		}
	
		virtual void loadParameters(const SmartACE::SmartIniParameter &parameter);
		virtual void initialize(«component.nameClass» *component, int argc, char* argv[]) = 0;
		virtual int onStartup();
	
		virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2));
		virtual void destroy() = 0;
	
	};
	
	#endif /* «component.name.toUpperCase»_EXTENSION_HH_ */
	'''
		
	def compileComponentExtensionSource(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#include "«component.componentExtensionHeaderFilename»"
	
	«component.nameClass»Extension::«component.nameClass»Extension(const std::string &name)
	:	extension_name(name)
	{
		cancelled = false;
		COMP->addExtension(this);
	}
	
	«component.nameClass»Extension::~«component.nameClass»Extension()
	{  }
	
	int «component.nameClass»Extension::startExtensionThread()
	{
		cancelled = false;
		// execute the task_execution() method in a new thread now
		extension_future = std::async(std::launch::async, &«component.nameClass»Extension::extensionExecution, this);
		return 0;
	}
	
	int «component.nameClass»Extension::stopExtensionThread(const std::chrono::steady_clock::duration &timeoutTime)
	{
		cancelled = true;
		// wait on extension thread to exit
		if (extension_future.wait_for(timeoutTime) == std::future_status::timeout) {
			return -1;
	    }
		return 0;
	}
	
	void «component.nameClass»Extension::loadParameters(const SmartACE::SmartIniParameter &parameter)
	{
		// no-op
	}
	
	int «component.nameClass»Extension::onStartup()
	{
		// default implementation just starts the internal thread
		return startExtensionThread();
	}
	
	int «component.nameClass»Extension::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
	{
		// default implementation stops the internal thread waiting up to timeoutTime until it is stopped (or a timeout occurs)
		return stopExtensionThread(timeoutTime);
	}
	'''
}