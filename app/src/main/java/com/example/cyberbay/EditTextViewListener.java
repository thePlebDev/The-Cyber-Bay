package com.example.cyberbay;

import android.text.Editable;
import android.text.TextWatcher;

public class EditTextViewListener implements TextWatcher {
    private String mainText;

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.mainText = s.toString();// this should update our text when we want to.
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
