package com.faresa.footballapp.connection;

public class Utils {
    public static final String BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/";

    public static Service getAPIService(){
        return RetroConfig.getRetrofit(BASE_URL).create(Service.class);
    }
}
