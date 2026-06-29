package luvjfx;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public interface ColorPickerCaps<S extends ColorPickerCaps<S, N>, N extends ColorPicker> extends ComboBoxBaseCaps<S, N, Color> {
}
