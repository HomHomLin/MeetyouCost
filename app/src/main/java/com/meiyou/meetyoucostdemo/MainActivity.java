package com.meiyou.meetyoucostdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.meiyou.meetyoucost.Test;
import com.meiyou.meetyoucost.TimeCache;
import com.meiyou.meetyoucostplugin.Cost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.maidian);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2(view, 1, "ttt","tts");
            }
        });
//        show();
//        show();
//        show2();
//        onClick(button);
    }

    public Object show2(View view, int a, String b, String c){
        Object[] meetyou_asms = new Object[20];
        meetyou_asms[0] = view;
        return view;
    }
//
//    public void show() {
//        for (int i = 0; i < 100; i++) {
//
//        }
//    }
}
