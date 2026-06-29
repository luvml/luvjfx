package luvjfx;

import java.lang.Override;
import javafx.scene.control.Button;

public final class FxButton implements ButtonCaps<FxButton, Button> {
  public final Button node;

  FxButton(Button node) {
    this.node = node;
  }

  @Override
  public Button node() {
    return node;
  }
}
