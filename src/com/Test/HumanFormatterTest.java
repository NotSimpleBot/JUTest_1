package com.Test;

import com.P_01.Human.Human;
import com.P_01.Human.HumanFormatter;
import com.P_01.Human.Sex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HumanFormatterTest {
    private Human human_1;
    private Human human_2;
    private Human human_3;

    @Before
    public void setUp(){
         human_1 = new Human("Евгений", 35, Sex.MALE);
         human_2 = new Human("Марина", 34, Sex.FEMALE);
         human_3 = new Human("Алина", 7, Sex.FEMALE);
    }

    @Test
    public void getAllHumans() {

        //создаем список expected и заполняем его данными нашего метода
        List<Human> expected = HumanFormatter.getAllHumans();

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<Human> actual = new ArrayList<>();
        actual.add(human_1);
        actual.add(human_2);
        actual.add(human_3);

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllHumans() {
    }

    @Test
    public void getHowManyHumans() {
    }

    @Test
    public void testGetHowManyHumans() {
    }

    @Test
    public void getAllAgeHumans() {
    }

    @Test
    public void testGetAllAgeHumans() {
    }

    @Test
    public void getAverageAgeOfAllHumans() {
    }

    @Test
    public void testGetAverageAgeOfAllHumans() {
    }
}