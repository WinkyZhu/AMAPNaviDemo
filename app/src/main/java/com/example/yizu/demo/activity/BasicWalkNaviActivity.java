package com.example.yizu.demo.activity;

import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.example.yizu.R;


public class BasicWalkNaviActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);
    }


    @Override
    public void onInitNaviSuccess() {
        mAMapNavi.calculateWalkRoute(sList.get(0), eList.get(0));
    }
}
