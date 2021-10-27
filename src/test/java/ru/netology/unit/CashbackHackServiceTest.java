package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowHowMuchToBuy() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(777);
        System.out.println("Осталось докупить на " + actual);

        int expected = 223;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(1000);
        System.out.println("Осталось докупить на " + actual);

        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(999);
        System.out.println("Осталось докупить на " + actual);

        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999() {
        CashbackHackService chs = new CashbackHackService();
        int actual = chs.remain(1001);
        System.out.println("Осталось докупить на " + actual);

        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
    
}
