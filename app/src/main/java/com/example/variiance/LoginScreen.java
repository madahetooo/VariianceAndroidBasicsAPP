package com.example.variiance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    TextView tvRegister, tvForgetPassword;
    Button btnLogin;
    AlertDialog.Builder buildAlertDialog;
    Boolean doublePressToExit = false;
    CheckBox chkRememberMe;
    EditText etEmailAddress, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        tvRegister = findViewById(R.id.tvRegister);
        tvForgetPassword = findViewById(R.id.tvForgetPassword);
        btnLogin = findViewById(R.id.btnLogin);
        chkRememberMe = findViewById(R.id.chkRememberMe);
        etEmailAddress = findViewById(R.id.etEmailAddressLogin);
        etPassword = findViewById(R.id.etPassword);

        SharedPreferences rememberMeFile = getSharedPreferences("rememberMeFile",0);
        if (rememberMeFile.getBoolean("bool",false) ==true){
          String emailAddress =   rememberMeFile.getString("email",""); // return Email
            etEmailAddress.setText(emailAddress);
          String password =   rememberMeFile.getString("password",""); // return Password
            etPassword.setText(password);

        }



        buildAlertDialog = new AlertDialog.Builder(this);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRegisterScreen = new Intent(LoginScreen.this,RegistrationScreen.class);
                startActivity(goToRegisterScreen);
            }
        });
        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToForgetPasswordScreen = new Intent(LoginScreen.this,ForgetPasswordActivity.class);
                startActivity(goToForgetPasswordScreen);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRestaurantActivity = new Intent(LoginScreen.this, RestuarantActivity.class);
                startActivity(goToRestaurantActivity);
            }
        });


    }

    public void rememberMe(View view){
        SharedPreferences rememberMeFile = getSharedPreferences("rememberMeFile",0);
        SharedPreferences.Editor marker = rememberMeFile.edit();

        marker.putString("email",etEmailAddress.getText().toString().trim());
        marker.putString("password",etPassword.getText().toString().trim());
        marker.putBoolean("bool",true);
        marker.apply();

        Toast.makeText(this, "We saved your data", Toast.LENGTH_SHORT).show();
        chkRememberMe.setChecked(true);
    }
    @Override
    public void onBackPressed() {
        if (doublePressToExit == true){
            finish(); // Close the application
            super.onBackPressed();
        }
        this.doublePressToExit = true; // Set as True
        Toast.makeText(this, "Press again quickly to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doublePressToExit = false; // Return to false
            }
        },3000);


    }
}










//  buildAlertDialog.setMessage("Do you want to exit ?!")
//                .setIcon(R.drawable.variiancelogo)
//                .setCancelable(false)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                        Toast.makeText(LoginScreen.this, "Good Bye", Toast.LENGTH_SHORT).show();
//                    }
//                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                        Toast.makeText(LoginScreen.this, "Welcome Back", Toast.LENGTH_SHORT).show();
//                    }
//                });
//        AlertDialog alertDialog = buildAlertDialog.create();
//        alertDialog.setTitle("Exit");
//        alertDialog.show();
