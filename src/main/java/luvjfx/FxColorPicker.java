package luvjfx;

import java.lang.Override;
import javafx.scene.control.ColorPicker;

public final class FxColorPicker implements ColorPickerCaps<FxColorPicker, ColorPicker> {
  public final ColorPicker node;

  FxColorPicker(ColorPicker node) {
    this.node = node;
  }

  @Override
  public ColorPicker node() {
    return node;
  }
}
