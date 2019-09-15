package com.ccm.module_base.provider;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public abstract class RouterApplicationProvider implements IProvider {
    private Context context;

    @Override
    public void init(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public abstract void onCreate(Application application);
}
