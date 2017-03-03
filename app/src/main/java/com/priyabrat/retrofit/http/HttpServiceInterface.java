package com.priyabrat.retrofit.http;

import com.priyabrat.retrofit.models.CityResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Priyabrat on 03-03-2017.
 */

public interface HttpServiceInterface {

    @GET("json/get/{id}")
    Call<CityResponse> getCities(@Path("id") String id);
}
