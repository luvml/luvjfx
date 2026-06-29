package luvjfx;

import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import luvjfx.cap.HasChronology;
import luvjfx.cap.HasConverterDatePicker;
import luvjfx.cap.HasDayCellFactory;
import luvjfx.cap.HasShowWeekNumbers;

public interface DatePickerCaps<S extends DatePickerCaps<S, N>, N extends DatePicker> extends ComboBoxBaseCaps<S, N, LocalDate>, HasChronology<S, N>, HasConverterDatePicker<S, N>, HasDayCellFactory<S, N>, HasShowWeekNumbers<S, N> {
}
