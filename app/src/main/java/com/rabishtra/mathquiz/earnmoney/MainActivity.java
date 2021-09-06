package com.rabishtra.mathquiz.earnmoney;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setValue();
        setToolbar();
    }

    private void initView() {
        toolbar = findViewById(R.id.tb_main);
    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            if (!title.equals("")) {
                toolbar.setTitle(title);
            }
        }
    }

    private void setValue(){
        title = getString(R.string.app_name);
    }
}