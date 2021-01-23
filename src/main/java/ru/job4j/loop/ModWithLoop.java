package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = 0;
        while (d > 0) {
            int del = n / d;
            rsl = n - del * d;
            break;
        }
        return rsl;
    }
}