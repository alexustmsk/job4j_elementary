package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String added = "added";
        String subtracted = "subtracted";
        String multiplied = "multiplied";
        String divided = "divided";
        int rslAdded = left + right;
        int rslSubtracted = left - right;
        int rslMultiplied = left * right;
        int rslDivided = left / right;

        String rslS = null;

        if (rsl == rslAdded) {
            rslS = String.valueOf(added);
            System.out.println(added);
            return rslS;
        } else if (rsl == rslSubtracted) {
            rslS = String.valueOf(subtracted);
            System.out.println(subtracted);
            return rslS;
        } else if (rsl == rslMultiplied) {
            rslS = String.valueOf(multiplied);
            System.out.println(multiplied);
            return rslS;
        } else if (rsl == rslDivided) {
            rslS = String.valueOf(divided);
            System.out.println(divided);
            return rslS;
        }
        return "none";
    }
}