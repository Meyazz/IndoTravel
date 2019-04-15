package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class activity_gili_labak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gililabak);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Gili+labak+Adventure/@-7.0545381,113.9405716,17z/data=!4m8!1m2!2m1!1sgili+labak+island!3m4!1s0x2dd9e3450e3ccb1f:0xd293cae92a2980cd!8m2!3d-7.0547852!4d113.9397826";
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
