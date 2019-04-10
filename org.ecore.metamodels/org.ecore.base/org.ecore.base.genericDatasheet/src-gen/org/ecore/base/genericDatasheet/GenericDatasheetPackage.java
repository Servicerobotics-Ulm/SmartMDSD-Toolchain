/**
 */
package org.ecore.base.genericDatasheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.base.genericDatasheet.GenericDatasheetFactory
 * @model kind="package"
 * @generated
 */
public interface GenericDatasheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericDatasheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/base/genericDatasheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericDatasheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDatasheetPackage eINSTANCE = org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl <em>Generic Datasheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getGenericDatasheet()
	 * @generated
	 */
	int GENERIC_DATASHEET = 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__LICENSE = 0;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__SHORT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__LONG_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Supplier Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__SUPPLIER_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__HOMEPAGE = 4;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__BASE_URI = 5;

	/**
	 * The feature id for the '<em><b>Trl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET__TRL = 6;

	/**
	 * The number of structural features of the '<em>Generic Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Generic Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.genericDatasheet.impl.AbstractLicenseImpl <em>Abstract License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.genericDatasheet.impl.AbstractLicenseImpl
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getAbstractLicense()
	 * @generated
	 */
	int ABSTRACT_LICENSE = 1;

	/**
	 * The number of structural features of the '<em>Abstract License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LICENSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.genericDatasheet.impl.SpdxLicenseImpl <em>Spdx License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.genericDatasheet.impl.SpdxLicenseImpl
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getSpdxLicense()
	 * @generated
	 */
	int SPDX_LICENSE = 2;

	/**
	 * The feature id for the '<em><b>License ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPDX_LICENSE__LICENSE_ID = ABSTRACT_LICENSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spdx License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPDX_LICENSE_FEATURE_COUNT = ABSTRACT_LICENSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spdx License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPDX_LICENSE_OPERATION_COUNT = ABSTRACT_LICENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl <em>Proprietary License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getProprietaryLicense()
	 * @generated
	 */
	int PROPRIETARY_LICENSE = 3;

	/**
	 * The feature id for the '<em><b>Full Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETARY_LICENSE__FULL_TEXT = ABSTRACT_LICENSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETARY_LICENSE__NAME = ABSTRACT_LICENSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETARY_LICENSE__URL = ABSTRACT_LICENSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Proprietary License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETARY_LICENSE_FEATURE_COUNT = ABSTRACT_LICENSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Proprietary License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETARY_LICENSE_OPERATION_COUNT = ABSTRACT_LICENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.base.genericDatasheet.TRL <em>TRL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.base.genericDatasheet.TRL
	 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getTRL()
	 * @generated
	 */
	int TRL = 4;

	/**
	 * Returns the meta object for class '{@link org.ecore.base.genericDatasheet.GenericDatasheet <em>Generic Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Datasheet</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet
	 * @generated
	 */
	EClass getGenericDatasheet();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getLicense()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EReference getGenericDatasheet_License();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getShortDescription()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getLongDescription()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getSupplierDescription <em>Supplier Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Description</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getSupplierDescription()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_SupplierDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homepage</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getHomepage()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_Homepage();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getBaseURI()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_BaseURI();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.GenericDatasheet#getTrl <em>Trl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trl</em>'.
	 * @see org.ecore.base.genericDatasheet.GenericDatasheet#getTrl()
	 * @see #getGenericDatasheet()
	 * @generated
	 */
	EAttribute getGenericDatasheet_Trl();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.genericDatasheet.AbstractLicense <em>Abstract License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract License</em>'.
	 * @see org.ecore.base.genericDatasheet.AbstractLicense
	 * @generated
	 */
	EClass getAbstractLicense();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.genericDatasheet.SpdxLicense <em>Spdx License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spdx License</em>'.
	 * @see org.ecore.base.genericDatasheet.SpdxLicense
	 * @generated
	 */
	EClass getSpdxLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.SpdxLicense#getLicenseID <em>License ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License ID</em>'.
	 * @see org.ecore.base.genericDatasheet.SpdxLicense#getLicenseID()
	 * @see #getSpdxLicense()
	 * @generated
	 */
	EAttribute getSpdxLicense_LicenseID();

	/**
	 * Returns the meta object for class '{@link org.ecore.base.genericDatasheet.ProprietaryLicense <em>Proprietary License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprietary License</em>'.
	 * @see org.ecore.base.genericDatasheet.ProprietaryLicense
	 * @generated
	 */
	EClass getProprietaryLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.ProprietaryLicense#getFullText <em>Full Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Text</em>'.
	 * @see org.ecore.base.genericDatasheet.ProprietaryLicense#getFullText()
	 * @see #getProprietaryLicense()
	 * @generated
	 */
	EAttribute getProprietaryLicense_FullText();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.ProprietaryLicense#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.base.genericDatasheet.ProprietaryLicense#getName()
	 * @see #getProprietaryLicense()
	 * @generated
	 */
	EAttribute getProprietaryLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.base.genericDatasheet.ProprietaryLicense#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.ecore.base.genericDatasheet.ProprietaryLicense#getUrl()
	 * @see #getProprietaryLicense()
	 * @generated
	 */
	EAttribute getProprietaryLicense_Url();

	/**
	 * Returns the meta object for enum '{@link org.ecore.base.genericDatasheet.TRL <em>TRL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRL</em>'.
	 * @see org.ecore.base.genericDatasheet.TRL
	 * @generated
	 */
	EEnum getTRL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericDatasheetFactory getGenericDatasheetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl <em>Generic Datasheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getGenericDatasheet()
		 * @generated
		 */
		EClass GENERIC_DATASHEET = eINSTANCE.getGenericDatasheet();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_DATASHEET__LICENSE = eINSTANCE.getGenericDatasheet_License();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__SHORT_DESCRIPTION = eINSTANCE.getGenericDatasheet_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__LONG_DESCRIPTION = eINSTANCE.getGenericDatasheet_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Supplier Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__SUPPLIER_DESCRIPTION = eINSTANCE.getGenericDatasheet_SupplierDescription();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__HOMEPAGE = eINSTANCE.getGenericDatasheet_Homepage();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__BASE_URI = eINSTANCE.getGenericDatasheet_BaseURI();

		/**
		 * The meta object literal for the '<em><b>Trl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DATASHEET__TRL = eINSTANCE.getGenericDatasheet_Trl();

		/**
		 * The meta object literal for the '{@link org.ecore.base.genericDatasheet.impl.AbstractLicenseImpl <em>Abstract License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.genericDatasheet.impl.AbstractLicenseImpl
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getAbstractLicense()
		 * @generated
		 */
		EClass ABSTRACT_LICENSE = eINSTANCE.getAbstractLicense();

		/**
		 * The meta object literal for the '{@link org.ecore.base.genericDatasheet.impl.SpdxLicenseImpl <em>Spdx License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.genericDatasheet.impl.SpdxLicenseImpl
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getSpdxLicense()
		 * @generated
		 */
		EClass SPDX_LICENSE = eINSTANCE.getSpdxLicense();

		/**
		 * The meta object literal for the '<em><b>License ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPDX_LICENSE__LICENSE_ID = eINSTANCE.getSpdxLicense_LicenseID();

		/**
		 * The meta object literal for the '{@link org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl <em>Proprietary License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.genericDatasheet.impl.ProprietaryLicenseImpl
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getProprietaryLicense()
		 * @generated
		 */
		EClass PROPRIETARY_LICENSE = eINSTANCE.getProprietaryLicense();

		/**
		 * The meta object literal for the '<em><b>Full Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETARY_LICENSE__FULL_TEXT = eINSTANCE.getProprietaryLicense_FullText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETARY_LICENSE__NAME = eINSTANCE.getProprietaryLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETARY_LICENSE__URL = eINSTANCE.getProprietaryLicense_Url();

		/**
		 * The meta object literal for the '{@link org.ecore.base.genericDatasheet.TRL <em>TRL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.base.genericDatasheet.TRL
		 * @see org.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getTRL()
		 * @generated
		 */
		EEnum TRL = eINSTANCE.getTRL();

	}

} //GenericDatasheetPackage
