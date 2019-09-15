package com.ccm.module_two;

import android.app.Activity;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccm.module_base.provider.RouterAsyncCallbackWrapper;
import com.ccm.module_base.provider.RouterAsyncProvider;

import java.util.HashMap;
import java.util.Map;
@Route(path = "/provider/HelloAsyncProviderIml")
public class HelloAsyncProviderIml extends RouterAsyncProvider {


    @Nullable
    @Override
    public void doAction(@Nullable Activity activity, Map<String, String> params, RouterAsyncCallbackWrapper callbackWrapper) {
        Map<String, Object> result = new HashMap<>();
        result.put("two", "helloAsync");
        callbackWrapper.onSuccess(result);
    }
}
