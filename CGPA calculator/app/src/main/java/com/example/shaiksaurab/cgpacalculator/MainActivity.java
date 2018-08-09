package com.example.shaiksaurab.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText11;
    EditText editText2;
    EditText editText21;
    EditText editText3;
    EditText editText31;
    EditText editText4;
    EditText editText41;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.sub1);
        editText11 = (EditText) findViewById(R.id.sub11);

        editText2 = (EditText) findViewById(R.id.sub2);
        editText21 = (EditText) findViewById(R.id.sub21);

        editText3 = (EditText) findViewById(R.id.sub3);
        editText31 = (EditText) findViewById(R.id.sub31);

        editText4 = (EditText) findViewById(R.id.sub4);
        editText41 = (EditText) findViewById(R.id.sub41);

        button = (Button) findViewById(R.id.result);
        textView = (TextView) findViewById(R.id.cgpa);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gpa1 = editText1.getText().toString();
                String gpa2 = editText2.getText().toString();
                String gpa3 = editText3.getText().toString();
                String gpa4 = editText4.getText().toString();

                String crd1 = editText11.getText().toString();
                String crd2 = editText21.getText().toString();
                String crd3 = editText31.getText().toString();
                String crd4 = editText41.getText().toString();

                float gp1 = Float.parseFloat(gpa1);
                float gp2 = Float.parseFloat(gpa2);
                float gp3 = Float.parseFloat(gpa3);
                float gp4 = Float.parseFloat(gpa4);

                int cr1 = Integer.parseInt(crd1);
                int cr2 = Integer.parseInt(crd2);
                int cr3 = Integer.parseInt(crd3);
                int cr4 = Integer.parseInt(crd4);

                float totalgp1 = gp1 * cr1;
                float totalgp2 = gp2 * cr2;
                float totalgp3 = gp3 * cr3;
                float totalgp4 = gp4 * cr4;

                float total = totalgp1 + totalgp2 + totalgp3 + totalgp4;
                int credit = cr1 + cr2 + cr3 + cr4;
                float cgpa = total/credit;
                textView.setText(String.valueOf(cgpa));

            }
        });
    }
}
