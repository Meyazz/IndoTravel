package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.TimerTask;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void menuWisata(View view) {
        Intent intent = new Intent(this, Provinsi.class);
        startActivity(intent);
    }

    public void menuKuliner(View view) {
        Intent intent = new Intent(this, ListProvinsi.class);
        startActivity(intent);
    }

    public void tipsTrik(View view) {
        Intent intent = new Intent(this, TipsTricks.class);
        startActivity(intent);
    }
}
