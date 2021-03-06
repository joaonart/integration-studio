/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.integrationstudio.eclipse.carbonserver.base.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.ui.IServerModule;
import org.wso2.integrationstudio.eclipse.carbonserver.base.manager.CarbonServerManager;

/**
 * This is the handler class for Redeploy option we added for Carbon Server
 * modules. Here we call the HotUpdate procedure of Carbon Servers for the
 * selected Carbon Server module.
 * 
 * 
 */
public class ServerApplicationHandler extends AbstractHandler {

	private static final String WEB_TEMP_PATH = "";

	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		// TODO: Execute the Redeploy logic here.
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(arg0);
		IServerModule object = (IServerModule) selection.getFirstElement();

		// There is always only one module in the IServerModule for our case.
		String projectName = object.getModule()[0].getName();
		IServer server = object.getServer();
		CarbonServerManager.getInstance().redeployServiceModule(server.getId(), WEB_TEMP_PATH, projectName);
		return null;
	}

}
