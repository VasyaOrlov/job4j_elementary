package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distanceTest() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double expect = 2;
        double result = first.distance(second);
        Assert.assertEquals(expect, result, 0.01);
    }
}