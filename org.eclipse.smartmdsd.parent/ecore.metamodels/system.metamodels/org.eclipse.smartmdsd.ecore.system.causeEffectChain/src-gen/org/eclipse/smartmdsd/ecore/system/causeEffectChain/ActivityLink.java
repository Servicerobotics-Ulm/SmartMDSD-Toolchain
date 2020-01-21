/**
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getActivityLink()
 * @model
 * @generated
 */
public interface ActivityLink extends AbstractChainLink {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getActivityLink_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ActivityNode)
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getActivityLink_Ref()
	 * @model required="true"
	 * @generated
	 */
	ActivityNode getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ActivityNode value);

} // ActivityLink
