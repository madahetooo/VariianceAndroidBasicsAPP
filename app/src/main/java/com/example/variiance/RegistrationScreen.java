package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationScreen extends AppCompatActivity {
    TextView tvLogin;
    RadioGroup radioGroup;
    RadioButton genderRadioButton;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        tvLogin = findViewById(R.id.tvLogin);
        radioGroup = findViewById(R.id.rgGender);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selectedId = radioGroup.getCheckedRadioButtonId();
                genderRadioButton = findViewById(selectedId);
                Toast.makeText(RegistrationScreen.this, genderRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });



        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRegisterScreen = new Intent(RegistrationScreen.this,LoginScreen.class);
                startActivity(goToRegisterScreen);
            }
        });
    }
}