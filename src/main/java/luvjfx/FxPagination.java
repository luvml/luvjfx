package luvjfx;

import java.lang.Override;
import javafx.scene.control.Pagination;

public final class FxPagination implements PaginationCaps<FxPagination, Pagination> {
  public final Pagination node;

  FxPagination(Pagination node) {
    this.node = node;
  }

  @Override
  public Pagination node() {
    return node;
  }
}
