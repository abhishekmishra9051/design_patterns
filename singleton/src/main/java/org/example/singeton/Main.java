package org.example.singeton;


public class Main {
    public static void main(String[] args) {
     Coffee coffee = Coffee.getCoffee();
        System.out.println(coffee.hashCode());
     Coffee coffee1 = Coffee.getCoffee();
        System.out.println(coffee1.hashCode());
     Coffee coffee2 = Coffee.getCoffee();
        System.out.println(coffee2.hashCode());
     Tea tea = Tea.getTea();
        System.out.println(tea.hashCode());
     Tea tea1 = Tea.getTea();
        System.out.println(tea1.hashCode());
    }
}