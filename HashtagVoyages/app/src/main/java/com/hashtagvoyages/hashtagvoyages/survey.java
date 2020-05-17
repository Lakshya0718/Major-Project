package com.hashtagvoyages.hashtagvoyages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        WebView webview = (WebView) findViewById(R.id.webview7);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdQmEL6cfs8-DZAmcAUeWwsB9kblKQ6noDDNfnO20qYusi6sw/viewform");
    }
}
