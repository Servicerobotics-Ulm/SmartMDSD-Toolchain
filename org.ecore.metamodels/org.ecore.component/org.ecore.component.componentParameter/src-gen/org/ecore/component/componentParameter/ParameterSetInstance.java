/**
 */
package org.ecore.component.componentParameter;

import org.eclipse.emf.common.util.EList;

import org.ecore.service.parameterDefinition.ParameterSetDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.ParameterSetInstance#getParameterInstances <em>Parameter Instances</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ParameterSetInstance#getParamSet <em>Param Set</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ParameterSetInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getParameterSetInstance()
 * @model
 * @generated
 */
public interface ParameterSetInstance extends AbstractComponentParameter {
	/**
	 * Returns the value of the '<em><b>Parameter Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.component.componentParameter.AbstractParameterInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Instances</em>' containment reference list.
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getParameterSetInstance_ParameterInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractParameterInstance> getParameterInstances();

	/**
	 * Returns the value of the '<em><b>Param Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Set</em>' reference.
	 * @see #setParamSet(ParameterSetDefinition)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getParameterSetInstance_ParamSet()
	 * @model required="true"
	 * @generated
	 */
	ParameterSetDefinition getParamSet();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ParameterSetInstance#getParamSet <em>Param Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Set</em>' reference.
	 * @see #getParamSet()
	 * @generated
	 */
	void setParamSet(ParameterSetDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getParameterSetInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.component.componentParameter.ParameterSetInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // ParameterSetInstance
