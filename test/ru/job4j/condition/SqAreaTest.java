package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void squareTest() {
        int k = 2;
        int p = 6;
        double result = SqArea.square(p, k);
        double expect = 2;
        Assert.assertEquals(expect, result, 0.01);
    }
}