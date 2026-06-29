package luvjfx;

import java.lang.Override;
import javafx.scene.layout.AnchorPane;

public final class FxAnchorPane implements AnchorPaneCaps<FxAnchorPane, AnchorPane>, FxPane<FxAnchorPane, AnchorPane> {
  public final AnchorPane node;

  FxAnchorPane(AnchorPane node) {
    this.node = node;
  }

  @Override
  public AnchorPane node() {
    return node;
  }
}
