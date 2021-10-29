package com.P_01.Human;

import java.util.ArrayList;

public class HumanFormatter {

    /**Получить полный список всех пользователей из класса Human*/
    public static ArrayList<Human> getAllHumans(){
        return  new ArrayList<>(Human.allHumans.values());
    }

    /**Получить полный список всех пользователей из класса Human по половому признаку
     * @param sex MALE or FEMALE*/
    public static ArrayList<Human> getAllHumans(Sex sex){
        ArrayList<Human> listTmp = new ArrayList<>();
        for (Human h : Human.allHumans.values()){
            if (h.getSex() == sex){
                listTmp.add(h);
            }
        }
        return listTmp;
    }

    /**Возвращает число пользователей в общем списке*/
    public static int getHowManyHumans(){
        return Human.allHumans.size();
    }

    /**Возвращает число пользователей в общем списке по половому признаку
     *@param sex Sex.MALE or Sex,FEMALE */
    public static int getHowManyHumans(Sex sex){
        return getAllHumans(sex).size();
    }


    /**Возвращает сумму возрастов всех пользователей общего списка класса Human*/
    public static int getAllAgeHumans(){
        int sum = 0;
        for (Human h : getAllHumans()){
            sum += h.getAge();
        }
        return sum;
    }


    /**Возвращает сумму возрастов всех пользователей общего списка класса Human по половому признаку
     * @param sex Sex.MALE or Sex.FEMALE*/
    public static int getAllAgeHumans(Sex sex){
        int sum = 0;
        for (Human h : getAllHumans(sex)){
            sum += h.getAge();
        }
        return sum;
    }


    /**Возвращает средний возраст общего списка класса Human*/
    public static int getAverageAgeOfAllHumans(){
        return getAllAgeHumans() / getHowManyHumans();
    }


    /**Возвращает средний возраст общего списка класса Human согласно половому признаку
     * @param sex Sex.MALE or Sex.FEMALE*/
    public static int getAverageAgeOfAllHumans(Sex sex){
        return getAllAgeHumans(sex) / getHowManyHumans(sex);
    }
}
