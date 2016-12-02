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

import smalluml.Attribute;
import smalluml.Methode;
import smalluml.SmallClass;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Small Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.SmallClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link smalluml.impl.SmallClassImpl#getListeAttribute <em>Liste Attribute</em>}</li>
 *   <li>{@link smalluml.impl.SmallClassImpl#getListeMethode <em>Liste Methode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmallClassImpl extends MinimalEObjectImpl.Container implements SmallClass {
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
	 * The cached value of the '{@link #getListeMethode() <em>Liste Methode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeMethode()
	 * @generated
	 * @ordered
	 */
	protected EList<Methode> listeMethode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmallClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.SMALL_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.SMALL_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getListeAttribute() {
		if (listeAttribute == null) {
			listeAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE);
		}
		return listeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methode> getListeMethode() {
		if (listeMethode == null) {
			listeMethode = new EObjectContainmentEList<Methode>(Methode.class, this, SmallumlPackage.SMALL_CLASS__LISTE_METHODE);
		}
		return listeMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE:
				return ((InternalEList<?>)getListeAttribute()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.SMALL_CLASS__LISTE_METHODE:
				return ((InternalEList<?>)getListeMethode()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.SMALL_CLASS__NAME:
				return getName();
			case SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE:
				return getListeAttribute();
			case SmallumlPackage.SMALL_CLASS__LISTE_METHODE:
				return getListeMethode();
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
			case SmallumlPackage.SMALL_CLASS__NAME:
				setName((String)newValue);
				return;
			case SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				getListeAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SmallumlPackage.SMALL_CLASS__LISTE_METHODE:
				getListeMethode().clear();
				getListeMethode().addAll((Collection<? extends Methode>)newValue);
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
			case SmallumlPackage.SMALL_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE:
				getListeAttribute().clear();
				return;
			case SmallumlPackage.SMALL_CLASS__LISTE_METHODE:
				getListeMethode().clear();
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
			case SmallumlPackage.SMALL_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmallumlPackage.SMALL_CLASS__LISTE_ATTRIBUTE:
				return listeAttribute != null && !listeAttribute.isEmpty();
			case SmallumlPackage.SMALL_CLASS__LISTE_METHODE:
				return listeMethode != null && !listeMethode.isEmpty();
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

} //SmallClassImpl
