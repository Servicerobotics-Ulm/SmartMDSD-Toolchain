//================================================================
//
//  Copyright (C) 2016 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
