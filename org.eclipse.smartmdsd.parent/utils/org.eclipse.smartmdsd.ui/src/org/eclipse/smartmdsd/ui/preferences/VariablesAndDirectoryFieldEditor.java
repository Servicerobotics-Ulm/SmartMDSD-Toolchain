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
package org.eclipse.smartmdsd.ui.preferences;

import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * SWT-based implementation of a directory-selection field (and open-directory button)
 * for an Eclipse Preferences page elements.
 * 
 * @author alex-lotz
 *
 */
public class VariablesAndDirectoryFieldEditor extends DirectoryFieldEditor {
    /**
     * The variables button, or <code>null</code> if none
     * (before creation and after disposal).
     */
    private Button variablesButton;
    
	
	public VariablesAndDirectoryFieldEditor(String name, String labelText, Composite parent) 
	{
		super(name,labelText,parent);
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
	
	@Override
	protected boolean doCheckState() {
		String fileName = getTextControl().getText();
        if (fileName.length() > 0 && fileName.startsWith("${")) {
			return true;
		} else {
			return super.doCheckState();
		}
	}
}
