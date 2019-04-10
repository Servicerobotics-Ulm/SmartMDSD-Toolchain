//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
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
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.smartmdsd.utils;

import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * SWT-based implementation of a file-selection field (and open-file button)
 * for an Eclipse Preferences page elements.
 * 
 * @author alex-lotz
 *
 */
public class VariablesAndFileFieldEditor extends FileFieldEditor {
    /**
     * The variables button, or <code>null</code> if none
     * (before creation and after disposal).
     */
    private Button variablesButton;
    
    public VariablesAndFileFieldEditor(String name, String labelText, Composite parent) {
    	super(name,labelText,parent);
    }
	
    @Override
    protected boolean checkState() {
    	String text = getTextControl().getText();
    	if(text.length() > 0 && text.startsWith("${")) {
    		return true;
    	}
    	return super.checkState();
    }
    
    
	@Override
	public int getNumberOfControls() {
		return 4;
	}
	
	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		super.doFillIntoGrid(parent, numColumns-1);
		variablesButton = getVariablesButton(parent);
        GridData gd = new GridData();
        gd.horizontalAlignment = GridData.FILL;
        int widthHint = convertHorizontalDLUsToPixels(variablesButton,
                IDialogConstants.BUTTON_WIDTH);
        gd.widthHint = Math.max(widthHint, variablesButton.computeSize(
                SWT.DEFAULT, SWT.DEFAULT, true).x);
        variablesButton.setLayoutData(gd);
	}
	
	protected Button getVariablesButton(Composite parent) {
        if (variablesButton == null) {
        	variablesButton = new Button(parent, SWT.PUSH);
            variablesButton.setText("Variables...");
            variablesButton.setFont(parent.getFont());
            variablesButton.addSelectionListener(new SelectionAdapter() {
                @Override
				public void widgetSelected(SelectionEvent evt) {
                    String newValue = getVariableSelection(parent.getShell());
                    if (newValue != null) {
                        setStringValue(newValue);
                    }
                }
            });
            variablesButton.addDisposeListener(event -> variablesButton = null);
        } else {
            checkParent(variablesButton, parent);
        }
        return variablesButton;
	}
	
	protected String getVariableSelection(Shell shell) {
		StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(shell);
		if(dialog.open()==Window.OK) {
			return dialog.getVariableExpression();
		}
		return null;
	}
}
