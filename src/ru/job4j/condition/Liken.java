package ru.job4j.condition;

public class Liken {
    public static void compare(int first, int second) {
        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Liken.compare(9, 10);
    }
}