package com.example.holidaywheather.demo.Thread;

import com.example.holidaywheather.demo.WeatherData.City;

class ThreadFactory {
   static Runnable getTask(ThreadTaskType threadTaskType, String user, City city) {
        switch (threadTaskType) {
            case GeonamesCityInfo: return new GeonamesCitiesInfoTask(user, city);
            default: throw new IllegalArgumentException();
        }
    }
}
