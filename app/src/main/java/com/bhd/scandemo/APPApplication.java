package com.bhd.scandemo;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

public class APPApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
