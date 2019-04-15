package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerJateng2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jateng2);
    }

    public void TahuPetis(View view) {
        Intent intent = new Intent(this, TahuPetis.class);
        startActivity(intent);
    }

    public void TempeMendoan(View view) {
        Intent intent = new Intent(this, TempeMendoan.class);
        startActivity(intent);
    }

    public void NasiGandul(View view) {
        Intent intent = new Intent(this, NasiGandul.class);
        startActivity(intent);
    }

    public void Brekecek(View view) {
        Intent intent = new Intent(this, Brekecek.class);
        startActivity(intent);
    }

    public void NasiGrombvang(View view) {
        Intent intent = new Intent(this, NasiGrombyang.class);
        startActivity(intent);
    }

    public void GarangaAsem(View view) {
        Intent intent = new Intent(this, GarangAsem.class);
        startActivity(intent);
    }

    public void GethukGoreng(View view) {
        Intent intent = new Intent(this, GethukGoreng.class);
        startActivity(intent);
    }

    public void NasiLiwet(View view) {
        Intent intent = new Intent(this, NasiLiwet.class);
        startActivity(intent);
    }

    public void MangutBeong(View view) {
        Intent intent = new Intent(this, MangutBeOng.class);
        startActivity(intent);
    }

    public void MieOngklok(View view) {
        Intent intent = new Intent(this, MieOngklok.class);
        startActivity(intent);
    }
}
