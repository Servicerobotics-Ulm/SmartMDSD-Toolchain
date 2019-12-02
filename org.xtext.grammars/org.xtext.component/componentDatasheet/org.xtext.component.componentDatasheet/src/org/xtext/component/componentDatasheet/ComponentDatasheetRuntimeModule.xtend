//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.xtext.component.componentDatasheet

import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ComponentDatasheetRuntimeModule extends AbstractComponentDatasheetRuntimeModule {
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ComponentDatasheetQNameProvider
	}
}
