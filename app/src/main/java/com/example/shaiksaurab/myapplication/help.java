package com.example.shaiksaurab.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class help extends AppCompatActivity {
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText) findViewById(R.id.editText);
    }
    public void sendButton(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] arr = {"shaik15-5612@diu.edu.bd"};
        i.putExtra(Intent.EXTRA_EMAIL,arr);
        i.putExtra(Intent.EXTRA_SUBJECT, "Sample mail");
        String body = edit.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT,body);

        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }
}

