package org.wso2.integrationstudio.eclipse.gmf.esb.diagram.custom.direction;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;

public class DirectionRMSequenceMediatorAction extends DirectionEsbNodeAction {

    EditPart editorPart;

    public DirectionRMSequenceMediatorAction(IWorkbenchPart part) {
        super(part);
        setText("Reverse");
        setToolTipText("Set Direction RMSequence mediator.");
    }

    public void setEditorPart(EditPart editorPart_) {
        editorPart = editorPart_;
    }

    protected void doRun(IProgressMonitor progressMonitor) {

        Reverse(editorPart);
    }

}
