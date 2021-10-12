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
         human_3 = new Human("Алина", 17, Sex.FEMALE);
    }

    @Test
    public void getAllHumans() {
        //создаем список actual и заполняем его данными нашего метода
        List<Human> actual = HumanFormatter.getAllHumans();

        //создаем список expected  в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<Human> expected = new ArrayList<>();
        expected.add(human_1);
        expected.add(human_2);
        expected.add(human_3);

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllHumans_NOT_NULL_EXCEPTION() {
        List<Human> actual = HumanFormatter.getAllHumans();
        Assert.assertNotNull(actual);
    }

    @Test
    public void testGetAllHumans_MALE() {
        List<Human> actual = HumanFormatter.getAllHumans(Sex.MALE);

        List<Human> expected = new ArrayList<>();
        expected.add(human_1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllHumans_MALE_NOT_NULL_EX() {
        List<Human> actual = HumanFormatter.getAllHumans(Sex.MALE);
        Assert.assertNotNull(actual);
    }

    @Test
    public void testGetAllHumans_FEMALE() {
        List<Human> actual = HumanFormatter.getAllHumans(Sex.FEMALE);

        List<Human> expected = new ArrayList<>();
        expected.add(human_2);
        expected.add(human_3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllHumans_FEMALE_NOT_NULL_EX() {
        List<Human> actual = HumanFormatter.getAllHumans(Sex.FEMALE);
        Assert.assertNotNull(actual);
    }

    @Test
    public void testGetHowManyHumans() {
        int actualCount = HumanFormatter.getHowManyHumans();
        int expectedCount = 3;

        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getHowManyHumans_MALE() {
        int actualCount = HumanFormatter.getHowManyHumans(Sex.MALE);
        int expectedCount = 1;

        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getHowManyHumans_FEMALE() {
        int actualCount = HumanFormatter.getHowManyHumans(Sex.FEMALE);
        int expectedCount = 2;

        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetAllAgeHumans() {
        int actual = HumanFormatter.getAllAgeHumans();
        int expected = 35 + 34 + 17;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllAgeHumans_MALE() {
        int actual = HumanFormatter.getAllAgeHumans(Sex.MALE);
        int expected = 35;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllAgeHumans_FEMALE() {
        int actual = HumanFormatter.getAllAgeHumans(Sex.FEMALE);
        int expected = 34 + 17;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetAverageAgeOfAllHumans() {
        int actual = HumanFormatter.getAverageAgeOfAllHumans();
        int expected = (35 + 34 + 17)/3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageAgeOfAllHumans_MALE() {
        int actual = HumanFormatter.getAverageAgeOfAllHumans(Sex.MALE);
        int expected = 35;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageAgeOfAllHumans_FEMALE() {
        int actual = HumanFormatter.getAverageAgeOfAllHumans(Sex.FEMALE);
        int expected = (34 + 17)/2;

        Assert.assertEquals(expected, actual);
    }
}