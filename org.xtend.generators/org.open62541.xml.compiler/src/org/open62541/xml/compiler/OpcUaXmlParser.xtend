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

import java.util.Collection
import java.util.ArrayList
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element
import java.io.File

class OpcUaXmlParser {
	static class SeRoNetNodeId{
		public int ns = 1001; //Name Space Index
		public int i = 1;  //Node Id			
	}
	
	static class SeRoNetENTITY {
		public String name;
		public String commObjectCall;
		public String type;
		public int userAccessLevel;
		public SeRoNetNodeId nodeid;
		public SeRoNetNodeId Parent_nodeid;		 
		public Collection<SeRoNetNodeId> Children_nodeid = new ArrayList<SeRoNetNodeId>();
		def UAuserAccessLevel() 
		{
			switch(userAccessLevel) {
				case  1: "UA_ACCESSLEVELMASK_READ"
				case  2: "UA_ACCESSLEVELMASK_WRITE"			
				case  3: "UA_ACCESSLEVELMASK_READ | UA_ACCESSLEVELMASK_WRITE"
			}
		}
		def UADataTypeIdentifierString() 
		{
			switch(type) {
				case  "Boolean": "UA_Boolean"
				case  "Int32" : "UA_Int32"			
				case  "Double" : "UA_Double"
				case  "String" : "UA_String"			
			}
		}
		def UADataTypeDefaultValues() 
		{
			switch(type) {
				case  "Boolean": "false"
				case  "Int32" : "0"			
				case  "Double" : "0.0"
				case  "String" : "UA_LOCALIZEDTEXT_ALLOC(\"NA\")"			
			}
		}
		def DataTypeIdentifierString() 
		{
			switch(type) {
				case  "Boolean": "UA_TYPES_BOOLEAN"
				case  "Int32" : "UA_TYPES_INT32"			
				case  "Double" : "UA_TYPES_DOUBLE"
				case  "String" : "UA_TYPES_STRING"			
			}
		}
		
		def DataTypeString() 
		{
			switch(type) {
				case  "Boolean": "bool"
				case  "Int32" : "int"			
				case  "Double" : "double"
				case  "String" : "std::string"			
			}
		}
		
		public static int UA_ACCESSLEVELMASK_READ           = (0x01<<0)
		public static int UA_ACCESSLEVELMASK_WRITE          = (0x01<<1)
		public static int UA_ACCESSLEVELMASK_HISTORYREAD    = (0x01<<2)
		public static int UA_ACCESSLEVELMASK_HISTORYWRITE   = (0x01<<3)
		public static int UA_ACCESSLEVELMASK_SEMANTICCHANGE = (0x01<<4)
		public static int UA_ACCESSLEVELMASK_STATUSWRITE    = (0x01<<5)
		public static int UA_ACCESSLEVELMASK_TIMESTAMPWRITE = (0x01<<6) 
		
		def Display()
		{
			print("("+Parent_nodeid.ns+", "+Parent_nodeid.i+")-->("+nodeid.ns+", "+nodeid.i+") ENTITY:   Name:"+name+"  DataType:"+DataTypeString()
				+"  UserAccessLevel:"+userAccessLevel+"  Children_nodeids:||");
			for(ch:Children_nodeid)
			{
				print(ch.ns+", "+ch.i+"||");
			}
			println("");
		}
	}

	static class SeRoNetARGUMENT {
		public String name;
		public int DataTypeIdentifier;
// Refer for future implementations https://github.com/OPCFoundation/UA-Nodeset.git
// https://github.com/OPCFoundation/UA-Nodeset/blob/master/Schema/Opc.Ua.NodeSet2.xml
// You may also read these values from ObjectsFolder/Types/DataTypes/BaseDataTypes on Prosys OPC UA CLient 
		public static int UA_TYPES_BOOLEAN		=	1;
		public static int UA_TYPES_INT32		=	6;
		public static int UA_TYPES_DOUBLE		=	11;
		public static int UA_TYPES_STRING		=	12;

