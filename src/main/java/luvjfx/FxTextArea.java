package luvjfx;

import java.lang.Override;
import javafx.scene.control.TextArea;

public final class FxTextArea implements TextAreaCaps<FxTextArea, TextArea> {
  public final TextArea node;

  FxTextArea(TextArea node) {
    this.node = node;
  }

  @Override
  public TextArea node() {
    return node;
  }
}
