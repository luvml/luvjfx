package luvjfx;

import javafx.scene.control.TabPane;
import luvjfx.cap.HasRotateGraphic;
import luvjfx.cap.HasSelectionModelTabPane;
import luvjfx.cap.HasSide;
import luvjfx.cap.HasTabClosingPolicy;
import luvjfx.cap.HasTabDragPolicy;
import luvjfx.cap.HasTabMaxHeight;
import luvjfx.cap.HasTabMaxWidth;
import luvjfx.cap.HasTabMinHeight;
import luvjfx.cap.HasTabMinWidth;

public interface TabPaneCaps<S extends TabPaneCaps<S, N>, N extends TabPane> extends ControlCaps<S, N>, HasRotateGraphic<S, N>, HasSelectionModelTabPane<S, N>, HasSide<S, N>, HasTabClosingPolicy<S, N>, HasTabDragPolicy<S, N>, HasTabMaxHeight<S, N>, HasTabMaxWidth<S, N>, HasTabMinHeight<S, N>, HasTabMinWidth<S, N> {
}
