package com.example;

import org.junit.Assert;
import org.junit.Test;


import java.util.List;


public class FelineTest {


    @Test
    public void getFoodForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, feline.getFamily());

    }

    @Test
    public void getKittensWithIntegerKittensCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        Assert.assertEquals(5, actual);
    }

    @Test
    public void getKittensWithoutArgs() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expectedResult, actual);

    }
}
