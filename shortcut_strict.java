@Override
public boolean dispatchKeyShortcutEvent(KeyEvent event) {
    if (event.getKeyCode() == KeyEvent.KEYCODE_Z
        && event.hasModifiers(KeyEvent.META_CTRL_ON)) {
        //Undo action
        return true;
    }

    return super.dispatchKeyShortcutEvent(event);
}
