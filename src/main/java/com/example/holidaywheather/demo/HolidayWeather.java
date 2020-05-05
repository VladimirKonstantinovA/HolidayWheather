package com.example.holidaywheather.demo;

import com.example.holidaywheather.demo.Date.DateService;
import com.example.holidaywheather.demo.WeatherData.Weather;

import java.util.Date;

public class HolidayWeather {
    public static Weather weather;

    public static void start(String[] args) {
        if (args.length < 3) {
            System.out.println("Invalid arguments count!");
            return;
        }
        Date dateFrom = DateService.getDate(args[1]);
        Date dateTo = DateService.getDate(args[2]);
        if ((dateFrom == null) || (dateTo == null)) {
            System.out.println("Invalid period arguments!");
            return;
        }
        Weather.setDateFrom(dateFrom);
        Weather.setDateTo(dateTo);
        Weather.fillData(args[0]);
    }
}
