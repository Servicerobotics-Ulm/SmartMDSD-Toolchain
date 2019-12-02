//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================

package org.xtend.smartsoft.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class ExtendedOutputConfigurationProvider implements IOutputConfigurationProvider {
	public final static String SMARTSOFT_OUTPUT = "SMARTSOFT_OUTPUT";
	public final static String SRC_OUTPUT = "SRC_OUTPUT";
	public final static String SRC_GEN_PARAMS = "SRC_GEN_PARAMS";
	public final static String SRC_GEN_SYS_CONFIG = "SRC_GEN_SYS_CONFIG";
	public final static String SRC_GEN_SYS_DEPLOY = "SRC_GEN_SYS_DEPLOY";
	public final static String SRC_GEN_DOCU = "SRC_GEN_DOCU";
	public final static String PROJECT_ROOT_FOLDER = "PROJECT_ROOT_FOLDER";

	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(
				IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("./smartsoft/src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		
		OutputConfiguration smartsoftOutput = new OutputConfiguration(
				SMARTSOFT_OUTPUT);
		smartsoftOutput.setDescription("Output Folder for Custom Code");
		smartsoftOutput.setOutputDirectory("./smartsoft");
		smartsoftOutput.setOverrideExistingResources(false);
		smartsoftOutput.setCreateOutputDirectory(true);
		smartsoftOutput.setCleanUpDerivedResources(false);
		smartsoftOutput.setSetDerivedProperty(false);
		
		OutputConfiguration srcOutput = new OutputConfiguration(
				SRC_OUTPUT);
		srcOutput.setDescription("Output Folder for Custom Code");
		srcOutput.setOutputDirectory("./smartsoft/src");
		srcOutput.setOverrideExistingResources(false);
		srcOutput.setCreateOutputDirectory(true);
		srcOutput.setCleanUpDerivedResources(false);
		srcOutput.setSetDerivedProperty(false);
		
		OutputConfiguration srcGenParamsOutput = new OutputConfiguration(
				SRC_GEN_PARAMS);
		srcGenParamsOutput.setDescription("Output Folder");
		srcGenParamsOutput.setOutputDirectory("./smartsoft/src-gen/params");
		srcGenParamsOutput.setOverrideExistingResources(true);
		srcGenParamsOutput.setCreateOutputDirectory(true);
		srcGenParamsOutput.setCleanUpDerivedResources(true);
		srcGenParamsOutput.setSetDerivedProperty(true);
		
		OutputConfiguration srcGenSysConfigOutput = new OutputConfiguration(
				SRC_GEN_SYS_CONFIG);
		srcGenSysConfigOutput.setDescription("Output Folder");
		srcGenSysConfigOutput.setOutputDirectory("./smartsoft/src-gen/system");
		srcGenSysConfigOutput.setOverrideExistingResources(true);
		srcGenSysConfigOutput.setCreateOutputDirectory(true);
		srcGenSysConfigOutput.setCleanUpDerivedResources(true);
		srcGenSysConfigOutput.setSetDerivedProperty(true);
		
		OutputConfiguration srcGenDeploymentOutput = new OutputConfiguration(
				SRC_GEN_SYS_DEPLOY);
		srcGenDeploymentOutput.setDescription("Output Folder");
		srcGenDeploymentOutput.setOutputDirectory("./smartsoft/src-gen/deployment");
		srcGenDeploymentOutput.setOverrideExistingResources(true);
		srcGenDeploymentOutput.setCreateOutputDirectory(true);
		srcGenDeploymentOutput.setCleanUpDerivedResources(true);
		srcGenDeploymentOutput.setSetDerivedProperty(true);
		
		OutputConfiguration srcGenDocumentationOutput = new OutputConfiguration(
				SRC_GEN_DOCU);
		srcGenDocumentationOutput.setDescription("Output Folder");
		srcGenDocumentationOutput.setOutputDirectory("./smartsoft/src-gen/docu");
		srcGenDocumentationOutput.setOverrideExistingResources(true);
		srcGenDocumentationOutput.setCreateOutputDirectory(true);
		srcGenDocumentationOutput.setCleanUpDerivedResources(true);
		srcGenDocumentationOutput.setSetDerivedProperty(true);
		
		OutputConfiguration rootConfigOutput = new OutputConfiguration(
				PROJECT_ROOT_FOLDER);
		rootConfigOutput.setDescription("Project Root Output Folder");
		rootConfigOutput.setOutputDirectory("./");
		rootConfigOutput.setOverrideExistingResources(false);
		rootConfigOutput.setCreateOutputDirectory(false);
		rootConfigOutput.setCleanUpDerivedResources(false);
		rootConfigOutput.setSetDerivedProperty(false);
		
		HashSet<OutputConfiguration> configurations = new HashSet<OutputConfiguration>();
		configurations.add(defaultOutput);
		configurations.add(srcGenParamsOutput);
		configurations.add(srcGenSysConfigOutput);
		configurations.add(srcGenDeploymentOutput);
		configurations.add(smartsoftOutput);
		configurations.add(srcOutput);
		configurations.add(srcGenDocumentationOutput);
		configurations.add(rootConfigOutput);
		return configurations;
	}
}
