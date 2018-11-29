/**
 */
package org.ecore.system.causeEffectChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.system.activityArchitecture.ActivityArchitectureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuase Effect Chain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getChains <em>Chains</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getActArch <em>Act Arch</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getCuaseEffectChainModel()
 * @model
 * @generated
 */
public interface CuaseEffectChainModel extends EObject {
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
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getCuaseEffectChainModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chains</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.causeEffectChain.ActivityChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' containment reference list.
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getCuaseEffectChainModel_Chains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityChain> getChains();

	/**
	 * Returns the value of the '<em><b>Act Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act Arch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act Arch</em>' reference.
	 * @see #setActArch(ActivityArchitectureModel)
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getCuaseEffectChainModel_ActArch()
	 * @model required="true"
	 * @generated
	 */
	ActivityArchitectureModel getActArch();

	/**
	 * Sets the value of the '{@link org.ecore.system.causeEffectChain.CuaseEffectChainModel#getActArch <em>Act Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act Arch</em>' reference.
	 * @see #getActArch()
	 * @generated
	 */
	void setActArch(ActivityArchitectureModel value);

} // CuaseEffectChainModel
