/**
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityArchitectureModel()
 * @model
 * @generated
 */
public interface ActivityArchitectureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityArchitectureModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.AbstractActivityArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityArchitectureModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActivityArchitectureElement> getElements();

} // ActivityArchitectureModel
