package com.example.holidaywheather.demo.WeatherData;

public class City {
    String name;
    String country;
    Integer geonameID;
    String latitude;
    String longitude;

    public String latitude() {
        return latitude;
    }

    void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String longitude() {
        return longitude;
    }

    void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer geonameID() {
        return geonameID;
    }

    public void setGeonameID(Integer geonameID) {
        this.geonameID = geonameID;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void fillInfo(String latitude, String longitude, Integer geonameID) {
        setLatitude(latitude);
        setLongitude(longitude);
        setGeonameID(geonameID);
    }

}
