/**
 */
package EAA.impl;

import EAA.Association;
import EAA.Attribute;
import EAA.EAAPackage;
import EAA.Role;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EAA.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link EAA.impl.AssociationImpl#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link EAA.impl.AssociationImpl#getListeRole <em>Liste Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListeAttribute() <em>Liste Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> listeAttribute;

	/**
	 * The cached value of the '{@link #getListeRole() <em>Liste Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> listeRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EAAPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EAAPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getListeAttribute() {
		if (listeAttribute == null) {
			listeAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE);
		}
		return listeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getListeRole() {
		if (listeRole == null) {
			listeRole = new EObjectContainmentEList<Role>(Role.class, this, EAAPackage.ASSOCIATION__LISTE_ROLE);
		}
		return listeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return ((InternalEList<?>)getListeAttribute()).basicRemove(otherEnd, msgs);
			case EAAPackage.ASSOCIATION__LISTE_ROLE:
				return ((InternalEList<?>)getListeRole()).basicRemove(otherEnd, msgs);
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
			case EAAPackage.ASSOCIATION__NAME:
				return getName();
			case EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return getListeAttribute();
			case EAAPackage.ASSOCIATION__LISTE_ROLE:
				return getListeRole();
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
			case EAAPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				getListeAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EAAPackage.ASSOCIATION__LISTE_ROLE:
				getListeRole().clear();
				getListeRole().addAll((Collection<? extends Role>)newValue);
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
			case EAAPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				return;
			case EAAPackage.ASSOCIATION__LISTE_ROLE:
				getListeRole().clear();
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
			case EAAPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EAAPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return listeAttribute != null && !listeAttribute.isEmpty();
			case EAAPackage.ASSOCIATION__LISTE_ROLE:
				return listeRole != null && !listeRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
