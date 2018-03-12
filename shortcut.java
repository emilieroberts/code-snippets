@Override
public boolean dispatchKeyShortcutEvent(KeyEvent event) {
    if (event.getKeyCode() == KeyEvent.KEYCODE_Z) {
        //Undo action
        return true;
    }
    return super.dispatchKeyShortcutEvent(event);
}
