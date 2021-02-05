package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                return false;
            }
        }
        return true;
    }
}