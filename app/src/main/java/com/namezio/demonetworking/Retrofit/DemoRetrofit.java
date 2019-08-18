package com.namezio.demonetworking.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DemoRetrofit {


    public static DemoService demoService;


    public static DemoService getInstance(){

        if (demoService == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://raw.githubusercontent.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            demoService = retrofit.create(DemoService.class);
        }
        return demoService;
    }
}
