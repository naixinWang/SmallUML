/**
 * generated by Xtext 2.10.1
 */
package org.xtext.example.eaa;

import org.xtext.example.eaa.MyDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {
  public static void doSetup() {
    MyDslStandaloneSetup _myDslStandaloneSetup = new MyDslStandaloneSetup();
    _myDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
