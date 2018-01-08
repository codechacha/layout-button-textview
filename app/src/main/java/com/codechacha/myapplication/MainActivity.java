package com.codechacha.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private TextView mTextView;
    private Button mBtnPrev;
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tv_text);
        mBtnPrev = (Button) findViewById(R.id.btn_prev);
        mBtnNext = (Button) findViewById(R.id.btn_next);

        mBtnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Prev button is pressed");
                mTextView.setText("Prev button is pressed");
                mTextView.setTextSize(20);
                mTextView.setTextColor(Color.BLUE);
            }
        });

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Next button is pressed");
                mTextView.setText("Next button is pressed");
                mTextView.setTextSize(15);
                mTextView.setTextColor(Color.RED);
            }
        });
    }
}
