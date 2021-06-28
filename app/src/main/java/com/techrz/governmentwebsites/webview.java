package com.techrz.governmentwebsites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {
    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView= findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(homeActivity.link);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(v -> onBackPressed());
        ImageView forward= findViewById(R.id.forward);
        forward.setOnClickListener(v -> forward());
        ImageView reload= findViewById(R.id.reload);
        reload.setOnClickListener(v -> reload());
        ImageView openInBrowser = findViewById(R.id.open);
        openInBrowser.setOnClickListener(v -> openInBrowser());
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }

    }

    public void forward(){
        if(webView.canGoForward()){
            webView.goForward();
        }
    }
    public void reload(){
        webView.reload();
    }
    public void openInBrowser(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(homeActivity.link));
        startActivity(intent);
    }
}