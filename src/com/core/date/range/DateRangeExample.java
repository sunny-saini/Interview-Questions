package com.core.date.range;

import java.time.LocalDate;
import java.time.Period;

public class DateRangeExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 8, 1);
        LocalDate endDate = LocalDate.of(2023, 8, 15);


        // Calculate the period between start and end dates
        Period period = Period.between(startDate, endDate);

        // Print the duration components
        System.out.println("Days: " + period.getDays());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Years: " + period.getYears());

        // Check if a specific date is within the date range
        LocalDate checkDate = LocalDate.of(2023, 8, 10);
        if (checkDate.isAfter(startDate) && checkDate.isBefore(endDate)) {
            System.out.println(checkDate + " is within the date range.");
        } else {
            System.out.println(checkDate + " is outside the date range.");
        }
    }
}
