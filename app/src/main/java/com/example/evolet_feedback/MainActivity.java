package com.example.evolet_feedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Gson mGson;
    private Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGson();
        initRetrofit();
    }

    private void initGson() {
        mGson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ssZ")
                .create();
    }

    private void initRetrofit() {
        String apiUrl = getString(R.string.apiUrl);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .build();
    }
}
