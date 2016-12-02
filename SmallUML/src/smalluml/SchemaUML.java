/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema UML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.SchemaUML#getGene <em>Gene</em>}</li>
 *   <li>{@link smalluml.SchemaUML#getC <em>C</em>}</li>
 *   <li>{@link smalluml.SchemaUML#getAss <em>Ass</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getSchemaUML()
 * @model
 * @generated
 */
public interface SchemaUML extends EObject {
	/**
	 * Returns the value of the '<em><b>Gene</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Generalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gene</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getSchemaUML_Gene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalisation> getGene();

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.SmallClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getSchemaUML_C()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<SmallClass> getC();

	/**
	 * Returns the value of the '<em><b>Ass</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getSchemaUML_Ass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAss();

} // SchemaUML
