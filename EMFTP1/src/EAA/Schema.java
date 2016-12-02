/**
 */
package EAA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EAA.Schema#getAss <em>Ass</em>}</li>
 *   <li>{@link EAA.Schema#getE <em>E</em>}</li>
 * </ul>
 *
 * @see EAA.EAAPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Ass</b></em>' containment reference list.
	 * The list contents are of type {@link EAA.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass</em>' containment reference list.
	 * @see EAA.EAAPackage#getSchema_Ass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Association> getAss();

	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference list.
	 * The list contents are of type {@link EAA.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' containment reference list.
	 * @see EAA.EAAPackage#getSchema_E()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Entity> getE();

} // Schema
