package com.faresa.footballapp.connection;

import com.faresa.footballapp.data.EventsItem;
import com.faresa.footballapp.data.LeaguesItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("eventsnextleague.php")
    Call<EventsItem>  getLeague(@Query("id") String idLeague);
    @GET("lookupteam.php")
    Call<LeaguesItem> getTeam(@Query("id") String id);


}
