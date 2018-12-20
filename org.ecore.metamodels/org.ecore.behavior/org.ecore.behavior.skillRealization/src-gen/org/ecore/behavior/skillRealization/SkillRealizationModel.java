/**
 */
package org.ecore.behavior.skillRealization;

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
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealizationModel#getSkillsets <em>Skillsets</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationModel()
 * @model
 * @generated
 */
public interface SkillRealizationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Skillsets</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.behavior.skillRealization.SkillRealizationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skillsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skillsets</em>' containment reference list.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationModel_Skillsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillRealizationSet> getSkillsets();

} // SkillRealizationModel
