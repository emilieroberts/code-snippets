@Override
public boolean dispatchKeyShortcutEvent(KeyEvent event) {
    if ((event.getKeyCode() == KeyEvent.KEYCODE_TAB)
        && event.hasModifiers(KeyEvent.META_CTRL_ON | KeyEvent.META_SHIFT_ON)) {
        // reverse tab navigation
        return true;
    }

          return super.dispatchKeyShortcutEvent(event);
}