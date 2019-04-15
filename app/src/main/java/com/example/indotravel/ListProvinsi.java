package com.example.indotravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListProvinsi extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_provinsi);

        /**spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new ItemSelectedListener());**/

    }

    public void ProvBanten(View view) {
        Intent intent = new Intent(this, KulinerBanten2.class);
        startActivity(intent);
    }

    public void ProvJakarta(View view) {
        Intent intent = new Intent(this, KulinerJakarta2.class);
        startActivity(intent);
    }

    public void ProvJabar(View view) {
        Intent intent = new Intent(this, KulinerJabar2.class);
        startActivity(intent);
    }

    public void ProvJateng(View view) {
        Intent intent = new Intent(this, KulinerJateng2.class);
        startActivity(intent);
    }

    public void ProvYogya(View view) {
        Intent intent = new Intent(this, KulinerJogja2.class);
        startActivity(intent);
    }

    public void ProvJatim(View view) {
        Intent intent = new Intent(this, KulinerJatim2.class);
        startActivity(intent);
    }

    /**public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        //get strings of first item
        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {

            } else if (pos == 01) {

                Intent banten = new Intent(ListProvinsi.this, KulinerBanten2.class);
                startActivity(banten);

            } else if (pos == 02) {
                Intent jakarta = new Intent(ListProvinsi.this, KulinerJakarta.class);
                startActivity(jakarta);

            } else if (pos == 03) {
                Intent jabar = new Intent(ListProvinsi.this, KulinerJabar.class);
                startActivity(jabar);

            } else if (pos == 04) {
                Intent jateng = new Intent(ListProvinsi.this, KulinerJatemg.class);
                startActivity(jateng);

            } else if (pos == 05) {
                Intent jogja = new Intent(ListProvinsi.this, KulinerJogja.class);
                startActivity(jogja);

            } else if (pos == 06) {
                Intent jatim = new Intent(ListProvinsi.this, KulinerJatim.class);
                startActivity(jatim);

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }

    }**/
}
