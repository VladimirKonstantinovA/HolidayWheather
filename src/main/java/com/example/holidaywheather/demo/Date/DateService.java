package com.example.holidaywheather.demo.Date;

import org.springframework.lang.Nullable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {
    @Nullable
    public static Date getDate(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
