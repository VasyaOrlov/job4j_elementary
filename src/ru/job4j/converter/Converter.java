package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 90;
    }

    public static int rubleToDollar(int value) {
        return value / 80;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(180);
        System.out.println("180 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar((160));
        System.out.println("160 rubles are " + dollar + " dollar");

        int in = 180;
        int expect = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = out == expect;
        System.out.println("180 rubles are 2. Test result : " + passed);

        int in2 = 160;
        int expect2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = out2 == expect2;
        System.out.println("160 rubles are 2. Test result : " + passed2);
    }
}