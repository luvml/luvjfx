package luvjfx;

import java.lang.Override;
import javafx.scene.control.TextField;

public final class FxTextField implements TextFieldCaps<FxTextField, TextField> {
  public final TextField node;

  FxTextField(TextField node) {
    this.node = node;
  }

  @Override
  public TextField node() {
    return node;
  }
}
