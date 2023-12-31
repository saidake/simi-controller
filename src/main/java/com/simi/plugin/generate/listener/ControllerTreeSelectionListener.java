package com.simi.plugin.generate.listener;

import com.simi.plugin.generate.data.core.DataHolder;
import com.simi.plugin.generate.data.core.DataState;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class ControllerTreeSelectionListener implements TreeSelectionListener {
    /**
     * <pre>
     *  1 ControllerNode
     *  2 RequestNode
     *  3 MethodNode
     * @param e
     */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DataState state = DataHolder.getInstance().getState();
        DefaultMutableTreeNode lastPathComponent = (DefaultMutableTreeNode)e.getPath().getLastPathComponent();
        lastPathComponent.getDepth();
        lastPathComponent.getUserObject();
    }
}
