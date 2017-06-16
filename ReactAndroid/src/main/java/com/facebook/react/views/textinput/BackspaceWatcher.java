package com.facebook.react.views.textinput;

/**
 * Implement this interface to trigger an action when the backspace is pressed and
 * the ReactTextEdit is empty. For other cases can be used the TextWatcher
 */
public interface BackspaceWatcher {
  void onBackspace();
}
