/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.PascalitoStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PascalitoStandaloneSetup extends PascalitoStandaloneSetupGenerated {
  public static void doSetup() {
    PascalitoStandaloneSetup _pascalitoStandaloneSetup = new PascalitoStandaloneSetup();
    _pascalitoStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
