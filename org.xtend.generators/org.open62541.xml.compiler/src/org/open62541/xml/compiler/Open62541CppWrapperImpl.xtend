//--------------------------------------------------------------------------
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
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.open62541.xml.compiler

import com.google.inject.Inject

class Open62541CppWrapperImpl implements Open62541CppWrapper {
	@Inject extension CopyrightHelpers
	@Inject extension Open62541GenericClientImpl
	@Inject extension Open62541GenericServerImpl
	@Inject extension AbstractModelViewControllerImpl
	
	override getOpcUaStatusCodeHeaderFileName() {"OpcUaStatusCode.hh"}
	
	override getOpcUaValueTypeHeaderFileName() {"OpcUaValueType.hh"}
	override getOpcUaValueTypeSourceFileName() {"OpcUaValueType.cc"}

	override getOpcUaNodeIdHeaderFileName() {"OpcUaNodeId.hh"}
	override getOpcUaNodeIdSourceFileName() {"OpcUaNodeId.cc"}	

	///////////////////////////
	// Header file of StatusCode
	///////////////////////////
	override compileOpcUaStatusCodeHeaderFileContent()
	'''
	«getCopyright()»
	
	#ifndef OPCUASTATUSCODE_H_
	#define OPCUASTATUSCODE_H_
	
	#include <iostream>
	
	namespace OPCUA {
	
	/** Enumeration class encoding result codes
	 *
	 * This C++11 enumeration class encodes generic result codes
	 * (i.e. codes returned by C++ getter/setter and method calls to indicate
	 *  the status of the internally implemented communication infrastructure).
	 */
	enum class StatusCode {
		/// Undefined (i.e. constructor) value
		UNDEFINED,
		/// Operation completed successfully
		ALL_OK,
		/// Connected status
		CONNECTED,
		/// Disconnected status
		DISCONNECTED,
		/// Element name (i.e. variable/method name) not found
		WRONG_ID,
		/// no new data is available (yet)
		NO_NEW_DATA,
		/// ???
		METHOD_BAD_CALL,
		/// number of used input arguments missmatch
		METHOD_INPUT_ARGUMENT_COUNT_MISMATCH,
		//METHOD_INPUT_ARGUMENT_TYPE_MISMATCH,
		//METHOD_OUTPUT_ARGUMENT_COUNT_MISMATCH,
		//METHOD_OUTPUT_ARGUMENT_TYPE_MISMATCH,
	
		/// communication error
		ERROR_COMMUNICATION
	};
	
	/** ostream operator for StatusCode
	 *
	 * This operator prints a string representation of the StatusCode to ostream.
	 *
	 */
	inline std::ostream& operator << (std::ostream& os, const StatusCode& status)
	{
		switch(status) {
			case StatusCode::ALL_OK: os << "ALL_OK"; break;
			case StatusCode::CONNECTED: os << "CONNECTED";  break;
			case StatusCode::DISCONNECTED: os << "DISCONNECTED"; break;
			case StatusCode::WRONG_ID: os << "WRONG_ID";  break;
			case StatusCode::NO_NEW_DATA: os << "NO_NEW_DATA";  break;
			case StatusCode::METHOD_BAD_CALL: os << "METHOD_BAD_CALL";  break;
			case StatusCode::METHOD_INPUT_ARGUMENT_COUNT_MISMATCH: os << "METHOD_INPUT_ARGUMENT_COUNT_MISMATCH";  break;
			case StatusCode::ERROR_COMMUNICATION: os << "ERROR_COMMUNICATION";  break;
			default: os << "UNDEFINED";
		}
		return os;
	}
	
	} /* namespace OPCUA */
	
	#endif // OPCUASTATUSCODE_H_
	'''
	
