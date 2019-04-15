package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WisataBanten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_banten);
    }

    public void MasjidAgung(View view) {
        Intent intent = new Intent(this, agung_banten.class);
        startActivity(intent);
    }

    public void Anyer(View view) {
        Intent intent = new Intent(this, Anyer.class);
        startActivity(intent);
    }

    public void Baduy(View view) {
        Intent intent = new Intent(this, activity_kampungbaduy.class);
        startActivity(intent);
    }

    public void UjungKulon(View view) {
        Intent intent = new Intent(this, ujung_kulon.class);
        startActivity(intent);
    }

    public void OceanPark(View view) {
        Intent intent = new Intent(this, OceanPark.class);
        startActivity(intent);
    }

    public void Peucang(View view) {
        Intent intent = new Intent(this, PulauPeucang.class);
        startActivity(intent);
    }

    public void Sawarna(View view) {
        Intent intent = new Intent(this, PantaiSawarna.class);
        startActivity(intent);
    }

    public void Umang(View view) {
        Intent intent = new Intent(this, PulauUmang.class);
        startActivity(intent);
    }

    public void Gendang(View view) {
        Intent intent = new Intent(this, air_terjun_gendang.class);
        startActivity(intent);
    }

    public void Cangkir(View view) {
        Intent intent = new Intent(this, pulau_cangkir.class);
        startActivity(intent);
    }
}
