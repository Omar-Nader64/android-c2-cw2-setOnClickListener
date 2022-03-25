package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 =findViewById(R.id.first_numbre);
        EditText num2 =findViewById(R.id.second_numbre);
        Button add =findViewById(R.id.add);
        Button rest =findViewById(R.id.rest);
        TextView res=findViewById(R.id.total);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a =Integer.parseInt(num1.getText().toString());
                int b =Integer.parseInt(num2.getText().toString());
                int x =a+b;
                res.setText(""+x);
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String t="";
                num1.setText(t);
                num2.setText(t);
                res.setText("   totaL");

            }
        });


    }
}