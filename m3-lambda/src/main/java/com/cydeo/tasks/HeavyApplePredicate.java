package com.cydeo.tasks;

public class HeavyApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight()>200 ){
            return true;
        }else{
            return false;
        }
    }
}
