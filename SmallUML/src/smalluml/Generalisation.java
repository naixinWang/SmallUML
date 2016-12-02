/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Generalisation#getSource <em>Source</em>}</li>
 *   <li>{@link smalluml.Generalisation#getCible <em>Cible</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getGeneralisation()
 * @model
 * @generated
 */
public interface Generalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SmallClass)
	 * @see smalluml.SmallumlPackage#getGeneralisation_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SmallClass getSource();

	/**
	 * Sets the value of the '{@link smalluml.Generalisation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SmallClass value);

	/**
	 * Returns the value of the '<em><b>Cible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' containment reference.
	 * @see #setCible(SmallClass)
	 * @see smalluml.SmallumlPackage#getGeneralisation_Cible()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SmallClass getCible();

	/**
	 * Sets the value of the '{@link smalluml.Generalisation#getCible <em>Cible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' containment reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(SmallClass value);

} // Generalisation
