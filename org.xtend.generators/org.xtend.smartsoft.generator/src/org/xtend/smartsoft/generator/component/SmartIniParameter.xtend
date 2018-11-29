//--------------------------------------------------------------------------
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//  Copyright (C) 2009-2011 Dennis Stampfer, Andreas Steck
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
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.performanceExtension.ActivationConstraints
import org.ecore.component.componentDefinition.ComponentPort

import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.component.performanceExtension.DefaultTrigger
import org.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.ecore.component.performanceExtension.DefaultInputTrigger
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.component.coordinationExtension.PublicOperationMode

class SmartIniParameter {
		@Inject extension ComponentGenHelpers
		@Inject extension CopyrightHelpers
		
		def iniParametersConstructor(ComponentDefinition component) '''
			// set default ini parameter values
			connections.component.name = "«component.getName()»";
			connections.component.initialComponentMode = "«component.initialComponentMode»";
			connections.component.defaultScheduler = "DEFAULT";
			connections.component.useLogger = false;
			
			«FOR server: component.allServerPorts.sortBy[it.name]»
			connections.«server.nameInstance».serviceName = "«server.nameOriginal»";
			connections.«server.nameInstance».roboticMiddleware = "«server.defaultMiddlewareString»";
«««				connections.«p.name.toFirstLower».cycle = «(p.stereotype as profile.SmartPushTimedServer).cycleInSeconds»;
			«ENDFOR»
			«FOR client: component.allClientPorts.sortBy[it.name]»
			«IF client.isOptional»
			connections.«client.nameInstance».initialConnect = false;
			«ENDIF»
			connections.«client.nameInstance».wiringName = "«client.name»";
			connections.«client.nameInstance».serverName = "unknown";
			connections.«client.nameInstance».serviceName = "unknown";
			connections.«client.nameInstance».interval = 1;
			connections.«client.nameInstance».roboticMiddleware = "«client.defaultMiddlewareString»";
			«ENDFOR»
			«FOR task : component.activities.filter(typeof(Activity)).sortBy(e | e.name)»
			«IF !task.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
			connections.«task.nameInstance».minActFreq = «task.minActFreq»;
			connections.«task.nameInstance».maxActFreq = «task.maxActFreq»;
			«ENDIF»
			«FOR trigger: task.extensions.filter(DefaultTrigger)»
				«IF trigger instanceof DefaultPeriodicTimer»
					connections.«task.nameInstance».trigger = "PeriodicTimer";
					connections.«task.nameInstance».periodicActFreq = «trigger.periodicActFreq»;
				«ELSEIF trigger instanceof DefaultInputTrigger»	
					connections.«task.nameInstance».trigger = "DataTriggered";
					connections.«task.nameInstance».inPortRef = "«(trigger as DefaultInputTrigger).inputLink.inputPort.name»";	
					connections.«task.nameInstance».prescale = «(trigger as DefaultInputTrigger).prescale»;
				«ENDIF»
			«ENDFOR»			
			// scheduling default parameters
			connections.«task.nameInstance».scheduler = "DEFAULT";
			connections.«task.nameInstance».priority = -1;
			connections.«task.nameInstance».cpuAffinity = -1;
			«ENDFOR»
			«FOR handler: component.inputHandlers.sortBy[it.name]»
			connections.«handler.nameInstance».prescale = 1;
			«ENDFOR»
			
			«FOR ext: componentGeneratorExtensions»
			// initialize members of «ext.getExtensionName(component)»
			«ext.getClassMemberConstruction(component)»
			
			«ENDFOR»
		'''
		
