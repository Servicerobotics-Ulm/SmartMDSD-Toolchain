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
package org.xtext.service.skillDefinition.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;
import org.xtext.base.basicAttributes.validation.BasicAttributesValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractSkillDefinitionValidator extends BasicAttributesValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ecore.org/service/SkillDefinition"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ecore.org/base/BasicAttributes"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ecore.org/base/documentation"));
		return result;
	}
}
