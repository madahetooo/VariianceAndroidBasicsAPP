package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerAcivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] countries = {"Egypt","UAE","KSA","BAHRIN","SUDAN","SYRIA","IRAQ"};
    Spinner countriesSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_acivity);
        countriesSpinner = findViewById(R.id.countrySpinner);
        countriesSpinner.setOnItemSelectedListener(this);

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.activity_spinner_acivity,countries);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        countriesSpinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, countries[position], Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}