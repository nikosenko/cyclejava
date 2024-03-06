package ru.netology.mvnjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalcServiceTest {


    @Test
    public void CalcServiceMonthsOfRest10() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcServiceMonthsOfRest100() {
        CalcService service = new CalcService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}

