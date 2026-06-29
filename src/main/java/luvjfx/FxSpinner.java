package luvjfx;

import java.lang.Override;
import javafx.scene.control.Spinner;

public final class FxSpinner<T> implements SpinnerCaps<FxSpinner<T>, Spinner<T>, T> {
  public final Spinner<T> node;

  FxSpinner(Spinner<T> node) {
    this.node = node;
  }

  @Override
  public Spinner<T> node() {
    return node;
  }
}
