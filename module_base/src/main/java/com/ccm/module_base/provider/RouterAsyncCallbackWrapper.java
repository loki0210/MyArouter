package com.ccm.module_base.provider;

import android.support.annotation.Nullable;

import java.util.Map;

public class RouterAsyncCallbackWrapper {
    private RouterAsyncCallback routerAsyncCallback;


    private RouterAsyncCallbackWrapper(RouterAsyncCallback callback) {
        this.routerAsyncCallback = callback;
    }

    public static RouterAsyncCallbackWrapper newInstance(RouterAsyncCallback callback) {
        if (callback != null) {
            callback.onStart();
        }
        return new RouterAsyncCallbackWrapper(callback);
    }

    public void onSuccess(@Nullable Map<String, Object> result) {
        routerAsyncCallback.onSuccess(result);
        routerAsyncCallback.onFinish();
    }

    public void onFailed(@Nullable Map<String, Object> error) {
        routerAsyncCallback.onFailed(error);
        routerAsyncCallback.onFinish();
    }


}
