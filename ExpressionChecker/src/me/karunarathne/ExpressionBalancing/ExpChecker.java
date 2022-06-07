package me.karunarathne.ExpressionBalancing;

public class ExpChecker {
    private static CharQueue queue;
    private static int count;

    static {
        queue = new CharQueue();
        count = 0;
    }

    public static boolean checkBalance (String exp) {
        int expLength = exp.length();

        for (char c: exp.toCharArray()) {
            if (exp.isEmpty()) return false;
            if (isAnOpeningBracket(c)) {
                queue.enqueue(c);
                count++;
            } else if (isAClosingBracket(c)) {
                if (isEmpty()) return false;
                queue.enqueue(c);
                count++;
            }
        }
        if (count % 2 == 1) return false;
        return isTheQueueAPalindrome();
    }

    private static boolean isTheQueueAPalindrome()  {
        String reverseHalf = "";
        for (int i=0; i<count/2; i++) {

        }
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
