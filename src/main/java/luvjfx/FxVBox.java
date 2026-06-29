package luvjfx;

import java.lang.Override;
import javafx.scene.layout.VBox;

public final class FxVBox implements VBoxCaps<FxVBox, VBox>, FxPane<FxVBox, VBox> {
  public final VBox node;

  FxVBox(VBox node) {
    this.node = node;
  }

  @Override
  public VBox node() {
    return node;
  }
}
