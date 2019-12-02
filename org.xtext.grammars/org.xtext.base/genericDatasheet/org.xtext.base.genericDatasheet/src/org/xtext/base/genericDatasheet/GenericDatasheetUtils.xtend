//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.base.genericDatasheet

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