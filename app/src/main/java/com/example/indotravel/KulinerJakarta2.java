package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerJakarta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jakarta2);
    }

    public void KerakTelor(View view) {
        Intent intent = new Intent(this, KerakTelor.class);
        startActivity(intent);
    }

    public void NasiUduk(View view) {
        Intent intent = new Intent(this, NasiUduk.class);
        startActivity(intent);
    }

    public void NasiUlam(View view) {
        Intent intent = new Intent(this, NasiUlam.class);
        startActivity(intent);
    }

    public void LontongSayur(View view) {
        Intent intent = new Intent(this, LontongSayur.class);
        startActivity(intent);
    }

    public void GadoGado(View view) {
        Intent intent = new Intent(this, GadoGado.class);
        startActivity(intent);
    }

    public void PindangBandeng(View view) {
        Intent intent = new Intent(this, PindangBandeng.class);
        startActivity(intent);
    }

    public void SotoTangkar(View view) {
        Intent intent = new Intent(this, SotoTangkar.class);
        startActivity(intent);
    }

    public void SemurJengkol(View view) {
        Intent intent = new Intent(this, SemurJengkol.class);
        startActivity(intent);
    }

    public void LaksaBetawi(View view) {
        Intent intent = new Intent(this, Laksa.class);
        startActivity(intent);
    }

    public void KetanBintul(View view) {
        Intent intent = new Intent(this, KetanBintul.class);
        startActivity(intent);
    }
}
