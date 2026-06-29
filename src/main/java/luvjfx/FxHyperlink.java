package luvjfx;

import java.lang.Override;
import javafx.scene.control.Hyperlink;

public final class FxHyperlink implements HyperlinkCaps<FxHyperlink, Hyperlink> {
  public final Hyperlink node;

  FxHyperlink(Hyperlink node) {
    this.node = node;
  }

  @Override
  public Hyperlink node() {
    return node;
  }
}
