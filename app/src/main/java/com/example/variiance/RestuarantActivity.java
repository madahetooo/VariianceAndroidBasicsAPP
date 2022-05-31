package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class RestuarantActivity extends AppCompatActivity {

    CheckBox cbPizza, cbBurger,cbLemon;
    Button btnOrder;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarant);
        cbPizza = findViewById(R.id.cbPizza);
        cbBurger = findViewById(R.id.cbBurger);
        cbLemon = findViewById(R.id.cbLemon);
        btnOrder = findViewById(R.id.btnOrder);
        tvResult = findViewById(R.id.tvResult);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmountOfOrder = 0;

                StringBuilder result = new StringBuilder();
                result.append("Selected itms");
                if (cbPizza.isChecked()){
                    result.append("\n Pizza 100 EGP");
                    totalAmountOfOrder+=100;
                }
                if (cbBurger.isChecked()){
                    result.append("\n Burger 80 EGP");
                    totalAmountOfOrder+=80;
                }
                if (cbLemon.isChecked()){
                    result.append("\n Lemon 25 EGP");
                    totalAmountOfOrder+=25;
                }
                result.append("\n Total Order is  : " + totalAmountOfOrder);
                tvResult.setText(result.toString());
                Toast.makeText(RestuarantActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}