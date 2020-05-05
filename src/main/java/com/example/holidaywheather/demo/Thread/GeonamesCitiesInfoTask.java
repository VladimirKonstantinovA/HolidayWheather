package com.example.holidaywheather.demo.Thread;

import com.example.holidaywheather.demo.WeatherData.City;
import com.example.holidaywheather.demo.Web.HTTPService;

public class GeonamesCitiesInfoTask implements Runnable {
    String user;
    City city;

    public GeonamesCitiesInfoTask(String user, City city) {
        this.user = user;
        this.city = city;
    }

    @Override
    public void run() {
        HTTPService.getCitiesData(user, city);
    }

}
