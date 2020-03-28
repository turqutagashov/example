package com.company;


import java.lang.String;
import java.time.LocalDate;
import java.util.Scanner;

public class date_and_time {
    public static String findDay(int month, int day, int year){

        LocalDate dt = LocalDate.of(year, month, day);

        String dayOfWeek = dt.getDayOfWeek().name();
        return dayOfWeek;
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();

        scan.close();

        String days = findDay(month, day, year);

        System.out.println(days);

    }





}
