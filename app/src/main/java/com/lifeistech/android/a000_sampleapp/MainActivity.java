package com.lifeistech.android.a000_sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 0;

    TextView textView;

    int master;

    int demo;

    int demo2;

    int[] demo3;

    boolean DemoBoolean;

    boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.valueOf(number));
    }

    public void add(View v) {
        number++;

        textView.setText(String.valueOf(number));

        if(BuildConfig.DEBUG) {
            Log.d("Number", String.valueOf(number));
        }
    }
}
