package com.meiyou.meetyoucostdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                show2(view, 1, "");
            }
        });
//        show();
//        show();
//        show2();
//        onClick(button);
    }

    public void show2(View view, int a, String b){

    }

    public void show() {
        for (int i = 0; i < 100; i++) {

        }
    }
}
