package com.ccm.module_two;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccm.module_base.provider.RouterProvider;

import java.util.HashMap;
import java.util.Map;

@Route(path = "/provider/moduleHelloProvider")
public class HelloProviderImpl extends RouterProvider {

    @Nullable
    @Override
    public Map<String, Object> doAction(@Nullable Activity activity, Map<String, String> params) {
        Map<String, Object> result = new HashMap<>();
        result.put("one", "hello one");
        return result;
    }

}
