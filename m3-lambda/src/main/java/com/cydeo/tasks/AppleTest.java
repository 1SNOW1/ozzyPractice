package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(199,Color.GREEN));
        inventory.add(new Apple(201,Color.RED));
        inventory.add(new Apple(150,Color.GREEN));
        inventory.add(new Apple(500,Color.GREEN));


        List<Apple> heavyApple = filterApples(inventory, new HeavyApplePredicate());
        System.out.println(heavyApple);

        List<Apple> greenApples = filterApples(inventory, new GreenApplePredicate());
        System.out.println(greenApples);

        ApplePredicate weightApple = apple -> apple.getWeight()>200;
        filterApples(inventory,weightApple);

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}
