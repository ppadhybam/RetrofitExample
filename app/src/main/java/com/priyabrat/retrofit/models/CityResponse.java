package com.priyabrat.retrofit.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Priyabrat on 03-03-2017.
 */

public class CityResponse {

    @SerializedName("cities")
    private ArrayList<City> cityList;

    public CityResponse() {
    }

    public CityResponse(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
}
