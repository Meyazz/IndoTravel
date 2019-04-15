package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WisataJogja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_jogja);
    }

    public void Keraton(View view) {
        Intent intent = new Intent(this, KeratonJogja.class);
        startActivity(intent);
    }

    public void Tugu(View view) {
        Intent intent = new Intent(this, TuguJogja.class);
        startActivity(intent);
    }

    public void SriGethuk(View view) {
        Intent intent = new Intent(this, AirGethuk.class);
        startActivity(intent);
    }

    public void TamanPintar(View view) {
        Intent intent = new Intent(this, TamanPintar.class);
        startActivity(intent);
    }

    public void Malioboro(View view) {
        Intent intent = new Intent(this, MalioboroJogja.class);
        startActivity(intent);
    }

    public void GoaPindul(View view) {
        Intent intent = new Intent(this, GoaPindul.class);
        startActivity(intent);
    }

    public void Prambanan(View view) {
        Intent intent = new Intent(this, CandiPrambanan.class);
        startActivity(intent);
    }

    public void GembiraLoka(View view) {
        Intent intent = new Intent(this, GembiraLoka.class);
        startActivity(intent);
    }

    public void PantaiParangtritis(View view) {
        Intent intent = new Intent(this, PantaiParangtritis.class);
        startActivity(intent);
    }

    public void PantaiIndrayanti(View view) {
        Intent intent = new Intent(this, PantaiIndrayanti.class);
        startActivity(intent);
    }
}
