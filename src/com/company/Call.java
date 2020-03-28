package com.company;

public class Call {
    public static void main(String[] args) {

        Airport ticketFirst = new Airport("Turgut Aghashov", 1);

        ticketFirst.from = "Istanbul";
        ticketFirst.to = "Moscow";

        ticketFirst.priceOfTicket();
        ticketFirst.bookTicket();

    }
}
