package com.template;

import android.app.Application;

import com.lynx.core.RuntimeManager;

/**
 * Created by yanxing on 16/9/29.
 */

public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        RuntimeManager.prepare(MainApplication.this);
    }
}
