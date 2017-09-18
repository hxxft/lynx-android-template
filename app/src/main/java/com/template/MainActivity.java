package com.template;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

import com.lynx.resources.Resource;
import com.lynx.resources.ResourcesManager;
import com.lynx.ui.LynxView;

public class MainActivity extends AppCompatActivity {

    private LynxView mLynxView;
    private LinearLayout mLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mLynxView.setBackgroundColor(Color.WHITE);
        setContentView(mLynxView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mLynxView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mLynxView.onStop();
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        Resource res = ResourcesManager.getInstance().getResource(this, "app");
        mLynxView = new LynxView(this, true);
        mLynxView.loadHTMLData(res.GetPage());
        super.onApplyThemeResource(theme, resid, first);
    }
}
