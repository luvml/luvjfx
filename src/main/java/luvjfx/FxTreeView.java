package luvjfx;

import java.lang.Override;
import javafx.scene.control.TreeView;

public final class FxTreeView<T> implements TreeViewCaps<FxTreeView<T>, TreeView<T>, T> {
  public final TreeView<T> node;

  FxTreeView(TreeView<T> node) {
    this.node = node;
  }

  @Override
  public TreeView<T> node() {
    return node;
  }
}
