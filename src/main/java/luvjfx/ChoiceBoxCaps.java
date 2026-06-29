package luvjfx;

import javafx.scene.control.ChoiceBox;
import luvjfx.cap.HasConverterChoiceBox;
import luvjfx.cap.HasItemsChoiceBox;
import luvjfx.cap.HasOnActionChoiceBox;
import luvjfx.cap.HasOnHiddenChoiceBox;
import luvjfx.cap.HasOnHidingChoiceBox;
import luvjfx.cap.HasOnShowingChoiceBox;
import luvjfx.cap.HasOnShownChoiceBox;
import luvjfx.cap.HasSelectionModelChoiceBox;
import luvjfx.cap.HasValueChoiceBox;

public interface ChoiceBoxCaps<S extends ChoiceBoxCaps<S, N, T>, N extends ChoiceBox<T>, T> extends ControlCaps<S, N>, HasConverterChoiceBox<S, N, T>, HasItemsChoiceBox<S, N, T>, HasOnActionChoiceBox<S, N, T>, HasOnHiddenChoiceBox<S, N, T>, HasOnHidingChoiceBox<S, N, T>, HasOnShowingChoiceBox<S, N, T>, HasOnShownChoiceBox<S, N, T>, HasSelectionModelChoiceBox<S, N, T>, HasValueChoiceBox<S, N, T> {
}
