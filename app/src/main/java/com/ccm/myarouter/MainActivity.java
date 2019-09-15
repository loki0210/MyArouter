package com.ccm.myarouter;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ccm.module_base.RouterEvent;
import com.ccm.module_base.RouterUtil;
import com.ccm.module_base.provider.HelloProviderInterface;
import com.ccm.module_base.provider.RouterAsyncCallback;

import java.util.HashMap;
import java.util.Map;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {


    @Autowired(name = "/provider/moduleTwoHelloProviderTwo")
    HelloProviderInterface helloProviderInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
        EventBus.getDefault().register(this);


    }

    //点击跳转
    public void login(View view) {
        // helloProviderInterface.sayHello(this);
        // 路由跳转
         ARouter.getInstance().build("/activity/moduleTwoActivity").withString("tName", "loki").navigation();
       //  RouterUtil.go("/activity/moduleTwoActivity");
       /*  RouterUtil.goWith("/activity/moduleTwoActivity")
                .withString("tName","loki")
                .navigation();*/

        // 同步调用
   /*     Map<String, Object> res = RouterUtil.exec(this, "/provider/moduleHelloProvider");
        assert res != null;
        String resV = (String) res.get("one");
        Toast.makeText(view.getContext(), resV, Toast.LENGTH_SHORT).show();*/

        /*//异步调用
        RouterUtil.execAsync(this, "/provider/HelloAsyncProviderIml?name=sss", new RouterAsyncCallback() {
            @Override
            public void onStart() {

            }

            @Override
            public void onSuccess(@Nullable Map<String, Object> result) {
                assert result != null;
                String resV = (String) result.get("two");
                Toast.makeText(MainActivity.this, resV, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(@Nullable Map<String, Object> error) {

            }

            @Override
            public void onFinish() {

            }
        });*/

    }


    public void onEvent(RouterEvent event) {
        if ("moduleTwoActivityOnCreate".equals(event.getEventName())) {
            Toast.makeText(this, event.getEventName(), Toast.LENGTH_SHORT).show();
        }
    }
}
