package com.cydeo;

public enum Currency {

    PENNY(0.1), NICKLE(0.5), DIME(0.10), QUARTER(0.25);

    private double value;

    Currency(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    /*
    public static final CurrencyDemo PENNY = new CurrencyDemo();
    public static final CurrencyDemo NICKLE = new CurrencyDemo();
    public static final CurrencyDemo DIME = new CurrencyDemo();
    public static final CurrencyDemo QUARTER = new CurrencyDemo();

    the code above and the code provide within comment bracket is saying the same thing
     */

}
