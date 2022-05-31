package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webViewOfVariiance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewOfVariiance = findViewById(R.id.webViewVariiance);

        webViewOfVariiance.getSettings().setJavaScriptEnabled(true);
        webViewOfVariiance.setWebViewClient(new WebViewClient());
        webViewOfVariiance.loadUrl("https://www.google.com/");

    }
}