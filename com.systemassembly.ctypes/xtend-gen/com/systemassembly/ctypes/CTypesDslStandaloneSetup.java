/**
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes;

import com.systemassembly.ctypes.CTypesDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CTypesDslStandaloneSetup extends CTypesDslStandaloneSetupGenerated {
  public static void doSetup() {
    new CTypesDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}