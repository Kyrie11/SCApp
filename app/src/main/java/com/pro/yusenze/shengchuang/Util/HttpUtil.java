package com.pro.yusenze.shengchuang.Util;

import android.util.Log;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class HttpUtil {
    String str = "";
    public String httpGet(String url){
        OkHttpClient httpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        Request request = builder.get().url(url).build();
        Call call = httpClient.newCall(request);
        try{
            Response response = call.execute();
            if(!response.isSuccessful()){
                Headers ResponseHeaders = response.headers();
                for(int i=0;i<ResponseHeaders.size();i++)
                    Log.i("ResponseHeaders", "httpGet:ResponseHeaders.name="+ResponseHeaders.name(i));
            }

            str = response.body().string();
        }catch (Exception e){e.printStackTrace();}
        return str;
    }
}
