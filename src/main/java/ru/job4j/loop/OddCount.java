package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int rsl = 0;
        for (;  a <= b; a++) {
            int check = a % 2;
            if (check != 0) {
                System.out.println(a);
                rsl++;
            }
        }
        return rsl;
    }
}