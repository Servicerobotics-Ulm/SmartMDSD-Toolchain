/**
 */
package org.ecore.system.compArchBehaviorExtension;

import org.eclipse.emf.ecore.EObject;

import org.ecore.behavior.skillRealization.CoordinationInterfaceInstance;

import org.ecore.system.componentArchitecture.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Interface Component Instance Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCoordInterInst <em>Coord Inter Inst</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationInterfaceComponentInstanceMapping()
 * @model
 * @generated
 */
public interface CoordinationInterfaceComponentInstanceMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Inst</em>' reference.
	 * @see #setCompInst(ComponentInstance)
	 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationInterfaceComponentInstanceMapping_CompInst()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getCompInst();

	/**
	 * Sets the value of the '{@link org.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCompInst <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Inst</em>' reference.
	 * @see #getCompInst()
	 * @generated
	 */
	void setCompInst(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Coord Inter Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord Inter Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord Inter Inst</em>' reference.
	 * @see #setCoordInterInst(CoordinationInterfaceInstance)
	 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getCoordinationInterfaceComponentInstanceMapping_CoordInterInst()
	 * @model required="true"
	 * @generated
	 */
	CoordinationInterfaceInstance getCoordInterInst();

	/**
	 * Sets the value of the '{@link org.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping#getCoordInterInst <em>Coord Inter Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Inter Inst</em>' reference.
	 * @see #getCoordInterInst()
	 * @generated
	 */
	void setCoordInterInst(CoordinationInterfaceInstance value);

} // CoordinationInterfaceComponentInstanceMapping