		def loadParameterImplementation(ComponentDefinition component) '''
			void «component.getName()»::loadParameter(int argc, char *argv[])
			{
				/*
				 Parameters can be specified via command line --filename=<filename> or -f <filename>
			
				 With this parameter present:
				   - The component will look for the file in the current working directory,
				     a path relative to the current directory or any absolute path
				   - The component will use the default values if the file cannot be found
			
				 With this parameter absent:
				   - <Name of Component>.ini will be read from current working directory, if found there
				   - $SMART_ROOT/etc/<Name of Component>.ini will be read otherwise
				   - Default values will be used if neither found in working directory or /etc
				 */
				SmartACE::SmartIniParameter parameter;
				std::ifstream parameterfile;
				bool parameterFileFound = false;
			
				// load parameters
				try
				{
					// if paramfile is given as argument
					if(parameter.tryAddFileFromArgs(argc,argv,"filename", 'f'))
					{
						parameterFileFound = true;
						std::cout << "parameter file is loaded from an argv argument \n";
					} else if(parameter.searchFile("«component.getName()».ini", parameterfile)) {
						parameterFileFound = true;
						std::cout << "load «component.getName()».ini parameter file\n";
						parameter.addFile(parameterfile);
					} else {
						std::cout << "WARNING: «component.getName()».ini parameter file not found! (using default values or command line arguments)\n";
					}
					
					// add command line arguments to allow overwriting of parameters
					// from file
					parameter.addCommandLineArgs(argc,argv,"component");
					
					// initialize the naming service using the command line parameters parsed in the
					// SmartIniParameter class. The naming service parameters are expected to be in
					// the "component" parameter group.
					SmartACE::NAMING::instance()->checkForHelpArg(argc,argv);
					if(parameterFileFound) 
					{
						if(SmartACE::NAMING::instance()->init(parameter.getAllParametersFromGroup("component")) != 0) {
							// initialization of naming service failed
							throw std::logic_error( "<NamingService> Service initialization failed!\nPossible causes could be:\n-> Erroneous configuration.\n-> Naming service not reachable.\n" );
						}
					} else {
						if(SmartACE::NAMING::instance()->init(argc, argv) != 0) {
							// initialization of naming service failed
							throw std::logic_error( "<NamingService> Service initialization failed!\nPossible causes could be:\n-> Erroneous configuration.\n-> Naming service not reachable.\n" );
						}
					}
						
					// print all known parameters
					// parameter.print();
					
					//--- server port // client port // other parameter ---
					// load parameter
					parameter.getString("component", "name", connections.component.name);
					parameter.getString("component", "initialComponentMode", connections.component.initialComponentMode);
					if(parameter.checkIfParameterExists("component", "defaultScheduler")) {
						parameter.getString("component", "defaultScheduler", connections.component.defaultScheduler);
					}
					if(parameter.checkIfParameterExists("component", "useLogger")) {
						parameter.getBoolean("component", "useLogger", connections.component.useLogger);
					}
					
					«FOR client: component.allClientPorts.sortBy[it.name]»
						// load parameters for client «client.name»
						«IF client.isOptional»
						parameter.getBoolean("«client.nameOriginal»", "initialConnect", connections.«client.nameInstance».initialConnect);
						«ENDIF»
						parameter.getString("«client.nameOriginal»", "serviceName", connections.«client.nameInstance».serviceName);
						parameter.getString("«client.nameOriginal»", "serverName", connections.«client.nameInstance».serverName);
						parameter.getString("«client.nameOriginal»", "wiringName", connections.«client.nameInstance».wiringName);
						«IF client.isSubscriber»
						parameter.getInteger("«client.nameOriginal»", "interval", connections.«client.nameInstance».interval);
						«ENDIF»
						if(parameter.checkIfParameterExists("«client.nameOriginal»", "roboticMiddleware")) {
							parameter.getString("«client.nameOriginal»", "roboticMiddleware", connections.«client.nameInstance».roboticMiddleware);
						}
					«ENDFOR»
					
					«FOR server: component.allServerPorts.sortBy[it.name]»
						// load parameters for server «server.name»
						parameter.getString("«server.nameOriginal»", "serviceName", connections.«server.nameInstance».serviceName);
						if(parameter.checkIfParameterExists("«server.nameOriginal»", "roboticMiddleware")) {
							parameter.getString("«server.nameOriginal»", "roboticMiddleware", connections.«server.nameInstance».roboticMiddleware);
						}
					«ENDFOR»
					
					«FOR task: component.activities.filter(typeof(Activity)).sortBy[it.name]»
						// load parameters for task «task.name»
						«IF !task.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
						parameter.getDouble("«task.nameOriginal»", "minActFreqHz", connections.«task.nameInstance».minActFreq);
						parameter.getDouble("«task.nameOriginal»", "maxActFreqHz", connections.«task.nameInstance».maxActFreq);
						parameter.getString("«task.nameOriginal»", "triggerType", connections.«task.nameInstance».trigger);
						if(connections.«task.nameInstance».trigger == "PeriodicTimer") {
							parameter.getDouble("«task.nameOriginal»", "periodicActFreqHz", connections.«task.nameInstance».periodicActFreq);
						} else if(connections.«task.nameInstance».trigger == "DataTriggered") {
							parameter.getString("«task.nameOriginal»", "inPortRef", connections.«task.nameInstance».inPortRef);
							parameter.getInteger("«task.nameOriginal»", "prescale", connections.«task.nameInstance».prescale);
						}
						«ENDIF»
						if(parameter.checkIfParameterExists("«task.nameOriginal»", "scheduler")) {
							parameter.getString("«task.nameOriginal»", "scheduler", connections.«task.nameInstance».scheduler);
						}
						if(parameter.checkIfParameterExists("«task.nameOriginal»", "priority")) {
							parameter.getInteger("«task.nameOriginal»", "priority", connections.«task.nameInstance».priority);
						}
						if(parameter.checkIfParameterExists("«task.nameOriginal»", "cpuAffinity")) {
							parameter.getInteger("«task.nameOriginal»", "cpuAffinity", connections.«task.nameInstance».cpuAffinity);
						}
					«ENDFOR»
					«FOR handler: component.inputHandlers.sortBy[it.name]»
						if(parameter.checkIfParameterExists("«handler.nameOriginal»", "prescale")) {
							parameter.getInteger("«handler.nameOriginal»", "prescale", connections.«handler.nameInstance».prescale);
						}
					«ENDFOR»
«««					«FOR cl : component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Port)).toIterable.sortBy(e | e.name)»
«««						«IF cl.stereotype instanceof profile.SmartInteractionServer»
«««							parameter.getString("«cl.name.toFirstLower»", "serviceName", connections.«cl.name.toFirstLower».serviceName);
«««						«ENDIF»
«««						«IF cl.stereotype instanceof profile.SmartPushTimedServer»
«««							parameter.getDouble("«cl.name.toFirstLower»", "cycle", connections.«cl.name.toFirstLower».cycle);
«««						«ENDIF»
«««						«IF cl.stereotype instanceof profile.SmartPushTimedClient»
«««							parameter.getInteger("«cl.name.toFirstLower»", "interval", connections.«cl.name.toFirstLower».interval);
«««						«ENDIF»
«««						«IF cl.stereotype instanceof profile.SmartInteractionClient»
«««							parameter.getString("«cl.name.toFirstLower»", "serviceName", connections.«cl.name.toFirstLower».serviceName);
«««							parameter.getString("«cl.name.toFirstLower»", "serverName", connections.«cl.name.toFirstLower».serverName);
«««							parameter.getString("«cl.name.toFirstLower»", "wiringName", connections.«cl.name.toFirstLower».wiringName);
«««						«ENDIF»
«««					«ENDFOR»
					
					«FOR ext: componentGeneratorExtensions»
					// load parameters for «ext.getExtensionName(component)»
					«ext.getLoadParameters(component)»
					
					«ENDFOR»
					
					// load parameters for all registered component-extensions
					for(auto extension = componentExtensionRegistry.begin(); extension != componentExtensionRegistry.end(); extension++) 
					{
						extension->second->loadParameters(parameter);
					}
					
					«IF component.hasParameters»
					paramHandler.loadParameter(parameter);
					«ENDIF»
				
				} catch (const SmartACE::IniParameterError & e) {
					std::cerr << e.what() << std::endl;
				} catch (const std::exception &ex) {
					std::cerr << "Uncaught std::exception: " << ex.what() << std::endl;
				} catch (...) {
					std::cerr << "Uncaught exception" << std::endl;
				}
			}
		'''
		
		
		def private String getIniStructName() '''connections'''
		
