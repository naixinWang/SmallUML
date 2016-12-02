/**
 * generated by Xtext 2.10.1
 */
package org.xtext.example.eaa.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.eaa.myDsl.Association#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.eaa.myDsl.Association#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.eaa.myDsl.MyDslPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Type
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.eaa.myDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.xtext.example.eaa.myDsl.MyDslPackage#getAssociation_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.eaa.myDsl.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference list.
   * @see org.xtext.example.eaa.myDsl.MyDslPackage#getAssociation_Role()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRole();

} // Association