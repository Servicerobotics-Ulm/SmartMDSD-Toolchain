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

import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetENTITY
import org.eclipse.smartmdsd.xtend.open62541.compiler.OpcUaXmlParser.SeRoNetMETHOD

class SpecificModelViewControllerImpl implements SpecificModelViewController 
{
	@Inject extension CopyrightHelpers
	@Inject extension AbstractModelViewControllerImpl
	@Inject extension OpcUaObjectInterfaceImpl
	@Inject extension OpcUaServerImpl
	@Inject extension OpcUaXmlParser
	
	override String getSpecificDriverModelHeader(String name) { name+"DriverModel.hh" }

	override String getSpecificViewHeader(String name) { name+"View.hh" }
	override String getSpecificViewSource(String name) { name+"View.cc" }

	override String getSpecificControllerHeader(String name) { name+"Controller.hh" }
	override String getSpecificControllerSource(String name) { name+"Controller.cc" }
	
	override String getSpecificTestServer(String name) { name+"ServerMain.cc" }
	
	override CharSequence compileSpecificDriverModelHeader(String name)
	'''
	«getCopyright()»
	
	#ifndef «name.toUpperCase»DRIVERMODEL_H_
	#define «name.toUpperCase»DRIVERMODEL_H_
	
	#include <MVC/«abstractModelHeader»>
	
	namespace Smart {
	
	
	class «name»DriverModel : public AbstractModel {
	public:
		«name»DriverModel() {  };
		virtual ~«name»DriverModel() {  };
		
		// FIXME: modify and extend this class on your needs
	};
	
	} // end namespace Smart
	
	#endif // «name.toUpperCase»DRIVERMODEL_H_
	'''

	override CharSequence compileSpecificViewHeader(String name)
	'''
	«getCopyright()»
	
	#ifndef «name.toUpperCase»TVIEW_H_
	#define «name.toUpperCase»TVIEW_H_
	
	#include <MVC/«abstractViewHeader»>
	
	//FIXME: use your specific DriverModel class (in case its is different to the generated one)
	#include "«name»DriverModel.hh"
		
	namespace Smart {
	
	/**
	 * This class implements the View part of the Model-View-Controller (MVC)
	 * design pattern. Please implement the method update() to realize your
	 * view update strategy. In addition, it is recommended to refine the
	 * method getModel() such that it returns your specific model class
	 * rather than the AbstractModel. This is particularly useful for the
	 * Controller class of the MVC pattern.
	 */
	class «name.toFirstUpper»View : public AbstractView
	{
	public:
		/// constructor requires a pointer to a specific model
		//FIXME: use your specific DriverModel class (in case its is different to the generated one)
		«name.toFirstUpper»View(«name»DriverModel *model);
		virtual ~«name.toFirstUpper»View();
	
		/// implements AbstractModelObserver
		virtual void update() override;
	
		/// returns a pointer to the internally used model
		//FIXME: use your specific DriverModel class (in case its is different to the generated one)
		virtual «name»DriverModel* getModel() const override;
	};
	
	} /* namespace Smart */
	
	#endif /* «name.toUpperCase»TVIEW_H_ */
	'''
	override CharSequence compileSpecificViewSource(String name)
	'''
	«getCopyright()»
	
	#include "«name.specificViewHeader»"
	
	namespace Smart {
	
	«name.toFirstUpper»View::«name.toFirstUpper»View(«name»DriverModel *model)
	:	AbstractView(model)
	{  }
	
	«name.toFirstUpper»View::~«name.toFirstUpper»View()
	{  }
	
	void «name.toFirstUpper»View::update()
	{
		//implement this method (if needed)
	}
	
	«name»DriverModel* «name.toFirstUpper»View::getModel() const {
		return dynamic_cast<«name»DriverModel*>(model);
	}
	
	} /* namespace Smart */
	'''

