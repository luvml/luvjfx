package luvjfx;

import java.lang.Override;
import javafx.scene.text.Text;

public final class FxText implements TextCaps<FxText, Text> {
  public final Text node;

  FxText(Text node) {
    this.node = node;
  }

  @Override
  public Text node() {
    return node;
  }
}
