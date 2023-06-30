package com.example.lab5task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3;
    Button bsum;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);


        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        bsum = (Button) findViewById(R.id.bsum);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);

        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                int addition=Integer.parseInt(num1) + Integer.parseInt(num2);
                et3.setText(String.valueOf(addition));

            }
        });
    }

}
