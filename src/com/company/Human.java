package com.company;

public class Human {

    String name, surname;
    int age;

    Human(){
        System.out.println("Object was created.");
    }

    void walk(){
        System.out.println("Human is walking...");
    }

    void sleep(){
        System.out.println("Human is sleeping...");
    }

    void grow(){
        age++;
    }

    void introduceYourself(){
        System.out.println("I am " + name + " " + surname); // System.out.printf("I am %s %s", name, surname);
    }
}
