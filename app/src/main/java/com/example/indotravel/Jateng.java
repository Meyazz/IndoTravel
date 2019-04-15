package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jateng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jateng);
    }

    public void Agungjateng(View view) {
        Intent intent = new Intent(this, AgungJateng.class);
        startActivity(intent);
    }

    public void Baturaden(View view) {
        Intent intent = new Intent(this, activity_raden.class);
        startActivity(intent);
    }

    public void Borobudur(View view) {
        Intent intent = new Intent(this, candi_borobudur.class);
        startActivity(intent);
    }

    public void Dieng(View view) {
        Intent intent = new Intent(this, DataranDieng.class);
        startActivity(intent);
    }

    public void Merbabu(View view) {
        Intent intent = new Intent(this, GunungMerbabu.class);
        startActivity(intent);
    }

    public void Sindoro(View view) {
        Intent intent = new Intent(this, LembahSindoro.class);
        startActivity(intent);
    }

    public void Nampu(View view) {
        Intent intent = new Intent(this, pantai_nampu.class);
        startActivity(intent);
    }

    public void Ponggok(View view) {
        Intent intent = new Intent(this, UmbulPonggok.class);
        startActivity(intent);
    }

    public void Sewu(View view) {
        Intent intent = new Intent(this, GrojoganSewu.class);
        startActivity(intent);
    }

    public void Rafting(View view) {
        Intent intent = new Intent(this, ProgoRafting.class);
        startActivity(intent);
    }
}
