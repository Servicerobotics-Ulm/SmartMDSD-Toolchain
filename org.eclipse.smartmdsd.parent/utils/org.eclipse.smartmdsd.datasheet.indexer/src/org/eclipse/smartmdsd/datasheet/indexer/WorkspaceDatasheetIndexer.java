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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * This class implements a Datasheet properties index (i.e. a persistent cache)
 * that provides a central access point for all projects in the workspace
 * to write/read all property-value entries of all projects in the workspace.
 * This indexer works independent of the Java classpath and can be used as a
 * persistent cache in parallel to other indexer types such as e.g. the
 * Xtext indexer. Please note, that this implementation might become rather
 * slow when the number of entries grows.
 * 
 * @author Alex Lotz
 *
 */
public class WorkspaceDatasheetIndexer {
	// the internal metadata index
	private Map<String, DatasheetProjectSettings> index = new HashMap<String, DatasheetProjectSettings>();

	// singleton instance
	private static WorkspaceDatasheetIndexer instance;

	/** returns singleton instance
	 * 
	 * This is a classical implementation of the Singleton design pattern.
	 *  
	 * @return singleton instance
	 */
	public static WorkspaceDatasheetIndexer getInstance() {
		if(instance == null) {
			instance = new WorkspaceDatasheetIndexer();
		}
		return instance;
	}
	
	/** creates the internal index for all currently open projects in the current workspace<br>
	 * 
	 * This method creates the internal project index for all currently open projects in the
	 * workspace. Be aware that this method might be rather time-consuming as it loads all 
	 * project-setting files for all projects in the workspace.
	 */
	public void reloadWorkspaceMetadataIndex() {
		for(IProject project: ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			String projectName = project.getName();
			if(project.isOpen()) {
				// create a new entry if it is not yet indexed
				if(!index.containsKey(projectName)) {
					index.put(projectName, new DatasheetProjectSettings(project));
				}
			} else {
				if(index.containsKey(projectName)) {
					index.remove(projectName);
				}
			}
		}
	}
	
	/**
	 * Clear all entries in the internal index.
	 */
	public void clearWorkspaceMetadataIndex() {
		index.clear();
	}
	
	/**
	 * This method returns a set of all currently indexed property names from all opened projects.
	 * 
	 * @return a set of unique property names
	 */
	public Set<String> getAllIndexedPropertyNames() {
		Set<String> unique_property_names = new HashSet<String>();
		for(DatasheetProjectSettings metadata: index.values()) {
			unique_property_names.addAll(metadata.getAllPropertyNames());
		}
		return unique_property_names;
	}
	
	/** returns a list of all matching property values<br>
	 * 
	 * This method iterates the index and returns the 
	 * value of each property that matches the provided
	 * property name. The returned set has no duplicates and
	 * all empty values are removed.
	 * 
	 * @param propertyName the property name to be searched for in the indexer
	 * @return a list of values for all matching properties
	 */
	public Set<String> getAllMatchingPropertyValues(String propertyName) {
		Set<String> all_values = new HashSet<String>();
		for(DatasheetProjectSettings metadata: index.values()) {
			all_values.addAll(metadata.getAllPropertyValues(propertyName));
		}
		return all_values;
	}
	
	/** returns a list of all matching property units<br>
	 * 
	 * This method iterates the index and returns the 
	 * unit of each property that matches the provided
	 * property name. The returned set has no duplicates and
	 * all empty units are removed.
	 * 
	 * @param propertyName the property name to be searched for in the indexer
	 * @return a list of units for all matching properties
	 */
	public Set<String> getAllMatchingPropertyUnits(String propertyName) {
		Set<String> all_units = new HashSet<String>();
		for(DatasheetProjectSettings metadata: index.values()) {
			all_units.addAll(metadata.getAllPropertyUnits(propertyName));
		}
		return all_units;
	}
	
	/** returns a list of all matching property units<br>
	 * 
	 * This method iterates the index and returns the 
	 * unit of each property that matches the provided
	 * property name. The returned set has no duplicates and
	 * all empty units are removed.
	 * 
	 * @param propertyName the property name to be searched for in the indexer
	 * @return a list of units for all matching properties
	 */
	public Set<String> getAllMatchingPropertySemanticURIs(String propertyName) {
		Set<String> all_uris = new HashSet<String>();
		for(DatasheetProjectSettings metadata: index.values()) {
			all_uris.addAll(metadata.getAllPropertySemanticURIs(propertyName));
		}
		return all_uris;
	}
	
	/** returns the project's metadata class<br>
	 * 
	 * This method returns the currently registered project's metadata
	 * entry for a given project name. In case when the current project
	 * is not (yet) indexed, a new index entry is automatically created
	 * and returned instead. This method can return null in case the given
	 * project name does not belong to any loaded projects in the current
	 * workspace.
	 * 
	 * @param projectName the name of the project to return its metadata properties
	 * @return an instance of the matching DatasheetProjectSettings properties (or null)
	 */
	public DatasheetProjectSettings getDatasheetProjectSettings(String projectName) {
		DatasheetProjectSettings metadata = index.get(projectName);
		if(metadata == null) {
			// create new metadata entry (if needed)
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if(project.exists() && project.isOpen()) {
				metadata = index.put(projectName, new DatasheetProjectSettings(project));
			}
		}
		return metadata;
	}
}
