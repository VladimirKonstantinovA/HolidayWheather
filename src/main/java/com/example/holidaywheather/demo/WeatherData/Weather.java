package com.example.holidaywheather.demo.WeatherData;

import com.example.holidaywheather.demo.File.FileService;
import com.example.holidaywheather.demo.Thread.ThreadService;

import java.util.ArrayList;
import java.util.Date;

public class Weather {
    private ArrayList<CityWeather> citiesWeather;
    private static Date dateFrom;
    private static Date dateTo;

    public ArrayList<CityWeather> getCitiesWeather() {
        return citiesWeather;
    }

    public static Date dateFrom() {
        return dateFrom;
    }

    public static Date dateTo() {
        return dateTo;
    }

    public static void setDateFrom(Date dateFrom) {
        dateFrom = dateFrom;
    }

    public static void setDateTo(Date dateTo) {
        dateTo = dateTo;
    }

    static ArrayList<CityWeather> getWeatherData(ArrayList<City> wishCites) {
        ThreadService.fillCityCoordinates(wishCites);
        // TODO: 22.10.2019 get weather
        ArrayList<CityWeather> data = new ArrayList<>();
        return data;
    }

    public static void fillData(String path) {
        ArrayList<City> wishCites = FileService.getWishList(path);
        ArrayList<CityWeather> weatherData= getWeatherData(wishCites);

    }


}
