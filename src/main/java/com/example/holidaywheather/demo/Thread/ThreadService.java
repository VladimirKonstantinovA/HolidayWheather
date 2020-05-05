package com.example.holidaywheather.demo.Thread;

import com.example.holidaywheather.Geonames.GeonamesAccount;
import com.example.holidaywheather.demo.WeatherData.City;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadService {
    public static void fillCityCoordinates(ArrayList<City> wishCites) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ArrayList<String> accounts =  GeonamesAccount.getAccounts();
        Random random = new Random();
        for (City city:wishCites) {
            String user = accounts.get(random.nextInt(accounts.size()));
            executorService.submit(ThreadFactory.getTask(ThreadTaskType.GeonamesCityInfo, user, city));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
