package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(200,Color.ORANGE));
        inventory.add(new Orange(199,Color.ORANGE));
        inventory.add(new Orange(201,Color.RED));
        inventory.add(new Orange(150,Color.YELLOW));
        inventory.add(new Orange(500,Color.GREEN));


      //  OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g"
        // prettyPrintOrange(inventory,orangeLambda);

        prettyPrintOrange(inventory,  orange -> "An orange of " + orange.getWeight() + "g");


    }

    private static void prettyPrintOrange( List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }


    }

}
