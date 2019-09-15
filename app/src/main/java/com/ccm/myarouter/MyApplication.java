package com.ccm.myarouter;



import android.app.Application;

import com.ccm.module_base.RouterUtil;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RouterUtil.init(this);
        RouterUtil.initModuleApplication(this,"/provider/moduleTwoApplication");
    }
}
