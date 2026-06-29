package luvjfx;

import java.lang.Override;
import javafx.scene.control.ComboBox;

public final class FxComboBox<T> implements ComboBoxCaps<FxComboBox<T>, ComboBox<T>, T> {
  public final ComboBox<T> node;

  FxComboBox(ComboBox<T> node) {
    this.node = node;
  }

  @Override
  public ComboBox<T> node() {
    return node;
  }
}
