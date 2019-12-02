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

import org.smartmdsd.utils.natures.SystemNature;

public class SystemComponentArchitectureDiagramContentProvider extends AbstractSiriusDiagramContentProvider {
	@Override
	protected String getModelFileExtension() {
		return SystemNature.DSL.SystemComponentArchitecture.getModelFileExtension();
	}
}
