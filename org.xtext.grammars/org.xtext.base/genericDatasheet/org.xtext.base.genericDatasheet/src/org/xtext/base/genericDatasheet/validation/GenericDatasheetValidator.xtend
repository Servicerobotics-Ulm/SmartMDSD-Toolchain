//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.base.genericDatasheet.validation

import org.eclipse.xtext.validation.Check
import org.ecore.base.genericDatasheet.SpdxLicense
import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException
import org.ecore.base.genericDatasheet.GenericDatasheetPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GenericDatasheetValidator extends AbstractGenericDatasheetValidator {
	
	public static val INVALID_SPDX_ID = 'invalidSpdxId'
	
	@Check
	def checkSpdxId(SpdxLicense license) {
		var URL url;
		var validId = false;
		try {
		    url = new URL("platform:/plugin/org.xtext.base.genericDatasheet/spdx-licenses.txt");
		    val inputStream = url.openConnection().getInputStream();
		    val in = new BufferedReader(new InputStreamReader(inputStream));
		    var String inputLine;
		 
		    while ((inputLine = in.readLine()) !== null) {
		    	if(license.licenseID==inputLine) {
		    		validId = true;
		    	}
		    }
		 
		    in.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		if(validId == false) {
			warning("Invalid SPDX id, see platform:/plugin/org.xtext.base.genericDatasheet/spdx-licenses.txt for valid definitions.",
				GenericDatasheetPackage.Literals.SPDX_LICENSE__LICENSE_ID,
				INVALID_SPDX_ID
			)
		}
	}
}
