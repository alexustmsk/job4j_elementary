package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String rsl = "Operation not support";

        String hello = "Hello";
        String world = "World";
        String hw = "Hello, World!!!";

        int rsl3 = number % 3;
        int rsl5 = number % 5;
        if (rsl3 == 0 && rsl5 != 0) {
            rsl = hello;
        } else if (rsl3 != 0 && rsl5 == 0) {
            rsl = world;
        } else if (rsl3 == 0 && rsl5 == 0) {
            rsl = hw;
        }
        return rsl;
    }
}
