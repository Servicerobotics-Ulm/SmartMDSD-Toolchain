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
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers

class InteractionObserver {
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
	
	def getNodeObserverInterfaceClassName(ComponentSubNode node) {
		return node.nameClass+"ObserverInterface"
	}
	
	def getNodeObserverInterfaceHeaderFileName(ComponentSubNode node) {
		return node.nodeObserverInterfaceClassName+".hh"
	}
	
	def compileNodeObserverInterface(ComponentSubNode node)
	'''
		«getCopyright()»
		#ifndef _«node.name.toUpperCase»_OBSERVER_INTERFACE_HH
		#define _«node.name.toUpperCase»_OBSERVER_INTERFACE_HH
		
		// forward declaration
		class «node.nameClass»;
		
		class «node.nodeObserverInterfaceClassName» {
		public:
			virtual ~«node.nodeObserverInterfaceClassName»() {  }
		
			virtual void on_update_from(const «node.nameClass» *subject) = 0;
		};
		
		#endif
	'''
	
	
	def compileNodeSubjectHeader(ComponentSubNode node)
	'''
	/**
	 * Implementation of the Subject part of an InteractionObserver
	 */
	private:
		std::mutex interaction_observers_mutex;
		std::list<«node.nodeObserverInterfaceClassName»*> interaction_observers;
	protected:
		void notify_all_interaction_observers();
	public:
		void attach_interaction_observer(«node.nodeObserverInterfaceClassName» *observer);
		void detach_interaction_observer(«node.nodeObserverInterfaceClassName» *observer);
	'''
	
	def compileNodeSubjectSource(ComponentSubNode node)
	'''
	void «node.nameClass»Core::notify_all_interaction_observers() {
		std::unique_lock<std::mutex> lock(interaction_observers_mutex);
		// try dynamically down-casting this class to the derived class 
		// (we can do it safely here as we exactly know the derived class)
		if(const «node.nameClass»* «node.nameInstance» = dynamic_cast<const «node.nameClass»*>(this)) {
			for(auto it=interaction_observers.begin(); it!=interaction_observers.end(); it++) {
				(*it)->on_update_from(«node.nameInstance»);
			}
		}
	}
	
	void «node.nameClass»Core::attach_interaction_observer(«node.nodeObserverInterfaceClassName» *observer) {
		std::unique_lock<std::mutex> lock(interaction_observers_mutex);
		interaction_observers.push_back(observer);
	}
	
	void «node.nameClass»Core::detach_interaction_observer(«node.nodeObserverInterfaceClassName» *observer) {
		std::unique_lock<std::mutex> lock(interaction_observers_mutex);
		interaction_observers.remove(observer);
	}
	'''
}