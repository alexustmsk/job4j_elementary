package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int del = n / d;
        int rsl = n - del * d;
        return rsl;
    }
}
