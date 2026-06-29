package luvjfx;

import javafx.scene.control.MenuButton;
import luvjfx.cap.HasOnHiddenMenuButton;
import luvjfx.cap.HasOnHidingMenuButton;
import luvjfx.cap.HasOnShowingMenuButton;
import luvjfx.cap.HasOnShownMenuButton;
import luvjfx.cap.HasPopupSide;

public interface MenuButtonCaps<S extends MenuButtonCaps<S, N>, N extends MenuButton> extends ButtonBaseCaps<S, N>, HasOnHiddenMenuButton<S, N>, HasOnHidingMenuButton<S, N>, HasOnShowingMenuButton<S, N>, HasOnShownMenuButton<S, N>, HasPopupSide<S, N> {
}
