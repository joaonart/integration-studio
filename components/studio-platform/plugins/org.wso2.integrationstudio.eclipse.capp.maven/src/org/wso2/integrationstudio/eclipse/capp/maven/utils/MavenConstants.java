package org.wso2.integrationstudio.eclipse.capp.maven.utils;

public class MavenConstants {
	public static final String MAVEN_CAR_VERSION=Messages.MAVEN_CAR_VERSION;
	public static final String MAVEN_ENDPOINT_VERSION=Messages.MAVEN_ENDPOINT_VERSION;
	public static final String MAVEN_SEQUENCE_VERSION=Messages.MAVEN_SEQUENCE_VERSION;
	public static final String MAVEN_SYNAPSE_VERSION=Messages.MAVEN_SYNAPSE_VERSION;
	public static final String MAVEN_PROXY_SERVICE_VERSION=Messages.MAVEN_PROXY_SERVICE_VERSION;
	public static final String MAVEN_LOCAL_ENTRY_VERSION=Messages.MAVEN_LOCAL_ENTRY_VERSION;
	public static final String MAVEN_REG_FILTERS_VERSION=Messages.MAVEN_REG_FILTERS_VERSION;
	public static final String MAVEN_REGISTRY_RESOURCE_VERSION = Messages.MAVEN_REGISTRY_RESOURCE_VERSION;
	public static final String MAVEN_SYNAPSE_MEDIATOR_PLUGIN_VERSION = Messages.MAVEN_SYNAPSE_MEDIATOR_PLUGIN_VERSION;
	public static final String MAVEN_LIBRARY_PLUGIN_VERSION = Messages.MAVEN_LIBRARY_PLUGIN_VERSION;
	public static final String MAVEN_REGISTRY_HANDLER_PLUGIN_VERSION = Messages.MAVEN_REGISTRY_HANDLER_PLUGIN_VERSION;
	public static final String MAVEN_AXIS2_PLUGIN_VERSION = Messages.MAVEN_AXIS2_PLUGIN_VERSION;
	public static final String MAVEN_WAR_PLUGIN_VERSION = Messages.MAVEN_WAR_PLUGIN_VERSION;
	public static final String MAVEN_CARBON_UI_PLUGIN_VERSION = Messages.MAVEN_CARBON_UI_PLUGIN_VERSION;
	public static final String MAVEN_DATASERVICE_PLUGIN_VERSION = Messages.MAVEN_DATASERVICE_PLUGIN_VERSION;
	public static final String MAVEN_DATASOURCE_PLUGIN_VERSION = Messages.MAVEN_DATASOURCE_PLUGIN_VERSION;
	public static final String MAVEN_BPEL_PLUGIN_VERSION = Messages.MAVEN_BPEL_PLUGIN_VERSION;
	public static final String MAVEN_DS_VALIDATOR_PLUGIN_VERSION = Messages.MAVEN_DS_VALIDATOR_PLUGIN_VERSION;
	public static final String MAVEN_GADGET_PLUGIN_VERSION = Messages.MAVEN_GADGET_PLUGIN_VERSION;
	public static final String MAVEN_JAXWS_PLUGIN_VERSION = Messages.MAVEN_JAXWS_PLUGIN_VERSION;
	
	public static final String WSO2_GENERAL_PROJECT_VERSION = Messages.WSO2_GENERAL_PROJECT_VERSION;
	public static final String MAVEN_CAR_DEPLOY_VERSION = Messages.MAVEN_CAR_DEPLOY_VERSION;
	public static final String MAVEN_BRS_PLUGIN_VERSION=Messages.MAVEN_BRS_VERSION;
	public static final String MAVEN_QOS_PLUGIN_VERSION=Messages.WSO2_QOS_PROJECT_VERSION;

	public static final String PACKAGE_PHASE = "package";
	public static final String INSTALL_PHASE = "install";
	public static final String DEPLOY_PHASE = "deploy";
	public static final String EXEC_GOAL = "exec";
	public static final String EXECUTABLE_TAG = "executable";
	public static final String EXECUTABLE_VALUE = "mvn";
	public static final String WORKING_DIRECTORY_TAG = "workingDirectory";
	public static final String WORKING_DIRECTORY_VALUE = "${project.build.directory}";
	public static final String ARGUMENTS_TAG = "arguments";
	public static final String ARGUMENT_TAG = "argument";
	public static final String ARGUMENT_VALUE_CLEAN = "clean";
	public static final String ARGUMENT_VALUE_SKIP_TESTS = "-Dmaven.test.skip=${maven.test.skip}";
}
