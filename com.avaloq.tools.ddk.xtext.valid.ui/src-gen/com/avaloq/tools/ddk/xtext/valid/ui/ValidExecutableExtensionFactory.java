/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.xtext.valid.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.avaloq.tools.ddk.xtext.valid.ui.internal.ValidActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ValidExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ValidActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ValidActivator.getInstance().getInjector(ValidActivator.COM_AVALOQ_TOOLS_DDK_XTEXT_VALID_VALID);
	}
	
}