		def CreateIniStruct(ComponentDefinition component) 
		'''
		// «getIniStructName()» parameter
		struct «getIniStructName()»_struct
		{
			// component struct
			struct component_struct
			{
				// the name of the component
				std::string name;
				std::string initialComponentMode;
				std::string defaultScheduler;
				bool useLogger;
			} component;
			
			//--- task parameter ---
			«FOR task: component.activities.filter(typeof(Activity)).sortBy[it.name]»
				struct «task.nameClass»_struct {
					«IF !task.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
					double minActFreq;
					double maxActFreq;
					std::string trigger;
					// only one of the following two params is 
					// actually used at run-time according 
					// to the system config model
					double periodicActFreq;
					// or
					std::string inPortRef;
					int prescale;
					«ENDIF»
					// scheduling parameters
					std::string scheduler;
					int priority;
					int cpuAffinity;
				} «task.nameInstance»;
			«ENDFOR»
			
			//--- upcall parameter ---
			«FOR handler: component.inputHandlers.sortBy[it.name]»
				struct «handler.nameClass»_struct {
					int prescale;
				} «handler.nameInstance»;
			«ENDFOR»
			
			//--- server port parameter ---
			«FOR server: component.allServerPorts.sortBy[it.name]»
				struct «server.nameClass»_struct {
						std::string serviceName;
						std::string roboticMiddleware;
«««						«IF i.stereotype instanceof profile.SmartPushTimedServer» 
«««						double cycle;
«««						«ENDIF»
				} «server.nameInstance»;
			«ENDFOR»

			//--- client port parameter ---
			«FOR client: component.allClientPorts.sortBy[it.name]»
				struct «client.nameClass»_struct {
					«IF client.isOptional»
					bool initialConnect;
					«ENDIF»
					std::string serverName;
					std::string serviceName;
					std::string wiringName;
					long interval;
					std::string roboticMiddleware;
				} «client.nameInstance»;
			«ENDFOR»
			
			«FOR ext: componentGeneratorExtensions»
			// -- parameters for «ext.getExtensionName(component)»
			«ext.getIniStructDefinition(component)»
			
			«ENDFOR»
		} «getIniStructName()»;
		'''

