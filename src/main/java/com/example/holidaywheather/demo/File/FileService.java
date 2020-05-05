package com.example.holidaywheather.demo.File;

import com.example.holidaywheather.demo.WeatherData.City;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileService {
  public static ArrayList<City> getWishList(String Path) {
      ArrayList<String> wishArray = new ArrayList<>();
        try {
        Files.lines(Paths.get(Path)).forEach((s ->  wishArray.add(s)));
        } catch (IOException e) {
            e.printStackTrace();
        }

      ArrayList<City> wishCities = new ArrayList<>();
      for (String wish:wishArray) {
          String[] splittingString = wish.split(",");
          if (splittingString.length < 2) {
              System.out.println("Wish list - error arguments count in string: " + wish);
              continue;
          }
          City wishCity = new City(splittingString[0], splittingString[1]);
          wishCities.add(wishCity);
        }
      return wishCities;
    }
}
