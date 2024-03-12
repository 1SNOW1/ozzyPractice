package com.cydeo.tasks;

public class GreenApplePredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equals(Color.GREEN)){
            return true;
        }else {
            return false;
        }
    }

}
