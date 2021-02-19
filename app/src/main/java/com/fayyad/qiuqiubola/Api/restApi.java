package com.fayyad.qiuqiubola.Api;

import com.fayyad.qiuqiubola.Response.AllSportResponse;
import com.fayyad.qiuqiubola.Response.ClubResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface restApi {
    String BASE_URL = "https://www.thesportsdb.com/";

    @GET("api/v1/json/1/search_all_teams.php")
    Call<ClubResponse> getLigaInggris(
            @Query("l") String l
    );

    @GET("api/v1/json/1/all_sports.php")
    Call<AllSportResponse> GetAllSport();
}
