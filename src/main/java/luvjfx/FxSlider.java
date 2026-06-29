package luvjfx;

import java.lang.Override;
import javafx.scene.control.Slider;

public final class FxSlider implements SliderCaps<FxSlider, Slider> {
  public final Slider node;

  FxSlider(Slider node) {
    this.node = node;
  }

  @Override
  public Slider node() {
    return node;
  }
}
