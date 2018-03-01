@Override
public boolean dispatchKeyShortcutEvent(KeyEvent event) {
    if (event.getKeyCode() == KeyEvent.KEYCODE_S) {
        // save action
        return true;
    }
    return super.dispatchKeyShortcutEvent(event);
}
