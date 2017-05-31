package com.meiyou.meetyoucostdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.meiyou.meetyoucost.Test;
import com.meiyou.meetyoucostplugin.Cost;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            Log.i("oncreate", "savedInstanceState is null");
        }
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.maidian);
        Button button2 = new Button(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2(view, 1, "ttt","tts");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(incetp()){
                    return;
                }
                show2(view, 1, "ttt","tts");
            }
        });
//        show();
//        show();
//        show2();
//        onClick(button);
    }

    public boolean incetp(){
        return false;
    }

    public View show2(View view, int a, String b, String c){
        Object[] meetyou_asms = new Object[20];
        meetyou_asms[0] = view;
        meetyou_asms[10] = a;
        meetyou_asms[11] = 1;
        meetyou_asms[12] = "sss";
        meetyou_asms[15] = b;
        return view;
    }
//
//    public void show() {
//        for (int i = 0; i < 100; i++) {
//
//        }
//    }
}
