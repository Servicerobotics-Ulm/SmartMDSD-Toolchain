# The SmartMDSD Toolchain

This repository provides the sources of the **SmartMDSD Toolchain version 3**.

The SmartMDSD Toolchain is an Eclipse-based Integrated Development Environment (IDE) for software development and system composition in a robotics software business ecosystem. It supports the different roles that act around the development of robotics systems to offer software components and/or use software components to build systems.

The SmartMDSD Toolchain is maintained by the Service Robotics Research Center at the Ulm University of Applied Sciences and is licensed under the [**BSD-3-Clause**](https://opensource.org/licenses/BSD-3-Clause) open-source license.

For more information about the SmartMDSD Toolchain, documentation, and tutorials, please visit the [**Servicerobotik Ulm Wiki**](https://wiki.servicerobotik-ulm.de/smartmdsd-toolchain:start).



## Installation Instructions

A detailed step-by-step installation instructions can be found at the [**SmartMDSD Toolchain installation instructions Wiki page**](https://wiki.servicerobotik-ulm.de/smartmdsd-toolchain:installation).

The SmartMDSD Toolchain offers an easy to use installer in two variants, one for installing a basic Eclipse Instance that imports the toolchain plugin sources in a new workspace, and another installer that again creates a new Eclipse instance, but also installs precompiled plugin binaries so that you can start right away to develop new Components and System with the SmartMDSD toolchain.

The SmartMDSD Toolchain is by itself **platform-independent**, and requires a **Java Runtime Enviroment (JRE) version 8** as the only mandatory dependency. In case you are using **Ubuntu Linux** (Ubuntu 16.04 is well tested with the toolchain) we recommend to install the **openjdk-8-jdk** Debian package.

The overall installation procedure consist of two main steps:

1. Download the latest **default Eclipse (OOMPH) Installer** from the official site: [**www.eclipse.org/downloads**](https://www.eclipse.org/downloads/)

2. Download one of the provided **Installer Configuration Setups** depending on whether you want to investigate the toolchain sources or if you just want to use the preinstalled toolchain version to develop robotics software components and systems:

 * Option (a): for the **runtime** usage of the SmartMDSD Toolchain, please use the [**SmartMDSD.runtime.setup**](org.smartmdsd.infrastructure/org.smartmdsd.installer/SmartMDSD.runtime.setup)
 * Option (b): for the **source-install** of the SmartMDSD Toolchain, please use the [**SmartMDSD.github.setup**](org.smartmdsd.infrastructure/org.smartmdsd.installer/SmartMDSD.github.setup)



