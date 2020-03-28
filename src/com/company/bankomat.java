package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bankomat{


    static final int pinCode = 1234;
    static int balance = 1000;
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        while(true){

            greeting();

            int enteredPinCode = takeAnIntegerInput();

            if(enteredPinCode == pinCode){

                showOptions();

                int choice = takeAnIntegerInput();

                switch (choice){
                    case 1:
                        int addedAmount = takeAnIntegerInput();
                        cashIn(addedAmount);
                        showBalance();
                        break;
                    case 2:
                        int wantedAmount = takeAnIntegerInput();
                        cashOut(wantedAmount);
                        showBalance();
                        break;
                    case 3:
                        showBalance();
                        break;

                    default:

                }


            } else {

            }
        }

    }

    static void greeting(){

        System.out.println("Welcome");
        System.out.println("Please enter your pin code:");

    }

    static void showOptions(){

        System.out.println("Your options are these:");
        System.out.println("1. Cash In");
        System.out.println("2. Cash Out");
        System.out.println("3. Balance");

    }

    static int takeAnIntegerInput(){
        int input = -1;
        try{
            input = scan.nextInt();
        } catch (InputMismatchException exception){
            System.out.println("Please enter integer value");
            takeAnIntegerInput();
        }
        return input;
    }

    static void cashIn(int addedAmount){
        balance += addedAmount;

    }

    static void cashOut(int removedAmount){
        if(balance >= removedAmount) balance -= removedAmount;
        else System.out.println("Not enough balance");
    }

    static void showBalance(){
        System.out.println("Your balance is " + balance);
    }

}
