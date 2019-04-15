package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WisataJakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_jakarta);
    }

    public void MasjidIstiqlal(View view) {
        Intent intent = new Intent(this, MasjidIstiqlal.class);
        startActivity(intent);
    }

    public void Ancol(View view) {
        Intent intent = new Intent(this, TamanAncol.class);
        startActivity(intent);
    }

    public void TamanMini(View view) {
        Intent intent = new Intent(this, TamanMini.class);
        startActivity(intent);
    }

    public void MuseumWayang(View view) {
        Intent intent = new Intent(this, MuWayang.class);
        startActivity(intent);
    }

    public void PulauBidadari(View view) {
        Intent intent = new Intent(this, activity_bidadari.class);
        startActivity(intent);
    }

    public void Kidzania(View view) {
        Intent intent = new Intent(this, KidzaniaJakarta.class);
        startActivity(intent);
    }

    public void Mangrove(View view) {
        Intent intent = new Intent(this, HutanMangrove.class);
        startActivity(intent);
    }

    public void MuseumNasional(View view) {
        Intent intent = new Intent(this, activity_museumnasional.class);
        startActivity(intent);
    }

    public void Monas(View view) {
        Intent intent = new Intent(this,MonumenNasional.class);
        startActivity(intent);
    }

    public void Ragunan(View view) {
        Intent intent = new Intent(this, RagunanJakarta.class);
        startActivity(intent);
    }
}
