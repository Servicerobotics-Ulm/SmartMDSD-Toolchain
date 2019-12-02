/**
 */
package org.ecore.system.systemParameter;

import org.eclipse.emf.common.util.EList;
import org.ecore.base.basicAttributes.AttributeRefinement;

import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.component.componentParameter.ComponentParameterBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.systemParameter.ParameterRefinement#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.system.systemParameter.ParameterRefinement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement()
 * @model
 * @generated
 */
public interface ParameterRefinement extends AbstractDocumentedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ComponentParameterBase)
	 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameterBase getParameter();

	/**
	 * Sets the value of the '{@link org.ecore.system.systemParameter.ParameterRefinement#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ComponentParameterBase value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRefinement> getAttributes();

} // ParameterRefinement
