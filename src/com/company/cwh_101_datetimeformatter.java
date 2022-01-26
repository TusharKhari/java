package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt =  LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(df);
     //   String myDate = dt.format(df);
        String myDate = dt.format(df2);

        System.out.println(myDate);
        System.out.println(df2);
    }
}
