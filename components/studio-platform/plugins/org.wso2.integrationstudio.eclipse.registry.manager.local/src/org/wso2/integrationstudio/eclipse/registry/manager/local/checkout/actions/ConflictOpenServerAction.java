/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.eclipse.registry.manager.local.checkout.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.integrationstudio.eclipse.logging.core.IIntegrationStudioLog;
import org.wso2.integrationstudio.eclipse.logging.core.Logger;
import org.wso2.integrationstudio.eclipse.registry.manager.local.Activator;
import org.wso2.integrationstudio.eclipse.registry.manager.local.utils.RegistryCheckInClientUtils;

public class ConflictOpenServerAction extends ConflictAction {
	private static IIntegrationStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	/**
	 * execute action on the file
	 */
	protected void execute(IFile file, IAction action) {
		String conflictResourceLocalCopy = RegistryCheckInClientUtils.getConflictResourceServerCopy(
																	file.getLocation().toOSString());
		IFile conflictFile = file.getWorkspace().getRoot().getFileForLocation(
																new Path(conflictResourceLocalCopy));
		try {
			IEditorDescriptor defaultEditor = IDE.getEditorDescriptor(file);
			IWorkbenchPage activePage = PlatformUI.getWorkbench()
														.getActiveWorkbenchWindow().getActivePage();
			activePage.openEditor(new FileEditorInput(conflictFile),
								  defaultEditor.getId());
		} catch (PartInitException e) {
			log.error(e);
		}
	}

}
