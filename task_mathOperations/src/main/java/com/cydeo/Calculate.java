package com.cydeo;

public class Calculate {

    private static void calculate (double num1, double num2, MathOperators operators){
        double result;
        switch (operators){
            case ADDITION:
                result = num1 + num2;
                System.out.println("Result of addition " + result);
                break;
            case SUBTRACTION:
                result = num1 - num2;
                System.out.println("Result of subtraction " + result);
                break;
            case MULTIPLICATION:
                result = num1 * num2;
                System.out.println("Result of multiplication " + result);
                break;
            case DIVISION:
                result = num1 / num2;
                System.out.println("Result of division " + result);
                break;
            default:
                System.out.println("Invalid operation!");
        }

    }

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate(10, 10, MathOperators.ADDITION);
    }
}
