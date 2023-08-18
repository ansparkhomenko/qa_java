package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class LionAlexTest {
    Feline feline;

    @Test
    public void getFriendsShouldReturnListOfNames() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        List<String> actualResult = alex.getFriends();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingShouldReturnString() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        String expectedResult = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedResult, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensShouldReturnZero() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, alex.getKittens());
    }
}
