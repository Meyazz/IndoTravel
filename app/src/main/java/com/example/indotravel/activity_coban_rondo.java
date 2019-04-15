package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class activity_coban_rondo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobanrondo);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/White+Crater/@-7.1662039,107.4021256,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipMP_GQe4PZcctD077kZhh2LbN8R0XbwkNMAjQCs!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipMP_GQe4PZcctD077kZhh2LbN8R0XbwkNMAjQCs%3Dw116-h86-k-no!7i3200!8i2368!4m5!3m4!1s0x2e688c1383dc510f:0xfab41bb8e4a3a83e!8m2!3d-7.1662039!4d107.4021256";
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
