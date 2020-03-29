package fabs.component;

import fabs.util.AbstractCreatorAction;
import fabs.util.AbstractDialog;

public class ComponentCreatorAction extends AbstractCreatorAction {
    @Override
    protected AbstractDialog createDialog() {
        return new ComponentCreatorDialog();
    }
}
