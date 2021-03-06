/**
 */
package org.wso2.integrationstudio.eclipse.ds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Validator Property List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.eclipse.ds.CustomValidatorPropertyList#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.ds.CustomValidatorPropertyList#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.wso2.integrationstudio.eclipse.ds.DsPackage#getCustomValidatorPropertyList()
 * @model extendedMetaData="name='properties_._type' kind='mixed'"
 * @generated
 */
public interface CustomValidatorPropertyList extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.wso2.integrationstudio.eclipse.ds.DsPackage#getCustomValidatorPropertyList_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.integrationstudio.eclipse.ds.CustomValidatorProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.wso2.integrationstudio.eclipse.ds.DsPackage#getCustomValidatorPropertyList_Property()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CustomValidatorProperty> getProperty();

} // CustomValidatorPropertyList
