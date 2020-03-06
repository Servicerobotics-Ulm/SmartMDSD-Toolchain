/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.navigator.content;

import org.eclipse.smartmdsd.ui.natures.SystemNature;

public class TargetPlatformDiagramContentProvider extends AbstractSiriusDiagramContentProvider {
	@Override
	protected String getModelFileExtension() {
		return SystemNature.DSL.TargetPlatform.getModelFileExtension();
	}
}
