/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smalluml.Association;
import smalluml.Generalisation;
import smalluml.SchemaUML;
import smalluml.SmallClass;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema UML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.SchemaUMLImpl#getGene <em>Gene</em>}</li>
 *   <li>{@link smalluml.impl.SchemaUMLImpl#getC <em>C</em>}</li>
 *   <li>{@link smalluml.impl.SchemaUMLImpl#getAss <em>Ass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaUMLImpl extends MinimalEObjectImpl.Container implements SchemaUML {
	/**
	 * The cached value of the '{@link #getGene() <em>Gene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGene()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalisation> gene;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<SmallClass> c;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaUMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.SCHEMA_UML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalisation> getGene() {
		if (gene == null) {
			gene = new EObjectContainmentEList<Generalisation>(Generalisation.class, this, SmallumlPackage.SCHEMA_UML__GENE);
		}
		return gene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallClass> getC() {
		if (c == null) {
			c = new EObjectContainmentEList<SmallClass>(SmallClass.class, this, SmallumlPackage.SCHEMA_UML__C);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAss() {
		if (ass == null) {
			ass = new EObjectContainmentEList<Association>(Association.class, this, SmallumlPackage.SCHEMA_UML__ASS);
		}
		return ass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.SCHEMA_UML__GENE:
				return ((InternalEList<?>)getGene()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.SCHEMA_UML__C:
				return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.SCHEMA_UML__ASS:
				return ((InternalEList<?>)getAss()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.SCHEMA_UML__GENE:
				return getGene();
			case SmallumlPackage.SCHEMA_UML__C:
				return getC();
			case SmallumlPackage.SCHEMA_UML__ASS:
				return getAss();
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
			case SmallumlPackage.SCHEMA_UML__GENE:
				getGene().clear();
				getGene().addAll((Collection<? extends Generalisation>)newValue);
				return;
			case SmallumlPackage.SCHEMA_UML__C:
				getC().clear();
				getC().addAll((Collection<? extends SmallClass>)newValue);
				return;
			case SmallumlPackage.SCHEMA_UML__ASS:
				getAss().clear();
				getAss().addAll((Collection<? extends Association>)newValue);
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
			case SmallumlPackage.SCHEMA_UML__GENE:
				getGene().clear();
				return;
			case SmallumlPackage.SCHEMA_UML__C:
				getC().clear();
				return;
			case SmallumlPackage.SCHEMA_UML__ASS:
				getAss().clear();
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
			case SmallumlPackage.SCHEMA_UML__GENE:
				return gene != null && !gene.isEmpty();
			case SmallumlPackage.SCHEMA_UML__C:
				return c != null && !c.isEmpty();
			case SmallumlPackage.SCHEMA_UML__ASS:
				return ass != null && !ass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaUMLImpl
