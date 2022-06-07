package me.karunarathne.ExpressionBalancing;

public class ExpChecker {
    private static CharQueue queue;
    private static int count;

    static {
        queue = new CharQueue();
        count = 0;
    }

    public static boolean checkBalance (String exp) {
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
        return isTheQueueAPalindrome();
    }

    private static boolean isTheQueueAPalindrome()  {
        if (count % 2 == 1) return false;
        String reverseHalf = "";
        for (int i=0; i<count/2; i++) {
            reverseHalf = queue.dequeue() + reverseHalf;
        }
        for (int i=0; i<count/2; i++) {
            if (reverseHalf.charAt(i) != queue.dequeue()) {
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
