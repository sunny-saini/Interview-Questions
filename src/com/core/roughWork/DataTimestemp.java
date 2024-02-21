package com.core.roughWork;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimestemp {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);



        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        System.out.println("TimeStamp: " + formatDateTime);

    }
}
