package org.wso2.integrationstudio.eclipse.gmf.esb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.providers.EsbModelingAssistantProvider;

/**
 * @generated
 */
public class EsbModelingAssistantProviderOfCloudConnectorOperationEditPart extends EsbModelingAssistantProvider {

    /**
     * @generated
     */
    @Override
    public List<IElementType> getTypesForPopupBar(IAdaptable host) {
        List<IElementType> types = new ArrayList<IElementType>(2);
        types.add(EsbElementTypes.CloudConnectorOperationInputConnector_3723);
        types.add(EsbElementTypes.CloudConnectorOperationOutputConnector_3724);
        return types;
    }

}
