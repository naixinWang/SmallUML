/**
 */
package EAA;

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
 *   <li>{@link EAA.Association#getName <em>Name</em>}</li>
 *   <li>{@link EAA.Association#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link EAA.Association#getListeRole <em>Liste Role</em>}</li>
 * </ul>
 *
 * @see EAA.EAAPackage#getAssociation()
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
	 * @see EAA.EAAPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EAA.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Liste Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link EAA.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Attribute</em>' containment reference list.
	 * @see EAA.EAAPackage#getAssociation_ListeAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getListeAttribute();

	/**
	 * Returns the value of the '<em><b>Liste Role</b></em>' containment reference list.
	 * The list contents are of type {@link EAA.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Role</em>' containment reference list.
	 * @see EAA.EAAPackage#getAssociation_ListeRole()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Role> getListeRole();

} // Association
