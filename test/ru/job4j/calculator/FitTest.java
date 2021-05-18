package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void manWeightTest() {
        short height = 187;
        double result = Fit.manWeight(height);
        double expect = 100.05;
        Assert.assertEquals(expect, result, 0.01);
    }

    @Test
    public void womanWeightTest() {
        short height = 187;
        double result = Fit.womanWeight(height);
        double expect = 88.55;
        Assert.assertEquals(expect, result, 0.01);
    }
}