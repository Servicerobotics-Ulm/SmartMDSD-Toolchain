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
package org.xtext.system.datasheetPropertyChecks;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.Properties;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ITokenToStringConverter;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.antlr.LexerProvider;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.IgnoreCaseLinking;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer;
import org.eclipse.xtext.service.DefaultRuntimeModule;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;
import org.xtext.system.datasheetPropertyChecks.formatting2.SystemDatasheetPropertyChecksFormatter;
import org.xtext.system.datasheetPropertyChecks.generator.SystemDatasheetPropertyChecksGenerator;
import org.xtext.system.datasheetPropertyChecks.parser.antlr.SystemDatasheetPropertyChecksAntlrTokenFileProvider;
import org.xtext.system.datasheetPropertyChecks.parser.antlr.SystemDatasheetPropertyChecksParser;
import org.xtext.system.datasheetPropertyChecks.parser.antlr.internal.InternalSystemDatasheetPropertyChecksLexer;
import org.xtext.system.datasheetPropertyChecks.scoping.SystemDatasheetPropertyChecksScopeProvider;
import org.xtext.system.datasheetPropertyChecks.serializer.SystemDatasheetPropertyChecksSemanticSequencer;
import org.xtext.system.datasheetPropertyChecks.serializer.SystemDatasheetPropertyChecksSyntacticSequencer;
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;
import org.xtext.system.datasheetPropertyChecks.validation.SystemDatasheetPropertyChecksConfigurableIssueCodesProvider;
import org.xtext.system.datasheetPropertyChecks.validation.SystemDatasheetPropertyChecksValidator;

/**
 * Manual modifications go to {@link SystemDatasheetPropertyChecksRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractSystemDatasheetPropertyChecksRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "org/xtext/system/datasheetPropertyChecks/SystemDatasheetPropertyChecks.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("systemDatasheetPropertyChecks");
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public Class<? extends IGrammarAccess> bindIGrammarAccess() {
		return SystemDatasheetPropertyChecksGrammarAccess.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
		return SystemDatasheetPropertyChecksSemanticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
		return SystemDatasheetPropertyChecksSyntacticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IParser> bindIParser() {
		return SystemDatasheetPropertyChecksParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
		return AntlrTokenToStringConverter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return SystemDatasheetPropertyChecksAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends Lexer> bindLexer() {
		return InternalSystemDatasheetPropertyChecksLexer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
		return AntlrTokenDefProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Provider<? extends InternalSystemDatasheetPropertyChecksLexer> provideInternalSystemDatasheetPropertyChecksLexer() {
		return LexerProvider.create(InternalSystemDatasheetPropertyChecksLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(InternalSystemDatasheetPropertyChecksLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
	@SingletonBinding(eager=true)
	public Class<? extends SystemDatasheetPropertyChecksValidator> bindSystemDatasheetPropertyChecksValidator() {
		return SystemDatasheetPropertyChecksValidator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
	public Class<? extends ConfigurableIssueCodesProvider> bindConfigurableIssueCodesProvider() {
		return SystemDatasheetPropertyChecksConfigurableIssueCodesProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return SystemDatasheetPropertyChecksScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(ImportedNamespaceAwareLocalScopeProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return DefaultGlobalScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIgnoreCaseLinking(Binder binder) {
		binder.bindConstant().annotatedWith(IgnoreCaseLinking.class).to(false);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return DefaultDeclarativeQualifiedNameProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return StateBasedContainerManager.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return ResourceSetBasedAllContainersStateProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptions(Binder binder) {
		binder.bind(IResourceDescriptions.class).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptionsPersisted(Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.generator.GeneratorFragment2
	public Class<? extends IGenerator2> bindIGenerator2() {
		return SystemDatasheetPropertyChecksGenerator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public Class<? extends IFormatter2> bindIFormatter2() {
		return SystemDatasheetPropertyChecksFormatter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public void configureFormatterPreferences(Binder binder) {
		binder.bind(IPreferenceValuesProvider.class).annotatedWith(FormatterPreferences.class).to(FormatterPreferenceValuesProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment2
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Ecore2XtextTerminalConverters.class;
	}
	
}
