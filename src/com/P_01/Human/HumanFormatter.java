package com.P_01.Human;

import java.util.ArrayList;

public class HumanFormatter {

    /**Получить полный список всех пользователей из класса Human*/
    public static ArrayList<Human> getAllUsers(){
        return  new ArrayList<>(Human.getAllHumans().values());
    }

    /**Получить полный список всех пользователей из класса Human по половому признаку
     * @param sex MALE or FEMALE*/
    public static ArrayList<Human> getAllUsers(Sex sex){
        ArrayList<Human> listTmp = new ArrayList<>();
        for (Human h : Human.getAllHumans().values()){
            if (h.getSex() == sex){
                listTmp.add(h);
            }
        }
        return listTmp;
    }

    /**Возвращает число пользователей в общем списке*/
    public static int getHowManyHumans(){
        return Human.getAllHumans().size();
    }

    /**Возвращает число пользователей в общем списке по половому признаку
     *@param sex Sex.MALE or Sex,FEMALE */
    public static int getHowManyHumans(Sex sex){
        return getAllUsers(sex).size();
    }

    /**Возвращает сумму возрастов всех пользователей общего списка класса Human*/
    public static int getAllAgeUsers(){
        int sum = 0;
        for (Human h : getAllUsers()){
            sum += h.getAge();
        }
        return sum;
    }

    /**Возвращает сумму возрастов всех пользователей общего списка класса Human по половому признаку
     * @param sex Sex.MALE or Sex.FEMALE*/
    public static int getAllAgeUsers(Sex sex){
        int sum = 0;
        for (Human h : getAllUsers(sex)){
            sum += h.getAge();
        }
        return sum;
    }

    /**Возвращает средний возраст общего списка класса Human*/
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyHumans();
    }

    /**Возвращает средний возраст общего списка класса Human согласно половому признаку
     * @param sex Sex.MALE or Sex.FEMALE*/
    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex) / getHowManyHumans(sex);
    }
}
