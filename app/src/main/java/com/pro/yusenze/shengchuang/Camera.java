package com.pro.yusenze.shengchuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Camera extends AppCompatActivity {

    private WebView webview;
    private long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        webview = new WebView(this);
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });

    webview.getSettings().setJavaScriptEnabled(true);
    webview.loadUrl("http://39.108.214.26/proxy/?action=stream");
    setContentView(webview);
    }
}