	///////////////////////////
	// Header file of ValueType
	///////////////////////////
	override compileOpcUaValueTypeHeaderFileContent() 
	'''
		«getCopyright()»
		
		#ifndef OPCUA_VALUETYPET_HH_
		#define OPCUA_VALUETYPET_HH_
		
		#include <string>
		#include <vector>
		
		#ifdef HAS_OPCUA
		#include <open62541.h>
		#else
		#include <sstream>
		#endif
		
		namespace OPCUA {
		
		class ValueType
		{
		public:
		#ifdef HAS_OPCUA
			typedef UA_Variant NativeVariantType;
		#else
			typedef std::stringstream NativeVariantType;
		#endif
		private:
			NativeVariantType _value;
		
		protected:
			/// deep-copy the value into internal structure
			template <typename T>
			void copy(const T &var, const bool &cleanupPreviousValue=true);
		
			/// copy an array of values into the internal structure
			template <typename T>
			void copy(const std::vector<T> &var, const bool &cleanupPreviousValue=true);
		
		public:
			/// default constructor
			ValueType();
		
			/// object copy constructor
			ValueType(const ValueType &value);
		
			/// internal value pointer-type copy constructor
			ValueType(const NativeVariantType *value);
		
			/// reference-type copy constructor
			template <typename T>
			ValueType(const T &value) {
				this->copy(value, false);
			}
		
			/// array-type copy constructor
			template <typename T>
			ValueType(const std::vector<T> &value) {
				this->copy(value, false);
			}
		
			/// default destructor
			virtual ~ValueType();
		
			/// check whether the current internal representation is an array or a scalar type
			bool isArrayType() const;
		
			/// checks whether the internal value has been setup to any actual value
			bool isEmpty() const;
		
			/// method checks if the internal value is an integer type
			bool isIntegerType() const;
			/// method checks if the internal value is a boolean type
			bool isBooleanType() const;
			/// method checks if the internal value is a double (i.e. floating) type
			bool isDoubleType() const;
			/// method checks if the internal value is a string type
			bool isStringType() const;
		
			/// object-type copy assigned operator (overrides and frees previous internal value)
			ValueType& operator=(const ValueType &value);
		
			/// internal value pointer-type assignment copy operator
			ValueType& operator=(const NativeVariantType *value);
		
			// reference-type assignment operator
			template <typename T>
			ValueType& operator=(const T &value) {
				// use the specific copy methods to create an internal value copy
				this->copy(value);
				return *this;
			}
		
			/// array-type assignment operator
			template <typename T>
			ValueType& operator=(const std::vector<T> &value) {
				// use the specific copy methods to create an internal value copy
				this->copy(value);
				return *this;
			}
		
			/// type-specific conversion operator
			template <typename T>
			operator T() const;
		
			/// explicit conversion operator for a C string (use "static_cast<const char*>(this-object)" to select this operator)
			explicit operator const char*() const;
		
			/// type-specific conversion operator for array types
			template <typename T>
			operator std::vector<T>() const;
		
			/// direct const (i.e. read-only) access to internal representation (no copy)
			inline operator const NativeVariantType*() const
			{
				return &_value;
			}
		
			/// to string conversion
			std::string toString() const;
		};
		
		/// ostream operator
		inline std::ostream& operator << (std::ostream& os, const ValueType& vt)
		{
			os << vt.toString();
			return os;
		}
		
		} /* namespace OPCUA */
		
		#endif /* OPCUA_VALUETYPET_HH_ */
	'''
	
