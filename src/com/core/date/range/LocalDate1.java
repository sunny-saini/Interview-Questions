package com.core.date.range;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate endDate = LocalDate.of(2023, Month.AUGUST, 16);
        LocalDate btwDate = LocalDate.of(2023, Month.AUGUST, 14);
        LocalDate startDate = LocalDate.of(2023, Month.AUGUST, 11);
        LocalDate find = LocalDate.of(2023, Month.AUGUST, 1);
//varibale  16-08-2023 < 16-08-2022
        Period period = Period.between(startDate, endDate);


        System.out.println("Days "+period.getDays());
        System.out.println("Months "+period.getMonths());
        System.out.println("Years "+period.getYears());
        System.out.println(endDate);


        List<LocalDate> dt= new ArrayList<>();
        dt.add(endDate);
        dt.add(btwDate);
        dt.add(startDate);
        List<LocalDate> an = dt.stream().filter(dte -> dte.isAfter(find)).collect(Collectors.toList());
        System.out.println(an);



    }
}
