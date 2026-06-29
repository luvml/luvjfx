package luvjfx;

import javafx.scene.control.Slider;
import luvjfx.cap.HasBlockIncrementSlider;
import luvjfx.cap.HasLabelFormatter;
import luvjfx.cap.HasMajorTickUnit;
import luvjfx.cap.HasMaxSlider;
import luvjfx.cap.HasMinSlider;
import luvjfx.cap.HasMinorTickCount;
import luvjfx.cap.HasOrientationSlider;
import luvjfx.cap.HasShowTickLabels;
import luvjfx.cap.HasShowTickMarks;
import luvjfx.cap.HasSnapToTicks;
import luvjfx.cap.HasValueChanging;
import luvjfx.cap.HasValueSlider;

public interface SliderCaps<S extends SliderCaps<S, N>, N extends Slider> extends ControlCaps<S, N>, HasBlockIncrementSlider<S, N>, HasLabelFormatter<S, N>, HasMajorTickUnit<S, N>, HasMaxSlider<S, N>, HasMinSlider<S, N>, HasMinorTickCount<S, N>, HasOrientationSlider<S, N>, HasShowTickLabels<S, N>, HasShowTickMarks<S, N>, HasSnapToTicks<S, N>, HasValueSlider<S, N>, HasValueChanging<S, N> {
}
