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

import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider

class SmartTimer {
	@Inject extension ComponentGenHelpers
	@Inject extension CopyrightHelpers
	@Inject extension SmartComponent
	
	def TimerHeaderFileName(SmartTimerDummy h) { h.nameClass + "Core.hh" }
	def TimerSourceFileName(SmartTimerDummy h) { h.nameClass + "Core.cc" }
	def TimerUserHeaderFileName(SmartTimerDummy h) { h.nameClass + ".hh" }
	def TimerUserSourceFileName(SmartTimerDummy h) { h.nameClass + ".cc" }
	
	def dispatch void CreateSmartTimer(SmartTimerDummy t, IFileSystemAccess fsa) {
		fsa.generateFile(t.TimerHeaderFileName, t.TimerHeaderFile)
		fsa.generateFile(t.TimerSourceFileName, t.TimerSourceFile)
		fsa.generateFile(t.TimerUserHeaderFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, t.TimerUserHeaderFile)
		fsa.generateFile(t.TimerUserSourceFileName, ExtendedOutputConfigurationProvider::SRC_OUTPUT, t.TimerUserSourceFile)
	}
	def dispatch void CreateSmartTimer(Object s, IFileSystemAccess fsa) {
	}
	

	def TimerHeaderFile(SmartTimerDummy timer) 
	'''
		«getCopyright()»
		#ifndef _«timer.nameClass.toUpperCase»_CORE_HH
		#define _«timer.nameClass.toUpperCase»_CORE_HH
			
		#include "smartSoft.hh"
		
		class «timer.nameClass»Core : public Smart::TimerHandler
		{
		private:
			long timerId;
		
			// create mutex
			CHS::SmartMutex mutex;
			// create condition mutex
			CHS::SmartConditionMutex cond;
		
		protected:
			virtual void timerExpired(const ACE_Time_Value & absolute_time,
					const void * arg);
		
		public:
			«timer.nameClass»Core()
			: timerId(0)
			, mutex()
			, cond(mutex)
			{  }
		
			virtual void timerExpired(const ACE_Time_Value & absolute_time) {
				// overload this method in derived classes
			}
		
			virtual void waitTimer();
		
			virtual void start();
			virtual void stop();
		};
		#endif
	'''
	
	def getCycleInSeconds(SmartTimerDummy timer) {
		var double seconds = 0
		switch(timer.timeUnit)
		{
			case "s": seconds = timer.cycle
			case "ms": seconds = timer.cycle / 1000.0
			case "us": seconds = timer.cycle / 1000000.0
			case "ns": seconds = timer.cycle / 1000000000.0
			default: seconds = -1
		}
		return seconds
	}
	
	def TimerSourceFile(SmartTimerDummy timer) 
	'''
		«getCopyright()»
		
		#include "«timer.TimerHeaderFileName»"
		
		#include "«timer.componentDefinition.getCompHeaderFilename»"

		void «timer.nameClass»Core::timerExpired(const ACE_Time_Value & absolute_time,
					const void * arg)
		{
			mutex.acquire();
			cond.signal();
			mutex.release();
		
			this->timerExpired(absolute_time);
		}
		
		void «timer.nameClass»Core::waitTimer()
		{
			mutex.acquire();
			cond.wait();
			mutex.release();
		}
		
		void «timer.nameClass»Core::start()
		{
			// create timer
			double fractpart, intpart;
		
			// setup «timer.nameClass»Core
			fractpart = modf(«timer.cycleInSeconds», &intpart);
			timerId = COMP->component->getTimerThread().scheduleTimer(*this, (void*) 0, ACE_Time_Value(0,0),
		                                  ACE_Time_Value(intpart, (int)(fractpart*1000*1000)));
		}
		
		void «timer.nameClass»Core::stop()
		{
			COMP->component->getTimerThread().cancelTimer(timerId);
		}
	'''

	def TimerUserHeaderFile(SmartTimerDummy timer) 
	'''
		«getCopyrightWriteOnce()»
		
		#ifndef _«timer.nameClass.toUpperCase»_HH
		#define _«timer.nameClass.toUpperCase»_HH
			
		#include "smartSoft.hh"
			
		#include "«timer.TimerHeaderFileName»"
			
		class «timer.nameClass» : public «timer.nameClass»Core 
		{
			virtual void timerExpired(const ACE_Time_Value & absolute_time);
		};
			
		#endif
	'''

	def TimerUserSourceFile(SmartTimerDummy timer) 
	'''
		«getCopyrightWriteOnce()»
		#include "«timer.TimerUserHeaderFileName»"
		#include "«timer.componentDefinition.getCompHeaderFilename»"
		
		#include <iostream>
		
		void «timer.nameClass»::timerExpired(const ACE_Time_Value & absolute_time)
		{
			// change this code to your needs !!!
		
		}
	'''
}