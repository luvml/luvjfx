package luvjfx;

import java.lang.Override;
import javafx.scene.control.ListView;

public final class FxListView<T> implements ListViewCaps<FxListView<T>, ListView<T>, T> {
  public final ListView<T> node;

  FxListView(ListView<T> node) {
    this.node = node;
  }

  @Override
  public ListView<T> node() {
    return node;
  }
}