	///////////////////////////
	// Source file of ValueType
	///////////////////////////
	override compileOpcUaValueTypeSourceFileContent() 
	'''
		«getCopyright()»
		
		#include "«getOpcUaValueTypeHeaderFileName()»"
		#include <sstream>
		
		namespace OPCUA {
		
		// NativeVariantType value copy
		template <>
		void ValueType::copy(const NativeVariantType &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
			// deep-copy UA variant value
			UA_Variant_copy(&var, &_value);
		#else
			_value = var;
		#endif
		}
		
		// default constructor
		ValueType::ValueType()
		{
		#ifdef HAS_OPCUA
			UA_Variant_init(&_value);
		#else
			_value = std::stringstream(); // clear the stringstream
		#endif
		}
		
		// default destructor
		ValueType::~ValueType()
		{
		#ifdef HAS_OPCUA
			UA_Variant_deleteMembers(&_value);
		#endif
		}
		
		ValueType::ValueType(const ValueType &value)
		{
			copy(value._value, false);
		}
		
		/// internal value pointer-type copy constructor
		ValueType::ValueType(const NativeVariantType *value)
		{
			this->copy(*value, false);
		}
		
		ValueType& ValueType::operator=(const ValueType &value)
		{
			this->copy(value._value);
			return *this;
		}
		
		/// internal value pointer-type assignment copy operator
		ValueType& ValueType::operator=(const NativeVariantType *value)
		{
			this->copy(*value);
			return *this;
		}
		
		bool ValueType::isEmpty() const
		{
		#ifdef HAS_OPCUA
			return UA_Variant_isEmpty(&_value);
		#else
			return _value.str().empty();
		#endif
		}
		
		bool ValueType::isArrayType() const
		{
			if(isEmpty()) {
				return false;
			}
		#ifdef HAS_OPCUA
			return ! UA_Variant_isScalar(&_value);
		#else
			return false;
		#endif
		}
		
		
		/// method checks if the internal value is an integer type
		bool ValueType::isIntegerType() const
		{
			if(isEmpty()) {
				return false;
			}
		#ifdef HAS_OPCUA
			return (_value.type == &UA_TYPES[UA_TYPES_INT32]);
		#else
			return false;
		#endif
		}
		/// method checks if the internal value is a boolean type
		bool ValueType::isBooleanType() const
		{
			if(isEmpty()) {
				return false;
			}
		#ifdef HAS_OPCUA
			return (_value.type == &UA_TYPES[UA_TYPES_BOOLEAN]);
		#else
			return false;
		#endif
		}
		/// method checks if the internal value is a floating type
		bool ValueType::isDoubleType() const
		{
			if(isEmpty()) {
				return false;
			}
		#ifdef HAS_OPCUA
			return (_value.type == &UA_TYPES[UA_TYPES_DOUBLE]);
		#else
			return false;
		#endif
		}
		/// method checks if the internal value is a string type
		bool ValueType::isStringType() const
		{
			if(isEmpty()) {
				return false;
			}
		#ifdef HAS_OPCUA
			return (_value.type == &UA_TYPES[UA_TYPES_STRING]);
		#else
			return false;
		#endif
		}
		
		/**
		 * Specialization of the copy template method for the C++ primitive types
		 */
		
		template <>
		void ValueType::copy(const int &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
			UA_Variant_setScalarCopy(&_value, &var, &UA_TYPES[UA_TYPES_INT32]);
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			_value << *var;
		#endif
		}
		
		template <>
		void ValueType::copy(const bool &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
			UA_Variant_setScalarCopy(&_value, &var, &UA_TYPES[UA_TYPES_BOOLEAN]);
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			_value << *var;
		#endif
		}
		
		template <>
		void ValueType::copy(const double &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
			UA_Variant_setScalarCopy(&_value, &var, &UA_TYPES[UA_TYPES_DOUBLE]);
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			_value << *var;
		#endif
		}
		
		template <>
		void ValueType::copy(const std::string &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
			// copy string
			UA_String ua_s;
			ua_s.length = var.length();
			ua_s.data = (UA_Byte*)var.c_str();
			// set string variant
			UA_Variant_setScalarCopy(&_value, &ua_s, &UA_TYPES[UA_TYPES_STRING]);
		#else
			v.str(*var); // overwrite internal string
		#endif
		}
		
		template <>
		void ValueType::copy(const std::vector<int> &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
		
			// deep-copy the array values
			UA_Variant_setArrayCopy(&_value, var.data(), var.size(), &UA_TYPES[UA_TYPES_INT32]);
		
			// one-dimension size
			_value.arrayDimensionsSize = 1;
			// set array dimension
			_value.arrayLength = var.size();
			// set the single array dimension-size
			_value.arrayDimensions = UA_UInt32_new();
			_value.arrayDimensions[0] = var.size();
		
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			for(auto it=var->begin(); it != var->end(); it++) {
				_value << *it << " ";
			}
		#endif
		}
		template <>
		void ValueType::copy(const std::vector<bool> &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
		
			// create a copy of the boolean array values
			UA_Boolean uaBoolArray[var.size()];
			for(size_t i=0; i<var.size(); ++i) {
				uaBoolArray[i] = var[i];
			}
		
			// deep-copy the array values
			UA_Variant_setArrayCopy(&_value, uaBoolArray, var.size(), &UA_TYPES[UA_TYPES_BOOLEAN]);
		
			// one-dimension size
			_value.arrayDimensionsSize = 1;
			// set array dimension
			_value.arrayLength = var.size();
			// set the single array dimension-size
			_value.arrayDimensions = UA_UInt32_new();
			_value.arrayDimensions[0] = var.size();
		
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			for(auto it=var->begin(); it != var->end(); it++) {
				_value << *it << " ";
			}
		#endif
		}
		template <>
		void ValueType::copy(const std::vector<double> &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
		
			// deep-copy the array values
			UA_Variant_setArrayCopy(&_value, var.data(), var.size(), &UA_TYPES[UA_TYPES_DOUBLE]);
		
			// one-dimension size
			_value.arrayDimensionsSize = 1;
			// set array dimension
			_value.arrayLength = var.size();
			// set the single array dimension-size
			_value.arrayDimensions = UA_UInt32_new();
			_value.arrayDimensions[0] = var.size();
		
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			for(auto it=var->begin(); it != var->end(); it++) {
				_value << *it << " ";
			}
		#endif
		}
		template <>
		void ValueType::copy(const std::vector<std::string> &var, const bool &cleanupPreviousValue)
		{
		#ifdef HAS_OPCUA
			if(cleanupPreviousValue) {
				UA_Variant_deleteMembers(&_value);
			}
			UA_Variant_init(&_value);
		
			// shallow-copy the strings into a local array
			UA_String ua_arr[var.size()];
			for(size_t i=0; i<var.size(); ++i) {
				ua_arr[i].length = var[i].length();
				ua_arr[i].data = (UA_Byte*)var[i].c_str();
			}
		
			// deep-copy the array values
			UA_Variant_setArrayCopy(&_value, ua_arr, var.size(), &UA_TYPES[UA_TYPES_STRING]);
		
			// one-dimension size
			_value.arrayDimensionsSize = 1;
			// set array dimension
			_value.arrayLength = var.size();
			// set the single array dimension-size
			_value.arrayDimensions = UA_UInt32_new();
			_value.arrayDimensions[0] = var.size();
		
		#else
			if(cleanupPreviousValue) {
				_value = std::stringstream(); // clear the stringstream
			}
			for(auto it=var->begin(); it != var->end(); it++) {
				_value << *it << " ";
			}
		#endif
		}
		
		/**
		 * Specialization of the conversion operator template method for the C++ primitive types
		 */
		
		template <>
		ValueType::operator int() const {
			if(isArrayType() || isEmpty()) {
				return 0;
			}
		
			#ifdef HAS_OPCUA
			if(isIntegerType()) {
				return *(static_cast<UA_Int32*>(_value.data));;
			}
			#else
			if(_value.good()) {
				return std::stoi(_value.str());
			}
			#endif
			return 0;
		}
		
		template <>
		ValueType::operator bool() const {
			if(isArrayType() || isEmpty()) {
				return false;
			}
		
			#ifdef HAS_OPCUA
			if(isBooleanType()) {
				return *(static_cast<UA_Boolean*>(_value.data));;
			}
			#else
			bool result;
			std::istringstream iss(_value.str());
			iss >> std::boolalpha >> result;
			if(iss.good()) {
				return result;
			}
			#endif
			return 0;
		}
		
		template <>
		ValueType::operator double() const {
			if(isArrayType() || isEmpty()) {
				return 0.0;
			}
		
			#ifdef HAS_OPCUA
			if(isDoubleType()) {
				return *(static_cast<UA_Double*>(_value.data));;
			}
			#else
			if(_value.good()) {
				return std::stod(_value.str());
			}
			#endif
			return 0.0;
		}
		
		template <>
		ValueType::operator std::string() const {
			if(isArrayType() || isEmpty()) {
				return std::string();
			}
		
			#ifdef HAS_OPCUA
			if(isStringType()) {
				UA_String *temp = (UA_String*)_value.data;
				std::string str((const char*)temp->data, temp->length);
				return str;
			}
			return std::string();
			#else
			return v.str();
			#endif
		}
		//template <>
		ValueType::operator const char*() const {
			if(isArrayType() || isEmpty()) {
				return 0;
			}
		
			#ifdef HAS_OPCUA
			if(isStringType()) {
				UA_String *temp = (UA_String*)_value.data;
				std::string str((const char*)temp->data, temp->length);
				return str.c_str();
			}
			return 0;
			#else
			return v.str().c_str();
			#endif
		}
		
		template <>
		ValueType::operator ValueType::NativeVariantType() const {
		#ifdef HAS_OPCUA
			UA_Variant v_out;
			UA_Variant_init(&v_out);
			UA_Variant_copy(&_value, &v_out);
			return v_out;
		#else
			return _value;
		#endif
		}
		
		template <>
		ValueType::operator std::vector<int>() const
		{
			std::vector<int> result;
			if(!isArrayType() || isEmpty()) {
				return result;
			}
		
		#ifdef HAS_OPCUA
			if(isIntegerType()) {
				UA_Int32 *uaArray = (UA_Int32*)_value.data;
				for(size_t i=0; i<_value.arrayLength; ++i) {
					result.push_back( uaArray[i] );
				}
			}
		#else
			if(_value.good()) {
		//		return std::stoi(_value.str());
			}
		#endif
			return result;
		}
		
		template <>
		ValueType::operator std::vector<bool>() const
		{
			std::vector<bool> result;
			if(!isArrayType() || isEmpty()) {
				return result;
			}
		
		#ifdef HAS_OPCUA
			if(isBooleanType()) {
				UA_Boolean *uaArray = (UA_Boolean*)_value.data;
				for(size_t i=0; i<_value.arrayLength; ++i) {
					result.push_back( uaArray[i] );
				}
			}
		#else
			if(_value.good()) {
		//		return std::stoi(_value.str());
			}
		#endif
			return result;
		}
		
		template <>
		ValueType::operator std::vector<double>() const
		{
			std::vector<double> result;
			if(!isArrayType() || isEmpty()) {
				return result;
			}
		
		#ifdef HAS_OPCUA
			if(isDoubleType()) {
				UA_Double *uaArray = (UA_Double*)_value.data;
				for(size_t i=0; i<_value.arrayLength; ++i) {
					result.push_back( uaArray[i] );
				}
			}
		#else
			if(_value.good()) {
		//		return std::stoi(_value.str());
			}
		#endif
			return result;
		}
		
		template <>
		ValueType::operator std::vector<std::string>() const
		{
			std::vector<std::string> result;
			if(!isArrayType() || isEmpty()) {
				return result;
			}
		
		#ifdef HAS_OPCUA
			if(isStringType()) {
				UA_String *uaArray = (UA_String*)_value.data;
				for(size_t i=0; i<_value.arrayLength; ++i) {
					std::string str( (const char*)uaArray[i].data, uaArray[i].length);
					result.push_back( str );
				}
			}
		#else
			if(_value.good()) {
		//		return std::stoi(_value.str());
			}
		#endif
			return result;
		}
		
		/**
		 * To-string conversion method
		 */
		std::string ValueType::toString() const {
		#ifdef HAS_OPCUA
			std::stringstream s;
		
			if(isIntegerType()) {
				int d = *this;
				s << d;
			} else if(isBooleanType()) {
				bool b = *this;
				s << b;
			} else if(isDoubleType()) {
				double d = *this;
				s << d;
			} else if(isStringType()) {
				std::string str = *this;
				s << str;
			}
		
			return s.str();
		#else
			return _value.str();
		#endif
		}
		
		} /* namespace OPCUA */
	'''
	
