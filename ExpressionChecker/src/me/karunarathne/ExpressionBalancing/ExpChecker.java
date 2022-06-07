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
            if (expression.isEmpty()) return false;
            if (isAnOpeningBracket(c)) {
                queue.enqueue(c);
            } else if (isAClosingBracket(c)) {
                if (isEmpty()) return false;
                queue.enqueue(c);
            }
        }
        return isTheQueueAPalindrome();
    }

    private static boolean isTheQueueAPalindrome()  {
        
    }

    private static boolean checkIfPalindrome() {
        String slice;
        if (expLength % 2 == 1) {  // odd
            slice = expression.substring((expLength/2)+1, expLength);
        } else {                // even
            slice = expression.substring(expLength/2, expLength);
        }

        for (int i=slice.length()-1; i>=0; i--) {
            if (slice.charAt(i) != queue.dequeue()) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEmpty() {
        return queue.isEmpty();
    }

    private static boolean isAClosingBracket (char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean isAnOpeningBracket (char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
