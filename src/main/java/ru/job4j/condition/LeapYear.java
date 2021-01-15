package ru.job4j.condition;

public class LeapYear {

    public static boolean checkYear(int year) {
        int ye400 = year % 400;
        int ye100 = year % 100;
        int ye4 = year % 4;

        boolean checkN = ye100 == 0;
        boolean checkNV = ye400 == 0 || ye4 == 0;
        boolean checkV = ye400 == 0 && ye4 == 0;

        boolean check = checkN != checkNV != checkV;

    return check;
    }
}
