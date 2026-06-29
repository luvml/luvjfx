package luvjfx;

import javafx.scene.control.TreeTableView;
import luvjfx.cap.HasColumnResizePolicyTreeTableView;
import luvjfx.cap.HasEditableTreeTableView;
import luvjfx.cap.HasFixedCellSizeTreeTableView;
import luvjfx.cap.HasFocusModelTreeTableView;
import luvjfx.cap.HasOnScrollToColumnTreeTableView;
import luvjfx.cap.HasOnScrollToTreeTableView;
import luvjfx.cap.HasOnSortTreeTableView;
import luvjfx.cap.HasPlaceholderTreeTableView;
import luvjfx.cap.HasRootTreeTableView;
import luvjfx.cap.HasRowFactoryTreeTableView;
import luvjfx.cap.HasSelectionModelTreeTableView;
import luvjfx.cap.HasShowRootTreeTableView;
import luvjfx.cap.HasSortMode;
import luvjfx.cap.HasSortPolicyTreeTableView;
import luvjfx.cap.HasTableMenuButtonVisibleTreeTableView;
import luvjfx.cap.HasTreeColumn;

public interface TreeTableViewCaps<S extends TreeTableViewCaps<S, N, T>, N extends TreeTableView<T>, T> extends ControlCaps<S, N>, HasColumnResizePolicyTreeTableView<S, N, T>, HasEditableTreeTableView<S, N, T>, HasFixedCellSizeTreeTableView<S, N, T>, HasFocusModelTreeTableView<S, N, T>, HasOnScrollToTreeTableView<S, N, T>, HasOnScrollToColumnTreeTableView<S, N, T>, HasOnSortTreeTableView<S, N, T>, HasPlaceholderTreeTableView<S, N, T>, HasRootTreeTableView<S, N, T>, HasRowFactoryTreeTableView<S, N, T>, HasSelectionModelTreeTableView<S, N, T>, HasShowRootTreeTableView<S, N, T>, HasSortMode<S, N, T>, HasSortPolicyTreeTableView<S, N, T>, HasTableMenuButtonVisibleTreeTableView<S, N, T>, HasTreeColumn<S, N, T> {
}