	override CharSequence compileOpcUaNodeIdHeaderFileContent()
	'''
	«getCopyright()»
	
	#ifndef OPCUANODEID_HH_
	#define OPCUANODEID_HH_
	
	#ifdef HAS_OPCUA
	#include <open62541.h>
	#endif
	
	#include <string>
	
	namespace OPCUA {
	
	class NodeId {
	public:
	#ifdef HAS_OPCUA
		typedef UA_NodeId NativeIdType;
	#else
		typedef std::string NativeIdType;
	#endif
	private:
		/// the internal (native) id value
		NativeIdType _id;
	
	protected:
		/// method copies the native id value into the NodeId's member variable
		void copy(const NativeIdType &id, const bool cleanupPreviousId=true);
	
	public:
		/// default constructor creates a null id
		NodeId();
	
		/// string-based node-id constructor
		NodeId(const std::string &id, const unsigned short &index=1);
	
		/// numeric node-id constructor
		NodeId(const unsigned int &id, const unsigned short &index=1);
	
		/// copy constructor
		NodeId(const NodeId &id) {
			copy(id._id, false);
		}
	
		/// copy constructor for the native ID type
		NodeId(const NativeIdType &id) {
			copy(id, false);
		}
	
		/// default destructor
		virtual ~NodeId();
	
		/// object-type copy assigned operator (overrides and frees previous internal value)
		inline NodeId& operator=(const NodeId &id) {
			this->copy(id._id);
			return *this;
		}
	
		/// internal value pointer-type assignment copy operator
		inline NodeId& operator=(const NativeIdType &id) {
			this->copy(id);
			return *this;
		}
	
		/// native const access
		operator const NativeIdType*() const;
	
		/// native id conversion operator (makes a copy of the internal id)
		operator NativeIdType() const;
	
		/// comparison operator: equality
		bool operator ==(const NodeId &id) const;
		/// comparison operator: smaller than right hand side
		bool operator <(const NodeId &id) const;
	
		/// checks if the id has been set to a value or is empty
		bool isNull() const;
	
		/// returns true if ID is a numeric type
		bool isNumericType() const;
	
		/// returns true if ID is a numeric type
		bool isStringType() const;
	
		/// returns a string representation of the ID without the namespace index
		std::string getSimpleName() const;
	};
	
	} /* namespace OPCUA */
	
	#endif /* OPCUANODEID_HH_ */
	'''
	
