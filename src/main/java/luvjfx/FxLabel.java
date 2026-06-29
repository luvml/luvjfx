package luvjfx;

import java.lang.Override;
import javafx.scene.control.Label;

public final class FxLabel implements LabelCaps<FxLabel, Label> {
  public final Label node;

  FxLabel(Label node) {
    this.node = node;
  }

  @Override
  public Label node() {
    return node;
  }
}
