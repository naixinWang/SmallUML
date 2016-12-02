/**
 */
package EAA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EAA.Entity#getName <em>Name</em>}</li>
 *   <li>{@link EAA.Entity#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link EAA.Entity#getListeRole <em>Liste Role</em>}</li>
 * </ul>
 *
 * @see EAA.EAAPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see EAA.EAAPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EAA.Entity#getName <em>Name</em>}' attribute.
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
	 * @see EAA.EAAPackage#getEntity_ListeAttribute()
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
	 * @see EAA.EAAPackage#getEntity_ListeRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getListeRole();

} // Entity
