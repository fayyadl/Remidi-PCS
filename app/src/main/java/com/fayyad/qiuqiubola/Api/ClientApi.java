package com.fayyad.qiuqiubola.Api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientApi {
    private static ClientApi instance = null;
    private final com.fayyad.qiuqiubola.Api.restApi restApi;

    private ClientApi() {
        HttpLoggingInterceptor loggingInterceptor =
                new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(com.fayyad.qiuqiubola.Api.restApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        restApi = retrofit.create(com.fayyad.qiuqiubola.Api.restApi.class);
    }

    public static synchronized ClientApi getInstance() {
        if (instance == null) {
            instance = new ClientApi();
        }

        return instance;
    }

    public com.fayyad.qiuqiubola.Api.restApi getApirest() {
        return restApi;
    }
}
