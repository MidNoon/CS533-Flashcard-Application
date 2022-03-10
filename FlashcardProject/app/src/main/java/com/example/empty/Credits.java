package com.example.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        String url = "https://www.calebf-s.me/authors.html";

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);

    }
}


