package com.template;

import android.app.Application;

import com.lynx.content.LynxApplication;
import com.lynx.content.LynxApplicationDelegate;
import com.lynx.content.info.App;


public class MainApplication extends Application implements LynxApplication {
    private LynxApplicationDelegate mDelegate;

    @Override
    public void onCreate() {
        super.onCreate();
        mDelegate = new LynxApplicationDelegate(this);
        mDelegate.onCreate();
    }

    @Override
    public App getAppInfo() {
        return mDelegate.getAppInfo();
    }
}
