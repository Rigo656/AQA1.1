package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCash500() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 500;


        int actual = cashbackHackerService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCash999() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 999;


        int actual = cashbackHackerService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash1000() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 1000;


        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash1001() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 1001;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash10001() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 10001;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash5000() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 5000;


        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash50() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 50;


        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
    }

}