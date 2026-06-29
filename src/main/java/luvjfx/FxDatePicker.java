package luvjfx;

import java.lang.Override;
import javafx.scene.control.DatePicker;

public final class FxDatePicker implements DatePickerCaps<FxDatePicker, DatePicker> {
  public final DatePicker node;

  FxDatePicker(DatePicker node) {
    this.node = node;
  }

  @Override
  public DatePicker node() {
    return node;
  }
}