	def CreateIniFile(ComponentDefinition component)
	'''
	[smartsoft]
	«getCopyrightHash()»
	
	##########################
	# component parameters
	
	[component]
	
	# the name of the component for the naming service
	name «component.name»
	
	# the initial ComponentMode
	initialComponentMode «component.initialComponentMode»
	#defaultScheduler FIFO
	#useLogger true
	
	##########################
	# Task parameters
	«FOR task: component.activities.filter(typeof(Activity)).sortBy[it.name]»
	
	[«task.name»]
	«IF !task.extensions.filter(typeof(ActivationConstraints)).exists[it.configurable==false]»
	minActFreqHz «task.minActFreq»
	maxActFreqHz «task.maxActFreq»
	«FOR trigger: task.extensions.filter(DefaultTrigger)»
		«IF trigger instanceof DefaultPeriodicTimer»
		# setup default trigger as PeriodicTimer
		triggerType PeriodicTimer
		periodicActFreqHz «trigger.periodicActFreq»
		«ELSEIF trigger instanceof DefaultInputTrigger»
		# setup default trigger as DataTriggered
		triggerType DataTriggered
		inPortRef «(trigger as DefaultInputTrigger).inputLink.inputPort.name»
		prescale «(trigger as DefaultInputTrigger).prescale»
		«ENDIF»
	«ENDFOR»
	# other trigger-types are:
	#triggerType PeriodicTimer
	#periodicActFreqHz «task.minActFreq»
	# or alternatively:
	#triggerType DataTriggered
	#inPortRef <InPortName>
	#prescale 1
	«ENDIF»
	# optional scheduling parameters
	# scheduler FIFO
	# priority 0
	# cpuAffinity 0
	«ENDFOR»
	
	##########################
	# InputHandler parameters
	«FOR handler: component.inputHandlers.sortBy[it.name]»
	
	[«handler.name»]
	prescale 1
	«ENDFOR»
	
	##########################
	# server port parameter
	«FOR server: component.allServerPorts.sortBy[it.name]»
	
	[«server.nameOriginal»]
	serviceName «server.nameOriginal»
	roboticMiddleware «server.defaultMiddlewareString»
«««	«IF cl.stereotype instanceof profile.SmartPushTimedServer»
«««		cycle «(cl.stereotype as profile.SmartPushTimedServer).cycleInSeconds»
«««	«ENDIF»
	«ENDFOR»	
	
	##########################
	# client port parameter
	«FOR client: component.allClientPorts.sortBy[it.name]»
	
	[«client.nameOriginal»]
	«IF client.isOptional»
	initialConnect false
	«ENDIF»
	serverName unknown
	serviceName unknown
	wiringName «client.nameOriginal»
	interval 1
	roboticMiddleware «client.defaultMiddlewareString»
	«ENDFOR»
	
	«FOR ext: componentGeneratorExtensions»
	##########################
	## parameters of «ext.getExtensionName(component)»
	«ext.getIniFileParameters(component)»
	
	«ENDFOR»
	
«««	
«««	«FOR param: component.eAllContents.filter(typeof(org.eclipse.uml2.uml.Comment)).toIterable.filter(p | p.isStereotypeApplied("profile::SmartComponentParameter"))»
«««		«IF (param.stereotype as profile.SmartComponentParameter)?.parameterDefinition.empty»
«««		# Alex: skip param generation due to empty param definition (mugt be that the uml model is not in sync)
«««		«ELSE»
«««		«FOR usage: ParseXtext::instance.parse((param.stereotype as profile.SmartComponentParameter).parameterDefinition)?.eAllContents.toIterable.filter(typeof(ParamCompUsage))»
«««			##########################
«««			# internal parameters
«««			«FOR internalGroup: usage.elements.filter(typeof(InternalParam)).sortBy(g|g.name)»
«««				[«internalGroup.name»]
«««				«FOR el: internalGroup.values.sortBy(v|v.key.name)»
«««					«IF el.value instanceof SimpleValue»
«««						«el.key.name» «(el.value as SimpleValue).value»
«««					«ELSEIF el.value instanceof ArrayValue»
«««						# «el.key.name» has an array value (defined by assigning each array element in a separate line)
«««						«FOR arrVal: (el.value as ArrayValue).values»
«««							«el.key.name» «arrVal.value»
«««						«ENDFOR»
«««					«ENDIF»
«««				«ENDFOR»
«««				
«««			«ENDFOR»
«««			
«««			##########################
«««			# extended parameters
«««			«FOR extended: usage.elements.filter(typeof(ExtendedParam))»
«««				[«extended.name»]
«««				«FOR nv: extended.values»
«««					«IF nv.value instanceof SimpleValue»
«««						«nv.key.name» «(nv.value as SimpleValue).value»
«««					«ELSEIF nv.value instanceof ArrayValue»
«««						# «nv.key.name» has an array value (defined by assigning each array element in a separate line)
«««						«FOR arrVal: (nv.value as ArrayValue).values»
«««							«nv.key.name» «arrVal.value»
«««						«ENDFOR»
«««					«ENDIF»
«««				«ENDFOR»
«««				
«««			«ENDFOR»
«««			
«««			##########################
«««			# instance parameters
«««			«FOR paramSetInstance: usage.elements.filter(typeof(ParamSetInstance))»
«««				«FOR par: paramSetInstance.set.params.filter(typeof(Param))»
«««					[«par.fullyQualifiedName»]
«««					«IF paramSetInstance.params.filter(typeof(ParamInstance)).exists(p|p.tag == par)»
«««						«FOR v: paramSetInstance.params.filter(typeof(ParamInstance)).findFirst(p|p.tag == par).values»
«««							«IF v.value instanceof SimpleValue»
«««								«v.key.name» «(v.value as SimpleValue).value»
«««							«ELSEIF v.value instanceof ArrayValue»
«««								# «v.key.name» has an array value (defined by assigning each array element in a separate line)
«««								«FOR arrVal: (v.value as ArrayValue).values»
«««									«v.key.name» «arrVal.value»
«««								«ENDFOR»
«««							«ENDIF»
«««						«ENDFOR»
«««					«ELSE»
«««						«FOR el: par.elems»
«««							«IF el.arrayType»
«««								# element «el.name» is an array type without a default value
«««							«ELSE»
«««								«el.name» «el.type.defaultValue»
«««							«ENDIF»
«««						«ENDFOR»
«««					«ENDIF»
«««					
«««				«ENDFOR»
«««			«ENDFOR»
«««		«ENDFOR»
«««		«ENDIF»
«««	«ENDFOR»
	'''
	
