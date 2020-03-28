package com.company;

public class Airport {

    String nameOfPassenger;
    String from;
    String to;
    String date;
    String time;

    int ageOfPassenger;
    int seatNumber;

    Airport(String n, int a){

        nameOfPassenger = n;
        ageOfPassenger = a;
        from = "BAKU";
        date = "19 MARCH";
        time = "10:00";
        seatNumber = a*a + a + 2;
    }

    void priceOfTicket(){

        if(ageOfPassenger < 2) {
            System.out.println("AGE GROUP: INFANT \n");
            System.out.println("PRICE OF TICKET: 300$ \n");
        } else if(ageOfPassenger <= 12) {
            System.out.println("AGE GROUP: CHILD \n");
            System.out.println("PRICE OF TICKET: 350$ \n");
        } else {
            System.out.println("AGE GROUP: ADULT");
            System.out.println("PRICE OF TICKET: 400$ \n");
        }

    }

    void bookTicket(){

        System.out.println("Ticket is successfully booked. Your ticket:");

        System.out.println("NAME: " + nameOfPassenger.toUpperCase());
        System.out.println("FROM: " + from.toUpperCase());
        System.out.println("TO:   " + to.toUpperCase());
        System.out.println("DATE: " + date.toUpperCase());
        System.out.println("TIME: " + time);
        System.out.println("SEAT: " + seatNumber);

    }
}