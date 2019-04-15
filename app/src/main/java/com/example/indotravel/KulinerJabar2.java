package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerJabar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jabar2);
    }

    public void TutugOncom(View view) {
        Intent intent = new Intent(this, TutugOncom.class);
        startActivity(intent);
    }

    public void Opak(View view) {
        Intent intent = new Intent(this, Opak.class);
        startActivity(intent);
    }

    public void Surabi(View view) {
        Intent intent = new Intent(this, Surabi.class);
        startActivity(intent);
    }

    public void ManisanPala(View view) {
        Intent intent = new Intent(this, ManisanPala.class);
        startActivity(intent);
    }

    public void Mochi(View view) {
        Intent intent = new Intent(this, Mochi.class);
        startActivity(intent);
    }

    public void Lotek(View view) {
        Intent intent = new Intent(this, MakanLotek.class);
        startActivity(intent);
    }

    public void Karedok(View view) {
        Intent intent = new Intent(this, Karedok.class);
        startActivity(intent);
    }

    public void Peuyeum(View view) {
        Intent intent = new Intent(this, Peyeum.class);
        startActivity(intent);
    }

    public void Cireng(View view) {

        Intent intent = new Intent(this, Cireng.class);
        startActivity(intent);
    }

    public void CombroMisro(View view) {
        Intent intent = new Intent(this, CombroMisro.class);
        startActivity(intent);
    }
}
