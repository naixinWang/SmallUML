/*
 * generated by Xtext 2.10.1
 */
package org.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SmallUMLStandaloneSetup extends SmallUMLStandaloneSetupGenerated {

	def static void doSetup() {
		new SmallUMLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}