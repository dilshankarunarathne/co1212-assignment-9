package me.karunarathne.ExpressionBalancing;

public class ExpChecker {
    private static CharQueue queue;
    private static String expression;
    private static int expLength;

    static {
        queue = new CharQueue();
    }

    public static boolean checkBalance (String exp) {
        expression = exp;
        expLength = exp.length();
    }

    private static boolean isBalanced () {

    }
}
