package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WisataJatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_jatim);
    }

    public void MuseumAngkut(View view) {
        Intent intent = new Intent(this, MuseumAngkut.class);
        startActivity(intent);
    }

    public void Baluran(View view) {
        Intent intent = new Intent(this, TamanBaluran.class);
        startActivity(intent);
    }

    public void CobanRondo(View view) {
        Intent intent = new Intent(this, activity_coban_rondo.class);
        startActivity(intent);
    }

    public void GiliLabak(View view) {
        Intent intent = new Intent(this, activity_gili_labak.class);
        startActivity(intent);
    }

    public void GuaGong(View view) {
        Intent intent = new Intent(this, activity_gua_gong.class);
        startActivity(intent);
    }

    public void JatimPark(View view) {
        Intent intent = new Intent(this, activity_jatimpark.class);
        startActivity(intent);
    }

    public void KawahIjen(View view) {
        Intent intent = new Intent(this, activity_kawahijen.class);
        startActivity(intent);
    }

    public void CandiPenataran(View view) {
        Intent intent = new Intent(this, CandiPenataran.class);
        startActivity(intent);
    }

    public void PantaiSukamade(View view) {
        Intent intent = new Intent(this, PantaiSukamade.class);
        startActivity(intent);
    }

    public void PantaKlayar(View view) {
        Intent intent = new Intent(this,PantaiKlayar.class);
        startActivity(intent);
    }
}
