package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class activity_jatimpark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jatimpark);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Jatim+Park+I,+Jl.+Dewi+Sartika+Atas,+Sisir,+Kec.+Batu,+Kota+Batu,+Jawa+Timur+65314/@-7.8854628,112.5230348,18z/data=!4m5!3m4!1s0x2e7880d52e0379d9:0x9c94d817cc2686bb!8m2!3d-7.8845017!4d112.5248818";
        // Parse the location and create the intent.
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    } public void openLocation2(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Jl.+Jatim+Park+II,+Temas,+Kec.+Batu,+Kota+Batu,+Jawa+Timur+65315/@-7.8885452,112.5279206,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78812a2d74e1ab:0xf1067f0224b67a85!8m2!3d-7.8885452!4d112.5301093";
        // Parse the location and create the intent.
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    } public void openLocation3(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Jawa+Timur+Park+3/@-7.8968059,112.5516247,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78811848f3a957:0x1b0013b35e7ee3cd!8m2!3d-7.8968059!4d112.5538134";
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
