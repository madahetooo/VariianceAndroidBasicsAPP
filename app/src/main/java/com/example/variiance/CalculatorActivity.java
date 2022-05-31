package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    EditText etFirstNumberObject, etSecondNumberObject;
    Button btnAddObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        etFirstNumberObject = findViewById(R.id.etFirstNumber);
        etSecondNumberObject = findViewById(R.id.etSecondNumber);
        btnAddObject = findViewById(R.id.btnAdd);
        btnAddObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumberString = etFirstNumberObject.getText().toString();
                String secondNumberString = etSecondNumberObject.getText().toString();

                int firstNumberInt = Integer.parseInt(firstNumberString);
                int secondNumberInt = Integer.parseInt(secondNumberString);
                 int result = firstNumberInt + secondNumberInt ;

                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();


            }
        });

    }
}