package com.mobileapp.suhailparvez.weather.CALLBACK;

import com.mobileapp.suhailparvez.weather.POJO.WeatherPOJO;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Satya on 02/06/2021.
 */

public interface WeatherService {

    @GET("2.5/weather")
    Call<WeatherPOJO> getWeather(@Query("lat") double lat,
                                       @Query("lon") double lon,
                                       @Query("units") String units,
                                       @Query("appid") String appid);

}
