package com.wordpress.ini8bht.fachschaftini;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity {

    private WebView telegramWebView;
    private Button btn_Website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        telegramWebView = (WebView)findViewById(R.id.telegram_WebView);
        telegramWebView.loadUrl("http://telegram.me/FSRVIII");

        btn_Website = (Button) findViewById(R.id.button6);
        btn_Website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.yourURL.com"));
                startActivity(intent);

            }
        });

    }
}
