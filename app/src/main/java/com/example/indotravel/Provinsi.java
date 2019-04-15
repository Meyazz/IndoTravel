package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Provinsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi);


    }

    public void ProvBanten(View view) {
        Intent intent = new Intent(this, WisataBanten.class);
        startActivity(intent);
    }

    public void ProvJakarta(View view) {
        Intent intent = new Intent(this, WisataJakarta.class);
        startActivity(intent);
    }

    public void ProvJateng(View view) {
        Intent intent = new Intent(this, activity_jateng.class);
        startActivity(intent);
    }

    public void ProvYogya(View view) {
        Intent intent = new Intent(this, WisataJogja.class);
        startActivity(intent);
    }

    public void ProvJatim(View view) {
        Intent intent = new Intent(this, WisataJatim.class);
        startActivity(intent);
    }

    public void ProvJabar(View view) {
        Intent intent = new Intent(this, WisataJabar.class);
        startActivity(intent);
    }
}
