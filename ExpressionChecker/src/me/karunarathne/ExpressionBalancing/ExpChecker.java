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

        return isBalanced();
    }

    private static boolean isBalanced () {
        for (char c: expression.toCharArray()) {
            if (isAnOpeningBracket(c)) {

            }
        }
    }

    private static boolean isAnOpeningBracket (char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
