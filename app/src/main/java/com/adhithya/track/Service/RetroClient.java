package com.adhithya.track.Service;

import com.adhithya.track.Service.ApiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hari Group Unity on 01-03-2018.
 */

public class RetroClient {
    private static Retrofit getRetrofitInstance() {
        String URL = "http://salsabeel.in/srm/api/";
        return new Retrofit.Builder()
                .baseUrl(URL)

                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getApiService() {
        return getRetrofitInstance().create(ApiServices.class);
    }

}
