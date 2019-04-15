package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class activity_raden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu_raden);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Baturraden,+Banyumas+Regency,+Central+Java/@-7.3229791,109.150418,12z/data=!3m1!4b1!4m8!1m2!2m1!1skawasan+wisata+baturaden!3m4!1s0x2e6ff51a569dec8d:0x76481c82a111502d!8m2!3d-7.3045305!4d109.2236831";
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
