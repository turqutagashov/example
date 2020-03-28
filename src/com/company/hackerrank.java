package com.company;
import java.text.*;
import java.util.*;

public class hackerrank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        scan.close();

        Locale INDIA = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(num));
        System.out.println("India: " + india.format(num));
        System.out.println("China: " + china.format(num));
        System.out.println("France: " + france.format(num));
    }

}