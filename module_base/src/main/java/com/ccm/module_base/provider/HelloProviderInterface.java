package com.ccm.module_base.provider;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface HelloProviderInterface extends IProvider {

    void sayHello(Context context);
}
