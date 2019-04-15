package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KulinerJogja2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_jogja2);
    }

    public void Gudek(View view) {
        Intent intent = new Intent(this, Gudeg.class);
        startActivity(intent);
    }

    public void BakmiJawa(View view) {
        Intent intent = new Intent(this, BakmiJawa.class);
        startActivity(intent);
    }

    public void SateKlathak(View view) {
        Intent intent = new Intent(this, SateKlathak.class);
        startActivity(intent);
    }

    public void SegoKucing(View view) {
        Intent intent = new Intent(this, SegoKucing.class);
        startActivity(intent);
    }

    public void KopiJoss(View view) {
        Intent intent = new Intent(this, KopiJoss.class);
        startActivity(intent);
    }

    public void OsengMercon(View view) {
        Intent intent = new Intent(this, OsengMercon.class);
        startActivity(intent);
    }

    public void Soto(View view) {
        Intent intent = new Intent(this, Soto.class);
        startActivity(intent);
    }

    public void AyamGoreng(View view) {
        Intent intent = new Intent(this, AyamGoreng.class);
        startActivity(intent);
    }

    public void Bakpia(View view) {
        Intent intent = new Intent(this, Bakpia.class);
        startActivity(intent);
    }

    public void JadahTempe(View view) {
        Intent intent = new Intent(this, JadahTempe.class);
        startActivity(intent);
    }
}
