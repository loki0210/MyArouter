package com.ccm.module_base.provider;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.template.IProvider;

import java.util.Map;

public abstract class RouterAsyncProvider implements IProvider {
    private Context context;

    @Override
    public void init(Context context) {
        this.context = context.getApplicationContext();
    }

    public Context getContext() {
        return context;
    }

    @Nullable
    public abstract void doAction(@Nullable Activity activity, Map<String, String> params, RouterAsyncCallbackWrapper callbackWrapper);
}
