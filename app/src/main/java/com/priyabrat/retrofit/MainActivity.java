package com.priyabrat.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.priyabrat.retrofit.http.HttpServiceInterface;
import com.priyabrat.retrofit.models.City;
import com.priyabrat.retrofit.models.CityResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doRetrofitHttpCall(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://beta.json-generator.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HttpServiceInterface httpServiceInterface = retrofit.create(HttpServiceInterface.class);
        Call<CityResponse> response = httpServiceInterface.getCities("GAqnlDN");
        response.enqueue(new Callback<CityResponse>() {
            @Override
            public void onResponse(Call<CityResponse> call, Response<CityResponse> response) {
                Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                CityResponse cityResponse = response.body();
                ArrayList<City> cityList = cityResponse.getCityList();
                City city = cityList.get(0);
            }

            @Override
            public void onFailure(Call<CityResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
