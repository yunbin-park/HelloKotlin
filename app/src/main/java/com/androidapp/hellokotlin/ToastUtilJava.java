package com.androidapp.hellokotlin;

import android.widget.Toast;

public class ToastUtilJava {
    private void toast_short(String s) {
        Toast.makeText(MainApplication.get_AppContext(), "" + s, Toast.LENGTH_SHORT).show();
    }
    private void toast_long(String s) {
        Toast.makeText(MainApplication.get_AppContext(), "" + s, Toast.LENGTH_LONG).show();
    }
}