		def UADataTypeIdentifierString() 
		{
			switch(DataTypeIdentifier) {
				case   1: "UA_Boolean"
				case   6: "UA_Int32"			
				case  11: "UA_Double"
				case  12: "UA_String"			
			}
		}
		def UADataTypeDefaultValues() 
		{
			switch(DataTypeIdentifier) {
				case   1: "false"
				case   6: "0"			
				case  11: "0.0"
				case  12: "std::string()"			
			}
		}
		def DataTypeIdentifierString() 
		{
			switch(DataTypeIdentifier) {
				case   1: "UA_TYPES_BOOLEAN"
				case   6: "UA_TYPES_INT32"			
				case  11: "UA_TYPES_DOUBLE"
				case  12: "UA_TYPES_STRING"			
			}
		}		
		def DataTypeString() 
		{
			switch(DataTypeIdentifier) {
			case  1: "bool"
			case  6: "int"			
			case 11: "double"
			case 12: "std::string"			
			}
		}
				
		public int ValueRank;	
		public int ArrayDimensions;
		public SeRoNetNodeId nodeid;
		public SeRoNetNodeId Parent_nodeid;		 
		def Display()
		{
			println("("+Parent_nodeid.ns+", "+Parent_nodeid.i+")-->("+nodeid.ns+", "+nodeid.i+") ARGUMENT: "+DataTypeString()+" "+name+" DataTypeIdentifier:"+DataTypeIdentifier
				+" ValueRank:"+ValueRank+" ArrayDimensions:"+ArrayDimensions);
		}				 
	}	
	
	static class SeRoNetMETHOD {
		public String name;
		public SeRoNetNodeId nodeid;
		public SeRoNetNodeId Parent_nodeid;		 
		public Collection<SeRoNetNodeId> Children_nodeid = new ArrayList<SeRoNetNodeId>();		
		public Collection<SeRoNetARGUMENT> inputArguments = new ArrayList<SeRoNetARGUMENT>();
		public Collection<SeRoNetARGUMENT> outputArguments = new ArrayList<SeRoNetARGUMENT>();
		def DisplaySmall()
		{
			print("("+Parent_nodeid.ns+", "+Parent_nodeid.i+")-->("+nodeid.ns+", "+nodeid.i+") METHOD: [");
		 	for(elem: inputArguments)
				print("   "+elem.DataTypeString()+" "+elem.name);
			print("    ] = "+name+" (");
			for(elem: outputArguments)
				print("   "+elem.DataTypeString()+" "+elem.name);
			print("    )");
			println(" NodeId:"+nodeid.ns+", "+nodeid.i+"  Parent_NodeId:"+Parent_nodeid.ns+", "+Parent_nodeid.i);
		}
		def Display()
		{
			print("("+Parent_nodeid.ns+", "+Parent_nodeid.i+")-->("+nodeid.ns+", "+nodeid.i+") METHOD: [");
		 	for(elem: outputArguments)
				print("   "+elem.DataTypeString()+" "+elem.name);
			print("    ] = "+name+" (");
			for(elem: inputArguments)
				print("   "+elem.DataTypeString()+" "+elem.name);
			print("    )  -->"+"  Children_nodeids:||");
			for(ch:Children_nodeid)
			{
				print(ch.ns+", "+ch.i+"||");
			}
			println("");
			for(elem: inputArguments)
			{
				print("        IN--");	elem.Display();
			}
			for(elem: outputArguments)
			{
				print("       OUT--");	elem.Display();
			}			
		}				
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	def SeRoNetNodeId getNodeIdFromString(String StartString) {
		val SeRoNetNodeId nid = new SeRoNetNodeId;
		nid.ns = Integer.parseInt(StartString.substring(StartString.indexOf("=")+1,StartString.indexOf(";")));
		var StartString2 = StartString.substring(StartString.indexOf("i"),StartString.length());
		nid.i  = Integer.parseInt(StartString2.substring(StartString2.indexOf("=")+1,StartString2.length()));
		return nid;
	}
//	def Iterable<SeRoNetENTITY> entityListReadServer(OpcUaDeviceClient client, Iterable<SeRoNetENTITY> entities) {
//		var entityListReadServer = entities;		
//		for (en:entityListReadServer)
//			en.userAccessLevel = 1;
//		return entityListReadServer;
//	}
	def String getObjectName(File xmlFile) {
		var verbose = true
		var objectName = "NotFound"
		if(xmlFile.exists) {
			val dbFactory = DocumentBuilderFactory.newInstance();
			val dBuilder = dbFactory.newDocumentBuilder();
			val doc = dBuilder.parse(xmlFile)
			doc.documentElement.normalize();
			
						val nl =doc.getDocumentElement().getChildNodes();
		    for (var i=0; i < nl.getLength(); i++) 
		    {
				val uel=nl.item(i);
				if (uel instanceof Element) 
				{
					val el = uel;
					val nodeName=el.getNodeName();
//					val EntityNodeId=el.getAttribute("NodeId");
					if(nodeName == "UAObjectType")	
					{			        	
					    val cn=el.childNodes;
					    for (var j=0; j < cn.getLength(); j++) {
					    	val uuel=cn.item(j);
					    	if (uuel instanceof Element) {
					    		val cel = uuel;
					    		val childNode=cel.getNodeName();
					    		val childNodeName=cel.getTextContent();
								if(childNode == "DisplayName")	
								{	
									objectName = childNodeName;
									if(verbose) println("object found "+objectName)
								}
							}
						}
					}
				}
			}
		}
		return objectName
	}

