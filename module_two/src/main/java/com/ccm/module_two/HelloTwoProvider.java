package com.ccm.module_two;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ccm.module_base.provider.HelloProviderInterface;

@Route(path = "/provider/moduleTwoHelloProviderTwo")
public class HelloTwoProvider implements HelloProviderInterface {
    private Context context;

    @Override
    public void sayHello(Context context) {
        Toast.makeText(context, "I am moduleTwoHelloProviderTwo", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
