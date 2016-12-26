package com.tv.tianyue.xrecyclerviewdemo;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by Evan on 2016/12/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /**okhttpUtils初始化**/
        OkGo.init(this);
        OkGo.getInstance().debug("OkGo");
    }
}
