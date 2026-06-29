package luvjfx;

import java.lang.Override;
import javafx.scene.control.ChoiceBox;

public final class FxChoiceBox<T> implements ChoiceBoxCaps<FxChoiceBox<T>, ChoiceBox<T>, T> {
  public final ChoiceBox<T> node;

  FxChoiceBox(ChoiceBox<T> node) {
    this.node = node;
  }

  @Override
  public ChoiceBox<T> node() {
    return node;
  }
}
