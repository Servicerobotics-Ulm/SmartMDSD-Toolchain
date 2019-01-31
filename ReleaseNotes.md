# Release Notes

This file contains the release notes for the SmartMDSD Toolchain version 3.x. For each release, it provides important information to users to support them in switching from one specific version the previous version. This includes information and instructions how to migrate content from one version to another.

## v3.8

This release does not involve any changes for the existing projects created with the previous SmartMDSD Toolchain v3.7.


## v3.7

* In previous versions of the Toolchain, the Java Classpath of each project required a dependency to two libraries
  * ECLIPSE_HOME/plugins/org.xtext.base.stateMachine_3.4.0.jar
  * ECLIPSE_HOME/plugins/org.xtext.service.parameterDefinition_3.4.0.jar
* Since version 3.7 these libraries do not exists anymore. If you have an old project please remove these library dependencies from your project's java classpath. You can do this either by opening the project properties in Eclipse (right click on the project within the Project Explorer, select **Properties -> Java Build Path -> Libraries** and delete the conflicting dependencies here). Or just open the hidden **.classpath** file in the project folder and delete the two classpath entries mentioned above.

* It is now recommended to deactivate the global (automatic) C++ indexer, which will consume all your memory for projects with heavy dependencies (such as e.g. ROS). You can still trigger the indexer for individual projects manually, but do not activate the automatic indexer update.
  * To deactivate the automatic indexer for your workspace, go to **Window -> Preferences -> C/C++ -> Indexer** and **deactivate the option "Automatically update the index"** (this option is highlighted with black color for a reason as it seems to be an evil option ;-)).
  * To manually trigger the C++ indexer for your project, **right-click on your project** within the project explorer and select **Index -> Rebuild**.
If you used the new Eclipse Installer to install the SmartMDSD Toolchain, then the global index update should be automatically deactivated by default.