	override CharSequence compileOpcUaNodeIdSourceFileContent()
	'''
	«getCopyright()»
	
	#include "«opcUaNodeIdHeaderFileName»"
	
	#include <sstream>
	
	namespace OPCUA {
	
	NodeId::NodeId()
	{
	#ifdef HAS_OPCUA
		UA_NodeId_init(&_id);
		_id= UA_NODEID_NULL;
	#endif
	}
	
	NodeId::~NodeId()
	{
	#ifdef HAS_OPCUA
		UA_NodeId_deleteMembers(&_id);
	#endif
	}
	
	
	NodeId::NodeId(const std::string &id, const unsigned short &index)
	{
	#ifdef HAS_OPCUA
		_id = UA_NODEID_STRING_ALLOC(index, id.c_str());
	#endif
	}
	
	NodeId::NodeId(const unsigned int &id, const unsigned short &index)
	{
	#ifdef HAS_OPCUA
		_id = UA_NODEID_NUMERIC(index, id);
	#endif
	}
	
	
	void NodeId::copy(const NativeIdType &id, const bool cleanupPreviousId)
	{
	#ifdef HAS_OPCUA
		if(cleanupPreviousId == true) {
			UA_NodeId_deleteMembers(&_id);
		}
		UA_NodeId_copy(&id, &_id);
	#endif
	}
	
	NodeId::operator const NodeId::NativeIdType*() const
	{
		return &_id;
	}
	
	NodeId::operator NodeId::NativeIdType() const
	{
	#ifdef HAS_OPCUA
		UA_NodeId id;
		UA_NodeId_copy(&_id, &id);
		return id;
	#else
		return_id;
	#endif
	}
	
	bool NodeId::operator ==(const NodeId &id) const
	{
	#ifdef HAS_OPCUA
		return UA_NodeId_equal(&_id, &id._id);
	#else
		return _id == id._id;
	#endif
	}
	
	bool NodeId::operator <(const NodeId &id) const
	{
	#ifdef HAS_OPCUA
		return (_id.identifier.numeric < id._id.identifier.numeric);
	#else
		return _id < id._id;
	#endif
	}
	
	bool NodeId::isNull() const
	{
	#ifdef HAS_OPCUA
		return UA_NodeId_isNull(&_id);
	#else
		return _id.empty();
	#endif
	}
	
	/// returns true if ID is a numeric type
	bool NodeId::isNumericType() const
	{
	#ifdef HAS_OPCUA
		return (_id.identifierType == UA_NODEIDTYPE_NUMERIC);
	#else
		return false;
	#endif
	}
	
	/// returns true if ID is a numeric type
	bool NodeId::isStringType() const
	{
	#ifdef HAS_OPCUA
		return (_id.identifierType == UA_NODEIDTYPE_STRING);
	#else
		return true;
	#endif
	}
	
	
	std::string NodeId::getSimpleName() const
	{
	#ifdef HAS_OPCUA
		if(isStringType()==true) {
			return std::string((const char*)_id.identifier.string.data, _id.identifier.string.length);
		} else if(isNumericType()) {
			std::stringstream ss;
			ss << _id.identifier.numeric;
			return ss.str();
		}
		return std::string();
	#else
		return _id;
	#endif
	}
	
	} /* namespace OPCUA */
	'''
	
