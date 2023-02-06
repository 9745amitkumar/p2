package com.example.prog2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView Result=findViewById(R.id.textView);
        String value1 = getIntent().getStringExtra("addition");
        Result.setText(value1);
    }
}
