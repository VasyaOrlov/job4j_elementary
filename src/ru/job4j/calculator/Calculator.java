package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int number) {
        return x + number;
    }

    public int multiply(int number) {
        return x * number;
    }

    public static int minus(int number) {
        return number - x;
    }

    public static int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + multiply(number) + minus(number) + divide(number);
    }

    public static void main(String[] args) {
        int number = 10;
        int s = sum(number);
        int min = minus(number);
        int div = divide(number);
        Calculator calc = new Calculator();
        int mult = calc.multiply(number);
        int sumAll = calc.sumAllOperation(number);
    }
}