//===============================================================
//
//  Copyright (C) 2018 Alex Lotz, Matthias Lutz, Dennis Stampfer
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
package org.xtend.smartsoft.generator.system

import java.util.ArrayList
import org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization
import org.ecore.component.coordinationExtension.CoordinationSlavePort
import org.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping
import org.ecore.system.componentArchitecture.ComponentInstance
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.xtend.smartsoft.generator.CopyrightHelpers
import com.google.inject.Inject
import java.util.LinkedHashSet
import org.ecore.system.deployment.DeploymentModel
import org.ecore.system.deployment.ComponentArtefact
import org.ecore.behavior.taskRealization.TaskRealizationModel
import org.eclipse.core.resources.ResourcesPlugin
import org.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef

class BehaviorSystem {
	
	@Inject extension CopyrightHelpers
		
	def compileModuleConnections(SystemComponentArchitecture model) '''
	{
		"modules-insts" : [
		«var mappings  = model.extensions.filter(typeof(CoordinationModuleMapping))»
		«FOR mapping : mappings»
			«var coordModRealization = mapping.coordModReal»
			«var coordModInstance = mapping.coordModuleInst»
			{
				"coordination-module-inst" : {
				"type" : "«coordModRealization.coordinationModuleDef.name»",
				"inst-name" : "«coordModInstance.name»",
				"coordination-interfaces-instances" : [
				«FOR coordInterCompInstMapping : mapping.coordInterCompInstMapping»
					{ "type" : "«coordInterCompInstMapping.coordInterInst.coordinationInterfaceDef.name»",
					"inst-name" : "«coordInterCompInstMapping.coordInterInst.name»",
					"component-inst" : "«coordInterCompInstMapping.compInst.name»",
					"services" : [«FOR service : coordInterCompInstMapping.compInst.generatePortNames()»«service»«ENDFOR»]
					} «IF coordInterCompInstMapping!=mapping.coordInterCompInstMapping.last»,«ENDIF»
				«ENDFOR»
				]
				}
			}
			«IF mapping != mappings.last»,«ENDIF»
		«ENDFOR»
		]
	}
	«««	 «var coordSlavePort = compInst.component.elements.filter(typeof(CoordinationSlavePort)).head»
	««« States: «FOR mode : coordInterCompInstMapping.compInst.generateMainState()» "«mode»"«ENDFOR»
	'''

