package com.example.holidaywheather.demo.Web;

public enum HTTPQuery {
    geonamesCitiesData("http://api.geonames.org/searchJSON?formatted=true&name=#City&&username=#User&country=#Country");

    final String name;

    HTTPQuery(String s) {
        name = s;
    }
}
