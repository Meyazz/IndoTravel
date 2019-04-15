package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerJatim2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jatim2);
    }

    public void SotoLamongan(View view) {
        Intent intent = new Intent(this, SotoLamongan.class);
        startActivity(intent);
    }

    public void RujakCingur(View view) {
        Intent intent = new Intent(this, RujakCingur.class);
        startActivity(intent);
    }

    public void Rawon(View view) {
        Intent intent = new Intent(this, Rawon.class);
        startActivity(intent);
    }

    public void LontongBalap(View view) {
        Intent intent = new Intent(this, LontongBalap.class);
        startActivity(intent);
    }

    public void GethukPisang(View view) {
        Intent intent = new Intent(this, GethukPisang.class);
        startActivity(intent);
    }

    public void Pecel(View view) {
        Intent intent = new Intent(this, Pecel.class);
        startActivity(intent);
    }

    public void TahuTek(View view) {
        Intent intent = new Intent(this, TahuTek.class);
        startActivity(intent);
    }

    public void RujakSoto(View view) {
        Intent intent = new Intent(this, RujakSoto.class);
        startActivity(intent);
    }

    public void LodhoAyam(View view) {
        Intent intent = new Intent(this, LodhoAyam.class);
        startActivity(intent);
    }

    public void Brem(View view) {
        Intent intent = new Intent(this, Brem.class);
        startActivity(intent);
    }}
