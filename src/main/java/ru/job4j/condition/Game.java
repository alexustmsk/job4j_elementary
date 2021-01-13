package ru.job4j.condition;

public class Game {
        public static int checkGame(double percent, int prize, int pay) {
            double summPrize = percent * (double) prize;
            System.out.println(summPrize);
            int cash;

            if (summPrize > pay) {
                cash = (int) summPrize - pay;
                System.out.println(cash);
            } else cash = 0;
        return cash;
        }

    public static void main(String[] args) {
        int checc = Game.checkGame(0.9, 1, 2);
        int checc2 = Game.checkGame(0.2, 50, 9);
    }
}

