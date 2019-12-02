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
package org.smartmdsd.navigator.content;

import org.smartmdsd.utils.natures.ComponentNature;

public class ComponentDiagramContentProvider extends AbstractSiriusDiagramContentProvider {
	@Override
	protected String getModelFileExtension() {
		return ComponentNature.DSL.ComponentDefinition.getModelFileExtension();
	}
}
