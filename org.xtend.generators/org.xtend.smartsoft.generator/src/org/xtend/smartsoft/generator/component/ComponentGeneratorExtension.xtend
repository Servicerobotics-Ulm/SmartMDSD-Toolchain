//===============================================================
//
//  Copyright (C) 2018 Alex Lotz, Matthias Lutz, Dennis Stampfer
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
package org.xtend.smartsoft.generator.component

import org.ecore.component.componentDefinition.ComponentDefinition

/**
 * This interface is used to attach ComponentGenerator extensions in a non-intrusive way.
 * The ComponentGenerator Extension-Point is specified in this plugin at "schema/ComponentGeneratorExtension.exsd".
 * 
 * With this extension it is possible to extend the generation of the main component C++ class
 * by external code generators. As the component's C++ class has a certain structure,
 * this class allows to provide specific code snipplets for the individual code-places
 * of the component class implementation (header and source). 
 */
interface ComponentGeneratorExtension {
	/**
	 * This is the minimally required method that needs to be implemented for a specific extension.
	 * The extension name is used to document the code parts that are provided by this extension.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the String name of this extension
	 */
	def String getExtensionName(ComponentDefinition component);
	
	/**
	 * This optional method places specific includes into the header file
	 * of the component's main class.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the includes as a character stream 
	 */
	def CharSequence getHeaderIncludes(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific includes into the <b>source</b> file
	 * of the component's main class.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the includes as a character stream 
	 */
	def CharSequence getSourceIncludes(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>member definitions</b> into the 
	 * class body definition (i.e. the class header) of the component's
	 * main class implementation. Typically, such member definitions
	 * might be member variable definitions and/or additional method specifications.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the definitions as a character stream 
	 */
	def CharSequence getClassMemberDefinition(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>member construction</b> into the 
	 * class constructor (i.e. in the class source file) of the component's
	 * main class implementation. Typically, such member construction
	 * consist of calling the member's constructors and/or initializing
	 * default values.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the constructions as a character stream 
	 */
	def CharSequence getClassMemberConstruction(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>member construction</b> into the 
	 * init() method (i.e. in the class source file) of the component's
	 * main class implementation. The component's main class is typically implemented
	 * as a Singleton, so it has a dedicated initialization method other than
	 * the default constructor. Typically, such member construction
	 * consist of calling the member's constructors and/or initializing
	 * default values.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the constructions as a character stream 
	 */
	def CharSequence getClassMemberInitialization(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>member destruction</b> into the 
	 * class destructor (i.e. in the class source file) of the component's
	 * main class implementation. Typically, such member destruction
	 * consist of deleting the dynamically allocated member memory.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the destructions as a character stream
	 * @sa getClassMemberConstruction()
	 */
	def CharSequence getClassMemberDestruction(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>implementations</b> into the 
	 * the class source file the component's main class implementation. 
	 * These are all the implementations that are not in any other specified
	 * class places and that are placed directly into the source-file (as is).
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the implementations as a character stream 
	 */
	def CharSequence getClassMemberImplementation(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific class <b>ini parameter definitions</b> into the 
	 * class body definition (i.e. the class header) of the component's
	 * main class implementation.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the ini parameter definitions as a character stream 
	 */
	def CharSequence getIniStructDefinition(ComponentDefinition component) ''''''
	
	/**
	 * This optional method places specific <b>ini parameter definitions</b> into the 
	 * default generated ini file.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the ini parameter definitions as a character stream 
	 */
	def CharSequence getIniFileParameters(ComponentDefinition component) ''''''
	
	/**
	 * This optional method allows extending the loadParameters() method
	 * of the component main clas.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the ini parameter parsing calls as a character stream 
	 */
	def CharSequence getLoadParameters(ComponentDefinition component) ''''''
	
	/**
	 * This optional method allows extending the component's CMakeLists.txt
	 * file. The provided snipplet is placed <b>after</b> the project() definition
	 * and <b>before</b> the target definition. 
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the custom CMake includes as a character stream 
	 */
	def CharSequence getCMakeIncludes(ComponentDefinition component) ''''''
	
	/**
	 * This optional method allows extending the component's CMakeLists.txt
	 * file. The provided snipplet is placed <b>after</b> the target 
	 * definition and allows configuring the component target, whose name
	 * is specified as ${PROJECT_NAME}. Moreover, customized installation
	 * instructions can also be implemented here.
	 * 
	 * @param component the calling ComponentDefinition definition resource
	 * @result the custom CMake target configurations/installation as a character stream 
	 */
	def CharSequence getCMakeTargetConfiguration(ComponentDefinition component) ''''''
}