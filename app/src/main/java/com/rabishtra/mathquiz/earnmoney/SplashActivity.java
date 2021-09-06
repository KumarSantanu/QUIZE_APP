package com.rabishtra.mathquiz.earnmoney;

import static com.rabishtra.mathquiz.earnmoney.Global.SPLASH_TIME;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private AppCompatImageView appLogo;
    private AppCompatTextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
        setAppName();

       Handler h = new Handler(Looper.getMainLooper());
       h.postDelayed(this::task, SPLASH_TIME);

    }

    private void task() {
        // Task after complete sleepTime
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
    }

    private void initView() {
        appLogo = findViewById(R.id.iv_logo_main);
        appName = findViewById(R.id.tv_app_name_main);
    }

    private void setAppName(){
        appName.setText(getString(R.string.app_name));
    }
}