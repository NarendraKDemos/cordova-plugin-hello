package com.example.plugin;

import android.app.Application;
import android.widget.Toast;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "TestApplication", Toast.LENGTH_LONG).show();
    }
}
