//==============================================================================
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
//==============================================================================
package org.eclipse.smartmdsd.xtend.open62541.compiler

interface AbstractModelViewController {
	def String getAbstractModelHeader()
	def String getAbstractModelSource()

	def String getAbstractModelObserverHeader()
	def String getAbstractModelObserverSource()

	def String getAbstractViewHeader()
	def String getAbstractControllerHeader()
	
	def CharSequence compileAbstractModelHeader()
	def CharSequence compileAbstractModelSource()

	def CharSequence compileAbstractModelObserverHeader()
	def CharSequence compileAbstractModelObserverSource()

	def CharSequence compileAbstractViewHeader()
	
	def CharSequence compileAbstractControllerHeader()
}