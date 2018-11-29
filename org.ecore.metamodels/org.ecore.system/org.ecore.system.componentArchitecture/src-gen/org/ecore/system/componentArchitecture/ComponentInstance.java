/**
 */
package org.ecore.system.componentArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.componentArchitecture.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.ComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.ComponentInstance#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.ecore.system.componentArchitecture.ComponentInstance#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject {
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
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getComponentInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.system.componentArchitecture.ComponentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getComponentInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.ecore.system.componentArchitecture.ComponentInstance#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.componentArchitecture.ServiceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getComponentInstance_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceInstance> getPorts();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.componentArchitecture.ComponentInstanceExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.ecore.system.componentArchitecture.ComponentArchitecturePackage#getComponentInstance_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstanceExtension> getExtensions();

} // ComponentInstance
