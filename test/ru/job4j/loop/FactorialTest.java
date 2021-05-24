package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int expect = 120;
        int result = Factorial.calc(number);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expect = 1;
        int result = Factorial.calc(number);
        Assert.assertEquals(expect, result);
    }
}