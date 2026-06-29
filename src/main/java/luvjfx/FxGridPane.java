package luvjfx;

import java.lang.Override;
import javafx.scene.layout.GridPane;

public final class FxGridPane implements GridPaneCaps<FxGridPane, GridPane>, FxPane<FxGridPane, GridPane> {
  public final GridPane node;

  FxGridPane(GridPane node) {
    this.node = node;
  }

  @Override
  public GridPane node() {
    return node;
  }
}
