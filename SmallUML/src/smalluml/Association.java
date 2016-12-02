/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Association#getName <em>Name</em>}</li>
 *   <li>{@link smalluml.Association#getSource <em>Source</em>}</li>
 *   <li>{@link smalluml.Association#getCible <em>Cible</em>}</li>
 *   <li>{@link smalluml.Association#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link smalluml.Association#getListeRole <em>Liste Role</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smalluml.SmallumlPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smalluml.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see smalluml.SmallumlPackage#getAssociation_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SmallClass getSource();

	/**
	 * Sets the value of the '{@link smalluml.Association#getSource <em>Source</em>}' containment reference.
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
	 * @see smalluml.SmallumlPackage#getAssociation_Cible()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SmallClass getCible();

	/**
	 * Sets the value of the '{@link smalluml.Association#getCible <em>Cible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' containment reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(SmallClass value);

	/**
	 * Returns the value of the '<em><b>Liste Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Attribute</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getAssociation_ListeAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getListeAttribute();

	/**
	 * Returns the value of the '<em><b>Liste Role</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Role</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getAssociation_ListeRole()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Role> getListeRole();

} // Association
