package com.example.chen.coursequery.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Chen on 2017/4/5.
 */

public class MyWebClient extends WebViewClient {
    private Activity activity;
    private final String TAG = "MyWebView";
    public MyWebClient(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        String cookie = CookieManager.getInstance().getCookie(url);
        Log.d(TAG, cookie);
        if (cookie.contains("sno")) {
            activity.setResult(0);
            activity.finish();
        }
    }
}
