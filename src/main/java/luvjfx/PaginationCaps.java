package luvjfx;

import javafx.scene.control.Pagination;
import luvjfx.cap.HasCurrentPageIndex;
import luvjfx.cap.HasMaxPageIndicatorCount;
import luvjfx.cap.HasPageCount;
import luvjfx.cap.HasPageFactory;

public interface PaginationCaps<S extends PaginationCaps<S, N>, N extends Pagination> extends ControlCaps<S, N>, HasCurrentPageIndex<S, N>, HasMaxPageIndicatorCount<S, N>, HasPageCount<S, N>, HasPageFactory<S, N> {
}
