package com.example.indotravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PantaiSukamade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_sukamade);
    }

    public void openLocation(View view){
        // Get the string indicating a location. Input is not validated; it is
        // passed to the location handler intact.
        String loc ="https://www.google.com/maps/place/Pantai+Sukamade/@-8.5638595,113.8869076,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd41a6e9039e9d9:0xcff36a37fd907405!8m2!3d-8.5638595!4d113.8890963";
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
