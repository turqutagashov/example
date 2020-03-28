package com.company;

import java.util.Scanner;
import java.math.BigInteger;
public class Daa {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        String y = scan.next();
        scan.close();

        BigInteger X = new BigInteger(x);
        BigInteger Y = new BigInteger(y);
        BigInteger add = X.add(Y);
        BigInteger mul = X.multiply(Y);

        System.out.println(add);
        System.out.println(mul);

    }
}
