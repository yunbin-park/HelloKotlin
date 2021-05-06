package com.androidapp.hellokotlin;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
    private static Context appContext;

    public static Context get_AppContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }
}
