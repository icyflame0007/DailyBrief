package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        getSupportActionBar().hide();
        WebView webView;

        webView = findViewById(R.id.webView);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(url);
    }
}