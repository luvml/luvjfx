package luvjfx;

import java.lang.Override;
import javafx.scene.control.Separator;

public final class FxSeparator implements SeparatorCaps<FxSeparator, Separator> {
  public final Separator node;

  FxSeparator(Separator node) {
    this.node = node;
  }

  @Override
  public Separator node() {
    return node;
  }
}
