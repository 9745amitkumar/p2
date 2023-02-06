package com.example.prog2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity2.class);
                EditText e = findViewById(R.id.edit);
                EditText e1 = findViewById(R.id.edit2);
                int num1 = Integer.parseInt(e.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1 + num2;
                String s=Integer.toString(sum);
                Bundle extras = new Bundle();
                extras.putString("addition", s);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }}
