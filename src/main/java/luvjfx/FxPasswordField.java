package luvjfx;

import java.lang.Override;
import javafx.scene.control.PasswordField;

public final class FxPasswordField implements PasswordFieldCaps<FxPasswordField, PasswordField> {
  public final PasswordField node;

  FxPasswordField(PasswordField node) {
    this.node = node;
  }

  @Override
  public PasswordField node() {
    return node;
  }
}
