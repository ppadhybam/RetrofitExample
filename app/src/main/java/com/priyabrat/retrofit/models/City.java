package com.priyabrat.retrofit.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priyabrat on 03-03-2017.
 */

public class City {

    @SerializedName("name")
    private String name;

    @SerializedName("state")
    private String state;

    @SerializedName("description")
    private String description;

    public City(){}

    public City(String name, String state, String description) {
        this.name = name;
        this.state = state;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
