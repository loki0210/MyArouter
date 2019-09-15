package com.ccm.module_two;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccm.module_base.provider.RouterApplicationProvider;

@Route(path = "/provider/moduleTwoApplication")

public class ApplicationProviderImpl extends RouterApplicationProvider {
    @Override
    public void onCreate(Application application) {
        Log.i("ApplicationProviderImpl", "/provider/moduleTwoApplication");
    }
}
