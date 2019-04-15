package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DataranDieng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataran_dieng);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Dieng+Plateau/@-7.2149012,109.8994385,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipOh6GWaf-xZGD6S2OVwLSkJmt-Mwq68aPR8mRK1!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipOh6GWaf-xZGD6S2OVwLSkJmt-Mwq68aPR8mRK1%3Dw129-h86-k-no!7i1776!8i1184!4m5!3m4!1s0x2e700ce34714804d:0xf71779c2d538ad1!8m2!3d-7.2149012!4d109.8994385";
        // Parse the location and create the intent.
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
