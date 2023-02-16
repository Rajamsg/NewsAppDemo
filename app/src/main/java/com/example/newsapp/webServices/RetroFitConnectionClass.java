package com.example.newsapp.webServices;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetroFitConnectionClass {

    /**
     * This is for connecting the retrofit class to the server
     */
    public static APICall apiCall = null;

    public static APICall getApiCall() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
               // Log.e("actual",message);
            }
        });
        interceptor.level(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(40, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();

         Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.playerline.org/test/static-endpoint/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiCall = retrofit.create(APICall.class);
        return apiCall;
    }

}
