package com.example.chen.coursequery.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.chen.coursequery.R;
import com.example.chen.coursequery.utils.MyWebClient;

/**
 * Created by Chen on 2017/4/5.
 */

public class LoginActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        webView = (WebView) findViewById(R.id.loginWebview);
        webView.setWebViewClient(new MyWebClient(this));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.loadUrl("http://wjw.sysu.edu.cn/");
    }
}
