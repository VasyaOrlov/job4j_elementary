package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void rubleToEuroTest() {
        int in = 180;
        int result = Converter.rubleToEuro(in);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void rubleToDollarTest() {
        int in = 160;
        int result = Converter.rubleToDollar(in);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }
}