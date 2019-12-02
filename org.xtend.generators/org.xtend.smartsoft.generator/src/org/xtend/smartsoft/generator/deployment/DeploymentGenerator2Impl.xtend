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
package org.xtend.smartsoft.generator.deployment

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.system.deployment.ComponentArtefact
import com.google.inject.Inject
import org.xtend.smartsoft.generator.CopyrightHelpers
import org.ecore.system.deployment.DeploymentModel
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.ecore.system.deployment.TargetPlatformReference
import org.ecore.system.deployment.NamingService

import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.ecore.component.componentDefinition.ComponentDefinition
import org.xtend.smartsoft.generator.system.BehaviorSystem

class DeploymentGenerator2Impl extends AbstractGenerator {
	
	@Inject extension CopyrightHelpers 
	@Inject extension BehaviorSystem
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(deployment: resource.allContents.toIterable.filter(typeof(DeploymentModel))) {
			
			fsa.generateFile("combine_ini_files.sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, deployment.combineIniFilesScript)
			
			for(namingService: deployment.elements.filter(NamingService)) {
				fsa.generateFile("ns_config.ini", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, namingService.nsConfig);
			}

			
			for(artefact: deployment.elements.filter(ComponentArtefact)) {
				resource.createDirectory(artefact.name+"_data")
				fsa.generateFile("predeploy-"+artefact.name+".sh", ExtendedOutputConfigurationProvider::SRC_OUTPUT, artefact.preDeployScript)
				fsa.generateFile("startstop-hooks-"+artefact.name+".sh", ExtendedOutputConfigurationProvider::SRC_OUTPUT, artefact.startStopHooksScript)
			}
			
			for(target: deployment.elements.filter(TargetPlatformReference)) {
				fsa.generateFile("deploy-" + target.name + ".sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, target.deployDeviceScript);
				fsa.generateFile("start-" + target.name + ".sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, target.startScript);
			}

			fsa.generateFile("deploy-all.sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, deployment.deployAllScript);
			fsa.generateFile("start-all.sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, deployment.startAllScript);
			fsa.generateFile("tiler.sh", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, this.tilerscript())
			
			fsa.generateFile("deploy-behavior-files.sh",ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, deployment.compileBehaviorDeploymentFiles)
			
			fsa.generateFile("referenced-projects", ExtendedOutputConfigurationProvider::SRC_GEN_SYS_DEPLOY, deployment.compileReferencedProjects)
		}
	}
	
	
	def compileReferencedProjects(DeploymentModel model)
	'''
	# This file is generated using the SmartMDSD Toolchain.
	# Any changes will be overwritten next time the deployment project
	# is deployed/run from within the SmartMDSD toolchain.
	
	«FOR componentDef: model.elements.filter(ComponentArtefact).map[it.type].toSet.sortBy[it.name]»
	REFERENCED_PROJECT_«componentDef.name»="«componentDef.location»"
	«ENDFOR»
	'''
	
	def private String getLocation(ComponentDefinition component) {
		val uri = component.eResource.URI
		val project = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1))
		return project.location.toString
	}
	
	def private createDirectory(Resource resource, String directory) {
		val project = ResourcesPlugin.getWorkspace().getRoot().getProject(resource.getURI().segment(1));
		val folder = project.getFolder("smartsoft/src/"+directory)
		if(!folder.exists) {
			folder.create(true, true, new NullProgressMonitor());
		}
	}
	
	def nsConfig(NamingService ns) 
	'''
		[smartsoft]
		
		[RemoteNS]
		
		# ip 127.0.0.1:20002
		«IF ns.deploy !== null && ns.deploy.to.host !== null»
			# ip «ns.deploy.to.host.network.hostAddress»:«ns.portNr»
		«ENDIF»
	'''
	
	def combineIniFilesScript(DeploymentModel model)
	'''
		#!/bin/bash
		«getCopyrightHash()»
		#
		# This script collects the generated ini-file parts and combines them into single ini-files (one for each component artefact)
		#
		
		# create subfolder combined-ini-files (if not yet created)
		echo "create subfolder src-gen/combined-ini-files"
		mkdir -p src-gen/combined-ini-files
		
		# clean-up old combined-ini-files before they are generated again
		echo "clean-up src-gen/combined-ini-files subfolder"
		rm src-gen/combined-ini-files/*.ini
		
		«FOR artefact: model.elements.filter(ComponentArtefact).sortBy[it.name]»
		# create ini-file «artefact.name».ini
		echo "create ini-file «artefact.name».ini"
		cp src-gen/system/«artefact.name».ini src-gen/combined-ini-files/
		if [ -f src-gen/params/«artefact.name».ini ]; then
		  cat src-gen/params/«artefact.name».ini >> src-gen/combined-ini-files/«artefact.name».ini
		fi
		
		«ENDFOR»
	'''
	
	def preDeployScript(ComponentArtefact artefact) 
	'''
		#!/bin/bash
		#
		# This script is run prior to deployment of component «artefact.name»
		# The working directory of this script is the deployment project folder.
		#
		
		«copyrightWriteOnceHash»
		
		# uncomment to enable predeploy script delivered by component
		source $REFERENCED_PROJECT_«artefact.type.name»/smartsoft/src/predeploy.sh
		
		# Add SmartSoft libraries that shall be deployed to the target device where this
		# component is to be deployed.
		# These libraries will be searched in $SMART_ROOT/lib and then deployed
		# Add one file per line.
		#DEPLOY_LIBRARIES="$DEPLOY_LIBRARIES
		#libSmartSickInterface.so
		#"
		
		
		# add custom code here. E.g. use this script to collect data-files and 
		# copy them to src/<COMPONENT>_data, etc.
		
	'''
	
	def startStopHooksScript(ComponentArtefact artefact) 
	'''
		#!/bin/bash
		#
		# Start-Stop-Hooks for component «artefact.name»
		#
		# This script provides methods to call custom commands pre/post of
		# starting/stoping the component during launch on the device.
		# This script is being executed on the target device where this 
		# component is running.
		#
		
		«copyrightWriteOnceHash»
		
		case "$1" in
		
		pre-start)
			# first, trigger hooks as delivered from component ...
			bash startstop-hooks-component-«artefact.type.name».sh pre-start
			
			# ...then call user/deployment specific hook:
			echo "Triggering pre-start hooks ..."
		;;
		
		post-start)
			# first, trigger hooks as delivered from component ...
			bash startstop-hooks-component-«artefact.type.name».sh post-start
			
			# ...then call user/deployment specific hook:
			echo "Triggering post-start hooks ..."
		;;
		
		pre-stop)
			# first, trigger hooks as delivered from component ...
			bash startstop-hooks-component-«artefact.type.name».sh pre-stop
			
			# ...then call user/deployment specific hook:
			echo "Triggering pre-stop hooks ..."
		;;
		
		post-stop)
			# first, trigger hooks as delivered from component ...
			bash startstop-hooks-component-«artefact.type.name».sh post-stop
			
			# ...then call user/deployment specific hook:
			echo "Triggering post-stop hooks ..."
		;;
		
		*)
			echo "ERROR in $0: no such hook '$1'. Usage: $0 pre-start|post-start|pre-stop|post-stop"
		;;
		
		esac
		
	'''
	
	def private Iterable<ComponentArtefact> getComponentArtefacts(TargetPlatformReference target) {
		return (target.eContainer as DeploymentModel).elements.filter(ComponentArtefact).filter[it.deploy?.to==target].sortBy[it.name]
	}
	
	def private hasNamingService(TargetPlatformReference target) {
		val namingService = target.namingService
		if(namingService !== null) {
			if(namingService.deploy !== null) {
				if(namingService.deploy.to==target) {
					return true
				}
			}
		}
		return false
	}
	def private getNamingService(TargetPlatformReference target) {
		val parent = target.eContainer
		if(parent instanceof DeploymentModel) {
			return parent.elements.filter(NamingService).head
		}
		return null
	}
	
	def private String sshLoginPair(TargetPlatformReference target) {
		if(target.host !== null) {
			if(target.login !== null) {
				return target.login.name + "@" + target.host.network.hostAddress
			} else {
				return target.host?.network.hostAddress
			}
		}
		return ""		
	}
	
	def private getType(ComponentArtefact artefact) {
		return artefact.component.component
	}
	
	
	//def deployDeviceScript(org.eclipse.uml2.uml.Device device) '''
	def deployDeviceScript(TargetPlatformReference target)  
	'''
		#!/bin/bash
		«getCopyrightHash()»
		#
		# run this script from the component's root folder to deploy the scenario to device.
		#
		
		TARGET_SSHUSER=«IF target.login!==null»«target.login.name»«ENDIF»
		TARGET_IP=«IF target.host!==null»«target.host.network.hostAddress»«ENDIF»
		TARGET_DIRECTORY="«IF target.directory!==null»«target.directory.path»«ENDIF»"
		DEPLOYMENT_DIRECTORY=«(target.eContainer as DeploymentModel).name».deployment/
		
		echo "#######################################################"
		echo "## Deployment of Device «target.platform.name» / $TARGET_IP"
		echo "#######################################################"
		echo "Target SSH user:      $TARGET_SSHUSER"
		echo "Target IP:            $TARGET_IP"
		echo "Target directory:     $TARGET_DIRECTORY"
		echo "Deployment directory: $DEPLOYMENT_DIRECTORY"
		
		echo "Working directory of deployment script: "`pwd`
		
		echo Sourcing referenced projects
		source src-gen/deployment/referenced-projects
		
		DEPLOY_LIBRARIES_USER=""
		«FOR artefact: target.componentArtefacts.sortBy[it.name]»
			###############################
			echo "Sourcing pre-deployment script for «artefact.name»... (errors might be ignored)"
			DEPLOY_LIBRARIES=""
			DEPLOY_COMPONENT_FILES=""
			source src/predeploy-«artefact.name».sh 2>&1
			
			for I in $DEPLOY_LIBRARIES; do
				if [ -e "$SMART_ROOT_ACE/bin/$I" ]; then
					FILE="$SMART_ROOT_ACE/bin/$I"
				else
					FILE="$SMART_ROOT_ACE/lib/$I"
				fi
				DEPLOY_LIBRARIES_USER="$DEPLOY_LIBRARIES_USER $FILE"
			done
			
			DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name»=""
			for I in $DEPLOY_COMPONENT_FILES; do
				if ls $REFERENCED_PROJECT_«artefact.type.name»/$I > /dev/null 2>&1; then
					DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name»="$DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name» $REFERENCED_PROJECT_«artefact.type.name»/$I"
				elif ls $I > /dev/null 2>&1; then
					DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name»="$DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name» $I"
				fi
			done
			
			#########################
			## BEHAVIOR FILES
			shopt -u | grep -q nullglob && changed=true && shopt -s nullglob
			for entry in "$REFERENCED_PROJECT_«artefact.type.name»"/model/*.smartTcl
			do
			  DEPLOY_COMPONENT_BEHAVIOR_MODEL_FILES_«artefact.type.name»="$DEPLOY_COMPONENT_TCL_MODEL_FILES_«artefact.type.name» $entry"
			done
			[ $changed ] && shopt -u nullglob; unset changed
			
			echo "$DEPLOY_COMPONENT_BEHAVIOR_MODEL_FILES_«artefact.type.name» "
			#########################
			
			echo
			###############################
			 
		«ENDFOR»
		
		
		DEPL_FILES="
		$SMART_ROOT_ACE/lib/libAceSmartSoftKernel.so
		$SMART_ROOT_ACE/lib/libSmartProperty.so.*
		src-gen/deployment/tiler.sh
		src-gen/deployment/start-«target.name».sh
		«IF target.hasNamingService»
		$SMART_ROOT_ACE/bin/NamingService
		src-gen/deployment/ns_config.ini
		«ENDIF»
		«FOR artefact: target.componentArtefacts.sortBy[it.name]»
			src/«artefact.name»_data
			src/startstop-hooks-«artefact.name».sh
			$SMART_ROOT_ACE/bin/«artefact.type.name»
			src-gen/combined-ini-files/«artefact.name».ini
			«FOR x : artefact.type.allCommObjects.map[(it.eContainer as CommObjectsRepository)].toSet.sortBy[it.name]»
				$SMART_ROOT_ACE/lib/lib«x.name».so*
			«ENDFOR»
		«ENDFOR»
		
		$DEPLOY_LIBRARIES_USER
		"
		
		FILES_MISSING=false
		for FILE in $DEPL_FILES; do
			if [ ! -e $FILE ]; then
				echo "Deployment: No such file or directory: $FILE"
				FILES_MISSING=true
			fi
		done
		
		if [ "$FILES_MISSING" = "true" ]; then
			echo
			echo "ERROR: FILES ARE MISSING FROM THE DEPLOYMENT (see above). Did you compile all components?"
			echo 
			exit 1
		fi
		
		
		if [ "$1" = "local" ]; then
			# local deployment
			mkdir -p $DEPLOYMENT_DIRECTORY
			rsync -l -r -v --progress --exclude ".svn" $DEPL_FILES $DEPLOYMENT_DIRECTORY/«target.name»
		else
			# remote deployment
			SSH_TARGET=«target.sshLoginPair»:$TARGET_DIRECTORY/$DEPLOYMENT_DIRECTORY
			echo "Deployment to $SSH_TARGET"
			ssh «target.sshLoginPair» mkdir -p $TARGET_DIRECTORY/$DEPLOYMENT_DIRECTORY
			
			TMPDIR=$(mktemp -d --suffix=.deployment) || exit 1
			echo "Temporary directory: $TMPDIR"
			mkdir $TMPDIR/behaviorFiles
			trap "rm -rf $TMPDIR" EXIT
			
			# collect files in $TMPDIR
			#rsync -l -r -v --progress --exclude ".svn" $DEPL_FILES $TMPDIR/
			cp -rv $DEPL_FILES $TMPDIR 2>&1
		«««	rsync -l -r -v --progress --exclude ".svn" -e ssh $DEPL_FILES $SSH_TARGET
			«FOR artefact : target.componentArtefacts.sortBy[it.name]»
				#rsync -l -r -v --progress --exclude ".svn" $DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name» $TMPDIR/«artefact.name»_data/
				if [ ! "$DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name»" = "" ]; then
					cp -rv $DEPLOY_COMPONENT_FILES_PATHS_«artefact.type.name» $TMPDIR/«artefact.name»_data/ 2>&1
				fi
				
				if [ ! "$DEPLOY_COMPONENT_BEHAVIOR_MODEL_FILES_«artefact.type.name»" = "" ]; then
					cp -rv $DEPLOY_COMPONENT_BEHAVIOR_MODEL_FILES_«artefact.type.name» $TMPDIR/behaviorFiles/ 2>&1
				fi
				
				cp -v $REFERENCED_PROJECT_«artefact.type.name»/smartsoft/src/startstop-hooks.sh $TMPDIR/startstop-hooks-component-«artefact.type.name».sh 2>/dev/null
			«ENDFOR»
			
			#collect and copy behavior related files
			echo "Sourcing behavior files..."
			test -f src-gen/deployment/deploy-behavior-files.sh && source src-gen/deployment/deploy-behavior-files.sh
			
			# actually deploy:
			rsync -z -l -r -v --progress --exclude ".svn" -e ssh $TMPDIR/ $SSH_TARGET
		fi
		
		
		if [ "$?" != "0" ]; then
			echo "ERROR: Files could not be deployed to remote host."
			#gdialog --title ERROR --msgbox "Files could not be deployed host."
			exit 1
		fi
		
		echo -e "\n\nDeployment to device «target.name» finished.\n\n"
	'''
		
	def startScript(TargetPlatformReference target) 
	'''
		#!/bin/sh
		«getCopyrightHash()»
		#
		# start script for device «target.platform.name»
		
		
		PID_XTERM="/var/tmp/start-«target.platform.name»-xterms.pid"
		PID_COMPONENT_NAMES="/var/tmp/start-«target.platform.name»-component-names.pid"
		
		SCRIPT_DIR=`pwd`
		SCRIPT_NAME=start-«target.platform.name».sh
		
		export SMART_ROOT_DEPLOYMENT=$SCRIPT_DIR
		
		#######
		## case
		case "$1" in
			    
			    
		#########################################################################################
		## start
		start)
		
		true > $PID_XTERM
		true > $PID_COMPONENT_NAMES
		
		echo "Starting scenario..."
		date -R
		
		«IF target.namingService !== null»
		# CONFIGURE NAMING SERVICE
			«IF target.namingService.deploy !== null && target.namingService.deploy.to.host !== null»
			export SMART_NS_ADDR=«target.namingService.deploy.to.host.network.hostAddress»:«target.namingService.portNr»
			«ENDIF»
		«ENDIF»
		
		«IF target.hasNamingService»
			echo "Stopping Naming Service..."
			killall AceSmartSoftNamingService &
			test -e SMART_NAMES && rm -f SMART_NAMES
			sleep 1
			echo Starting Naming Service...
			rm -f AceSmartSoftNamingService.log
			xterm -l -lf AceSmartSoftNamingService.log -title "AceSmartSoftNamingService" -hold -e "export LD_LIBRARY_PATH=$SCRIPT_DIR:\$LD_LIBRARY_PATH; ./NamingService/AceSmartSoftNamingService --ns-port «target.namingService.portNr» --ns-dir ./ --ns-file SMART_NAMES --filename=ns_config.ini; echo; echo; echo 'Naming Service exited'; /bin/bash" &
			echo $! >> $PID_XTERM
			echo AceSmartSoftNamingService >> $PID_COMPONENT_NAMES
			sleep 1
		«ENDIF»
		
		## start components
		«IF target.host !== null»export SMART_IP=«target.host.network.hostAddress»«ENDIF»
		echo "starting components..."
		
		«FOR artefact : target.componentArtefacts.sortBy[it.name]»
			# Component instance «artefact.name»
			echo
			echo "############################################"
			echo "## Starting component instance «artefact.name»"
			cd $SCRIPT_DIR
			echo "executing startstop-hooks-«artefact.name».sh (errors might be ignored)"
			bash startstop-hooks-«artefact.name».sh pre-start
			cd $SCRIPT_DIR/«artefact.name»_data
			rm -f "../«artefact.name».log"
			xterm -l -lf "../«artefact.name».log" -title "«artefact.name»@«target.platform.name» Component" -hold -e "export LD_LIBRARY_PATH=$SCRIPT_DIR:\$LD_LIBRARY_PATH; $SCRIPT_DIR/«artefact.type.name» -filename=$SCRIPT_DIR/«artefact.name».ini; echo; echo; echo '«artefact.name» exited.'; echo; /bin/bash --login" &
			echo $! >> $PID_XTERM
			echo «artefact.type.name» >> $PID_COMPONENT_NAMES
			cd $SCRIPT_DIR
			bash startstop-hooks-«artefact.name».sh post-start
			echo -e "\n\n\n"
			
		«ENDFOR»
		
		cd $SCRIPT_DIR
		
		;; ## start
		
		
		#########################################################################################
		## stop
		stop)
		cd $SCRIPT_DIR
		«FOR artefact : target.componentArtefacts.sortBy[it.name]»
			bash startstop-hooks-«artefact.name».sh pre-stop
		«ENDFOR»
		
		echo "kill all components..."
		
		for I in `cat $PID_COMPONENT_NAMES`; do
		        echo $I
		        killall -2 $I
		done
		rm $PID_COMPONENT_NAMES
		
		sleep 3
		
		for I in `cat $PID_XTERM`; do
		        echo $I
		        kill -2 $I
		done
		rm $PID_XTERM
		
		
		
		«IF target.hasNamingService»
			test -e SMART_NAMES && rm -f SMART_NAMES
		«ENDIF»
		
		««««LET this.eAllContents.typeSelect(AceSmartSoft::RTAISetup).first() AS rs-»
		««««IF rs != null-»
		«««## stop RTAI
		«««echo "removing RTAI modules... (this requires ROOT privileges)"
		«««sudo /sbin/rmmod rtai_usi.ko
		«««sudo /sbin/rmmod rtai_sem.ko
		«««sudo /sbin/rmmod rtai_lxrt.ko
		«««sudo /sbin/rmmod rtai_hal.ko
		««««ENDIF»
		«FOR artefact : target.componentArtefacts.sortBy[it.name]»
			bash startstop-hooks-«artefact.name».sh post-stop
		«ENDFOR»
		
		
		# collect log files
		ls -l *.log && (
			pwd
			tar czvf «target.platform.name»-logs-$(date +"%Y%m%d%H%M").tar.gz *.log
			rm *.log
		)
		
		;; ## stop
		
		
		
		#########################################################################################
		## menu
		
		menu-start)
			bash $SCRIPT_NAME start
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		menu-stop)
			bash $SCRIPT_NAME stop
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		menu-tile)
			bash tiler.sh
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		menu)
		
		#wmctrl -r :ACTIVE: -b add,above
		ACTION=$(whiptail --title "Scenario Control" --menu "Choose an option" 12 35 4 "menu-start" "Start Scenario" "menu-stop" "Stop Scenario" "menu-tile" "Arrange terminals" "quit" "Quit to console" 3>&1 1>&2 2>&3)
		#whiptail --title "Scenario Control" --menu "Choose an option" 10 30 3 "menu-start" "Start Scenario" "menu-stop" "Stop Scenario" "quit" "Quit to console" 2>/tmp/whip
		#ACTION=`cat /tmp/whip`
		
		cd $SCRIPT_DIR
		bash $SCRIPT_NAME $ACTION
		
		;; ## menu
		
		quit)
			bash $SCRIPT_NAME stop
		;;
				
				
		#########################################################################################
		## default
		*)
		echo "No such parameter: $1"
		echo "Usage: $SCRIPT_NAME {start|stop|menu-start|menu-stop|menu}"
		exit 1
		;;
		
		esac
	'''
	
	
	
	
	def deployAllScript(DeploymentModel model) 
	'''
		#!/bin/bash
		«getCopyrightHash()»
		#
		# run this script from the component's root folder to deploy the scenario to robot.
		#
		
		echo "Working directory of deployment script: "`pwd`
		
		BASENAME=`pwd | xargs basename`
		if [ "$BASENAME" != "smartsoft" ]; then
			echo "Folder: $BASENAME vs Model: smartsoft did not match"
			echo "###################################################################"
			echo "ERROR: this script must be called from the project's smartsoft folder."
			echo "###################################################################"
			gdialog --title ERROR --msgbox "ERROR: this script must be called from the component's root folder."
			exit 1
		fi
		
		#gdialog --title "Deployment" --yesno "Deploy scenario to remote host?"
		#if [ "$?" != "0" ]; then
		#	DEPL_MODE="local"
		#fi
		
		echo "combine ini-files"
		bash src-gen/deployment/combine_ini_files.sh
		
		DEVICES="
		«FOR target : model.elements.filter(TargetPlatformReference)»
			«target.platform.name»
		«ENDFOR»
		"
		
		exec 99> >(zenity --progress --auto-close --pulsate --no-cancel --width 300)
		
		for I in $DEVICES; do
			echo "#Deploying Device $I ..." >&99
			#gdialog --title "Deployment" --yesno "Device $I is about to be deployed.\nContinue?" || continue
			
			bash src-gen/deployment/deploy-$I.sh ${DEPL_MODE}
			if [ "$?" != "0" ]; then
				zenity --error --text="Deployment to $I failed.\nAborting Deployment."
				exit 1
			fi
		done
		
		exec 99>&-
		
		gdialog --title "Deployment" --yesno "Deployment finished. Do you want to start it now?"
		if [ "$?" != "0" ]; then
			echo
			echo "Scenario not started."
			echo "Execute the startscript 'start-<DEVICENAME>.sh' on the remote device in order to execute the scenario."
			echo
			exit 0
		fi
		
		if [ "$DEPL_MODE" = "local" ]; then
			for I in $DEVICES; do
				cd «model.name».deployment/$I
				xterm -title "Scenario Control of Device $I" -e "pwd;bash start-$I.sh menu;echo;echo;echo;echo 'You can close this window now.'; echo; echo;bash --login"
			done
		else
			#gdialog --title "Deployment" --yesno "remote start not yet implemented!!!!!!!!!!!!!!!!!!"
			xterm -title "Global Scenario Control" -e "cd src-gen/deployment; pwd; bash start-all.sh menu;echo;echo;echo;echo 'You can close this window now.'; echo; echo;bash --login"
		fi
		
		echo -e "\n\nDeployment finished.\n\n"
		exit 0
	'''
	
	def startAllScript(DeploymentModel model) 
	'''
		#!/bin/bash
		«getCopyrightHash()»
		#
		# Script to start all components on all devices
		#
		
		PID_FILE="/var/tmp/start-all.pid"
		SCRIPT_DIR=`pwd`
		SCRIPT_NAME=start-all.sh
		
		
		
		case "$1" in
		
		start)
			true > $PID_FILE
			
			echo "Starting all devices ..."
			
			«FOR target : model.elements.filter(TargetPlatformReference)»
				echo "Starting «target.sshLoginPair»"
				«IF target.host.network.hostAddress.equals("localhost") || target.host.network.hostAddress.equals("127.0.0.1")»
				xterm -fg red -title "«target.sshLoginPair»" -e 'echo;echo "Starting local session ..."; echo;echo;cd «target.directory?.path»/«model.name».deployment; pwd; bash --login -i -e start-«target.platform.name».sh start' &
				«ELSE»
				xterm -fg red -title "SSH: «target.sshLoginPair»" -e 'echo;echo "Starting remote SSH session at «target.sshLoginPair» ..."; echo;echo;ssh -X «target.sshLoginPair» "cd «target.directory?.path»/«model.name».deployment; pwd; bash --login -i -e start-«target.platform.name».sh start"' &
				«ENDIF»
				echo $! >> $PID_FILE
				
			«ENDFOR»
		;;
		
		stop)
			echo "Stopping all devices"
			
			«FOR target : model.elements.filter(TargetPlatformReference)»
				echo "Stopping «target.sshLoginPair»"
				«IF target.host.network.hostAddress.equals("localhost") || target.host.network.hostAddress.equals("127.0.0.1")»
				xterm -title "stopping «target.sshLoginPair»" -e 'echo;echo "Starting local session ..."; echo;echo;cd «target.directory?.path»/«model.name».deployment; pwd; bash --login -i -e start-«target.platform.name».sh stop'
				«ELSE»
				xterm -title "stopping «target.sshLoginPair»" -e 'echo;echo "Starting remote SSH session at «target.sshLoginPair» ..."; echo;echo;ssh -X «target.sshLoginPair» "cd «target.directory?.path»/«model.name».deployment; pwd; bash --login -i -e start-«target.platform.name».sh stop"'
				«ENDIF» 
				echo $! >> $PID_FILE
				
			«ENDFOR»
			
		## just to make sure:
		sleep 2
		cut -d '"' -f2 $PID_FILE |
		while read number
		do
			echo $number
			kill -9 $number
		done < $PID_FILE
		rm $PID_FILE
		;;
		
		menu-start)
			bash $SCRIPT_NAME start
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		
		menu-stop)
			bash $SCRIPT_NAME stop
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		
		menu-tile)
			bash tiler.sh
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME menu
		;;
		
		
		menu)
			ACTION=$(whiptail --title "Scenario Control" --menu "Choose an option" 12 40 4 "menu-start" "Start Scenario" "menu-stop" "Stop Scenario" "menu-tile" "Arrange terminals" "quit" "Quit to console" 3>&1 1>&2 2>&3)
		
			cd $SCRIPT_DIR
			bash $SCRIPT_NAME $ACTION
		;;
		
		quit)
			bash $SCRIPT_NAME stop
		;;
		
		*)
			echo "No such parameter: $1"
			echo "Usage: $SCRIPT_NAME {start|stop|menu-start|menu-stop|menu}"
		;;
		
		esac
		
		'''
	
	
	def tilerscript() 
	'''
		#!/bin/bash
		«getCopyrightHash()»
		#
		# Parts in this script are taken from: https://github.com/otubo/misc/commit/3bbf0c9ad93b72e802d5591f2364ccb9d457bbc2#diff-0b590c8bfa296cd726e4d93945f0e24d
		
		#get the desktop parameters
		HEIGHT=`xwininfo -root | grep 'Height:' | awk '{print $2}'`
		WIDTH=`xwininfo -root | grep 'Width:' | awk '{print $2}'`
		
		#xterm parameters
		TERM_HEIGHT=316
		TERM_WIDTH=484
		
		#get the window parameters
			
		#get the current desktop
		CURR_DESK=` wmctrl -d | grep '* DG:'| awk '{print $1}'`
		
		#get the total number of windows.
		#NOTE: we are not directly using grep to get the windows from the current desktop as it may serve up some false positives
		COMPONENT_WINDOWS=`wmctrl -lx |grep Component| wc -l`
		SSH_WINDOWS=`wmctrl -lx |grep SSH| wc -l`
		GLOBAL_SCENARIO_WINDOWS=`wmctrl -lx |grep 'Global Scenario Control'| wc -l`
		
		
		#counter
		i=1
		#Assume that there are no Global Scenario Controls in the current desktop
		GLOBAL_SCENARIO_IN_DESK=0
		while  [ $i  -le  $GLOBAL_SCENARIO_WINDOWS ] ; do
			CURR_LINE=`wmctrl -lx | grep 'Global Scenario Control'|head -n $i | tail -n 1`
			WIN_DESK=`echo $CURR_LINE | awk '{print $2}'|sort`
			if  [ $WIN_DESK  -eq  $CURR_DESK ] ; then
			#save the various window properties as supplied by wmctrl .
				GLOBAL_SCENARIO_XID[$GLOBAL_SCENARIO_IN_DESK]=`echo $CURR_LINE | awk '{print $1}'`
			
			#see if the window is "IsViewable" or "IsUnMapped" i.e minimized
				MAP_STATE=`xwininfo -id ${GLOBAL_SCENARIO_XID[$GLOBAL_SCENARIO_IN_DESK]} | grep "Map State:" | awk '{print $3}'`
			#we don't  want the minimized windows to be considered while allocating the space
				if [ "$MAP_STATE"  ==  "IsViewable" ]; then
					GLOBAL_SCENARIO_IN_DESK=$((GLOBAL_SCENARIO_IN_DESK+1))
				else
					GLOBAL_SCENARIO_XID[$GLOBAL_SCENARIO_IN_DESK]=0
				fi	
			fi
			i=$((i+1))
		done
		
		#counter
		i=1
		#Assume that there are no SSH windows in the current desktop
		SSH_IN_DESK=0
		while  [ $i  -le  $SSH_WINDOWS ] ; do
			CURR_LINE=`wmctrl -lx | grep SSH|head -n $i | tail -n 1`
			WIN_DESK=`echo $CURR_LINE | awk '{print $2}'|sort`
			if  [ $WIN_DESK  -eq  $CURR_DESK ] ; then
			#save the various window properties as supplied by wmctrl .
				SSH_XID[$SSH_IN_DESK]=`echo $CURR_LINE | awk '{print $1}'`
				SSH_NAME[$SSH_IN_DESK]=`echo $CURR_LINE | awk '{print substr($0, index($0,$5))}'`
			
			#see if the window is "IsViewable" or "IsUnMapped" i.e minimized
				MAP_STATE=`xwininfo -id ${SSH_XID[$SSH_IN_DESK]} | grep "Map State:" | awk '{print $3}'`
			#we don't  want the minimized windows to be considered while allocating the space
				if [ "$MAP_STATE"  ==  "IsViewable" ]; then
					SSH_IN_DESK=$((SSH_IN_DESK+1))
				else
					SSH_XID[$SSH_IN_DESK]=0
					SSH_NAME[$SSH_IN_DESK]=""	
				fi	
			fi
			i=$((i+1))
		done
		
		#sort SSH
		readarray -t SSH_NAME < <(for a in "${SSH_NAME[@]}"; do echo "$a"; done | sort)
		
		
		#counter
		i=1
		#Assume that there are no windows in the current desktop
		WINDOWS_IN_DESK=0
		while  [ $i  -le  $COMPONENT_WINDOWS ] ; do
			CURR_LINE=`wmctrl -lx | grep Component|head -n $i | tail -n 1`
			WIN_DESK=`echo $CURR_LINE | awk '{print $2}'|sort`
			if  [ $WIN_DESK  -eq  $CURR_DESK ] ; then
			#save the various window properties as supplied by wmctrl .
				WIN_XID[$WINDOWS_IN_DESK]=`echo $CURR_LINE | awk '{print $1}'`
				WIN_NAME[$WINDOWS_IN_DESK]=`echo $CURR_LINE | awk '{print substr($0, index($0,$5))}'`
			
			#see if the window is "IsViewable" or "IsUnMapped" i.e minimized
				MAP_STATE=`xwininfo -id ${WIN_XID[$WINDOWS_IN_DESK]} | grep "Map State:" | awk '{print $3}'`
			#we don't  want the minimized windows to be considered while allocating the space
				if [ "$MAP_STATE"  ==  "IsViewable" ]; then
					WINDOWS_IN_DESK=$((WINDOWS_IN_DESK+1))
				else
					WIN_XID[$WINDOWS_IN_DESK]=0
					WIN_NAME[$WINDOWS_IN_DESK]=""	
				fi	
			fi
			i=$((i+1))
		done
		
		#sort components
		readarray -t WIN_NAME < <(for a in "${WIN_NAME[@]}"; do echo "$a"; done | sort)
		
		
		
		X_POS=0
		Y_POS=0
		DESK=$CURR_DESK
		
		#Gloabal Scenario Control
		i=0
		while [ $i -lt $GLOBAL_SCENARIO_IN_DESK ] ; do
			
			if [ $((WIDTH+25)) -le $((X_POS+TERM_WIDTH)) ] ; then
				#next row
				if [ $Y_POS -eq 0 ] ; then
					Y_POS=$((Y_POS+TERM_HEIGHT+53))
				else
					Y_POS=$((Y_POS+TERM_HEIGHT+30))
				fi
				X_POS=0
			fi
			if [ $((Y_POS+TERM_HEIGHT)) -ge $((HEIGHT+5)) ] ; then
				#next Desktop
				DESK=$(((DESK+1)%4))
				X_POS=0
				Y_POS=0
			fi
			wmctrl  -i  -r ${GLOBAL_SCENARIO_XID[$i]}  -b remove,maximized_vert,maximized_horz
			wmctrl  -i  -r ${GLOBAL_SCENARIO_XID[$i]} -e "0,$X_POS,$Y_POS,$TERM_WIDTH,$TERM_HEIGHT"
			wmctrl  -i  -r ${GLOBAL_SCENARIO_XID[$i]} -t "$DESK"
		
			X_POS=$((X_POS+TERM_WIDTH))
			i=$((i+1))
		done
		
		#SSH
		i=0
		while [ $i -lt $SSH_IN_DESK ] ; do
			
			if [ $((WIDTH+25)) -le $((X_POS+TERM_WIDTH)) ] ; then
				#next row
				if [ $Y_POS -eq 0 ] ; then
					Y_POS=$((Y_POS+TERM_HEIGHT+53))
				else
					Y_POS=$((Y_POS+TERM_HEIGHT+30))
				fi
				X_POS=0
			fi
			if [ $((Y_POS+TERM_HEIGHT)) -ge $((HEIGHT+5)) ] ; then
				#next Desktop
				DESK=$(((DESK+1)%4))
				X_POS=0
				Y_POS=0
			fi
			wmctrl    -r ${SSH_NAME[$i]}  -b remove,maximized_vert,maximized_horz
			wmctrl    -r ${SSH_NAME[$i]} -e "0,$X_POS,$Y_POS,$TERM_WIDTH,$TERM_HEIGHT"
			wmctrl    -r ${SSH_NAME[$i]} -t "$DESK"
		
			X_POS=$((X_POS+TERM_WIDTH))
			i=$((i+1))
		done
		
		
		#components
		i=0
		while [ $i -lt $WINDOWS_IN_DESK ] ; do
			
			if [ $((WIDTH+25)) -le $((X_POS+TERM_WIDTH)) ] ; then
				#next row
				if [ $Y_POS -eq 0 ] ; then
					Y_POS=$((Y_POS+TERM_HEIGHT+53))
				else
					Y_POS=$((Y_POS+TERM_HEIGHT+30))
				fi
				X_POS=0
			fi
			if [ $((Y_POS+TERM_HEIGHT)) -ge $((HEIGHT+5)) ] ; then
				#next Desktop
				DESK=$(((DESK+1)%4))
				X_POS=0
				Y_POS=0
			fi
			wmctrl    -r ${WIN_NAME[$i]}  -b remove,maximized_vert,maximized_horz
			wmctrl    -r ${WIN_NAME[$i]} -e "0,$X_POS,$Y_POS,$TERM_WIDTH,$TERM_HEIGHT"
			wmctrl    -r ${WIN_NAME[$i]} -t "$DESK"
		
			X_POS=$((X_POS+TERM_WIDTH))
			i=$((i+1))
		done
	'''
}