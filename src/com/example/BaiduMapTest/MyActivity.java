package com.example.BaiduMapTest;

import android.app.Activity;
import android.os.Bundle;
import com.baidu.lbsapi.BMapManager;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private MapView mapView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.main);
     //   mapView = (MapView) findViewById(R.id.map_view);

    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //��activityִ��onDestroyʱִ��mMapView.onDestroy()��ʵ�ֵ�ͼ�������ڹ���
//        mapView.onDestroy();
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        //��activityִ��onResumeʱִ��mMapView. onResume ()��ʵ�ֵ�ͼ�������ڹ���
//        mapView.onResume();
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//        //��activityִ��onPauseʱִ��mMapView. onPause ()��ʵ�ֵ�ͼ�������ڹ���
//        mapView.onPause();
//    }
}
