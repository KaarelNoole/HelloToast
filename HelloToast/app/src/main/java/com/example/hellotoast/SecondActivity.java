package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int mCount;
    private TextView Count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Count = findViewById(R.id.count);

        Intent intent = getIntent();
        mCount = intent.getIntExtra("message",0);
        Count.setText(String.valueOf(mCount));

    }
}