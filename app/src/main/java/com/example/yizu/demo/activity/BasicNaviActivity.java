package com.example.yizu.demo.activity;

import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.example.yizu.R;


public class BasicNaviActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);
    }


}
