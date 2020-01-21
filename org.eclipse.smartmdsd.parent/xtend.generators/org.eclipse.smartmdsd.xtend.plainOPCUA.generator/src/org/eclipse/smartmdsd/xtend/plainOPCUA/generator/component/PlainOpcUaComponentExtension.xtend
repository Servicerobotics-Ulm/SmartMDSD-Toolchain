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
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaReadServer
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.SmartComponentExtension
import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.SmartComponent

class PlainOpcUaComponentExtension  {
	@Inject extension CopyrightHelpers
	@Inject extension SmartComponentExtension
	@Inject extension SmartComponent
	
	@Inject extension PlainOpcUaDeviceClient
	@Inject extension PlainOpcUaStatusServer
	
	def String getPlainOpcUaExtensionHeaderFilename(ComponentDefinition component) '''PlainOpcUa«component.name»Extension.hh'''
	def String getPlainOpcUaExtensionSourceFilename(ComponentDefinition component) '''PlainOpcUa«component.name»Extension.cc'''
	
	def compilePlainOpcUaExtensionHeader(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#ifndef PLAINOPCUACOMPONENTEXTENSION_H_
	#define PLAINOPCUACOMPONENTEXTENSION_H_
	
	#include "«component.componentExtensionHeaderFilename»"
	
	// include component's main class
	#include "«component.compHeaderFilename»"
	
	// include plain OPC UA device clients
	«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
	#include "«opcDeviceClient.opcUaDeviceClientHeader»"
	«ENDFOR»
	// include plain OPC UA status servers
	«FOR server: component.elements.filter(OpcUaReadServer)»
	#include "«server.serverControllerHeaderFileName»"
	«ENDFOR»
	
	class PlainOpcUa«component.name»Extension : public «component.name»Extension 
	{
	private:
		«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
		OPCUA::«opcDeviceClient.name.toFirstUpper» *«opcDeviceClient.name.toFirstLower»;
		bool «opcDeviceClient.name.toFirstLower»AutoConnect;
		std::string «opcDeviceClient.name.toFirstLower»DeviceURI;
		std::string «opcDeviceClient.name.toFirstLower»RootObjectPath;
		«ENDFOR»
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		unsigned short «opcStatusServer.name.toFirstLower»PortNumber;
		OPCUA::«opcStatusServer.className» *«opcStatusServer.name.toFirstLower»;
		«ENDFOR»
	public:
		PlainOpcUa«component.name»Extension();
		virtual ~PlainOpcUa«component.name»Extension();
	
		virtual void loadParameters(const SmartACE::SmartIniParameter &parameter);
		virtual void initialize(«component.name» *component, int argc, char* argv[]) override;
		virtual int onStartup() override;

		virtual int extensionExecution() override;

		virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) override;
		virtual void destroy() override;
	};
	
	#endif /* PLAINOPCUACOMPONENTEXTENSION_H_ */
	'''
	
	
	def compilePlainOpcUaExtensionSource(ComponentDefinition component)
	'''
	«getCopyright()»
	
	#include "«component.plainOpcUaExtensionHeaderFilename»"
	
	// the ace port-factory is used as a default port-mapping
	
	// statically create a global PlainOpcUa«component.name»Extension instance
	static PlainOpcUa«component.name»Extension extension;
	
	PlainOpcUa«component.name»Extension::PlainOpcUa«component.name»Extension()
	:	«component.name»Extension("PlainOpcUa«component.name»Extension")
	{
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			«client.name.toFirstLower» = 0;
			«client.name.toFirstLower»AutoConnect = «client.autoConnect»;
			«client.name.toFirstLower»DeviceURI = "«client.deviceURI»";
			«client.name.toFirstLower»RootObjectPath = "«client.rootObjectPath»";
		«ENDFOR»
		
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
			«opcStatusServer.name.toFirstLower» = 0;
			«opcStatusServer.name.toFirstLower»PortNumber = «opcStatusServer.portNumber»;
		«ENDFOR»
	}
	
	PlainOpcUa«component.name»Extension::~PlainOpcUa«component.name»Extension()
	{  }
	
	void PlainOpcUa«component.name»Extension::loadParameters(const SmartACE::SmartIniParameter &parameter)
	{
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			parameter.getBoolean("«client.name»", "autoConnect", «client.name.toFirstLower»AutoConnect);
			parameter.getString("«client.name»", "deviceURI", «client.name.toFirstLower»DeviceURI);
			parameter.getString("«client.name»", "rootObjectPath", «client.name.toFirstLower»RootObjectPath);
		«ENDFOR»
		«FOR server: component.elements.filter(OpcUaReadServer)»
			parameter.getInteger("«server.name»", "portNumber", «server.name.toFirstLower»PortNumber);
		«ENDFOR»
	}
	
	void PlainOpcUa«component.name»Extension::initialize(«component.name» *component, int argc, char* argv[])
	{
		«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
		«opcDeviceClient.name.toFirstLower» = new OPCUA::«opcDeviceClient.name.toFirstUpper»();
		component->«opcDeviceClient.name.toFirstLower» = «opcDeviceClient.name.toFirstLower»;
		«ENDFOR»
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		«opcStatusServer.name.toFirstLower» = new OPCUA::«opcStatusServer.className»(NULL, «opcStatusServer.name.toFirstLower»PortNumber);
		component->«opcStatusServer.name.toFirstLower» = «opcStatusServer.name.toFirstLower»;
		«ENDFOR»
	}
	
	int PlainOpcUa«component.name»Extension::onStartup()
	{
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			if(«client.name.toFirstLower»AutoConnect == true) {
				// connect OPC/UA DeviceClient «client.name»
				«client.name.toFirstLower»->connect(«client.name.toFirstLower»DeviceURI, «client.name.toFirstLower»RootObjectPath, false);
			}
		«ENDFOR»
		
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		«opcStatusServer.name.toFirstLower»->start();
		«ENDFOR»
		
		return startExtensionThread();
	}
	
	int PlainOpcUa«component.name»Extension::extensionExecution()
	{
		while(cancelled == false) {
			«FOR client: component.elements.filter(OpcUaDeviceClient)»
				«client.name.toFirstLower»->run_once();
			«ENDFOR»
		}
		return 0;
	}
	
	int PlainOpcUa«component.name»Extension::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
	{
		«FOR client: component.elements.filter(OpcUaDeviceClient)»
			// disconnect OPC/UA DeviceClient «client.name»
			«client.name.toFirstLower»->disconnect();
		«ENDFOR»
		
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		«opcStatusServer.name.toFirstLower»->stop();
		«ENDFOR»
		
		return stopExtensionThread(timeoutTime);
	}
	
	void PlainOpcUa«component.name»Extension::destroy()
	{
		«FOR opcDeviceClient: component.elements.filter(OpcUaDeviceClient)»
		delete «opcDeviceClient.name.toFirstLower»;
		«ENDFOR»
		«FOR opcStatusServer: component.elements.filter(OpcUaReadServer)»
		delete «opcStatusServer.name.toFirstLower»;
		«ENDFOR»
	}
	'''
}