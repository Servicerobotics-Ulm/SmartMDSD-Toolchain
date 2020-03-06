/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.sirius.utils;

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;

public class CommPortEditPartProvider extends AbstractEditPartProvider {
    @Override
    protected Class<?> getNodeEditPartClass(View view) {
        if (view.getElement() instanceof CustomStyle) {
            //CustomStyle customStyle = (CustomStyle) view.getElement();
            return CommPortEditPart.class;
        }
        return super.getNodeEditPartClass(view);
    }
}
