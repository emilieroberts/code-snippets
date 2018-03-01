@Override
public boolean dispatchKeyShortcutEvent(KeyEvent event) {
    if (event.getKeyCode() == KeyEvent.KEYCODE_S
        && event.hasModifiers(KeyEvent.META_CTRL_ON)) {
        // save action
        return true;
    }

    return super.dispatchKeyShortcutEvent(event);
}