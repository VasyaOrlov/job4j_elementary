package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void calc1Test() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void calc2Test() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void calc3Test() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void calc4Test() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int result = X2.calc(a, b, c, x);
        int expect = 1;
        Assert.assertEquals(expect, result);
    }
}