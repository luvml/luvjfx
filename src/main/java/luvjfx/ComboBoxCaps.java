package luvjfx;

import javafx.scene.control.ComboBox;
import luvjfx.cap.HasButtonCell;
import luvjfx.cap.HasCellFactoryComboBox;
import luvjfx.cap.HasConverterComboBox;
import luvjfx.cap.HasItemsComboBox;
import luvjfx.cap.HasPlaceholderComboBox;
import luvjfx.cap.HasSelectionModelComboBox;
import luvjfx.cap.HasVisibleRowCount;

public interface ComboBoxCaps<S extends ComboBoxCaps<S, N, T>, N extends ComboBox<T>, T> extends ComboBoxBaseCaps<S, N, T>, HasButtonCell<S, N, T>, HasCellFactoryComboBox<S, N, T>, HasConverterComboBox<S, N, T>, HasItemsComboBox<S, N, T>, HasPlaceholderComboBox<S, N, T>, HasSelectionModelComboBox<S, N, T>, HasVisibleRowCount<S, N, T> {
}