	override CharSequence compileOpen62541WrapperLibCmake(String libName)
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	PROJECT(«libName» VERSION 0.8)
	
	# find open62541 as the main dependency
	FIND_PACKAGE(open62541 PATHS /usr/local/lib/cmake)
	
	# collect header files
	FILE(GLOB HDRS ${PROJECT_SOURCE_DIR}/*.hh)
	
	# setup server source files
	SET(LIB_SRCS
		${PROJECT_SOURCE_DIR}/MVC/«abstractModelSource»
		${PROJECT_SOURCE_DIR}/MVC/«abstractModelObserverSource»
		${PROJECT_SOURCE_DIR}/«opcUaValueTypeSourceFileName»
		${PROJECT_SOURCE_DIR}/«opcUaNodeIdSourceFileName»
		${PROJECT_SOURCE_DIR}/«opcUa_GenericClient_SourceFileName»
		${PROJECT_SOURCE_DIR}/«opcUa_GenericServer_SourceFileName»
	)
	
	# create server test executable
	ADD_LIBRARY(${PROJECT_NAME} SHARED ${LIB_SRCS})
	
	set_property(TARGET ${PROJECT_NAME} PROPERTY VERSION ${PROJECT_VERSION})
	set_property(TARGET ${PROJECT_NAME} PROPERTY SOVERSION ${PROJECT_VERSION_MAJOR})
	
	# define include paths for the target
	TARGET_INCLUDE_DIRECTORIES(${PROJECT_NAME} INTERFACE
	  $<BUILD_INTERFACE:${PROJECT_SOURCE_DIR}>
	  $<INSTALL_INTERFACE:include/${PROJECT_NAME}>  # <prefix>/include/open62541CppWrapper
	)
	
	# add open62541 as library dependency and set further target properties
	TARGET_LINK_LIBRARIES(${PROJECT_NAME} open62541)
	SET_TARGET_PROPERTIES(${PROJECT_NAME} PROPERTIES
	    CXX_STANDARD 11
	)
	TARGET_COMPILE_DEFINITIONS(${PROJECT_NAME} PUBLIC HAS_OPCUA)
	
	# set the export-name used in the ${PROJECT_NAME}Config.cmake.in and for exporting and installing the target
	SET(EXPORT_NAME ${PROJECT_NAME}Target)
	
	# generate CMake package-config file
	CONFIGURE_FILE(
	  ${PROJECT_SOURCE_DIR}/${PROJECT_NAME}Config.cmake.in
	  ${PROJECT_BINARY_DIR}/${PROJECT_NAME}Config.cmake
	  @ONLY
	)
	
	# generate ConfigVersion file
	INCLUDE(CMakePackageConfigHelpers)
	write_basic_package_version_file(
	  "${PROJECT_BINARY_DIR}/${PROJECT_NAME}ConfigVersion.cmake"
	  COMPATIBILITY AnyNewerVersion
	)
	
	# install library and target-exports
	INSTALL(FILES ${HDRS} DESTINATION include/${PROJECT_NAME})
	INSTALL(DIRECTORY ${PROJECT_SOURCE_DIR}/MVC DESTINATION include/${PROJECT_NAME})
	# install target and package-config files
	INSTALL(TARGETS ${PROJECT_NAME} EXPORT ${EXPORT_NAME} LIBRARY DESTINATION lib)
	INSTALL(EXPORT ${EXPORT_NAME} DESTINATION modules)
	INSTALL(FILES ${PROJECT_BINARY_DIR}/${PROJECT_NAME}Config.cmake DESTINATION modules)
	INSTALL(FILES "${PROJECT_BINARY_DIR}/${PROJECT_NAME}ConfigVersion.cmake" DESTINATION modules)
	'''
	
	override CharSequence compileOpen62541WrapperLibCmakeConfig()
	'''
	CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
	
	INCLUDE("${CMAKE_CURRENT_LIST_DIR}/@EXPORT_NAME@.cmake")
	'''
}