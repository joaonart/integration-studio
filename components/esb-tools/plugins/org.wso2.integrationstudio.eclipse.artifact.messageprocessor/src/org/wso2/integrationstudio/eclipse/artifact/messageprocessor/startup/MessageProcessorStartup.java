package org.wso2.integrationstudio.eclipse.artifact.messageprocessor.startup;

import org.eclipse.ui.IStartup;
import org.wso2.integrationstudio.eclipse.artifact.messageprocessor.ui.ResourceBrowserUIStrip;
import org.wso2.integrationstudio.eclipse.platform.ui.startup.RegisterUIControl;


public class MessageProcessorStartup implements IStartup {

	@Override
	public void earlyStartup() {
		ResourceBrowserUIStrip control = new ResourceBrowserUIStrip();
		RegisterUIControl uiControl = new RegisterUIControl();
		uiControl.registerUIControls("ResourceBrowserUIStrip", control);
	}

}
