/**
 */
package maia.impl;

import maia.MAIA;
import maia.MaiaPackage;

import maia.collectiveStructure.CollectiveStructure;

import maia.constitutionalStructure.ConstitutionalStructure;

import maia.evaluativeStructure.EvaluativeStructure;

import maia.ontologicalStructure.OntologicalStructure;

import maia.operationalStructure.OperationalStructure;

import maia.physicalStructure.PhysicalStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MAIA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maia.impl.MAIAImpl#getConstitutionalStructure <em>Constitutional Structure</em>}</li>
 *   <li>{@link maia.impl.MAIAImpl#getCollectiveStructure <em>Collective Structure</em>}</li>
 *   <li>{@link maia.impl.MAIAImpl#getPhysicalStructure <em>Physical Structure</em>}</li>
 *   <li>{@link maia.impl.MAIAImpl#getOperationalStructure <em>Operational Structure</em>}</li>
 *   <li>{@link maia.impl.MAIAImpl#getEvaluativeStructure <em>Evaluative Structure</em>}</li>
 *   <li>{@link maia.impl.MAIAImpl#getOntologicalStructure <em>Ontological Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAIAImpl extends MinimalEObjectImpl.Container implements MAIA {
	/**
	 * The cached value of the '{@link #getConstitutionalStructure() <em>Constitutional Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstitutionalStructure()
	 * @generated
	 * @ordered
	 */
	protected ConstitutionalStructure constitutionalStructure;

	/**
	 * The cached value of the '{@link #getCollectiveStructure() <em>Collective Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectiveStructure()
	 * @generated
	 * @ordered
	 */
	protected CollectiveStructure collectiveStructure;

	/**
	 * The cached value of the '{@link #getPhysicalStructure() <em>Physical Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalStructure()
	 * @generated
	 * @ordered
	 */
	protected PhysicalStructure physicalStructure;

	/**
	 * The cached value of the '{@link #getOperationalStructure() <em>Operational Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStructure()
	 * @generated
	 * @ordered
	 */
	protected OperationalStructure operationalStructure;

	/**
	 * The cached value of the '{@link #getEvaluativeStructure() <em>Evaluative Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluativeStructure()
	 * @generated
	 * @ordered
	 */
	protected EvaluativeStructure evaluativeStructure;

	/**
	 * The cached value of the '{@link #getOntologicalStructure() <em>Ontological Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologicalStructure()
	 * @generated
	 * @ordered
	 */
	protected OntologicalStructure ontologicalStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAIAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaiaPackage.Literals.MAIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstitutionalStructure getConstitutionalStructure() {
		return constitutionalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstitutionalStructure(ConstitutionalStructure newConstitutionalStructure, NotificationChain msgs) {
		ConstitutionalStructure oldConstitutionalStructure = constitutionalStructure;
		constitutionalStructure = newConstitutionalStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE, oldConstitutionalStructure, newConstitutionalStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstitutionalStructure(ConstitutionalStructure newConstitutionalStructure) {
		if (newConstitutionalStructure != constitutionalStructure) {
			NotificationChain msgs = null;
			if (constitutionalStructure != null)
				msgs = ((InternalEObject)constitutionalStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE, null, msgs);
			if (newConstitutionalStructure != null)
				msgs = ((InternalEObject)newConstitutionalStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE, null, msgs);
			msgs = basicSetConstitutionalStructure(newConstitutionalStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE, newConstitutionalStructure, newConstitutionalStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveStructure getCollectiveStructure() {
		return collectiveStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectiveStructure(CollectiveStructure newCollectiveStructure, NotificationChain msgs) {
		CollectiveStructure oldCollectiveStructure = collectiveStructure;
		collectiveStructure = newCollectiveStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__COLLECTIVE_STRUCTURE, oldCollectiveStructure, newCollectiveStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectiveStructure(CollectiveStructure newCollectiveStructure) {
		if (newCollectiveStructure != collectiveStructure) {
			NotificationChain msgs = null;
			if (collectiveStructure != null)
				msgs = ((InternalEObject)collectiveStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__COLLECTIVE_STRUCTURE, null, msgs);
			if (newCollectiveStructure != null)
				msgs = ((InternalEObject)newCollectiveStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__COLLECTIVE_STRUCTURE, null, msgs);
			msgs = basicSetCollectiveStructure(newCollectiveStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__COLLECTIVE_STRUCTURE, newCollectiveStructure, newCollectiveStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalStructure getPhysicalStructure() {
		return physicalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalStructure(PhysicalStructure newPhysicalStructure, NotificationChain msgs) {
		PhysicalStructure oldPhysicalStructure = physicalStructure;
		physicalStructure = newPhysicalStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__PHYSICAL_STRUCTURE, oldPhysicalStructure, newPhysicalStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalStructure(PhysicalStructure newPhysicalStructure) {
		if (newPhysicalStructure != physicalStructure) {
			NotificationChain msgs = null;
			if (physicalStructure != null)
				msgs = ((InternalEObject)physicalStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__PHYSICAL_STRUCTURE, null, msgs);
			if (newPhysicalStructure != null)
				msgs = ((InternalEObject)newPhysicalStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__PHYSICAL_STRUCTURE, null, msgs);
			msgs = basicSetPhysicalStructure(newPhysicalStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__PHYSICAL_STRUCTURE, newPhysicalStructure, newPhysicalStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStructure getOperationalStructure() {
		return operationalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalStructure(OperationalStructure newOperationalStructure, NotificationChain msgs) {
		OperationalStructure oldOperationalStructure = operationalStructure;
		operationalStructure = newOperationalStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__OPERATIONAL_STRUCTURE, oldOperationalStructure, newOperationalStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalStructure(OperationalStructure newOperationalStructure) {
		if (newOperationalStructure != operationalStructure) {
			NotificationChain msgs = null;
			if (operationalStructure != null)
				msgs = ((InternalEObject)operationalStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__OPERATIONAL_STRUCTURE, null, msgs);
			if (newOperationalStructure != null)
				msgs = ((InternalEObject)newOperationalStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__OPERATIONAL_STRUCTURE, null, msgs);
			msgs = basicSetOperationalStructure(newOperationalStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__OPERATIONAL_STRUCTURE, newOperationalStructure, newOperationalStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluativeStructure getEvaluativeStructure() {
		return evaluativeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluativeStructure(EvaluativeStructure newEvaluativeStructure, NotificationChain msgs) {
		EvaluativeStructure oldEvaluativeStructure = evaluativeStructure;
		evaluativeStructure = newEvaluativeStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__EVALUATIVE_STRUCTURE, oldEvaluativeStructure, newEvaluativeStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluativeStructure(EvaluativeStructure newEvaluativeStructure) {
		if (newEvaluativeStructure != evaluativeStructure) {
			NotificationChain msgs = null;
			if (evaluativeStructure != null)
				msgs = ((InternalEObject)evaluativeStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__EVALUATIVE_STRUCTURE, null, msgs);
			if (newEvaluativeStructure != null)
				msgs = ((InternalEObject)newEvaluativeStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__EVALUATIVE_STRUCTURE, null, msgs);
			msgs = basicSetEvaluativeStructure(newEvaluativeStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__EVALUATIVE_STRUCTURE, newEvaluativeStructure, newEvaluativeStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologicalStructure getOntologicalStructure() {
		return ontologicalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntologicalStructure(OntologicalStructure newOntologicalStructure, NotificationChain msgs) {
		OntologicalStructure oldOntologicalStructure = ontologicalStructure;
		ontologicalStructure = newOntologicalStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE, oldOntologicalStructure, newOntologicalStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologicalStructure(OntologicalStructure newOntologicalStructure) {
		if (newOntologicalStructure != ontologicalStructure) {
			NotificationChain msgs = null;
			if (ontologicalStructure != null)
				msgs = ((InternalEObject)ontologicalStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE, null, msgs);
			if (newOntologicalStructure != null)
				msgs = ((InternalEObject)newOntologicalStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE, null, msgs);
			msgs = basicSetOntologicalStructure(newOntologicalStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE, newOntologicalStructure, newOntologicalStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
				return basicSetConstitutionalStructure(null, msgs);
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
				return basicSetCollectiveStructure(null, msgs);
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
				return basicSetPhysicalStructure(null, msgs);
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
				return basicSetOperationalStructure(null, msgs);
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
				return basicSetEvaluativeStructure(null, msgs);
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
				return basicSetOntologicalStructure(null, msgs);
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
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
				return getConstitutionalStructure();
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
				return getCollectiveStructure();
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
				return getPhysicalStructure();
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
				return getOperationalStructure();
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
				return getEvaluativeStructure();
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
				return getOntologicalStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
				setConstitutionalStructure((ConstitutionalStructure)newValue);
				return;
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
				setCollectiveStructure((CollectiveStructure)newValue);
				return;
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
				setPhysicalStructure((PhysicalStructure)newValue);
				return;
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
				setOperationalStructure((OperationalStructure)newValue);
				return;
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
				setEvaluativeStructure((EvaluativeStructure)newValue);
				return;
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
				setOntologicalStructure((OntologicalStructure)newValue);
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
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
				setConstitutionalStructure((ConstitutionalStructure)null);
				return;
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
				setCollectiveStructure((CollectiveStructure)null);
				return;
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
				setPhysicalStructure((PhysicalStructure)null);
				return;
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
				setOperationalStructure((OperationalStructure)null);
				return;
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
				setEvaluativeStructure((EvaluativeStructure)null);
				return;
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
				setOntologicalStructure((OntologicalStructure)null);
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
			case MaiaPackage.MAIA__CONSTITUTIONAL_STRUCTURE:
				return constitutionalStructure != null;
			case MaiaPackage.MAIA__COLLECTIVE_STRUCTURE:
				return collectiveStructure != null;
			case MaiaPackage.MAIA__PHYSICAL_STRUCTURE:
				return physicalStructure != null;
			case MaiaPackage.MAIA__OPERATIONAL_STRUCTURE:
				return operationalStructure != null;
			case MaiaPackage.MAIA__EVALUATIVE_STRUCTURE:
				return evaluativeStructure != null;
			case MaiaPackage.MAIA__ONTOLOGICAL_STRUCTURE:
				return ontologicalStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //MAIAImpl
