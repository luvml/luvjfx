package luvjfx;

import javafx.scene.control.Control;
import luvjfx.cap.HasContextMenu;
import luvjfx.cap.HasSkin;
import luvjfx.cap.HasTooltip;

public interface ControlCaps<S extends ControlCaps<S, N>, N extends Control> extends RegionCaps<S, N>, HasContextMenu<S, N>, HasSkin<S, N>, HasTooltip<S, N> {
}
