/**
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.ds.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.wso2.integrationstudio.eclipse.ds.AttributeMapping;
import org.wso2.integrationstudio.eclipse.ds.CallQuery;
import org.wso2.integrationstudio.eclipse.ds.ElementMapping;

/**
 * A sample validator interface for {@link org.wso2.integrationstudio.eclipse.ds.ElementMapping}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementMappingValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateColumn(String value);
	boolean validateExport(String value);
	boolean validateName(String value);
	boolean validateRequiredRoles(String value);
	boolean validateExportType(String value);
	boolean validateNamespace(String value);
	boolean validateXsdType(String value);
	boolean validateElement(EList<ElementMapping> value);
	boolean validateAttribute(EList<AttributeMapping> value);
	boolean validateCallQuery(CallQuery value);
	boolean validateIsComplexType(boolean value);
	boolean validateQueryParam(String value);
	boolean validateValue(String value);
	boolean validateOptional(boolean value);
	boolean validateArrayName(String value);
}
