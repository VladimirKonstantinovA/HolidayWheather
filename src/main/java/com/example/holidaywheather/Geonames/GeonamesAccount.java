package com.example.holidaywheather.Geonames;

import java.util.ArrayList;

public class GeonamesAccount {
    public static ArrayList<String> getAccounts() {
        int accountCount = 2;
        String name = "gn_api_";
        ArrayList<String> accounts = new ArrayList<>();
        for (int i = 1 ; i < (accountCount+1); i++) {
            accounts.add(name+i);
        }
        return accounts;
    }
}
