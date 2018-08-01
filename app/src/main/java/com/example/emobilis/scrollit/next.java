package com.example.emobilis.scrollit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class next extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        web=findViewById(R.id.webview);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/index.html");
    }
}
