package org.xtend.system.datasheet.generator;

import org.eclipse.core.commands.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.RegistryToggleState;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.smartsoft.utils.commands.AutoCodeGeneration;
import org.xtend.smartsoft.generator.GeneratorHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SkillJsonGenerator extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);  
	    Command command = commandService.getCommand(AutoCodeGeneration.COMMAND_ID);
		boolean activatedCodeGenerator = (Boolean)command.getState(RegistryToggleState.STATE_ID).getValue();
		
		if(activatedCodeGenerator == true) {
			// use google Guice to resolve all injected Xtend classes!
			Injector injector = Guice.createInjector(new SkillJsonGeneratorModule());
			SkillJsonGeneratorImpl gen = injector.getInstance(SkillJsonGeneratorImpl.class);
			
			// use the generator-helper class
			GeneratorHelper genHelper = new GeneratorHelper(injector,resource);

			// create the datasheet folder (if not already created)
			genHelper.createFolder(IFileSystemAccess.DEFAULT_OUTPUT);
			
			// clean-up the "datasheet/src-gen" directory
			genHelper.invokeDirectoryCleaner(IFileSystemAccess2.DEFAULT_OUTPUT);
			
			// execute generator using a configured FileSystemAccess
			gen.doGenerate(resource, genHelper.getConfiguredFileSystemAccess(), context);
			
			// refresh the source-folder (and its subfolders down to depth 3) for making changes visible
			genHelper.refreshFolder(IFileSystemAccess.DEFAULT_OUTPUT, 2);
		} else {
//			System.out.println("Component CodeGenerator deactivated");
		}
	}
	

}
