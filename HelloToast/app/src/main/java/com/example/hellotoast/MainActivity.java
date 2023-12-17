package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        intent=new Intent(this, SecondActivity.class);
    }
    public void onShow(View view) {showToast( intent,1); }

    public void showToast(Intent intent, int i) {
        intent.putExtra("message", mCount);
        startActivity(intent);

    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}