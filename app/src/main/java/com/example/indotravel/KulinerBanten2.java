package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerBanten2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_banten2);
    }

    public void AngeunLada(View view) {
        Intent intent = new Intent(this, Lada.class);
        startActivity(intent);
    }

    public void BalokMenes(View view) {
        Intent intent = new Intent(this, BalokMenes.class);
        startActivity(intent);
    }

    public void KueBontot(View view) {
        Intent intent = new Intent(this, Bontot.class);
        startActivity(intent);
    }

    public void GeremAsem(View view) {
        Intent intent = new Intent(this, GeremAsem.class);
        startActivity(intent);
    }

    public void KetanBintul(View view) {
        Intent intent = new Intent(this, KetanBintul.class);
        startActivity(intent);
    }

    public void KueGipang(View view) {
        Intent intent = new Intent(this, KueGipang.class);
        startActivity(intent);
    }

    public void LepetBanten(View view) {
        Intent intent = new Intent(this, LepetBanten.class);
        startActivity(intent);
    }

    public void NasiSumsum(View view) {
        Intent intent = new Intent(this, NasiSumSum.class);
        startActivity(intent);
    }

    public void PecakBendeng(View view) {
        Intent intent = new Intent(this, PecakBandeng.class);
        startActivity(intent);
    }

    public void RabegBanten(View view) {
        Intent intent = new Intent(this, Rabeg.class);
        startActivity(intent);
    }
}
