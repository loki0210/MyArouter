package com.ccm.module_two;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ccm.module_base.RouterEvent;

import de.greenrobot.event.EventBus;

@Route(path = "/activity/moduleTwoActivity")
public class ModuleTwoActivity extends AppCompatActivity {

    public String mUrl;
    @Autowired
    public String tName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        mUrl = getIntent().getStringExtra(ARouter.RAW_URI);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ARouter.getInstance().inject(this);

        EventBus.getDefault().register(this);

        ((TextView) findViewById(R.id.module_two_text)).setText("接收的参数---" + tName);


        EventBus.getDefault().post(new RouterEvent("moduleTwoActivityOnCreate", ""));
    }

    public void onEvent(String s){

    }
}
