package com.example.shaiksaurab.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn2;
        Button btn3;
        Button btn4;
        Button btn5;

        btn2 = (Button) findViewById(R.id.btnpaddy);
        btn3 = (Button) findViewById(R.id.btnveg);
        btn4 = (Button) findViewById(R.id.btnfruit);
        btn5 = (Button) findViewById(R.id.btnflow);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,paddy.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main2Activity.this,vegetable.class);
                startActivity(intent1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Main2Activity.this,fruit.class);
                startActivity(intent2);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Main2Activity.this,flower.class);
                startActivity(intent3);
            }
        });
    }
}
