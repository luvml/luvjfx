package luvjfx;

import javafx.scene.control.ListView;
import luvjfx.cap.HasCellFactoryListView;
import luvjfx.cap.HasEditableListView;
import luvjfx.cap.HasFixedCellSizeListView;
import luvjfx.cap.HasFocusModelListView;
import luvjfx.cap.HasItemsListView;
import luvjfx.cap.HasOnEditCancelListView;
import luvjfx.cap.HasOnEditCommitListView;
import luvjfx.cap.HasOnEditStartListView;
import luvjfx.cap.HasOnScrollToListView;
import luvjfx.cap.HasOrientationListView;
import luvjfx.cap.HasPlaceholderListView;
import luvjfx.cap.HasSelectionModelListView;

public interface ListViewCaps<S extends ListViewCaps<S, N, T>, N extends ListView<T>, T> extends ControlCaps<S, N>, HasCellFactoryListView<S, N, T>, HasEditableListView<S, N, T>, HasFixedCellSizeListView<S, N, T>, HasFocusModelListView<S, N, T>, HasItemsListView<S, N, T>, HasOnEditCancelListView<S, N, T>, HasOnEditCommitListView<S, N, T>, HasOnEditStartListView<S, N, T>, HasOnScrollToListView<S, N, T>, HasOrientationListView<S, N, T>, HasPlaceholderListView<S, N, T>, HasSelectionModelListView<S, N, T> {
}
