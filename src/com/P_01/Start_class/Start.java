package com.P_01.Start_class;

import com.P_01.Human.Human;
import com.P_01.Human.HumanFormatter;
import com.P_01.Human.Sex;

public class Start {
    public static void main(String[] args) {
        Human m1 = new Human("Andy", 25, Sex.MALE);
        Human m2 = new Human("Bill", 32, Sex.MALE);
        Human w1 = new Human("Sara", 19, Sex.FEMALE);

        System.out.println("\nВсе люди:\n---------");
        System.out.println("          getHowManyHumans()= " + HumanFormatter.getHowManyHumans());
        System.out.println("  getHowManyHumans(Sex.MALE)= " + HumanFormatter.getHowManyHumans(Sex.MALE));
        System.out.println("getHowManyHumans(Sex.FEMALE)= " + HumanFormatter.getHowManyHumans(Sex.FEMALE));

        System.out.println("\nИнфа по каждому человеку:\n-------------------------");
        HumanFormatter.getAllUsers().forEach(System.out::println);
        System.out.println("\nИнфа по каждому Мужчине:\n------------------------");
        HumanFormatter.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("\nИнфа по каждой Женщине:\n-----------------------");
        HumanFormatter.getAllUsers(Sex.FEMALE).forEach(System.out::println);


        System.out.println("\nСуммарное знаение возраста:\n---------------------------");
        System.out.println("          getAllAgeUsers()= " + HumanFormatter.getAllAgeUsers());
        System.out.println("  getAllAgeUsers(Sex.MALE)= " + HumanFormatter.getAllAgeUsers(Sex.MALE));
        System.out.println("getAllAgeUsers(Sex.FEMALE)= " + HumanFormatter.getAllAgeUsers(Sex.FEMALE));

        System.out.println("\nСреднее значение возраста:\n--------------------------");
        System.out.println("          getAverageAgeOfAllUsers()= " + HumanFormatter.getAverageAgeOfAllUsers());
        System.out.println("  getAverageAgeOfAllUsers(Sex.MALE)= " + HumanFormatter.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("getAverageAgeOfAllUsers(Sex.FEMALE)= " + HumanFormatter.getAverageAgeOfAllUsers(Sex.FEMALE));



    }
}
