/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.integrationstudio.eclipse.docker.distribution.project.export;

import java.util.ArrayList;
import java.util.List;

import org.wso2.integrationstudio.eclipse.distribution.project.export.CappArtifactsListProvider;
import org.wso2.integrationstudio.eclipse.docker.distribution.Activator;
import org.eclipse.core.resources.IProject;
import org.wso2.integrationstudio.eclipse.logging.core.IIntegrationStudioLog;
import org.wso2.integrationstudio.eclipse.logging.core.Logger;

public class DockerArtifactsProvider extends CappArtifactsListProvider {

	private static IIntegrationStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	@Override
	public List<ListData> getArtifactsListForCappExport(IProject project) {

		List<ListData> list = new ArrayList<ListData>();
		try {
			list = super.getArtifactsListForCappExport(project);
		} catch (Exception e) {
			log.error("Error getting artifacts list from project ", e);
		}
		return list;
	}

}
