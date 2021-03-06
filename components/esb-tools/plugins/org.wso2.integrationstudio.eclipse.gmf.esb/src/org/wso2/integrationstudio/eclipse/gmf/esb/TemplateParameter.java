/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.integrationstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends EObject {
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
     * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getTemplateParameter_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Mandatory</em>' attribute.
     * @see #setIsMandatory(boolean)
     * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getTemplateParameter_IsMandatory()
     * @model default="false"
     * @generated
     */
    boolean isIsMandatory();

    /**
     * Sets the value of the '{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#isIsMandatory <em>Is Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Mandatory</em>' attribute.
     * @see #isIsMandatory()
     * @generated
     */
    void setIsMandatory(boolean value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getTemplateParameter_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.wso2.integrationstudio.eclipse.gmf.esb.TemplateParameter#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

} // TemplateParameter
