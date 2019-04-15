package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

public class Home extends AppCompatActivity
        implements BaseSliderView.OnSliderClickListener,
        ViewPagerEx.OnPageChangeListener {

    private SliderLayout sliderShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sliderShow = (SliderLayout) findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Monas",R.drawable.monas);
        file_maps.put("Museum Angkut",R.drawable.angkut);
        file_maps.put("Masjid Agung Jawa Tengah",R.drawable.agung_jateng);
        file_maps.put("Candi Borobudur",R.drawable.borobudur);
        file_maps.put("Gunung Bromo",R.drawable.bromo);
        file_maps.put("Curug Cisako",R.drawable.cisako);
        file_maps.put("Daratan Tinggi Dieng",R.drawable.dieng);
        file_maps.put("Ocean Park",R.drawable.ocean);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            sliderShow.addSlider(textSliderView);
        }

        sliderShow.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderShow.setCustomAnimation(new DescriptionAnimation());
        sliderShow.setDuration(3000);
        sliderShow.addOnPageChangeListener(this);
    }

    @Override
    protected void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }
    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
    @Override
    public void onPageSelected(int position){
        Log.e("Slider Demo", "Page Changed: " +  position);

    }

    @Override
    public void onPageScrollStateChanged(int state){

    }


    public void menuWisata(View view) {
        Intent intent = new Intent(this, Provinsi.class);
        startActivity(intent);
    }

    public void menuKuliner(View view) {
        Intent intent = new Intent(this, ListProvinsi.class);
        startActivity(intent);
    }

    public void tipsTrik(View view) {
        Intent intent = new Intent(this, TipsTricks.class);
        startActivity(intent);
    }
}
