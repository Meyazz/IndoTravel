package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WisataJabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_jabar);
    }

    public void AlamPanenjoan(View view) {
        Intent intent = new Intent(this, AlamPanenjoan.class);
        startActivity(intent);
    }

    public void GreenCanyon(View view) {
        Intent intent = new Intent( this, activity_green_canyon.class);
        startActivity(intent);
    }

    public void StoneGarden(View view) {
        Intent intent =new Intent(this, StoneGarden.class);
        startActivity(intent);
    }

    public void UjungGenteng(View view) {
        Intent intent = new Intent(this, UjungGenteng.class);
        startActivity(intent);
    }

    public void TelagaRemis(View view) {
        Intent intent = new Intent(this, TelagaRemis.class);
        startActivity(intent);
    }

    public void KawahPutih(View view) {
        Intent intent = new Intent(this, KawahPutih.class);
        startActivity(intent);
    }

    public void TalagaBodas(View view) {
        Intent intent = new Intent(this, KawahTalagaBodas.class);
        startActivity(intent);
    }

    public void KampungKaruhun(View view) {
        Intent intent = new Intent(this, KampungKaruhun.class);
        startActivity(intent);
    }

    public void SriBaduga(View view) {
        Intent intent= new Intent(this, SriBadugaPurwakarta.class);
        startActivity(intent);
    }

    public void CurugCikaso(View view) {
        Intent intent = new Intent(this, CurugCikaso.class);
        startActivity(intent);
    }
}
