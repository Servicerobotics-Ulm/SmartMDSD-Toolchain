This folder contains all the Ecore metamodels that are used as a basis for textual and graphical model editors.

For creating a new metamodel, please read and follow the following instructions:

1) Create an Ecore modeling project
-----------------------------------
- In Eclipse go to menu: File -> New -> Project...
- Within the popup menu select: "Eclipse Modeling Framework" -> "Ecore Modeling Project"
- press "Next" button
- now give a Project name according to the following naming convention:

For naming Ecore projects, there are three top-level categories whose names should be used as prefix:
- org.ecore.service (pre-component, service design phase)
- org.ecore.component (component design phase)
- org.ecore.system (system design phase)

Depending on the prefix, the project name can be defined as follows:
<prefix>.<project-name-with-small-first-letter> (please never use a capital first letter as this will later break package naming)
example: "org.ecore.service.communicationPattern"

- press "Next" button
- now the package-name should be the last segment of the project-name, starting with a small letter (this is important!)
--> using the above example, the package-name would be "communicationPattern"
- the NS-URI should be modified as follows (not using the proposed default generation):
--> for the above example the NS-URI should be named as follows:
--> "http://www.ecore.org/service/CommunicationPattern" (please note the capital first letter of the last segment)
- the NS-Prefix should be named as the last segment in the NS-URI, in this example this will be: "CommunicationPattern"

- press "Next" button
- the "Design" viewpont should be selected (default choice)
- press "Finish"

2) Setting-up JVM version and EMF compliance
--------------------------------------------
Before generating the model code, you should specify the exact JVM Version and EMF compliance. This can be done as follows.

- open the "MANIFEST.MF" file from the subfolder "META-INF" of your Ecore project
- (don't forget to define the general information, such as the Plugin Version/Name/Vendor)
- in the "Execution Environment" section, check if there is a JVM specified
--> at the moment we use JavaSE-1.8 (press the "Add" button to add it if it was not selected automatically)
- in case when you changed the JVM, don't forget to update the classpath; this can be done by clicking on thes hyperlink named:
--> "Update the classpath settings"

- you can now close the manifest file
- next, we will setup the EMF compliance, therefore:
- open your "<PackageName>.genmodel" file located in the "model" folder of your Ecore project
- open the "Properties View" to see the genmodel properties
- expand the tree-node called "All" where you should see the subnode named "Compliance Level"
--> we need at least compliance level "6" or greater for our sources

Now you have all the minimum setup steps and if you have defined your Ecore model, 
then you can generate the source code by right clicking on the root element in your "Genmodel" and
selecting the submenu "Generate Model Code"

Just in case if you need to derive an Xtext grammar from your Ecore model, don't forget to set the Xtext nature to your Ecore project. 
This can be dony by right-clicking on your Ecore project and selecting the submenu:
- "Configure" -> "Convert to Xtext Project"