	def private String getLocation(TaskRealizationModel model) {
		val uri = model.eResource.URI
		val project = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1))
		return project.location.toString
	}
	

    def compileBehaviorProjectFiles(SystemComponentArchitecture model)'''
		«var behaviorTaskRefs = model.extensions.filter(typeof(TaskRealizationModelRef))»
		#!/bin/bash
		«getCopyrightHash()»
		#
		# this script will be sourced from the components deployment
		#
		declare -a BEHAVIOR_PROJECTS_PATH=(
    	«FOR ref : behaviorTaskRefs»"«ref.taskModelRef.location»"«ENDFOR»
		)
    '''

	def generateMainState(ComponentInstance compInst) {
		var res = new ArrayList
		var coordSlavePorts = compInst.component.elements.filter(typeof(CoordinationSlavePort));
		if (coordSlavePorts !== null) {

			for (coodrinationSlavePort : coordSlavePorts) {
				var modeCollection = coodrinationSlavePort.service.statePattern.modes
				if(modeCollection !== null){
					for (mode : modeCollection.modes) {
						res.add(mode.name)
					}
				}
			}
		}
		return res;
	}	
	
	def generatePortNames(ComponentInstance compInst) {
		var result = new ArrayList
		var coordSlavePorts = compInst.component.elements.filter(typeof (CoordinationSlavePort));
		for( coodrinationSlavePort : coordSlavePorts )
		{
			var comServiceUsagesReals = coodrinationSlavePort.elements.filter(typeof(CommunicationServiceUsageRealization));
			for( comServiceUsage : comServiceUsagesReals )
			{
				var tmp = "{ \"coordservice\" : \"" + comServiceUsage.serviceUsage.name + "\", \"compservice\" : \"" + comServiceUsage.componentPort.name + "\"}"
				if(comServiceUsage != comServiceUsagesReals.last){
					tmp += ","
				}
				result.add(tmp);	
			}
		}
		return result;
	}
	

	
	def LinkedHashSet<String> getAllComponentCoordinationInterfaces(DeploymentModel model) {
		var cis = new LinkedHashSet<String>()
		for(artefact: model.elements.filter(ComponentArtefact)) {	
			var coordSlavePorts = artefact.component.component.elements.filter(typeof (CoordinationSlavePort));
			for( coodrinationSlavePort : coordSlavePorts )
			{
				cis.add(coodrinationSlavePort.service.name)
			}
		}
		return cis;
	}
	
	def compileBehaviorDeploymentFiles(DeploymentModel model) '''
	#!/bin/bash
	«getCopyrightHash()»
	#
	# this script will be sourced from the components deployment
	#
	
«««	«FOR project: resource.allContents.toIterable.filter(typeof(BehaviorProjectInstance))»
«««	mkdir $TMPDIR/«project.ref.name»_data
«««	
«««	shopt -u | grep -q nullglob && changed=true && shopt -s nullglob
«««	for entry in "$REFERENCED_PROJECT_«project.ref.name»"/model/*.smartTCLv2
«««	do
«««	  DEPLOY_COMPONENT_TCL_MODEL_FILES_«project.ref.name»="$DEPLOY_COMPONENT_TCL_MODEL_FILES_«project.ref.name» $entry"
«««	done
«««	[ $changed ] && shopt -u nullglob; unset changed
«««		
«««	echo "$DEPLOY_COMPONENT_TCL_MODEL_FILES_«project.ref.name»"
«««	
«««	if [ ! "$DEPLOY_COMPONENT_TCL_MODEL_FILES_«project.ref.name»" = "" ]; then
«««				cp -rv $DEPLOY_COMPONENT_TCL_MODEL_FILES_«project.ref.name» $TMPDIR/«project.ref.name»_data/ 2>&1
«««	fi
«««	«ENDFOR»
	
	COMP_INTERFACE_FILES="
	«FOR ci : getAllComponentCoordinationInterfaces(model)»
	$SMART_ROOT_ACE/lib/lib«ci».so
	«ENDFOR»
	"
	 
	BEHAVIOR_UTILITY_FILES="
	src-gen/system/CoordinationModuleConnections.json
	"
	 
	COMP_INTERFACE_FILES_MISSING=false
	for FILE in $COMP_INTERFACE_FILES; do
		if [ ! -e $FILE ]; then
			echo "Deployment: No such file or directory: $FILE"
			COMP_INTERFACE_FILES_MISSING=true
		fi
	done
	
	if [ "$COMP_INTERFACE_FILES_MISSING" = "true" ]; then
		echo	
		echo "ERROR: FILES ARE MISSING FROM THE DEPLOYMENT (see above). Did you compile all components interfaces/components?"
		echo 
		exit 1
	fi
	
	echo "Sourcing behaviorProjectFiles"
	source src-gen/system/behaviorProjectFiles.sh 2>&1
	
	BEHAVIOR_PROJECT_MODEL_FILES=""
	shopt -u | grep -q nullglob && changed=true && shopt -s nullglob
	for DIR in "${BEHAVIOR_PROJECTS_PATH[@]}"; do
		echo "Behavior files for $DIR"
		for entry in "$DIR"/model/*.smartTcl
		do
			echo "Behavior file: $entry"
	  		BEHAVIOR_PROJECT_MODEL_FILES="$BEHAVIOR_PROJECT_MODEL_FILES $entry"
		done
	done
	[ $changed ] && shopt -u nullglob; unset changed
	
	
	
	cp -rv $BEHAVIOR_PROJECT_MODEL_FILES $TMPDIR/behaviorFiles 2>&1
	cp -rv $COMP_INTERFACE_FILES $TMPDIR/behaviorFiles 2>&1
	cp -rv $BEHAVIOR_UTILITY_FILES $TMPDIR/behaviorFiles 2>&1
	'''
	
}