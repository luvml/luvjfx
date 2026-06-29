package luvjfx;

import java.lang.Override;
import javafx.scene.layout.HBox;

public final class FxHBox implements HBoxCaps<FxHBox, HBox>, FxPane<FxHBox, HBox> {
  public final HBox node;

  FxHBox(HBox node) {
    this.node = node;
  }

  @Override
  public HBox node() {
    return node;
  }
}
