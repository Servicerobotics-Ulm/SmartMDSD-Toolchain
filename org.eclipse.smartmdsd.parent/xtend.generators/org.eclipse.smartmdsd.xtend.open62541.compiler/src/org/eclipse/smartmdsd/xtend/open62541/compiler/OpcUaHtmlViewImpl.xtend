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

import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetMETHOD

class OpcUaHtmlViewImpl implements OpcUaHtmlView {
	@Inject extension CopyrightHelpers
	
	override getOpcUaDeviceServerVisualFileName() { "../html-view/Visual.html" }
	
	override getOpcUaDevice_HtmlView_HeaderFileName(String objectName) { objectName + "HtmlView.hh" }
	override getOpcUaDevice_HtmlView_SourceFileName(String objectName) { objectName + "HtmlView.cc" }	
	
	////////////////////////////////////////////////////////////////// MVC HTML View Header
	////////////////////////////////////////////////////////////////////////////////////
	override CharSequence compileOpcUaDevice_HtmlView_HeaderFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) '''
	«getCopyright()»
	#ifndef _«objectName.toUpperCase»_HTML_VIEW_HH
	#define _«objectName.toUpperCase»_HTML_VIEW_HH	
	
	#include "Pixtend2Observer.h"
	
	namespace Smart {
	class «objectName»HtmlView : public Pixtend2Observer
	{
	private:
		«FOR entity:entityList»
		unsigned short PIN_«entity.name»;
		«ENDFOR»
	public:
		/// constructor requires a Pixtend2DriverModel
		«objectName»HtmlView(Pixtend2DriverModel *model);
		virtual ~«objectName»HtmlView();

		/// PIN number setters
		«FOR entity:entityList»
				void setPIN_«entity.name» (unsigned short p) { PIN_«entity.name» = p; }
		«ENDFOR»
		/// PIN NUMBER getters
		«FOR entity:entityList»
				unsigned short getPIN_«entity.name» () {return PIN_«entity.name»; }
		«ENDFOR»
	
		/// implements Pixtend2Observer
		virtual void update();
	
		/// returns a pinter to the internally used model
		inline Pixtend2DriverModel* getModel() const {
			return model;
		}
	};
	
	} /* namespace Smart */
	
	
	#endif /* _«objectName.toUpperCase»_HTML_VIEW_HH */
	'''
	////////////////////////////////////////////////////////////////// MVC HTML View Source
	////////////////////////////////////////////////////////////////////////////////////	
	override CharSequence compileOpcUaDevice_HtmlView_SourceFileContent(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList) '''
	«getCopyright()»
	#include "«objectName.getOpcUaDevice_HtmlView_HeaderFileName()»"
	
	#include <iostream>
	#include <fstream>
	
	namespace Smart {
	// Default PIN Setting
	«FOR entity:entityList»
		unsigned short DEFAULT_PIN_«entity.name» = 0; //Fill Actual
	«ENDFOR»
	«objectName»HtmlView::«objectName»HtmlView(Pixtend2DriverModel *model)
	:	Pixtend2Observer(model)
	{  
		«FOR entity:entityList»
		PIN_«entity.name» = DEFAULT_PIN_«entity.name»;
		«ENDFOR»
	}
	
	«objectName»HtmlView::~«objectName»HtmlView()
	{  }
	
	
	void «objectName»HtmlView::update()
	{
		std::cout<<"«objectName»HtmlView Update " << std::endl;
		std::cout<<"DO " << (int)model->getDigitalOutput()<<"  RO " << (int)model->getRelayOutput() <<"  DI " << (int)model->getDigitalInput()<< std::endl;
		std::ofstream html_file("../Visual/Visual.html");
		if(html_file.is_open())
		{
			html_file << "<!DOCTYPE html>" << std::endl;
			html_file << "<html>" << std::endl;
			html_file << "<head>" << std::endl;
			html_file << "<meta http-equiv=refresh content=1 />" << std::endl;
			html_file << "</head>" << std::endl;
			html_file << "<body>" << std::endl;
			html_file << "<div align=center>" << std::endl;
			html_file << "<B>«objectName.toUpperCase»_SERVER</B><BR>"<< std::endl;
			«FOR entity: entityList»
			html_file << "«entity.name» : " << model->getDigitalInput(getPIN_«entity.name»()) << "<BR>" << std::endl;
			«ENDFOR»
			html_file <<"<BR>  DO " << (int)model->getDigitalOutput()<< std::endl;
			html_file <<"<BR>  RO " << (int)model->getRelayOutput()<< std::endl;
			html_file <<"<BR>  DI " << (int)model->getDigitalInput()<<"<BR>" << std::endl;
	
			html_file << "</div>" << std::endl;
			html_file << "</body>" << std::endl;
			html_file << "</html>" << std::endl;
	
			html_file.close();
		}
	}
	
	} /* namespace Smart */
	'''
}