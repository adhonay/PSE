package sample.nodes;

import sample.workspace.Workspace;

public class LogicalOperatorAnd extends NodeBox {
    /**
     * Setup the appearance: title, icon and workspace.
     *
     * @param title          NodeBox title
     * @param root           Root element that should contain this NodeBox.
     * @param actionIconName NodeBox icon path.
     */
    public LogicalOperatorAnd(String title, Workspace root, String actionIconName) {
        super(title, root, actionIconName);
    }

    @Override
    public void install() {

    }

    @Override
    public void execute() {

    }
}
