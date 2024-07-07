package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1 = new Person("Enes", 22, Gender.MALE);
        Person p2 = new Person("Gizem", 23, Gender.FEMALE);
        Person p3 = new Person("Kubra", 16, Gender.FEMALE);
        Person p4 = new Person("Furkan", 11, Gender.MALE);


        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember = p -> p.getGender().equals(Gender.MALE) && p.getAge()>=18 && p.getAge()<=25;

        print(personList,checkMember);

        print(personList, p -> p.getGender().equals(Gender.MALE) && p.getAge()>=18 && p.getAge()<=25);



    }
     private static void print (List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();

         for (Person person : personList) {
             if (checkMember.test(person)){
                 result.add(person);
             }
         }
         System.out.println(result);
     }


}
