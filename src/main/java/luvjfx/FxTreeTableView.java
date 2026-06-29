package luvjfx;

import java.lang.Override;
import javafx.scene.control.TreeTableView;

public final class FxTreeTableView<T> implements TreeTableViewCaps<FxTreeTableView<T>, TreeTableView<T>, T> {
  public final TreeTableView<T> node;

  FxTreeTableView(TreeTableView<T> node) {
    this.node = node;
  }

  @Override
  public TreeTableView<T> node() {
    return node;
  }
}
