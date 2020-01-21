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
package org.eclipse.smartmdsd.ecore.base.documentation

class DocumentationUtility {
	def static String getMultilineHtmlText(String comment) {
		if (comment !== null && comment.trim().length() > 3) {
			var trimmed_comment = comment.trim();

			if (trimmed_comment.startsWith("///")) {
				// single line comment, so we don't have to parse the multiple lines
				return getFirstLine(comment);
			}

			if (trimmed_comment.startsWith("/**")) {
				// skip the leading three characters "/**" and also the tailing two characters "*/"
				trimmed_comment = trimmed_comment.substring(3, trimmed_comment.length() - 2);

				// iterate over the lines, remove the leading '*' character
				var result = "<p>";
				val lines = trimmed_comment.split(System.getProperty("line.separator"));
				for (line : lines) {
					val trimmed_line = line.trim();
					if (trimmed_line.startsWith("*")) {
						// remove the leading '*' character
						result = result + trimmed_line.substring(1)
					} else {
						result = result + trimmed_line
					}
					if(trimmed_line.empty || trimmed_line.equals("*")) {
						result = result + "</p>\n<p>"
					} else {
						result = result + "\n"
					}
				}
				result = result + "</p>"
				return result;
			}
		}
		return "";
	}
	
	def static String getFirstLine(String comment) {
		if (comment !== null && comment.trim().length() > 3) {
			// skip leading 3 characters which are either "///" or "/**"
			var docu_text = comment.trim().substring(3);
			val lines = docu_text.split(System.getProperty("line.separator"));
			var first_line = lines.get(0);
			if (first_line.endsWith("*/")) {
				// remove the last two characters
				first_line = first_line.substring(0, first_line.length() - 2);
			}
			return first_line;
		}
		return "";
	}
}