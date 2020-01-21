//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
package org.eclipse.smartmdsd.datasheet.indexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * This class encapsulates the access to a project's Datasheet
 * property-value entries. This implementation stores all 
 * property-value entries in a dedicated project-settings
 * file (located in the hidden ".settings" folder of the
 * given project). The file name is specified by the public 
 * static variable SETTINGS_NODE_NAME.
 *   
 * @author Alex Lotz
 *
 */
public class DatasheetProjectSettings {
	public static String SETTINGS_NODE_NAME = "toolchain.project.metadata";
	
	public static String VALUE_NODE_KEY = "value";
	public static String UNIT_NODE_KEY = "unit";
	public static String SEMANTIC_URI_NODE_KEY = "semanticURI";
	
	private ProjectScope settings;
	private IEclipsePreferences rootNode;
	private Preferences projectNode;

	public DatasheetProjectSettings(IProject project) {
		// we use the ProjectScope to store/read metadata name-value pairs
		settings = new ProjectScope(project);
		// this will create a hidden file within the project folder ".settings"
		// the file is named "toolchain.project.metadata.prefs"
		rootNode = settings.getNode(SETTINGS_NODE_NAME);
		// the project node will be uses as the default/main node
		// further nodes wit custom names can be created using the getPropertyNode method (see below)
		projectNode = rootNode.node(project.getName());
	}
	
	/**
	 * This method returns the main node which is used by default
	 * to store all global preferences
	 * @return the main project node
	 */
	public Preferences getMainPropertyNode(String name) {
		return projectNode.node(name);
	}
	
	/**
	 * This method clears all main property entries,
	 * which is useful to prevent outdated entries. 
	 */
	public void clearAllMainProperties() {
		try {
			projectNode.clear();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method returns a custom property node with the given path.
	 * Custom nodes can be used as sub-nodes to create more hierarchical
	 * structures.
	 * @param path the path of the sub-node (use '/' to separate path elements)
	 * @return the property node object
	 */
	public Preferences getCustomSubNode(String path) {
		return rootNode.node(path);
	}
	
	/**
	 * This method returns a sequence of property-values of the provided property node.
	 * 
	 * @param property is the property node that can be obtained by e.g. using the getMainNode(), or the getCustomSubNode() methods
	 * @return a list of property-values
	 * @see getMainNode
	 * @see getCustomSubNode
	 */
	public Collection<String> getPropertyValues(Preferences property) {
		Collection<String> result = new HashSet<String>();
		Preferences values = property.node(VALUE_NODE_KEY);
		try {
			for(String key: values.keys()) {
				String value = values.get(key, "");
				if(value != "") {
					result.add(value);
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method returns a sequence of property-units of the provided property node.
	 * 
	 * @param property is the property node that can be obtained by e.g. using the getMainNode(), or the getCustomSubNode() methods
	 * @return a list of property-units
	 * @see getMainNode
	 * @see getCustomSubNode
	 */
	public Collection<String> getPropertyUnits(Preferences property) {
		Collection<String> result = new HashSet<String>();
		Preferences units = property.node(UNIT_NODE_KEY);
		try {
			for(String key: units.keys()) {
				String unit = units.get(key, "");
				if(unit != "") {
					result.add(unit);
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method returns a sequence of property-semanticURIs of the provided property node.
	 * 
	 * @param property is the property node that can be obtained by e.g. using the getMainNode(), or the getCustomSubNode() methods
	 * @return a list of property-semanticURIs
	 * @see getMainNode
	 * @see getCustomSubNode
	 */
	public Collection<String> getPropertySemanticURIs(Preferences property) {
		Collection<String> result = new HashSet<String>();
		Preferences uris = property.node(SEMANTIC_URI_NODE_KEY);
		try {
			for(String key: uris.keys()) {
				String uri = uris.get(key, "");
				if(uri != "") {
					result.add(uri);
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}

	
	/**
	 * This method returns all currently available property names of the main-node.
	 * @return an array of all available property names
	 */
	public Collection<String> getAllPropertyNames() {
		Set<String> result = new HashSet<String>();
		try {
			for(String nodeName: rootNode.childrenNames()) {
				Preferences node = rootNode.node(nodeName);
				result.addAll(Arrays.asList(node.childrenNames()));
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method returns all property-vales for all matching
	 * properties (located under all current root nodes).
	 * @param propertyName the name of the property to search for
	 * @return a list of property-values
	 */
	public Collection<String> getAllPropertyValues(String propertyName) {
		Set<String> result = new HashSet<String>();
		try {
			for(String nodeName: rootNode.childrenNames()) {
				Preferences curr_node = rootNode.node(nodeName);
				if(curr_node.nodeExists(propertyName)) {
					result.addAll(getPropertyValues(curr_node.node(propertyName)));
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method returns all property-units for all matching
	 * properties (located under all current root nodes).
	 * @param propertyName the name of the property to search for
	 * @return a list of property-units
	 */
	public Collection<String> getAllPropertyUnits(String propertyName) {
		Set<String> result = new HashSet<String>();
		try {
			for(String nodeName: rootNode.childrenNames()) {
				Preferences curr_node = rootNode.node(nodeName);
				if(curr_node.nodeExists(propertyName)) {
					result.addAll(getPropertyUnits(curr_node.node(propertyName)));
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method returns all property-semanticURIs for all matching
	 * properties (located under all current root nodes).
	 * @param propertyName the name of the property to search for
	 * @return a list of property-semanticURIs
	 */
	public Collection<String> getAllPropertySemanticURIs(String propertyName) {
		Set<String> result = new HashSet<String>();
		try {
			for(String nodeName: rootNode.childrenNames()) {
				Preferences curr_node = rootNode.node(nodeName);
				if(curr_node.nodeExists(propertyName)) {
					result.addAll(getPropertySemanticURIs(curr_node.node(propertyName)));
				}
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * This method updates the value of a given property.
	 * 
	 * @param property whose value is to be updated
	 * @param index the index number of the property (in case multiple properties with the same name have been defined)
	 * @param value the new property-value
	 */
	public void updatePropertyValue(Preferences property, int index, String value) {
		updatePropertyValue(property, index, value, null);
	}
	
	/**
	 * This method updates the value and the unit of a given property.
	 * 
	 * @param property whose value and unit is to be updated
	 * @param index the index number of the property (in case multiple properties with the same name have been defined)
	 * @param value the new property-value
	 * @param unit the new property-unit
	 */
	public void updatePropertyValue(Preferences property, int index, String value, String unit) {
		String str_index = Integer.toString(index);
		Preferences value_node = property.node(VALUE_NODE_KEY);
		value_node.put(str_index, value);
		if(unit != null) {
			Preferences unit_node = property.node(UNIT_NODE_KEY);
			unit_node.put(str_index, unit);
		}
	}
	
	/**
	 * This method updates the semanticURI of a given property.
	 * 
	 * @param property whose semanticURI and unit is to be updated
	 * @param index the index number of the property (in case multiple properties with the same name have been defined)
	 * @param semanticURI the new property-semanticURI
	 */
	public void updatePropertySeminticURI(Preferences property, int index, String semanticURI) {
		String str_index = Integer.toString(index);
		Preferences uri_node = property.node(SEMANTIC_URI_NODE_KEY);
		uri_node.put(str_index, semanticURI);
	}
	
	/**
	 * This method saves the current in-memory properties cache into a file (specified by the SETTINGS_NODE_NAME variable).
	 */
	public void saveProperties() {
		try {
			rootNode.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
}
