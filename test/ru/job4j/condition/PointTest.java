package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distanceTest() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expect = 2;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expect, result, 0.01);
    }
}