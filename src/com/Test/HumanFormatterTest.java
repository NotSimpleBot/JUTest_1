package com.Test;

import com.P_01.Human.Human;
import com.P_01.Human.HumanFormatter;
import com.P_01.Human.Sex;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HumanFormatterTest {

    @Test
    public void getAllHumans() {
        //создаем тестовые данные
        Human user = new Human("Евгений", 35, Sex.MALE);
        Human user1 = new Human("Марина", 34, Sex.FEMALE);
        Human user2 = new Human("Алина", 7, Sex.FEMALE);

        //создаем список expected и заполняем его данными нашего метода
        List<Human> expected = HumanFormatter.getAllHumans();

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<Human> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

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