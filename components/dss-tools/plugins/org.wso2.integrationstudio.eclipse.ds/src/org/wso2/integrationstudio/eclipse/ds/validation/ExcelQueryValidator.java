/**
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.ds.validation;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.wso2.integrationstudio.eclipse.ds.HasHeader;
import org.wso2.integrationstudio.eclipse.ds.MaxRowCount;
import org.wso2.integrationstudio.eclipse.ds.StartingRow;
import org.wso2.integrationstudio.eclipse.ds.WorkBookName;

/**
 * A sample validator interface for {@link org.wso2.integrationstudio.eclipse.ds.ExcelQuery}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExcelQueryValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateWorkbookname(WorkBookName value);
	boolean validateHasheader(HasHeader value);
	boolean validateStartingrow(StartingRow value);
	boolean validateMaxrowcount(MaxRowCount value);
}
