package com.template;

import android.app.Application;

import com.lynx.LynxExtModule;
import com.lynx.content.LynxApplication;
import com.lynx.content.LynxApplicationDelegate;
import com.lynx.content.info.App;

import java.util.Arrays;


public class MainApplication extends Application implements LynxApplication {
    private LynxApplicationDelegate mDelegate;

    @Override
    public void onCreate() {
        super.onCreate();
        mDelegate = new LynxApplicationDelegate(this);
        mDelegate.setExtModules(Arrays.asList(new LynxExtModule()));
        mDelegate.onCreate();
    }

    @Override
    public App getAppInfo() {
        return mDelegate.getAppInfo();
    }
}
