package com.boots.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Renick.J on 02/01/2017.
 */
public class DateUtils {

    public static String getTimeFromString(String val){
        DateFormat time = null;
        try {
            String dateVal = val.substring(0,16);
            DateFormat f = new SimpleDateFormat("yyyy-dd-MM hh:mm");
            Date d = f.parse(dateVal);
            DateFormat date = new SimpleDateFormat("yyyy-dd-MM");
            time = new SimpleDateFormat("hh:mm");
            System.out.println("Date: " + date.format(d));
            System.out.println("Time: " + time.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time.toString();
    }

}
