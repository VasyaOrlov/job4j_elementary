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
    }
}