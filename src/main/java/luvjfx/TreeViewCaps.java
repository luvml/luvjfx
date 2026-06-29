package luvjfx;

import javafx.scene.control.TreeView;
import luvjfx.cap.HasCellFactoryTreeView;
import luvjfx.cap.HasEditableTreeView;
import luvjfx.cap.HasFixedCellSizeTreeView;
import luvjfx.cap.HasFocusModelTreeView;
import luvjfx.cap.HasOnEditCancelTreeView;
import luvjfx.cap.HasOnEditCommitTreeView;
import luvjfx.cap.HasOnEditStartTreeView;
import luvjfx.cap.HasOnScrollToTreeView;
import luvjfx.cap.HasRootTreeView;
import luvjfx.cap.HasSelectionModelTreeView;
import luvjfx.cap.HasShowRootTreeView;

public interface TreeViewCaps<S extends TreeViewCaps<S, N, T>, N extends TreeView<T>, T> extends ControlCaps<S, N>, HasCellFactoryTreeView<S, N, T>, HasEditableTreeView<S, N, T>, HasFixedCellSizeTreeView<S, N, T>, HasFocusModelTreeView<S, N, T>, HasOnEditCancelTreeView<S, N, T>, HasOnEditCommitTreeView<S, N, T>, HasOnEditStartTreeView<S, N, T>, HasOnScrollToTreeView<S, N, T>, HasRootTreeView<S, N, T>, HasSelectionModelTreeView<S, N, T>, HasShowRootTreeView<S, N, T> {
}
