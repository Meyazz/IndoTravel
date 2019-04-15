package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ProgoRafting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progo_rafting);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Progo+Rafting/@-7.484805,110.2043193,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a8f66054c4093:0x1bd1912eb8c35b5f!8m2!3d-7.484805!4d110.206508";
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