	def private getInitialComponentMode(ComponentDefinition component) {
		for(slave: component.elements.filter(CoordinationSlavePort)) {
			val mode = slave.elements.filter(PublicOperationMode).findFirst[it.isIsDefaultInit==true]
			if(mode !== null) {
				return mode.name
			}
		}
		return "Neutral"
	}
	
	def boolean isOptional(ComponentPort client) {
		val component = (client.eContainer as ComponentDefinition)
		for(task: component.activities) {
			if(task.inputLinks.filter[it.inputPort.equals(client)].exists[it.optional==false]) {
				return false
			}
		}
		return true
	}
	
//	def private String getFullyQualifiedName(Param par) {
//		var ParamSet set = (par.eContainer as ParamSet)
//		var PackageDeclaration repo = (set.eContainer as PackageDeclaration)
//		var String result = repo.name + "." + set.name + "." + par.name
//		return result
//	}
//	
//	def private getValue(SimpleValue v) {
//		switch(v) {
//			DecimalValue: v.content
//			FloatValue: v.content
//			BoolValue: v.content
//			StringValue: v.content
//			EnumRef: v.content.name
//		}
//	}
//	
//	def private getDefaultValue(AbstractType type) {
//		switch(type) {
//			DecimalType: '''0'''
//			FloatType: '''0.0'''
//			BoolType: '''false'''
//			EnumDef: '''ENUM_VALUE_UNDEFINED'''
//			default: '''# empty string'''
//		}
//	}
}