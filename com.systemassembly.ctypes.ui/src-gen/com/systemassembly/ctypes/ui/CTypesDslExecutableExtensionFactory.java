/*
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.ui;

import com.google.inject.Injector;
import com.systemassembly.ctypes.ui.internal.CtypesActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CTypesDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CtypesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CtypesActivator activator = CtypesActivator.getInstance();
		return activator != null ? activator.getInjector(CtypesActivator.COM_SYSTEMASSEMBLY_CTYPES_CTYPESDSL) : null;
	}

}
