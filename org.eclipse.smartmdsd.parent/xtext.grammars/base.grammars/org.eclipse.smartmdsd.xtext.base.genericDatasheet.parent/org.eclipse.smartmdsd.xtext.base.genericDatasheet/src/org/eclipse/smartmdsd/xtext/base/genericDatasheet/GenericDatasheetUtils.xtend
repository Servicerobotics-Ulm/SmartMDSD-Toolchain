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
package org.eclipse.smartmdsd.xtext.base.genericDatasheet

import java.util.Collection
import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException

class GenericDatasheetUtils {
	def static Collection<String> getSpdxLicenseNames() {
		val result = newArrayList
		try {
			var url = new URL("platform:/plugin/org.xtext.base.genericDatasheet/spdx-licenses.txt");
			val inputStream = url.openConnection().getInputStream();
			val in = new BufferedReader(new InputStreamReader(inputStream));
			var String inputLine;

			while ((inputLine = in.readLine()) !== null) {
				result.add(inputLine)
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	} 
}
