package com.example.indotravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
    private int waktu_loading = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent home = new Intent(MainActivity.this, Home.class);
                startActivity(home);
                finish();

            }
        }, waktu_loading);
    }
}
