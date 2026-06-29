package luvjfx;

import javafx.scene.control.TableView;
import luvjfx.cap.HasColumnResizePolicyTableView;
import luvjfx.cap.HasEditableTableView;
import luvjfx.cap.HasFixedCellSizeTableView;
import luvjfx.cap.HasFocusModelTableView;
import luvjfx.cap.HasItemsTableView;
import luvjfx.cap.HasOnScrollToColumnTableView;
import luvjfx.cap.HasOnScrollToTableView;
import luvjfx.cap.HasOnSortTableView;
import luvjfx.cap.HasPlaceholderTableView;
import luvjfx.cap.HasRowFactoryTableView;
import luvjfx.cap.HasSelectionModelTableView;
import luvjfx.cap.HasSortPolicyTableView;
import luvjfx.cap.HasTableMenuButtonVisibleTableView;

public interface TableViewCaps<S extends TableViewCaps<S, N, T>, N extends TableView<T>, T> extends ControlCaps<S, N>, HasColumnResizePolicyTableView<S, N, T>, HasEditableTableView<S, N, T>, HasFixedCellSizeTableView<S, N, T>, HasFocusModelTableView<S, N, T>, HasItemsTableView<S, N, T>, HasOnScrollToTableView<S, N, T>, HasOnScrollToColumnTableView<S, N, T>, HasOnSortTableView<S, N, T>, HasPlaceholderTableView<S, N, T>, HasRowFactoryTableView<S, N, T>, HasSelectionModelTableView<S, N, T>, HasSortPolicyTableView<S, N, T>, HasTableMenuButtonVisibleTableView<S, N, T> {
}
