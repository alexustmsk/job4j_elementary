package ru.job4j;

public class Main {

    private static double percent = 0.1;
    private static int prize = 50;
    private static int pay = 2;
    private static double payD = pay;
    private static double prizeD = prize;
    private static double summPrize = percent * prizeD;
    private static double cash = summPrize - payD;

    public static void main(String[] args) {

        System.out.println(summPrize);
        if (summPrize > pay){
            //return cash;
            System.out.println(cash);
        }
        System.out.println("0");
    }
}