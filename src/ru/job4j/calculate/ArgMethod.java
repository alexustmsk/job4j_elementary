package ru.job4j.calculate;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age);
    }

    public static void main(String[] args) {
        String name = "Alexander Ustyuzhanin";
        int age = 31;
        ArgMethod.hello(name, age);
    }
}
