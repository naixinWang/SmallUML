/**
 */
package EAA.impl;

import EAA.Association;
import EAA.EAAPackage;
import EAA.Entity;
import EAA.Schema;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EAA.impl.SchemaImpl#getAss <em>Ass</em>}</li>
 *   <li>{@link EAA.impl.SchemaImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
	/**
	 * The cached value of the '{@link #getAss() <em>Ass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAss()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ass;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> e;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EAAPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAss() {
		if (ass == null) {
			ass = new EObjectContainmentEList<Association>(Association.class, this, EAAPackage.SCHEMA__ASS);
		}
		return ass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getE() {
		if (e == null) {
			e = new EObjectContainmentEList<Entity>(Entity.class, this, EAAPackage.SCHEMA__E);
		}
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EAAPackage.SCHEMA__ASS:
				return ((InternalEList<?>)getAss()).basicRemove(otherEnd, msgs);
			case EAAPackage.SCHEMA__E:
				return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EAAPackage.SCHEMA__ASS:
				return getAss();
			case EAAPackage.SCHEMA__E:
				return getE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EAAPackage.SCHEMA__ASS:
				getAss().clear();
				getAss().addAll((Collection<? extends Association>)newValue);
				return;
			case EAAPackage.SCHEMA__E:
				getE().clear();
				getE().addAll((Collection<? extends Entity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EAAPackage.SCHEMA__ASS:
				getAss().clear();
				return;
			case EAAPackage.SCHEMA__E:
				getE().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EAAPackage.SCHEMA__ASS:
				return ass != null && !ass.isEmpty();
			case EAAPackage.SCHEMA__E:
				return e != null && !e.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
