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

package org.open62541.xml.compiler

import com.google.inject.Inject

class AbstractModelViewControllerImpl implements AbstractModelViewController 
{
	@Inject extension CopyrightHelpers
	
	override String getAbstractModelHeader() { "AbstractModel.hh" }
	override String getAbstractModelSource() { "AbstractModel.cc" }

	override String getAbstractModelObserverHeader() { "AbstractModelObserver.hh" }
	override String getAbstractModelObserverSource() { "AbstractModelObserver.cc" }

	override String getAbstractViewHeader() { "AbstractView.hh" }
	override String getAbstractControllerHeader() { "AbstractController.hh" }
	
	override CharSequence compileAbstractModelHeader()
	'''
	«getCopyright()»
	
	#ifndef ABSTRACTMODEL_H_
	#define ABSTRACTMODEL_H_
	
	#include "«abstractModelObserverHeader»"
	
	#include <mutex>
	#include <set>
	
	namespace Smart {
	
	// forward declaration
	class AbstractModelObserver;
	
	/**
	 * This class implements the abstract version of the Model part of the Model-View-Controller (MVC)
	 * design pattern. Please derive from this class to implement your specific version of the 
	 * model (which can be for example a wrapper around a device driver, or a data-base or any
	 * other data source/sink).
	 */
	class AbstractModel {
	private:
		// observers registry
		std::mutex registry_mutex;
		std::set<AbstractModelObserver*> registry;
	
	protected:
		// this flag indicates that some values have changed
		bool changed_values;
		// call this method (from within the internal thread) each time some values have changed
		void notify();
	
	public:
		AbstractModel();
		virtual ~AbstractModel();
	
		/// this method is used by AbstractModelObserver to get notified about model changes
		void attach(AbstractModelObserver *observer);
		void detach(AbstractModelObserver *observer);
	};
	
	} /* namespace Smart */
	
	#endif /* ABSTRACTMODEL_H_ */
	'''
	override CharSequence compileAbstractModelSource()
	'''
	«getCopyright()»
	
	#include "«abstractModelHeader»"
	
	namespace Smart {
	
	AbstractModel::AbstractModel()
	:	changed_values(false)
	{  }
	
	AbstractModel::~AbstractModel()
	{  }
	
	void AbstractModel::attach(AbstractModelObserver *observer) {
		std::unique_lock<std::mutex> lock(registry_mutex);
		registry.insert(observer);
	}
	
	void AbstractModel::detach(AbstractModelObserver *observer) {
		std::unique_lock<std::mutex> lock(registry_mutex);
		registry.erase(observer);
	}
	
	void AbstractModel::notify() {
		std::unique_lock<std::mutex> lock(registry_mutex);
		auto it = registry.begin();
		for(; it!=registry.end(); it++) {
			(*it)->update();
		}
	}
	
	} /* namespace Smart */
	'''

	override CharSequence compileAbstractModelObserverHeader()
	'''
	«getCopyright()»
	
	#ifndef ABSTRACTMODELOBSERVER_H_
	#define ABSTRACTMODELOBSERVER_H_
	
	#include "«abstractModelHeader»"
	
	namespace Smart {
	
	// forward declaration
	class AbstractModel;
	
	/**
	 * This class defines the abstract base-class for the ModelObserver part
	 * of the Model-View-Controller (MVC) design pattern. From this class,
	 * the View and the Controller classes are derived. The abstract method 
	 * update() must implement the respective update strategy of the derived class.
	 */
	class AbstractModelObserver {
	protected:
		AbstractModel *model;
	
	public:
		/**
		 * Default constructor attaches this class
		 * to the given model (in case the model is not null).
		 */
		AbstractModelObserver(AbstractModel *model=0);
		/**
		 * Default destructor detaches this class from the
		 * internal model (in case the model is not null).
		 */
		virtual ~AbstractModelObserver();
	
		/// implement this method in derived classes
		virtual void update() = 0;
	};
	
	} /* namespace Smart */
	
	#endif /* ABSTRACTMODELOBSERVER_H_ */
	'''
	override CharSequence compileAbstractModelObserverSource()
	'''
	«getCopyright()»
	
	#include "«abstractModelObserverHeader»"
	
	namespace Smart {
	
	AbstractModelObserver::AbstractModelObserver(AbstractModel *model)
	:	model(model)
	{
		if(model != 0) {
			model->attach(this);
		}
	}
	
	AbstractModelObserver::~AbstractModelObserver()
	{
		if(model != 0) {
			model->detach(this);
		}
	}
	
	} /* namespace Smart */
	'''
	
	
	override CharSequence compileAbstractViewHeader()
	'''
	«getCopyright()»
	
	#ifndef ABSTRACTVIEW_HH_
	#define ABSTRACTVIEW_HH_
	
	#include "«abstractModelObserverHeader»"
	
	namespace Smart {
	
	/**
	 * This class implements the View part of the Model-View-Controller (MVC)
	 * design pattern. Please override the method update() in derived classes
	 * to realize your view update strategy. In addition, it is recommended to
	 * override the method getModel() such that it returns your specific model class
	 * rather than the AbstractModel. This is particularly useful for the
	 * Controller class of the MVC pattern.
	 */
	class AbstractView : public AbstractModelObserver
	{
	public:
		/// default constructor
		AbstractView(AbstractModel *model)
		:	AbstractModelObserver(model)
		{  }
	
		/// default destructor
		virtual ~AbstractView()
		{  }
	
		/// implements AbstractModelObserver
		virtual void update() override {
			// default is a no-op
		}
	
		/// returns a pinter to the abstract model (overload this method in derived classes to return the specific model type)
		virtual AbstractModel* getModel() const {
			return model;
		}
	};
	
	} /* namespace Smart */
	
	#endif /* ABSTRACTVIEW_HH_ */
	'''
	
	override CharSequence compileAbstractControllerHeader()
	'''
	«getCopyright()»
	
	#ifndef ABSTRACTCONTROLLER_HH_
	#define ABSTRACTCONTROLLER_HH_
	
	#include "«abstractViewHeader»"
	
	namespace Smart {
	
	/**
	 * This class implements the Controller part of the Model-View-Controller (MVC)
	 * design pattern. The actual model can be internally accessed over the given view pointer.
	 */
	class AbstractController  : public AbstractModelObserver
	{
	public:
		/// default constructor attaches itself as an observer to the model accessed through the given view
		AbstractController(AbstractView *view)
		:	AbstractModelObserver()
		{
			if(view != 0) {
				view->getModel()->attach(this);
				this->model = view->getModel();
			}
		}
	
		/// default destructor
		virtual ~AbstractController()
		{  }
	
		/// call this method at the end of the main function
		virtual int run() = 0;
	};
	
	} /* namespace Smart */
	
	#endif /* ABSTRACTCONTROLLER_HH_ */
	'''
}