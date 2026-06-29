package luvjfx;

import java.lang.Override;
import javafx.scene.control.TableView;

public final class FxTableView<T> implements TableViewCaps<FxTableView<T>, TableView<T>, T> {
  public final TableView<T> node;

  FxTableView(TableView<T> node) {
    this.node = node;
  }

  @Override
  public TableView<T> node() {
    return node;
  }
}
