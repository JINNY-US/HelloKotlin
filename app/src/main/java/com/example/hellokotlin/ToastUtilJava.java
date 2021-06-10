package com.example.hellokotlin;

import android.widget.Toast;

public class ToastUtilJava{

    public static void Toast_short(String s) {
        Toast.makeText(MainApplication.get_appContext(), "" + s, Toast.LENGTH_SHORT).show();

    }
    public static void Toast_long(String s) {
        Toast.makeText(MainApplication.get_appContext(), "" + s, Toast.LENGTH_LONG).show();
    }
}
