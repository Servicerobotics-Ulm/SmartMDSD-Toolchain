/**
 */
package org.ecore.component.performanceExtension;

import org.ecore.component.componentDefinition.ComponentSubNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Observed Element Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultObservedElementTrigger()
 * @model
 * @generated
 */
public interface DefaultObservedElementTrigger extends DefaultTrigger {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ComponentSubNode)
	 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultObservedElementTrigger_Element()
	 * @model required="true"
	 * @generated
	 */
	ComponentSubNode getElement();

	/**
	 * Sets the value of the '{@link org.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ComponentSubNode value);

} // DefaultObservedElementTrigger
