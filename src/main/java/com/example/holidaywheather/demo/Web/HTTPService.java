package com.example.holidaywheather.demo.Web;

import com.example.holidaywheather.demo.WeatherData.City;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPService {
    static String getQueryWithParams(HTTPQuery queryType, String user, City city) {
        String query = queryType.name;
        query = query.replace("#User", user);
        query = query.replace("#City", city.getName());
        query = query.replace("#Country", city.getCountry());
        return query;
    }

    static JSONObject getCitiesDataJSON(String query) {
        try {
            URL url = new URL(query);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            int status = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String in;
            StringBuffer stringBuffer = new StringBuffer();
            while ((in = bufferedReader.readLine())!= null) {
                stringBuffer.append(in);
            }
            bufferedReader.close();
            JSONObject jsonObject   = new JSONObject(stringBuffer.toString()) ;
            return jsonObject;
        } catch (Exception e) {
        }
    return null;
    }

   public static void getCitiesData(String user, City city) {
        JSONObject jsonObject = getCitiesDataJSON(getQueryWithParams(HTTPQuery.geonamesCitiesData, user, city));
        if ((jsonObject != null) && (jsonObject.getInt("totalResultsCount") > 0)) {
            JSONArray JSONObjects = jsonObject.getJSONArray("geonames");
            JSONObject firstJSONObject = JSONObjects.getJSONObject(0);
            city.fillInfo(firstJSONObject.getString("lat"), firstJSONObject.getString("lng"), firstJSONObject.getInt("geonameId"));
        }
    }
}
