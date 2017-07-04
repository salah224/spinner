package com.example.android.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {


    String[] country = {"USA", "China", "Japan", "Egypt", "Canda"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//get the instance of spinner and apply ItemSelected
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);

//Creating ArrayAdpter instance to have country list
        ArrayAdapter adpt = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting the ArrayAdpter data on spinner
        spin.setAdapter(adpt);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }


    public boolean onCreateoptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
