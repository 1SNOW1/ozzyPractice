package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList items = new ArrayList();
        // now we don't want to add all sorts of objects into our arraylist,
        // which is a problem because arraylist accepts every object. We need to filter our arraylist
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("Apple");


        printDoubled(items);

        System.out.println("------------------------------------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe"); //created an object
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //problem --> team is accepting any object
       // liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);









    }


    private static void printDoubled(ArrayList items){
        for (Object i : items) {
            System.out.println((Integer)i*2);
        }
    }
}
