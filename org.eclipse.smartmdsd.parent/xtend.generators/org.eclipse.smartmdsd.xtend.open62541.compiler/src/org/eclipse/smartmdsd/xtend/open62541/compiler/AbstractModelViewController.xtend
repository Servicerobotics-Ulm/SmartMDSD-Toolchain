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