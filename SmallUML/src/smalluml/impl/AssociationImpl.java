/**
 */
package smalluml.impl;

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

import smalluml.Association;
import smalluml.Attribute;
import smalluml.Role;
import smalluml.SmallClass;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getListeRole <em>Liste Role</em>}</li>
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SmallClass source;

	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected SmallClass cible;

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
		return SmallumlPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallClass getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SmallClass newSource, NotificationChain msgs) {
		SmallClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SmallClass newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallClass getCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCible(SmallClass newCible, NotificationChain msgs) {
		SmallClass oldCible = cible;
		cible = newCible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__CIBLE, oldCible, newCible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCible(SmallClass newCible) {
		if (newCible != cible) {
			NotificationChain msgs = null;
			if (cible != null)
				msgs = ((InternalEObject)cible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__CIBLE, null, msgs);
			if (newCible != null)
				msgs = ((InternalEObject)newCible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__CIBLE, null, msgs);
			msgs = basicSetCible(newCible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__CIBLE, newCible, newCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getListeAttribute() {
		if (listeAttribute == null) {
			listeAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE);
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
			listeRole = new EObjectContainmentEList<Role>(Role.class, this, SmallumlPackage.ASSOCIATION__LISTE_ROLE);
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
			case SmallumlPackage.ASSOCIATION__SOURCE:
				return basicSetSource(null, msgs);
			case SmallumlPackage.ASSOCIATION__CIBLE:
				return basicSetCible(null, msgs);
			case SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return ((InternalEList<?>)getListeAttribute()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.ASSOCIATION__LISTE_ROLE:
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
			case SmallumlPackage.ASSOCIATION__NAME:
				return getName();
			case SmallumlPackage.ASSOCIATION__SOURCE:
				return getSource();
			case SmallumlPackage.ASSOCIATION__CIBLE:
				return getCible();
			case SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return getListeAttribute();
			case SmallumlPackage.ASSOCIATION__LISTE_ROLE:
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
			case SmallumlPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__SOURCE:
				setSource((SmallClass)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__CIBLE:
				setCible((SmallClass)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				getListeAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__LISTE_ROLE:
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
			case SmallumlPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmallumlPackage.ASSOCIATION__SOURCE:
				setSource((SmallClass)null);
				return;
			case SmallumlPackage.ASSOCIATION__CIBLE:
				setCible((SmallClass)null);
				return;
			case SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				return;
			case SmallumlPackage.ASSOCIATION__LISTE_ROLE:
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
			case SmallumlPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmallumlPackage.ASSOCIATION__SOURCE:
				return source != null;
			case SmallumlPackage.ASSOCIATION__CIBLE:
				return cible != null;
			case SmallumlPackage.ASSOCIATION__LISTE_ATTRIBUTE:
				return listeAttribute != null && !listeAttribute.isEmpty();
			case SmallumlPackage.ASSOCIATION__LISTE_ROLE:
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
