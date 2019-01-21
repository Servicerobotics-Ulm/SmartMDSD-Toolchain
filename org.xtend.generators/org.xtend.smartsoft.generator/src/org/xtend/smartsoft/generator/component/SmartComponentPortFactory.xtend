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
import org.ecore.component.componentDefinition.ComponentDefinitionModelUtility
import org.xtend.smartsoft.generator.commObj.CommObjectGenHelpers
import org.ecore.service.roboticMiddleware.ACE_SmartSoft
import org.xtend.smartsoft.generator.CopyrightHelpers

class SmartComponentPortFactory {
	@Inject extension SmartComponent
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	@Inject extension CommObjectGenHelpers
	
	def String getPortFactoryInterfaceFilename(ComponentDefinition component) '''«component.name»PortFactoryInterface.hh'''
	
	def String getAcePortFactoryHeaderFilename(ComponentDefinition component) '''«component.name»AcePortFactory.hh'''
	def String getAcePortFactorySourceFilename(ComponentDefinition component) '''«component.name»AcePortFactory.cc'''
	
	def compilePortFactoryInterface(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#ifndef «component.name.toUpperCase»_PORTFACTORYINTERFACE_HH_
	#define «component.name.toUpperCase»_PORTFACTORYINTERFACE_HH_
	
	// include communication objects
	«FOR obj : ComponentDefinitionModelUtility.getAllCommObjects(component).sortBy[it.name]»
		#include <«obj.userClassHeaderFileNameFQN»>
		#include <«obj.serailizationHeaderFileNameFQN»>
	«ENDFOR»
	
	#include <chrono>
	
	// include component's main class
	#include "«component.compHeaderFilename»"
	
	// forward declaration
	class «component.nameClass»;
	
	class «component.name»PortFactoryInterface {
	public:
		«component.name»PortFactoryInterface() { };
		virtual ~«component.name»PortFactoryInterface() { };
	
		virtual void initialize(«component.nameClass» *component, int argc, char* argv[]) = 0;
		virtual int onStartup() = 0;
	
		«FOR port: component.allClientPorts.sortBy[it.name]»
		virtual «port.portDefinition» * create«port.nameClass»() = 0;
		«ENDFOR»
		
		«FOR port: component.allServerPorts.sortBy[it.name]»
		virtual «port.portDefinition» * create«port.nameClass»(const std::string &serviceName«IF port.isEventServer», Smart::IEventTestHandler<«port.getCommObjectCppList(true)»> *«port.nameInstance»EventTestHandler«ENDIF») = 0;
		«ENDFOR»
	
		virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) = 0;
		virtual void destroy() = 0;
	};
	
	#endif /* «component.name.toUpperCase»_PORTFACTORYINTERFACE_HH_ */
	'''
	
	def compileAcePortFactoryHeader(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#ifndef «component.name.toUpperCase»_ACE_PORTFACTORY_HH_
	#define «component.name.toUpperCase»_ACE_PORTFACTORY_HH_
	
	// include ACE/SmartSoft component implementation
	#include "«component.compImplHeaderFilename»"
	
	// include the main component-definition class
	#include "«component.portFactoryInterfaceFilename»"
	
	class «component.name»AcePortFactory: public «component.name»PortFactoryInterface
	{
	private:
		«component.name»Impl *componentImpl;
	public:
		«component.name»AcePortFactory();
		virtual ~«component.name»AcePortFactory();
	
		virtual void initialize(«component.nameClass» *component, int argc, char* argv[]) override;
		virtual int onStartup() override;
	
		«FOR port: component.allClientPorts.sortBy[it.name]»
		virtual «port.portDefinition» * create«port.nameClass»() override;
		«ENDFOR»
		
		«FOR port: component.allServerPorts.sortBy[it.name]»
		virtual «port.portDefinition» * create«port.nameClass»(const std::string &serviceName«IF port.isEventServer», Smart::IEventTestHandler<«port.getCommObjectCppList(true)»> *«port.nameInstance»EventTestHandler«ENDIF») override;
		«ENDFOR»
		
		// get a pointer to the internal component implementation
		SmartACE::SmartComponent* getComponentImpl();
	
		virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) override;
		virtual void destroy() override;
	};
	
	#endif /* «component.name.toUpperCase»_ACE_PORTFACTORY_HH_ */
	'''
	
	def compileAcePortFactorySource(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#include "«component.acePortFactoryHeaderFilename»"
	
	// create a static instance of the default AcePortFactory
	static «component.name»AcePortFactory acePortFactory;
	
	«component.name»AcePortFactory::«component.name»AcePortFactory()
	{  
		componentImpl = 0;
		«component.nameClass»::instance()->addPortFactory("«ACE_SmartSoft.simpleName»", this);
	}
	
	«component.name»AcePortFactory::~«component.name»AcePortFactory()
	{  }
	
	void «component.name»AcePortFactory::initialize(«component.nameClass» *component, int argc, char* argv[])
	{
		if(component->connections.component.defaultScheduler != "DEFAULT") {
			ACE_Sched_Params sched_params(ACE_SCHED_OTHER, ACE_THR_PRI_OTHER_DEF);
			if(component->connections.component.defaultScheduler == "FIFO") {
				sched_params.policy(ACE_SCHED_FIFO);
				sched_params.priority(ACE_THR_PRI_FIFO_MIN);
			} else if(component->connections.component.defaultScheduler == "RR") {
				sched_params.policy(ACE_SCHED_RR);
				sched_params.priority(ACE_THR_PRI_RR_MIN);
			}
			// create new instance of the SmartSoft component with customized scheuling parameters 
			componentImpl = new «component.name»Impl(component->connections.component.name, argc, argv, sched_params);
		} else {
			// create new instance of the SmartSoft component
			componentImpl = new «component.name»Impl(component->connections.component.name, argc, argv);
		}
	}
	
	int «component.name»AcePortFactory::onStartup()
	{
		return componentImpl->startComponentInfrastructure();
	}

	«FOR port: component.allClientPorts.sortBy[it.name]»
	«port.portDefinition» * «component.name»AcePortFactory::create«port.nameClass»()
	{
		return new «port.portImplementation»(componentImpl);
	}
	
	«ENDFOR»
	
	«FOR port: component.allServerPorts.sortBy[it.name]»
	«port.portDefinition» * «component.name»AcePortFactory::create«port.nameClass»(const std::string &serviceName«IF port.isEventServer», Smart::IEventTestHandler<«port.getCommObjectCppList(true)»> *«port.nameInstance»EventTestHandler«ENDIF»)
	{
		return new «port.portImplementation»(componentImpl, serviceName«IF port.isEventServer», «port.nameInstance»EventTestHandler«ENDIF»);
	}
	
	«ENDFOR»

	SmartACE::SmartComponent* «component.name»AcePortFactory::getComponentImpl()
	{
		return componentImpl;
	}

	int «component.name»AcePortFactory::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
	{
		componentImpl->stopComponentInfrastructure(timeoutTime);
		return 0;
	}
	
	void «component.name»AcePortFactory::destroy()
	{
		// clean-up component's internally used resources (internally used communication middleware) 
		componentImpl->cleanUpComponentResources();
		delete componentImpl;
	}
	'''
}