	def Iterable<SeRoNetENTITY> getEntityList(File xmlFile) {
		var entityList = new ArrayList<SeRoNetENTITY>();
		var verbose = true
		if(xmlFile.exists) {
			val dbFactory = DocumentBuilderFactory.newInstance();
			val dBuilder = dbFactory.newDocumentBuilder();
			val doc = dBuilder.parse(xmlFile)
			
			doc.documentElement.normalize();
			if(verbose==true) println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||")
			if(verbose==true) println("=============================================================================")
			
			val nl =doc.getDocumentElement().getChildNodes();
		    for (var i=0; i < nl.getLength(); i++) 
		    {
				val uel=nl.item(i);
				if (uel instanceof Element) 
				{
					val el = uel;
					val nodeName=el.getNodeName();
					val dataType=el.getAttribute("DataType");
					val userAccessLevel=el.getAttribute("UserAccessLevel");	
					val EntityNodeId=el.getAttribute("NodeId");
					val EntityParentNodeId=el.getAttribute("ParentNodeId");			        
					if(nodeName == "UAVariable")	
					{			        	
						val SeRoNetENTITY entity = new SeRoNetENTITY();
						val Collection<SeRoNetNodeId> New_Children_nodeid = new ArrayList<SeRoNetNodeId>();
						var addNewEntity = false;
					    val cn=el.childNodes;
					    for (var j=0; j < cn.getLength(); j++) {
					    	val uuel=cn.item(j);
					    	if (uuel instanceof Element) {
					    		val cel = uuel;
					    		val childNode=cel.getNodeName();
					    		val childNodeName=cel.getTextContent();
								if(childNode == "DisplayName")	
								{	
									if((childNodeName != "InputArguments")&&(childNodeName != "OutputArguments"))	//These need to be treated separately 	 
									{       	
										entity.name = childNodeName;
										entity.type = dataType;
										entity.userAccessLevel = Integer.parseInt(userAccessLevel);
										entity.nodeid = getNodeIdFromString(EntityNodeId);
										entity.Parent_nodeid = getNodeIdFromString(EntityParentNodeId);
										addNewEntity = true;
									}
								}
								if(childNode == "References")
								{
									val Refs=cel.childNodes;
									for (var r=0; r < Refs.getLength(); r++) 
									{
										val Ref=Refs.item(r);
										if (Ref instanceof Element) 
										{
											val RefChildNodeType=Ref.getAttribute("ReferenceType");
											val IsForward=Ref.getAttribute("IsForward");												
											if((RefChildNodeType == "HasComponent")&&(IsForward != "false"))
											{
												val childnodeid = Ref.getTextContent();
												New_Children_nodeid.add(getNodeIdFromString(childnodeid));
											}
										}
									}
								}
							}
						}
						if(addNewEntity)
						{
							entity.Children_nodeid = New_Children_nodeid;
							if(verbose==true) entity.Display();
							entityList.add(entity);	
						}									
					}
				}
			}
			if(verbose==true) println("=============================================================================")				
		}
		return entityList;
	}
	def Iterable<SeRoNetMETHOD> getMethodList(File xmlFile) {
		var methodList = new ArrayList<SeRoNetMETHOD>();
		var verbose = true
		if(xmlFile.exists) {
			val dbFactory = DocumentBuilderFactory.newInstance();
			val dBuilder = dbFactory.newDocumentBuilder();
			val doc = dBuilder.parse(xmlFile)
			
			doc.documentElement.normalize();
			
			val nl =doc.getDocumentElement().getChildNodes();
		    for (var i=0; i < nl.getLength(); i++) 
		    {
				val uel=nl.item(i);
				if (uel instanceof Element) 
				{
					val el = uel;
					val nodeName=el.getNodeName();
					val MethodNodeId=el.getAttribute("NodeId");
					val MethodParentNodeId=el.getAttribute("ParentNodeId");						
					if(nodeName == "UAMethod")	
					{			        	
						val SeRoNetMETHOD method = new SeRoNetMETHOD();
						val Collection<SeRoNetNodeId> New_Children_nodeid = new ArrayList<SeRoNetNodeId>();
						var addNewMethod = false;
					    val cn=el.childNodes;
					    for (var j=0; j < cn.getLength(); j++) {
					    	val uuel=cn.item(j);
					    	if (uuel instanceof Element) {
					    		val cel = uuel;
					    		val childNode=cel.getNodeName();
					    		val childNodeName=cel.getTextContent();
					    		if(childNode == "References")
								{
									val Refs=cel.childNodes;
									for (var r=0; r < Refs.getLength(); r++) 
									{
										val Ref=Refs.item(r);
										if (Ref instanceof Element) 
										{
											val RefChildNodeType=Ref.getAttribute("ReferenceType");
											val IsForward=Ref.getAttribute("IsForward");												
											if((RefChildNodeType == "HasProperty")&&(IsForward != "false"))
											{
												val childnodeid = Ref.getTextContent();
												New_Children_nodeid.add(getNodeIdFromString(childnodeid));
											}
										}
									}
								}
								if(childNode == "DisplayName")	
								{			        	
									method.name = childNodeName;
									////////////////////////////////////Find corresponding Argument Nodes ///////////////////////////////////
									var verboseSAVED = verbose;
									verbose = true;
									for (var ib=0; ib < nl.getLength(); ib++) 
			    					{
			    							val B=nl.item(ib);
											if (B instanceof Element) 
											{
												val C = B;
												val C_Node=C.getNodeName();
												val C_ParentNodeId=C.getAttribute("ParentNodeId");
												val ArgumentNodeId=C.getAttribute("NodeId");						
												if((C_Node == "UAVariable")&&(C_ParentNodeId == MethodNodeId))	
												{
													val D=C.childNodes;
													var F_InOrOutl = "";
						    						for (var id=0; id < D.getLength(); id++)
						    						{
						    							val E=D.item(id);
						    							if (E instanceof Element)
						    							{
															val F = E;
															val F_Node=F.getNodeName();
															val F_NodeName=F.getTextContent();
															if(F_Node == "DisplayName")
															{F_InOrOutl = F_NodeName;}
						    							}	
						    						}
						    						if(F_InOrOutl != "")
						    						{
							    						for (var id=0; id < D.getLength(); id++)
							    						{
							    							val E=D.item(id);
							    							if ((E instanceof Element)&&(E.getNodeName().equals("Value")))
							    							{
							    								val F=E.childNodes;								    								
							    								for (var iff=0; iff < F.getLength(); iff++)
							    								{
							    									val G=F.item(iff);
							    									if ((G instanceof Element)&&(G.getNodeName().equals("ListOfExtensionObject")))
							    									{
																		val H=G.childNodes;								    								
									    								for (var ih=0; ih < H.getLength(); ih++)
									    								{
									    									val I=H.item(ih);
									    									if ((I instanceof Element)&&(I.getNodeName().equals("ExtensionObject")))
									    									{
																				val J=I.childNodes;								    								
											    								for (var ij=0; ij < J.getLength(); ij++)
											    								{
											    									val K=J.item(ij);
											    									if ((K instanceof Element)&&(K.getNodeName().equals("Body")))
											    									{
																						val L=K.childNodes;								    								
													    								for (var il=0; il < L.getLength(); il++)
													    								{
													    									val M=L.item(il);
													    									if ((M instanceof Element)&&(M.getNodeName().equals("Argument")))
													    									{
													    										var SeRoNetARGUMENT NewArg = new SeRoNetARGUMENT();
																								val N=M.childNodes;								    								
															    								for (var in=0; in < N.getLength(); in++)
															    								{																																										    									
															    									val O=N.item(in);
															    									if ((O instanceof Element)&&(O.getNodeName().equals("Name"))
															    										&&(! O.getTextContent().equals("")))
															    									{   
																										NewArg.name = O.getTextContent();
															    									}	
											    													if ((O instanceof Element)&&(O.getNodeName().equals("DataType"))
											    														&&(! O.getTextContent().equals("")))
															    									{   
																										val P=O.childNodes;
																										for (var ip=0; ip < P.getLength(); ip++)
																										{
																											val Q=P.item(ip);
																											if ((Q instanceof Element)&&(Q.getNodeName().equals("Identifier"))
																												&&(! Q.getTextContent().equals("")))
																											{
																												var tmp = Q.getTextContent();
																												tmp = tmp.substring(2);
																												NewArg.DataTypeIdentifier = Integer.parseInt(tmp);
																											}
																										}																																										    										
															    									}	
											    													if ((O instanceof Element)&&(O.getNodeName().equals("ValueRank"))
											    														&&(! O.getTextContent().equals("")))
															    									{   
																										NewArg.ValueRank = Integer.parseInt(O.getTextContent());																    										
															    									}	
											    													if ((O instanceof Element)&&(O.getNodeName().equals("ArrayDimensions"))
											    													  &&(! O.getTextContent().equals("")))
															    									{   
																										NewArg.ArrayDimensions = Integer.parseInt(O.getTextContent());
															    									}	
															    								}
															    								NewArg.nodeid = getNodeIdFromString(ArgumentNodeId);
															    								NewArg.Parent_nodeid = getNodeIdFromString(C_ParentNodeId);
															    								if(F_InOrOutl == "InputArguments")
															    									{ method.inputArguments.add(NewArg); }
															    								else									
															    									{ method.outputArguments.add(NewArg);}					    										
													    									}	
													    								}												    										
											    									}	
											    								}										    										
									    									}	
									    								}								    										
							    									}	
							    								}																	
							    							}	
							    						}	
							    					}
												}													
											}	
			    					}		
									///////////////////////////////////////////////////////////////////////////////////////////////////////////////
									method.nodeid = getNodeIdFromString(MethodNodeId);
									method.Parent_nodeid = getNodeIdFromString(MethodParentNodeId);
									addNewMethod = true;
									verbose = verboseSAVED;																				
								}
							}
						}
						if(addNewMethod)
						{
							method.Children_nodeid = New_Children_nodeid;
							if(verbose==true) method.Display();
							methodList.add(method);	
						}	
					}
				}
			}
			if(verbose==true) println("=============================================================================")				
		}
		return methodList;
	}	
	def getCppType(String opcUaType) {
		switch(opcUaType) {
			case "Boolean": "bool"
			case "String": "std::string"
			case "Byte": "unsigned char"
			case "Int16": "short"
			case "UInt16": "unsigned short"
			case "Int32": "int"
			case "UInt32": "unsigned int"
			case "Int64": "long"
			case "UInt64": "unsigned long"
			case "Float": "float"
			case "Double": "double"
			
			case "std::vector<Boolean>": "std::vector<bool>"
			case "std::vector<String>": "std::vector<std::string>"
			case "std::vector<Byte>": "std::vector<unsigned char>"
			case "std::vector<Int16>": "std::vector<short>"
			case "std::vector<UInt16>": "std::vector<unsigned short>"
			case "std::vector<Int32>": "std::vector<int>"
			case "std::vector<UInt32>": "std::vector<unsigned int>"
			case "std::vector<Int64>": "std::vector<long>"
			case "std::vector<UInt64>": "std::vector<unsigned long>"
			case "std::vector<Float>": "std::vector<float>"
			case "std::vector<Double>": "std::vector<double>"
		}
	}
	def getCppDefaultValue(String opcUaType) {
		switch(opcUaType) {
			case "Boolean": "false"
			case "String": "std::string(\"\")"
			case "Byte": "0"
			case "Int16": "0"
			case "UInt16": "0"
			case "Int32": "0"
			case "UInt32": "0"
			case "Int64": "0"
			case "UInt64": "0"
			case "Float": "0.0"
			case "Double": "0.0"
			
			case "std::vector<Boolean>": "std::vector<bool>()"
			case "std::vector<String>": "std::vector<std::string>()"
			case "std::vector<Byte>": "std::vector<unsigned char>()"
			case "std::vector<Int16>": "std::vector<short>()"
			case "std::vector<UInt16>": "std::vector<unsigned short>()"
			case "std::vector<Int32>": "std::vector<int>()"
			case "std::vector<UInt32>": "std::vector<unsigned int>()"
			case "std::vector<Int64>": "std::vector<long>()"
			case "std::vector<UInt64>": "std::vector<unsigned long>()"
			case "std::vector<Float>": "std::vector<float>()"
			case "std::vector<Double>": "std::vector<double>()"
		}
	}
	
	def String getCppMethodArgumentsDef(SeRoNetMETHOD method) {
		var result = ""
		for(argIn: method.inputArguments) {
			result = result + "const "+argIn.DataTypeString()+" &"+argIn.name
			if(argIn != method.inputArguments.last) {
				result = result + ", "
			}
		}
		for(argOut: method.outputArguments) {
			if(argOut == method.outputArguments.head) {
				if(!method.inputArguments.empty) {
					result = result + ", "
				}
			} else {
				result = result + ", "
			}
			result = result + argOut.DataTypeString()+" &"+argOut.name
		}
		return result
	}
	
	def String getCppMethodArgumentsCall(SeRoNetMETHOD method) {
		var result = ""
		for(argIn: method.inputArguments) {
			result = result + argIn.name
			if(argIn != method.inputArguments.last) {
				result = result + ", "
			}
		}
		for(argOut: method.outputArguments) {
			if(argOut == method.outputArguments.head) {
				if(!method.inputArguments.empty) {
					result = result + ", "
				}
			} else {
				result = result + ", "
			}
			result = result + argOut.name
		}
		return result
	}
}