	override CharSequence compileSpecificControllerHeader(String objectName, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	'''
	«getCopyright()»
	
	#ifndef «objectName.toUpperCase»CONTROLLER_H_
	#define «objectName.toUpperCase»CONTROLLER_H_
	
	#include <MVC/«abstractControllerHeader»>
	
	#include "«objectName.specificViewHeader»"
	#include "«objectName.opcUaDevice_Interface_HeaderFileName»"
	#include "«objectName.opcUaDevice_Server_HeaderFileName»"
	
	namespace Smart {
	
	/**
	 * This class implements the Controller part of the Model-View-Controller (MVC)
	 * design pattern. As a second responsibility, this class also implements
	 * the generated interface which is used by the internally initialized OPC UA
	 * server to interact with the actual model. The actual model can be internally
	 * accessed over the given view pointer. Conceptually, this class decouples
	 * the OPC UA server from the Model and handles the lifecycle of the OPC UA server.
	 */
	class «objectName.toFirstUpper»Controller : public AbstractController, public «objectName»Interface
	{
	private:
		OPCUA::«objectName» server;
		«objectName.toFirstUpper»View *view;
	
	public:
		«objectName.toFirstUpper»Controller(«objectName.toFirstUpper»View *view);
		virtual ~«objectName.toFirstUpper»Controller();
	
		/// implements AbstractModelObserver
		virtual void update() override;
		
		
		«FOR entity: entityList»
		/** XML Specific Getter function for entity «entity.name»
		 *
		 *  This function gets «entity.name»  from the Server
		 *  When class «objectName» is used with a Specific XML file to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *	
		 *  @param value	:output parameter, returns the new value if StatusCode is ALL_OK
		 *
		 *  @return status code
		 *	- ALL_OK
		 *  - DISCONNECTED
		 *  - ERROR_COMMUNICATION
		 */
		virtual OPCUA::StatusCode get«entity.name.toFirstUpper»(«entity.type.cppType» &«entity.name.toFirstLower») const override;
		
		«IF (entity.userAccessLevel == 2)||(entity.userAccessLevel == 3) »
		/** XML Specific Setter function for entity «entity.name»
		 *
		 *  This function sets «entity.name»  at the Server
		 *  When class «objectName» is used with a Specific XML file to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *
		 *  @param value			:Value to be set
		 * 
		 *  @return status code
		 *	- ALL_OK
		 *  - DISCONNECTED
		 *  - ERROR_COMMUNICATION
		 */
		virtual OPCUA::StatusCode set«entity.name.toFirstUpper»(const «entity.type.cppType» &value) override;
		
		«ENDIF»
		«ENDFOR»
		«FOR method: methodList»
		/** XML Specific Caller function for method «method.name»
		 *
		 *  This function calls «method.name» at the Server
		 *  When class ConveyorBelt is used with a Specific XML file to connect to
		 *  SeRoNet Servers which implements the device information model.
		 *
		«FOR argIn: method.inputArguments»
			*  @param «argIn.name»			: Input | DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
		«ENDFOR»
		«FOR argIn: method.outputArguments»			
			*  @param «argIn.name»			: Output| DataTypeIdentifier:«argIn.DataTypeIdentifier»(«argIn.DataTypeString()») ValueRank:«argIn.ValueRank» ArrayDimensions:«argIn.ArrayDimensions»			 	
		«ENDFOR»			 	
		 * 
		 *  @return status code
		 *	- ALL_OK
		 *  - DISCONNECTED
		 *  - ERROR_COMMUNICATION
		 */
		 virtual OPCUA::StatusCode call«method.name.toFirstUpper»(«method.cppMethodArgumentsDef») override;
		 
		«ENDFOR»
		
		/// call this method at the end of the main function
		virtual int run() override;
	};
	
	} /* namespace Smart */
	
	#endif /* «objectName.toUpperCase»CONTROLLER_H_ */
	'''
	
	override CharSequence compileSpecificControllerSource(String name, Iterable<SeRoNetENTITY> entityList, Iterable<SeRoNetMETHOD> methodList)
	'''
	«getCopyright()»
	
	#include "«name.specificControllerHeader»"
	
	namespace Smart {
	
	«name.toFirstUpper»Controller::«name.toFirstUpper»Controller(«name.toFirstUpper»View *view)
	:	AbstractController(view)
	,	server(this)
	,	view(view)
	{  }
	
	«name.toFirstUpper»Controller::~«name.toFirstUpper»Controller()
	{  }
	
	void «name.toFirstUpper»Controller::update()
	{
		//FIXME: implement this method
	}
	
	//Getter methods for all OPCUA Variable nodes.
	«FOR entity: entityList»
		OPCUA::StatusCode «name.toFirstUpper»Controller::get«entity.name.toFirstUpper»(«entity.type.cppType» &«entity.name.toFirstLower») const
		{
			// FIXME: implement this method, use: view->getModel()->... to get the most recent model values
			return OPCUA::StatusCode::ERROR_COMMUNICATION;
		}
	«ENDFOR»			
	//Setter methods for OPCUA Entity nodes with write access.
	«FOR entity: entityList»
	«IF (entity.userAccessLevel == 2)||(entity.userAccessLevel == 3) »
		OPCUA::StatusCode «name.toFirstUpper»Controller::set«entity.name.toFirstUpper»(const «entity.type.cppType» &value)
		{
			// FIXME: implement this method, use: view->getModel()->... to change (i.e. to write) model values
			return OPCUA::StatusCode::ERROR_COMMUNICATION;
		}
	«ENDIF»
	«ENDFOR»

	//Access methods for OPCUA Method nodes.
	«FOR method: methodList»
		OPCUA::StatusCode «name.toFirstUpper»Controller::call«method.name.toFirstUpper»(«FOR argIn: method.inputArguments»const «argIn.DataTypeString()» &«argIn.name.toFirstUpper»«IF argIn!=method.inputArguments.last»,«ENDIF»«ENDFOR»«FOR argIn: method.outputArguments»,«argIn.DataTypeString()» &«argIn.name.toFirstUpper»«ENDFOR»)
		{
			// FIXME: implement the logic of this method, use view->getModel()->... to access the most recent model values
			return OPCUA::StatusCode::ERROR_COMMUNICATION;
		}
	«ENDFOR»
	
	int «name.toFirstUpper»Controller::run()
	{
		// this call executes the OPCUA server (until it is killed)
		return server.run();
	}
	
	} /* namespace Smart */
	'''
	
	
	override compileSpecificTestServer(String name) 
	'''
	«getCopyright()»
	
	#include "«name.specificControllerHeader»"
	
	int main(int argc, char*argv[]) {
		Smart::«name.toFirstUpper»DriverModel model;
		Smart::«name.toFirstUpper»View view(&model);
		Smart::«name.toFirstUpper»Controller controller(&view);
		return controller.run();
	}
	'''
	
	override CharSequence compileSpecificCMakeLists(String name)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.5)
	
	PROJECT(«name»ServerTest)
	
	# find Open62541CppWrapper as the main dependency
	FIND_PACKAGE(Open62541CppWrapper 1.0)
	
	# setup default include directoy
	INCLUDE_DIRECTORIES(
		${PROJECT_SOURCE_DIR}
		${PROJECT_SOURCE_DIR}/..
	)
	
	# setup server source files
	SET(SERVER_SRCS
		${PROJECT_SOURCE_DIR}/«name.specificViewSource»
		${PROJECT_SOURCE_DIR}/«name.specificControllerSource»
		${PROJECT_SOURCE_DIR}/«name.opcUaDevice_Server_SourceFileName»
		${PROJECT_SOURCE_DIR}/«name.specificTestServer»
	)
	
	# create server test executable
	ADD_EXECUTABLE(${PROJECT_NAME} ${SERVER_SRCS})
	TARGET_LINK_LIBRARIES(${PROJECT_NAME} Open62541CppWrapper)
	SET_TARGET_PROPERTIES(${PROJECT_NAME} PROPERTIES
	    CXX_STANDARD 14
	)
	'''
}