package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to access all constants?");

        Currency[] currencies = Currency.values();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to retrieve value?");

        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.compareTo(Currency.PENNY));
        System.out.println(Currency.NICKLE.compareTo(Currency.PENNY));
        System.out.println(Currency.PENNY.ordinal());

    }
}
