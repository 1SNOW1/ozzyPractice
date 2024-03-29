package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class NumberOfElements {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int countOdd = countIf(ci, new OddPredicate());
        int countEven = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = " + countOdd);
        System.out.println("Number of Even integers = " + countEven);



    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p ){

        int count = 0;
        for(T element : c){
            if (p.test(element)){
                ++count;
            }
        }
        return count;

    }


}

