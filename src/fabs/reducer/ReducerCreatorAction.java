package fabs.reducer;

import com.intellij.openapi.project.Project;
import fabs.reducer.state.ReducerSettingsState;
import fabs.reducer.ui.ReducerDialog;
import fabs.util.AbstractCreatorAction;
import fabs.util.AbstractDialog;

public class ReducerCreatorAction extends AbstractCreatorAction {
    @Override
    protected AbstractDialog createDialog(Project project) {
        ReducerSettingsState state = ReducerSettingsState.getInstance(project);
        return new ReducerDialog(state.getOptions());
    }
}
