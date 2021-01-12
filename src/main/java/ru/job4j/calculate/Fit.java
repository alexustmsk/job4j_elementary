package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightM = 175;
        short heightW = 164;
        double man = Fit.manWeight(heightM);
        double woman = Fit.womanWeight(heightW);
        System.out.println("Man 175 is " + man);
        System.out.println("Woman 164 is " + woman);
    }
}
