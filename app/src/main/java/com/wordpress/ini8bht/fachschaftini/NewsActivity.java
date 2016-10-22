package com.wordpress.ini8bht.fachschaftini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NewsActivity extends AppCompatActivity {

    private WebView telegramWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        telegramWebView = (WebView)findViewById(R.id.telegram_WebView);
      //  telegramWebView.createWebMessageChannel();
        telegramWebView.loadUrl("http://telegram.me/FSRVIII");


    }
}
