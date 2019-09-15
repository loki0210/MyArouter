package com.ccm.module_base.provider;

import android.support.annotation.Nullable;

import java.util.Map;

public interface RouterAsyncCallback {

    void onStart();

    void onSuccess(@Nullable Map<String, Object> result);

    void onFailed(@Nullable Map<String, Object> error);

    void onFinish();

}
