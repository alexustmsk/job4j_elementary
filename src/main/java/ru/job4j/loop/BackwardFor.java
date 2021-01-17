package ru.job4j.loop;

public class BackwardFor {
    public static void out(int m, int n) {
        for (int i = m; i >= n + 1; i--) {
                System.out.println(i);
        }
    }
}