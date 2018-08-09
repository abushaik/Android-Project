package com.example.shaiksaurab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class paddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paddy);
        TextView textView = (TextView) findViewById(R.id.textpaddy);
        textView.setMovementMethod(new ScrollingMovementMethod());
        TextView textView1 = (TextView) findViewById(R.id.textpaddy1);
        textView1.setMovementMethod(new ScrollingMovementMethod());
    }
}
